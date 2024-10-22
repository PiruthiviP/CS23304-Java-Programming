// 4. Write an interface for a Stack that has operations push, pop and clear. 
// Also write a class that uses the interface.

interface Stack {
    void push(int item);
    int pop();
    void clear();
}

class MyStack implements Stack {
    private int[] data = new int[10];
    private int top = -1;

    public void push(int item) {
        data[++top] = item;
    }

    public int pop() {
        return data[top--];
    }

    public void clear() {
        top = -1;
    }
}

public class pro4 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());
        stack.clear();
    }
}
