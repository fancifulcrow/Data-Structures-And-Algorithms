# Data Structures and Algorithms

This repository is my study on several Data Structures and Algorithms.

## Setup

### **Getting Started**

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

### **Folder Structure**

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

### **Dependency Management**

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).



## Data Structures

The following are part of the DataStructures package   

#### **Linked List (LinkedListDS)**

The LinkedListDS class has the following methods:

- **LinkedListDS():** Constructor creates an empty linked list by initializing the head to null and the size to 0.
- **int size():** Returns the number of elements in the linked list.
- **boolean isEmpty():** Returns true if the linked list is empty, false otherwise.
- **void insertFirst(E value):** Inserts an element with the given value at the beginning of the linked list.
- **void insert(E value):** Inserts an element with the given value at the end of the linked list.
- **void insert(int index, E value):** Inserts an element with the given value at the given index of the linked list.
- **void remove(E value):** Deletes a given value from the linked list.
- **void removeFirst():** Deletes the first element in the linked list.
- **void removeLast():** Deletes the last element in the linked list.
- **void removeAtIndex(int index):** Deletes the element at the given index of the linked list.
- **E getFirst():** Returns the value of the first element in the linked list.
- **E getLast():** Returns the value of the last element in the linked list.
- **E get(int index):** Returns the value of the element at the given index of the linked list.
- **void print():** Prints the elements of the linked list.
- **void clear():** Remove all elements in the linked list.

#### **Stack (StackDS)**

Here is a summary of what each method in the StackDS class does:

- **StackDS(int size):** Constructor that creates a new stack with the specified size.
- **void push(E value):** Adds a new element to the top of the stack.
- **E pop():** Removes and returns the top element of the stack.
- **E peek():** Returns the top element of the stack without removing it.
- **boolean isEmpty():** Checks if the stack is empty.
- **boolean isFull():** Checks if the stack is full.
- **int size():** Returns the number of elements in the stack.
- **void print():** Prints out the elements of the stack from bottom to top.
- **void clear():** Removes all elements from the stack.

#### **Queue (QueueDS)**

These are the methods of the QueueDS class:

- **QueueDS(int capacity):** Constructor that creates a new instance of the queue with the specified capacity.
- **void enqueue(E value):** Inserts the specified element at the rear of the queue.
- **E dequeue():** Removes and returns the element at the front of the queue.
- **E front():** Returns the element at the front of the queue without removing it.
- **E rear():** Returns the element at the rear of the queue without removing it.
- **int size():** Returns the current number of elements in the queue.
- **boolean isEmpty():** Checks if the queue is empty.
- **boolean isFull():** Checks if the queue is full.
- **void print():** Prints the elements of the queue from front to rear.
- **void clear():** Removes all elements from the queue.

#### **HashTable (HashTableDS)**

This is a brief description of the public methods of the HashTableDS clas:

- **void insert(K key, V value):** Inserts a key-value pair into the hash table.
- **V get(K key):** Retrieves the value associated with the specified key from the hash table.
- **void remove(K key):** Removes the key-value pair for the specified key from the hash table.
- **int size():** Returns the current number of key-value pairs in the hash table.
- **boolean containsKey(K key):** Checks id the hash table contains a specific key.
- **boolean containsValue(V value):** Checks if the hash table contains a specific value.
- **void print():** Prints all the key-value pairs stored in the hash table.
- **void clear():** Removes all elements from the hash table.
- **K[] keySet():** Returns an array of the keys in the hash table.

#### **Graph (GraphDS)**

The GraphDS class has following methods:

- **GraphDS(boolean isDirected):** Constructor to create a new graph and specify whether the graph is directed or undirected.
- **void addVertex(E vertex):** Adds a new vertex to the graph.
- **void addEdge(E source, E destination):** Adds a new edge between two vertices in the graph. If the vertices do not exist, they will be added.
- **void removeVertex(E vertex):** Removes a vertex and all its associated edges from the graph.
- **void removeEdge(E source, E destination):** Removes an edge between two vertices from the graph.
- **int verticesCount():** Returns the number of vertices in the graph.
- **int edgesCount():** Returns the number of edges in the graph.
- **boolean hasVertex(E vertex):** Checks whether a given vertex exists in the graph.
- **boolean hasEdge(E source, E destination):** Checks whether a given edge exists in the graph.
- **boolean isDirectedGraph():** Checks whether the graph is directed or undirected.
- **void print():** Prints out the adjacency map representation of the graph.
- **void clear():** Clears the graph by removing all vertices and edges.



## Searching Algorithms

For searching algorithms, only 2 are looked into here:

#### **Linear Search**
Linear search is a simple searching algorithm that sequentially checks each element in a list or array until a match is found or the end of the list is reached. It is applicable to both sorted and unsorted lists.
#### **Binary Search**
Binary search is a search algorithm used to find the position or index of a target value within a sorted list or array. It follows a divide-and-conquer strategy by repeatedly dividing the search space in half until the target value is found or the search space is empty.



## Sorting Algorithms

Under the SortingAlgorithms package, these are the algorithms that are implemented:

#### **Bubble Sort** 
Bubble sort is a simple sorting algorithm that works by repeatedly swapping adjacent elements if they are in the wrong order.
#### **Selection Sort** 
Selection sort is a simple sorting algorithm that works by repeatedly finding the minimum element from the unsorted part of the array and placing it at the beginning of the sorted part of the array.
#### **Insertion Sort** 
Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time. It is based on the idea that one element from the input elements is consumed in each iteration to find its correct position in the sorted array.
#### **Merge Sort** 
Merge sort is a sorting algorithm that divides an array into two halves, sorts each half recursively, and then merges the two halves back together. It is a divide-and-conquer algorithm.
#### **Quicksort** 
Quick sort is a comparison-based algorithm that works by selecting a pivot element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then recursively sorted.