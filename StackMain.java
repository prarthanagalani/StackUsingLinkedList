package StackUsingLinkedList;

import java.util.LinkedList;

public class StackMain {

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(70);
        stack.push(30);
        stack.push(56);

        // Display the initial stack
        System.out.println("Initial Stack:");
        stack.display();

        // Perform peek operation
        Integer topElement = stack.peek();
        System.out.println("Top Element: " + topElement);

        // Perform pop operation
        Integer poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);

        // Use case 3: queue
        Queue<Integer> queue = new Queue<>();

        // enqueue
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        // Display the initial stack
        System.out.println("Initial Queue:");
        queue.display();

    }
}

class Stack<T> {
    LinkedList<T> List = new LinkedList<>();

    // push
    public void push(T data) {
        List.addFirst(data);
    }

    // pop
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return List.removeFirst();

    }

    // peak
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }

        return List.getFirst();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return List.isEmpty();
    }

    // Display the stack
    public void display() {
        for (T data : List) {
            System.out.print(data + " ");
        }

    }
}

class Queue<T> {

    LinkedList<T> List = new LinkedList<>();

    // Enqueue operation
    public void enqueue(T data) {
        List.addLast(data);
    }

    // Display the queue
    public void display() {
        for (T data : List) {
            System.out.print(data + " ");
        }

    }

    // Dequeue operation
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return List.removeFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return List.isEmpty();
    }
}