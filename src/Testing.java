import DataStructures.*;

public class Testing {
    public static void main(String[] args) {
        HashTableDS<Integer, String> hashMapDS = new HashTableDS<>();
        for(int i = 0; i < 64; i++){
            hashMapDS.insert(i, "hello");
        }
        
        System.out.println(hashMapDS.containsValue("goodbye"));

        StackDS<Integer> stackDS = new StackDS<>(10);
        for(int i = 0; i < 10; i++){
            stackDS.push(i * 2);
        }

        stackDS.print();
        hashMapDS.print();

        QueueDS<String> queueDS = new QueueDS<>(10);
        queueDS.print();
    }
}
