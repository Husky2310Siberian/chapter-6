package gr.aueb.cf.ch6;

/**
 * Implements a stack based on a
 * static array implementation.
 */
public class StackApp {
    static int[] stack = new int[10];
    static int top = -1;

    public static void main(String[] args) {
        push(1);    //last in first out
        push(2);
        push(3);
        push(4);
        int popped = pop();
        int popped2 = pop();
        System.out.println("POPPED " + popped); //
        System.out.println("POPPED " + popped2);
        System.out.println("TRAVERSE");
        traverse();

    }
    public static void push(int num) {
        if (isFull()){
            System.out.println("the stack is full");
            return;
        }
        stack[++top] = num;
    }
    public static int pop () {
        if(isEmpty()){
            System.out.println("the stack is empty");
            return -1; //will be solved with exception
        }
        return stack[top--];
    }

    public static boolean isFull () {
        return top == stack.length - 1;
    }

    public static boolean isEmpty () {
        return top == -1;
    }

    public static void traverse () {
        for(int i = top; i >= 0; i--){
            System.out.println(stack[i]);
        }
    }
}
