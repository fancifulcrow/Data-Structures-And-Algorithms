package DataStructures;

public class HashTableDS<K, V> {
    private final int capacity = 64;
    private int size = 0;
    @SuppressWarnings("unchecked")
    private Entry<K, V>[] table = new Entry[capacity];

    // Entry class represents each key-value pair in the table
    private static class Entry<K, V> {
        private final K key; // Key of the entry
        private V value; // Value of the entry
        private Entry<K, V> next; // For handling collisions using linked list

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        // Getter for the key of the Entry
        public K getKey() {
            return key;
        }

        // Getter for the key of the Entry
        public V getValue() {
            return value;
        }

        // Setter for the value of the Entry
        public void setValue(V value) {
            this.value = value;
        }
    }

    // The hashing function
    private int hash(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    // Insert a key-value pair into the table
    public void insert(K key, V value) {
        int index = hash(key); // Get the index for the key
        Entry<K, V> entry = table[index]; // Get the entry at the index

        while (entry != null) { // Traverse through the linked list for handling collisions
            // If key already exists, update its value and return
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
            entry = entry.next;
        }

        // If key doesn't exist, add a new entry to the beginning of the linked list
        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = table[index];
        table[index] = newEntry;
        this.size++;
    }

    // Get the value for a given key
    public V get(K key) {
        int index = hash(key); // get the index for the key
        Entry<K, V> entry = table[index]; // get the entry at the index

        // Traverse through the linked list for handling collisions
        while (entry != null) {
            // If key is found, return its value
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
            entry = entry.next;
        }

        // Return null if key is not found
        return null;
    }
    
    // Remove the key-value pair for a given key
    public void remove(K key) {
        int index = hash(key);
        Entry<K, V> prevEntry = null;
        Entry<K, V> currEntry = table[index];

        // Traverse through the linked list for handling collisions
        while (currEntry != null) {
            // If key is found, remove the entry
            if (currEntry.getKey().equals(key)) {
                if (prevEntry == null) {
                    table[index] = currEntry.next;
                } else {
                    prevEntry.next = currEntry.next;
                }
                size--;
                return;
            }
            prevEntry = currEntry;
            currEntry = currEntry.next;
        }
    }

    // return the size of the hash map
    public int size(){
        return this.size;
    }

    // Checks if the hash map contains a given key
    public boolean containsKey(K key) {
        return get(key) != null;
    }

    // Check if the hash map contains a given value
    public boolean containsValue(V value) {
        // Traverse through the hashmap and return true if found
        for (int i = 0; i < capacity; i++) {
            Entry<K, V> entry = table[i];
            while (entry != null) {
                if (entry.getValue().equals(value)) {
                    return true;
                }
                entry = entry.next;
            }
        }
        return false;
    }

    // Print the hash map
    public void print(){
        // Traverse through the hashmap and print out the entries
        for(int i = 0; i < capacity; i++){
            Entry<K, V> entry = table[i];
            while(entry != null){
                System.out.print(entry.getKey() + " : " + entry.getValue() + ", ");
                entry = entry.next;
            }
        }
        System.out.println();
    }

    // Clear all elements in the hash table
    public void clear(){
        // Traverse through the hashmap and remove each entry
        for (int i = 0; i < capacity; i++) {
            table[i] = null;
        }
        size = 0;
    }

    // Returns an array of all keys in the hash map
    @SuppressWarnings("unchecked")
    public K[] keySet(){
        // Create an array to store the keys
        K[] keys = (K[]) new Object[size];
        int keysIndex = 0;

        // Iterate over the hash table
        for (int i = 0; i < capacity; i++){
            Entry<K, V> entry = table[i];

            // Traverse each linked list
            while (entry != null){
                // Add the key to the keys array
                keys[keysIndex++] = entry.getKey();
                entry = entry.next;
            }
        }

        return keys;
    }
}
