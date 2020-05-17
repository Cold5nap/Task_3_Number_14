import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> oldStack = new Stack<>();
        oldStack.add(1);
        oldStack.add(2);
        oldStack.add(3);
        oldStack.add(4);
        oldStack.add(5);
        oldStack.add(6);
        oldStack.add(7);
        oldStack.add(8);

        System.out.print("Old stack: ");
        Task.printStack(oldStack);

        Stack<Integer> newStack = Task.swapPairedElements(oldStack);
        System.out.print("New stack: ");
        Task.printStack(newStack);
    }
}