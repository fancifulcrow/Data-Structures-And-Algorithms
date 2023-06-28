package DataStructures;

public class QueueDS<E> {
    private int front; // index of the front element of the queue
    private int rear; // index of the rear element of the queue
    private int size; // current number of elements in the queue
    private final int capacity; // maximum number of elements the queue can hold
    private E[] arr; // array to store the elements of the queue

    // Constructor to create a queue of a given size
    @SuppressWarnings("unchecked")
    public QueueDS(int capacity){
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.capacity = capacity;
        this.arr = (E[]) new Object[capacity];
    }

    // Add an element to the rear of the queue
    public void enqueue(E value){
        // Throw an exception if the queue is full
        if(isFull()){
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % arr.length; // calculate the index of the next rear element (wrapping around if necessary)
        arr[rear] = value; // add the element to the queue
        size++; // increase the size of the queue
    }

    // Remove the element at the front of the queue
    public E dequeue(){
        // Throw an exception if the queue is empty
        if (isEmpty()){
            throw new IllegalStateException("Queue is empty.");
        }
        E value = arr[front];
        front = (front + 1) % arr.length; // calculate the index of the new front element (wrapping around if necessary)
        size--; // reduce the size of the queue

        return value; // return the dequeued value
    }

    // Get the element at the front of the queue
    public E front(){
        // Throw an exception if the queue is empty
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty.");
        }

        return arr[front];
    }

    // Get the element at the rear of the queue
    public E rear(){
        // Throw an exception if the queue is empty
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return arr[rear];
    }

    // Get the size of the queue
    public int size(){
        return this.size;
    }

    // Check if the queue is empty
    public boolean isEmpty(){
        if(this.size == 0){
            return true;
        }
        return false;
    }

    // Check if the queue is full
    public boolean isFull(){
        if(this.size == this.capacity){
            return true;
        }
        return false;
    }

    // Print out the queue
    public void print(){
        for(int i = 0; i < size; i++){
            int index = (front + i) % capacity;
            System.out.print(arr[index] + "    ");
        }
        System.out.println();
    }

    // Clear out the queue
    public void clear(){
        // Reset the front, rear, and size variables to their initial values
        front = 0;
        rear = -1;
        size = 0;
    }
}
