import java.util.Arrays;

public class BubbleSorting{
    //print() method
    private static void print(int[] a){

        System.out.println(Arrays.toString(a));

    }

    //swap() method
    private static void swap(int[] a, int i, int j){

        int temp = a[i];

        a[i] = a[j];
        a[j] = temp;

    }

    //bubbleSort() method
    public static void bubbleSort(int[] a){

        for (int round = 1; round < a.length ; round++) {

            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                }
            }

        }
    }


    public static void main(String[] args){
        int[] a = {77,44,99,66,33,55,88,22};
        System.out.println("Bubble Sort");
        print(a);
        bubbleSort(a);
        print(a);
    }


}




