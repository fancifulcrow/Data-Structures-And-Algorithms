package DataStructures;

public class LinkedListSinglyDS<E> {
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
    public LinkedListSinglyDS(){
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
        // check if index is out of bounds
        if (index < 0 || index > this.size){
            throw new IndexOutOfBoundsException();
        }

        Node<E> current = this.head;
        for (int i = 0; i < index - 1; i++){
            current = current.next;
        }
        Node<E> newNode = new Node<>(value);
        newNode.next = current.next;
        current.next = newNode;
        this.size++;
    }

    // Delete at the beginning
    public void deleteFirst(){
        this.size--;
    }

    public static void main(String[] args) {
        Node<Integer> node = new Node<>(4);
    }
}
