# Data Structures and Algorithms

This repository is my study on Several Data Structures and 

## Setup

### Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

### Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

### Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).



#### **Linked List (LinkedListDS)**

The LinkedListDS class has the following methods:

- **LinkedListDS():** Constructor creates an empty linked list by initializing the head to null and the size to 0.
- **size():** Returns the number of elements in the linked list.
- **isEmpty():** Returns true if the linked list is empty, false otherwise.
- **insertFirst(E value):** Inserts an element with the given value at the beginning of the linked list.
- **insert(E value):** Inserts an element with the given value at the end of the linked list.
- **insert(int index, E value):** Inserts an element with the given value at the given index of the linked list.
- **deleteFirst():** Deletes the first element in the linked list.
- **deleteLast():** Deletes the last element in the linked list.
- **delete(int index):** Deletes the element at the given index of the linked list.
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