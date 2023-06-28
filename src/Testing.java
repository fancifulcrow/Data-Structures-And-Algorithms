import DataStructures.*;

public class Testing {
    public static void main(String[] args) {
        GraphDS<Integer> graphDS = new GraphDS<>(false);

        graphDS.addEdge(1, 2);        
        graphDS.addEdge(2, 3);
        graphDS.addEdge(3, 4);
        graphDS.addEdge(4, 5);
        graphDS.addEdge(5, 6);

        graphDS.removeVertex(4);
        graphDS.removeEdge(5, 6);

        System.out.println(graphDS.verticesCount());

        graphDS.print();

        GraphDS<String> graphDS2 = new GraphDS<>(false);
        graphDS2.addVertex("Hello World");
        graphDS2.addEdge("null", "Hey People");
        graphDS2.addEdge("null", "Hello World");
        graphDS2.print();

        System.out.println(graphDS.hasEdge(2, 1));
        System.out.println(graphDS2.edgesCount());
    }
}
