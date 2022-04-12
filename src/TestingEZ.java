import java.util.Random;

public class TestingEZ {
    public static void callCommand(Command command, Object data) {
        command.execute(data);
    }

    public static int[] ranPong(int MAX) {

        Random rand = new Random();
        int[] data = new int[MAX];

        for (int i = 0; i < MAX; i++) {

            data[i] = rand.nextInt(MAX) + 1;

        }

        return data;
    }

    public static void loopNgoNgo(Command command,String name) {
        for (int i = 1; i <= 5; i++) {
            int j = 0;

            if (i == 1) {
                j = 10_000;
            } else if (i == 2) {
                j = 30_000;
            } else if (i == 3) {
                j = 50_000;
            } else if (i == 4) {
                j = 70_000;
            } else if (i == 5) {
                j = 100_000;
            }

            int random_num = j;

            int[] array = ranPong(random_num);
            System.out.println(name + " : " + random_num);

            long startTime = System.currentTimeMillis();

            command.execute(array);

            long endTime = System.currentTimeMillis();

            System.out.println("Elapsed time = " + (endTime - startTime));
            System.out.println();

        }

        System.out.println("=====================================================");
    }

    public interface Command {
        void execute(Object data);
    }

    public static class BubbleSortingTest implements Command {

        public void execute(Object data) {

            BubbleSorting.bubbleSort((int[]) data);

        }

    }

    public static class SelectionSortingTest implements Command {
        public void execute(Object data) {

            SelectionSorting.selectionSort((int[]) data);

        }

    }

    public static class InsertionSortingTest implements Command {
        public void execute(Object data) {

            InsertionSorting.insertionSort((int[]) data);

        }

    }

    public static class QuickSortTest implements Command {
        public void execute(Object data) {

            int[] arrray = (int[]) data;
            QuickSort.qSort(arrray ,0, arrray.length - 1);

        }

    }

    public static void main(String... args) {
        loopNgoNgo(new BubbleSortingTest(), "BubbleSort");
        loopNgoNgo(new SelectionSortingTest(), "SelectionSort");
        loopNgoNgo(new InsertionSortingTest(), "InsertionSort");
        loopNgoNgo(new QuickSortTest(), "QuickSort");
        System.out.println("This is the end");
    }
}