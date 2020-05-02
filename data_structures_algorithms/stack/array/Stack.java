package data_structures_algorithms.stack.array;

public class Stack {
    private int stack[];
    private int max;
    private int top;

    private Stack(int max) {
        this.stack = new int[max];
        this.max = max;
        this.top = -1;
    }

    private void view() {
        if (top == -1) {
            System.out.println("Empty Stack");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    private void insert(int x) {
        if (!isfull()) {
            stack[++top] = x;
        } else {
            System.out.println("Overflow");
        }
    }

    private int remove() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Empty");
            return -1;
        }
    }

    private boolean isEmpty() {
        return (top == -1);
    }

    private boolean isfull() {
        return (top == max - 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.insert(2);
        stack.insert(3);
        stack.insert(4);
        stack.insert(5);
        stack.insert(6);
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        stack.view();
        stack.insert(100);
        stack.view();
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        stack.view();
    }
}
