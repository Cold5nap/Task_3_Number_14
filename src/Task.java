import java.util.Stack;

public class Task {

    public static Stack<Integer> swapPairedElementsBasedOnJavaStack(Stack<Integer> oldStack) {
        Stack<Integer> newStack = new Stack<>();
        int index = 1, count = 0, lastIndex = oldStack.size() - 1;


        while (count < oldStack.size() ) {
            count++;
            newStack.add(oldStack.get(index));

            if (oldStack.size() % 2 != 0 && count == lastIndex) {
                newStack.add(oldStack.get(count));
                break;
            }

            if (index % 2 == 0) {
                index = index + 3;
            } else {
                index--;
            }
        }

        return newStack;
    }

    public static StackRealisation<Integer> swapPairedElementsBasedOnStackRealisation(StackRealisation<Integer> oldStack) throws Exception {
        StackRealisation<Integer> newStack = new StackRealisation<>();
        int index = 1, count = 0, lastIndex = oldStack.size() - 1;

        while (count < oldStack.size() ) {
            count++;
            newStack.add(oldStack.get(index));

            if (oldStack.size() % 2 != 0 && count == lastIndex) {
                newStack.add(oldStack.get(count));
                break;
            }

            if (index % 2 == 0) {
                index = index + 3;
            } else {
                index--;
            }
        }

        return newStack;
    }

    public static void printJavaStack(Stack<Integer> stack) {
        int count = 1;

        for (Integer element : stack) {
            if (count < stack.size()) {
                System.out.print(element + ", ");
            } else {
                System.out.println(element + ".");
            }
            count++;
        }
    }
    public static void printStackRealisation(StackRealisation<Integer> stack) {
        int count = 1;

        for (Integer element : stack) {
            if (count < stack.size()) {
                System.out.print(element + ", ");
            } else {
                System.out.println(element + ".");
            }
            count++;
        }
    }
}