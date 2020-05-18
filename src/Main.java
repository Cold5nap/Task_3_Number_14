import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1 || args.length > 3) throw new Exception("Enter arguments in this order:" +
                "1) con or win" +
                "2) input file name" +
                "3) output file name");//можно не вводить 2 и 3 пункт или только 3 пункт
        if (args[0].equals("con")) {
            consoleStart(args);
        } else {
            if (args[0].equals("win")) {
                winStart(args);
            } else {
                throw new Exception("First argument is wrong");
            }
        }
    }

    /**
     * если передали аргумент "win"
     */
    static void winStart(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new FrameMain(args).setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * если передали аргумент "con"
     */
    static void consoleStart(String[] args) throws Exception {
        Stack<Integer> oldStack = new Stack<>();
        Arguments arguments = new Arguments(args);
        int[] arrOfLines = arguments.readIntArrFromConsoleOrFile();

        convertIntArrToStack(arrOfLines, oldStack);

        System.out.println("------------");
        System.out.println("Origin Stack: ");
        Task.printJavaStack(oldStack);
        System.out.println("------------");

        Stack<Integer> newStack = Task.swapPairedElementsBasedOnJavaStack(oldStack);

        System.out.println("New Stack: ");
        Task.printJavaStack(newStack);
        System.out.println("------------");

        arguments.writeStackToFile(newStack);
    }

    /**
     * Преобразует массив int в stack
     */
    static void convertIntArrToStack(int[] arr, Stack<Integer> stack) {
            for (int element : arr) {
                stack.add(element);
            }
    }



}