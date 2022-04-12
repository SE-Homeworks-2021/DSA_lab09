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

    public static void loopNgoNgo(Command command) {
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

            command.execute(j);

        }

        System.out.println("=====================================================");
    }

    public interface Command {
        void execute(Object data);
    }

    public static class BubbleSortingTest implements Command {
        public void execute(Object data) {
            int random_num = (int) data;

            int[] array = ranPong(random_num);
            System.out.println("Bubble Sort : " + random_num);

            long startTime = System.currentTimeMillis();
            BubbleSorting.bubbleSort(array);
            long endTime = System.currentTimeMillis();

            System.out.println("Elapsed time = " + (endTime - startTime));
            System.out.println();
        }

    }

    public static class SelectionSortingTest implements Command {
        public void execute(Object data) {
            int random_num = (int) data;

            int[] array = ranPong(random_num);
            System.out.println("SelectionSort : " + random_num);

            long startTime = System.currentTimeMillis();
            SelectionSorting.selectionSort(array);
            long endTime = System.currentTimeMillis();

            System.out.println("Elapsed time = " + (endTime - startTime));
            System.out.println();
        }

    }

    public static class InsertionSortingTest implements Command {
        public void execute(Object data) {
            int random_num = (int) data;

            int[] array = ranPong(random_num);
            System.out.println("insertionSort : " + random_num);

            long startTime = System.currentTimeMillis();
            SelectionSorting.selectionSort(array);
            long endTime = System.currentTimeMillis();

            System.out.println("Elapsed time = " + (endTime - startTime));
            System.out.println();
        }

    }

    public static class QuickSortTest implements Command {
        public void execute(Object data) {
            int random_num = (int) data;

            int[] array = ranPong(random_num);
            System.out.println("QuickSort : " + random_num);

            long startTime = System.currentTimeMillis();
            QuickSort.qSort(array, 0, array.length - 1);
            long endTime = System.currentTimeMillis();

            System.out.println("Elapsed time = " + (endTime - startTime));
            System.out.println();
        }

    }


    public static void main(String... args) {
        loopNgoNgo(new BubbleSortingTest());
        loopNgoNgo(new SelectionSortingTest());
        loopNgoNgo(new InsertionSortingTest());
        loopNgoNgo(new QuickSortTest());
        System.out.println("This is the end");
    }
}