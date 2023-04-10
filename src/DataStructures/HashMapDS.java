package DataStructures;

public class HashMapDS<K, V> {
    private final int SIZE;
    private Node<K, V>[] map;

    private static class Node<K, V> {
        private final K key;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    private int hash(K key) {
        return key.hashCode() % SIZE;
    }

    @SuppressWarnings("unchecked")
    public HashMapDS(int size){
        this.SIZE = size;
        this.map = new Node[this.SIZE];
    }

    // public void add(K key, V value){
    //     int hash = hash(key);
    //     Node<K, V> node = map[hash];

    //     while(node != null){
    //         if(node.key.equals(key)){
    //             node.setValue(value);
    //         }else{
    //             while(node.next != null){
                    
    //             }
    //         }
    //     }

    }
}
