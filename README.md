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
- **size():** Returns the number of elements in the linked list.
- **isEmpty():** Returns true if the linked list is empty, false otherwise.
- **insertFirst(E value):** Inserts an element with the given value at the beginning of the linked list.
- **insert(E value):** Inserts an element with the given value at the end of the linked list.
- **insert(int index, E value):** Inserts an element with the given value at the given index of the linked list.
- **removeFirst():** Deletes the first element in the linked list.
- **removeLast():** Deletes the last element in the linked list.
- **remove(int index):** Deletes the element at the given index of the linked list.
- **getFirst():** Returns the value of the first element in the linked list.
- **getLast():** Returns the value of the last element in the linked list.
- **get(int index):** Returns the value of the element at the given index of the linked list.
- **print():** Prints the elements of the linked list.  

#### **Stack (StackDS)**

Here is a summary of what each method in the StackDS class does:

- **StackDS(int size):** Constructor that creates a new stack with the specified size.
- **push(E value):** Adds a new element to the top of the stack.
- **pop():** Removes and returns the top element of the stack.
- **peek():** Returns the top element of the stack without removing it.
- **isEmpty():** Checks if the stack is empty.
- **isFull():** Checks if the stack is full.
- **size():** Returns the number of elements in the stack.
- **clear():** Removes all elements from the stack.

#### **Queue (QueueDS)**

These are the methods of the QueueDS class:

- **QueueDS(int capacity):** Constructor that creates a new instance of the queue with the specified capacity.
- **enqueue(E value):** Inserts the specified element at the rear of the queue.
- **dequeue():** Removes and returns the element at the front of the queue.
- **front():** Returns the element at the front of the queue without removing it.
- **rear():** Returns the element at the rear of the queue without removing it.
- **size():** Returns the current number of elements in the queue.
- **isEmpty():** Checks if the queue is empty.
- **isFull():** Checks if the queue is full.
- **print():** Prints the elements of the queue from front to rear.

#### **HashTable (HashTableDS)**

This is a brief description of the public methods of the HashTableDS clas:

- **insert(K key, V value):** Inserts a key-value pair into the hash table.
- **get(K key):** Retrieves the value associated with the specified key from the hash table.
- **remove(K key):** Removes the key-value pair for the specified key from the hash table.
- **size():** Returns the current number of key-value pairs in the hash table.
- **containsKey(K key):** Checks id the hash table contains a specific key.
- **containsValue(V value):** Checks if the hash table contains a specific value.
- **print():** Prints all the key-value pairs stored in the hash table.
- **clear():** Removes all elements from the hash table.



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