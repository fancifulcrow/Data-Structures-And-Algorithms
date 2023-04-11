import DataStructures.*;

public class Testing {
    public static void main(String[] args) {
        HashTableDS<Integer, Integer> hashMapDS = new HashTableDS<>();
        for(int i = 0; i < 64; i++){
            hashMapDS.insert(i, i * i);
        }
        
        System.out.println(hashMapDS.containsValue(441));
    }
}
