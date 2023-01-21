import java.util.Stack;

public class MyStack {

    private int[] array;
    private int count;

    public MyStack(int size) {
        array = new int[size];
        count = 0;
    }

    public void push(int element) {
        if (count == array.length) throw new RuntimeException("Stack is full");
        array[count++] = element;
    }

    public int pop() {
        if (count == 0) throw new RuntimeException("Stack is empty");
        return array[--count];
    }

    public int peek() {
        if (count == 0) throw new RuntimeException("Stack is empty");
        return array[count - 1];
    }

    public int search(int element) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        MyStack myStack = new MyStack(5);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.search(19));

        Stack<String> stack = new Stack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        stack.forEach(System.out::println);
        stack.pop();
        stack.forEach(System.out::println);
    }

}
