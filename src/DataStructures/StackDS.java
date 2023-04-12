package DataStructures;

public class StackDS<E> {
    private int top; // keeps track of the top element in the stack
    private E[] arr; // array to store elements in the stack

    // constructor to create a stack of given size
    @SuppressWarnings("unchecked")
    public StackDS(int capacity){
        this.top = -1;
        this.arr = (E[]) new Object[capacity];
    }

    // adds an element to the top of the stack
    public void push(E value){
        // check if the stack is full
        if (top == arr.length - 1){
            throw new IllegalStateException("Stack is full");
        }
        top++;
        arr[top] = value;
    }

    // removes and returns the top element of the stack
    public E pop(){
        // check if the stack is empty
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        E item = arr[top];
        top--;
        return item;
    }

    // returns the top element of the stack without removing it
    public E peek(){
        if (top == -1){
            throw new IllegalStateException("Stack is empty");
        }
        return arr[top];
    }

    // check if the stack is empty
    public boolean isEmpty(){
        if (top == -1){
            return true;
        }
        return false;
    }

    // check if the stack is full
    public boolean isFull(){
        if (top == arr.length - 1){
            return true;
        }
        return false;
    }

    // returns the number of elements in the stack
    public int size(){
        return top + 1;
    }

    // Print the stack
    public void print(){
        for(int i = 0; i <= top; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // clears all elements from the stack
    public void clear(){
        top = -1;
    }
}
