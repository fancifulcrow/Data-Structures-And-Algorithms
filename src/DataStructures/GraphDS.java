package DataStructures;

public class GraphDS<E> {
    // Graphs in programming are usually represented by their Adjacency Matrix
    // The Adjacency Matrix here is implemented as a Hash Table of Linked Lists
    private HashTableDS<E, LinkedListDS<E>> adjacencyMap; // The Adjacency Matrix (or rather Map in this case)
    private boolean isDirected;

    // Constructor of GraphDS to create a directed or undirected graph
    public GraphDS(boolean isDirected){
        this.isDirected = isDirected;
        adjacencyMap = new HashTableDS<>();
    }

    // Add a new vertex to the graph
    public void addVertex(E vertex){
        adjacencyMap.insert(vertex, new LinkedListDS<>());
    }

    // Add a new edge to the graph
    public void addEdge(E source, E destination){
        // Adds the source vertex to the graph if it does not exist
        if (!adjacencyMap.containsKey(source)){
            addVertex(source);
        }
        // Adds the destination vertex to the graph if it does not exist
        if (!adjacencyMap.containsKey(destination)){
            addVertex(destination);
        }

        // adds the edge to the graph
        adjacencyMap.get(source).insert(destination);
        // Symmetrize if the graph is undirected
        if (!isDirected){
            adjacencyMap.get(destination).insert(source);
        }
    }

    // Remove a vertex from the graph
    public void removeVertex(E vertex){
        // Check if the vertex exists in the graph
        if (!adjacencyMap.containsKey(vertex)){
            return; // If vertex does not exist, do nothing
        }

        // Remove all edges connected to the given vertex
        // Iterate over the Adjacency Map
        for (E v : adjacencyMap.keySet()){
            // For each vertex, get its set of neighbors
            LinkedListDS<E> neighbors = adjacencyMap.get(v);
            // From the set of neigbors, remove the given vertex if found, else continue
            try {
                neighbors.remove(vertex);
            } catch (IllegalArgumentException iae){
                continue;
            }
        }

        // Remove the given vertex from the adjacency map
        adjacencyMap.remove(vertex);
    }

    // Removes an edge from the graph
    public void removeEdge(E source, E destination){
        // Check if both source and destination vertices exist in the graph
        if (!adjacencyMap.containsKey(source) || !adjacencyMap.containsKey(destination)){
            // Do nothing if either vertex is not present in the graph
            return;
        }

        // Remove the edge from the source vertex
        adjacencyMap.get(source).remove(destination);
        // If the graph is undirected, remove the corresponding edge from the destination vertex
        if (!isDirected){
            adjacencyMap.get(destination).remove(source);
        }
    }

    // Returns the number of vertices in the graph
    public int verticesCount(){
        return adjacencyMap.size();
    }

    // Returns the number of edges in the graph
    public int edgesCount(){
        int count = 0;
        // Iterate over the hash table
        for (E v : adjacencyMap.keySet()){
            // Add the size of each linked list to the count
            count += adjacencyMap.get(v).size();
        }
        if (!isDirected){
            count /= 2; // Divide by 2 for undirected graphs
        }
        return count;
    }

    // Checks whether a given vertex exists in the graph
    public boolean hasVertex(E vertex){
        return adjacencyMap.containsKey(vertex);
    }

    // Checks whether a given edge exists in the graph
    public boolean hasEdge(E source, E destination){
        // Checks if the source vertex exists in te graph
        if (!adjacencyMap.containsKey(source)){
            return false;
        }
        // Checks if the destination exists in the set of neighbors of the source vertex
        return adjacencyMap.get(source).containsValue(destination);
    }

    // Checks whether the graph is directed or undirected
    public boolean isDirectedGraph(){
        return isDirected;
    }

    // Prints out the Adjacency Map
    public void print(){
        // Iterate over the Adjavency Map
        for (E v : adjacencyMap.keySet()){
            // For each vertex, get its set of neighbors
            LinkedListDS<E> neighbors = adjacencyMap.get(v);
            
            // Print out each vertex and its neighbors
            System.out.print(v + " : ");
            neighbors.print();
            System.out.println();
        }
    }

    // Clear out the graph
    public void clear(){
        adjacencyMap.clear();
    }
}