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
