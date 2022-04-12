import java.util.Arrays;

public class QuickSort {

    //print() method
    private static void print(int[] a){

        System.out.println(Arrays.toString(a));

    }

    public static void qSort(int[] a, int low, int high) {

        int pivotInedx;

        if(low < high)  // base case
        {
            pivotInedx = partition(a, low, high);

            qSort(a, low, pivotInedx - 1);
            qSort(a, pivotInedx + 1, high);

        }

    }

    private static int partition(int[] a, int low, int high) {

        int pivot = a[low];     // main
        int first = low;        // just a starting point

        for (int next = low + 1; next <= high; next++)
        {

            if (a[next] < pivot)
            {

                first++;       // next value become first

                swap(a,next,first);     // go to S1

            }

        }

        swap(a,low,first);      // take pivot to border S1

        return first;
    }

    public static void swap(int[] a, int i, int j) {

        int temp = a[i];

        a[i] = a[j];
        a[j] = temp;

    }

    public static void main(String[] args){
        int[] data = {77,44,99,66,33,55,88,22};
        System.out.println("Quick Sort");
        print(data);
        qSort(data, 0, data.length- 1);
        print(data);
    }
}
