package DataStructures;

public class LinkedListDS<E> {
    private Node<E> head; // reference to the first node in the list
    private int size; // number of nodes in the list

    // Inner Node class to represent each element in the list
    private class Node<T> {
        T value; // value of the node
        Node<T> next; // reference to the next node in the list

        Node(T value){
            this.value = value;
            this.next = null;
        }
    }

    // Constructor of LinkedListDS to create an empty linked list
    public LinkedListDS(){
        this.head = null;
        this.size = 0;
    }

    // Return the number of elements in the linked list
    public int size(){
        return this.size;
    }

    // Return true if the linked list is empty. Otherwise return false
    public boolean isEmpty(){
        if (this.size == 0){
            return true;
        }
        return false;
    }

    // Insert at the beginning
    public void insertFirst(E value){
        Node<E> newNode = new Node<>(value);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }

    // Insert at the end
    public void insert(E value){
        // Check if the linked list is empty
        if (isEmpty()){
            insertFirst(value);
            return;
        }

        // Iterate over the linked list until the end
        Node<E> current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        // Add the node to the end
        current.next = new Node<>(value);
        this.size++;

    }
    
    // Insert at a given index
    public void insert(int index, E value){
        // Check if index is out of bounds
        if (index < 0 || index > this.size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        // Check if the index is 0
        if (index == 0){
            insertFirst(value);
        }

        // Insert at the given index otherwise
        // Iterate over the list until the node before the given index is found
        Node<E> current = this.head;
        for (int i = 0; i < index - 1; i++){
            current = current.next;
        }

        // Insert the new node at the next index
        Node<E> newNode = new Node<>(value);
        newNode.next = current.next;
        current.next = newNode;
        this.size++;
    }

    // Delete a node with a given value from the linked list
    public void remove(E value){
        // Check if linked list is empty
        if (isEmpty()){
            throw new IllegalStateException("Linked list is empty");
        }

        // Check if the node to be removed is the head node
        if (head.value.equals(value)){
            removeFirst();
            return;
        }

        // Iterate over the list until the node before the node to be removed is found
        Node<E> current = head;
        while (current.next != null){
            if (current.next.value.equals(value)){
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }

        // throw an exception if value is not found
        throw new IllegalArgumentException("Value not found in the linked list");
    }

    // Delete at the beginning
    public void removeFirst(){
        if (isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        this.head = this.head.next;
        this.size--;
    }

    // Delete at the end
    public void removeLast() {
        // Check if the list is empty
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        // Check if there's only one element
        if (this.size == 1) {
            removeFirst();
            return;
        }

        // Iterate over the list until the second to last node is found
        Node<E> current = this.head;
        while (current.next.next != null) {
            current = current.next;
        }
        // Set the second to last node as the last node
        current.next = null;
        this.size--;
    }

    // Delete at a given index
    public void removeAtIndex(int index) {
        // Check if index is out of bounds
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        // Check if index is 0
        if (index == 0) {
            removeFirst();
            return;
        }
        // Check if index is the last element
        if (index == this.size - 1) {
            removeLast();
            return;
        }
        // Iterate over the list until the node before the given index is found
        Node<E> current = this.head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        // Delete the node at the given index
        current.next = current.next.next;
        this.size--;
    }

    // Get the value of the first element
    public E getFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Linked list is empty");
        }
        return this.head.value;
    }

    // Get the value of the last element
    public E getLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Linked list is empty");
        }
        Node<E> current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        return current.value;
    }

    // Get the value of the element at a given index
    public E get(int index) {
        // Check if index is out of bounds
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        // Iterate over the list until the node at the given index is found
        Node<E> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    // Check whether a given value exists in the linked list
    public boolean containsValue(E value){
        // Iterate over the list
        Node<E> current = this.head;
        while (current != null){
            // Check if the value of the current node is equal to the given value
            if (current.value.equals(value)){
                return true;
            }
            current = current.next;
        }
        // return false if the value is not found
        return false;
    }

    // Print the linked list
    public void print() {
        Node<E> current = this.head;
        while (current != null) {
            System.out.print(current.value + "    ");
            current = current.next;
        }
    }

    // Clear all elements in the linked list
    public void clear(){
        this.head = null;
        this.size = 0;
    }
}