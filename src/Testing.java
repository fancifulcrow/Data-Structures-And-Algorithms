import DataStructures.*;

public class Testing {
    public static void main(String[] args) {
        StackDS<Integer> stack = new StackDS<>(5);
        for(int i = 0;  i < 5; i++){
            stack.push(i);
            System.out.println("Size " + stack.size());
        }
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
