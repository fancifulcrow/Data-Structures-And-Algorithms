package DataStructures;

public class GraphDS<E> {
    // Graphs in programming are usually represented by their Adjacency Matrix
    
    private HashTableDS<E, LinkedListDS<E>> adjacencyMap; // The Adjacency Matrix
    private boolean isDirected;

    // Constructor of GraphDS to create a directed or undirected graph
    public GraphDS(boolean isDirected) {
        this.isDirected = isDirected;
        adjacencyMap = new HashTableDS<>();
    }

    // Add a new vertex
    public void addVertex(E vertex) {
        adjacencyMap.insert(vertex, new LinkedListDS<>());
    }

    // Add a new edge
    public void addEdge(E source, E destination) {
        // Adds the source vertex to the graph if it does not exist
        if (!adjacencyMap.containsKey(source)) {
            addVertex(source);
        }
        // Adds the destination vertex to the graph if it does not exist
        if (!adjacencyMap.containsKey(destination)) {
            addVertex(destination);
        }

        // adds the edge to the graph
        adjacencyMap.get(source).insert(destination);
        // Symmetrize if the graph is undirected
        if (!isDirected) {
            adjacencyMap.get(destination).insert(source);
        }
    }

    // Returns the number of vertices in the graph
    public int verticesCount(){
        return adjacencyMap.size();
    }

    // Checks whethere the graph is directed or not
    public boolean isDirectedGraph() {
        return isDirected;
    }
}
