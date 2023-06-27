import DataStructures.*;

public class Testing {
    public static void main(String[] args) {
        GraphDS<Integer> graphDS = new GraphDS<>(false);

        graphDS.addEdge(1, 2);
        System.out.println(graphDS.verticesCount());
    }
}
