package DataStructures;

public class QueueDS<E> {
    private int front; // index of the front element of the queue
    private int rear; // index of the rear element of the queue
    private int size; // current number of elements in the queue
    private final int capacity; // maximum number of elements the queue can hold
    private E[] arr; // array to store the elements of the queue

    // Constructor to create a stack of a given size
    @SuppressWarnings("unchecked")
    public QueueDS(int capacity){
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.capacity = capacity;
        this.arr = (E[]) new Object[capacity];
    }

    public void enqueue(E value){
        if(isFull()){
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % arr.length; // calculate the index of the next rear element (wrapping around if necessary)
        arr[rear] = value; // add the element to the queue
        size++; // increase the size of the queue
    }

    public E dequeue(){
        if (isEmpty()){
            throw new IllegalStateException("Queue is empty.");
        }
        E value = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return value;
    }

    public E front(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty.");
        }
        return arr[front];
    }

    public E rear(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return arr[rear];
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        if(this.size == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(this.size == this.capacity){
            return true;
        }
        return false;
    }

    public void print(){
        for(int i = 0; i < size; i++){
            int index = (front + i) % capacity;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }
}
