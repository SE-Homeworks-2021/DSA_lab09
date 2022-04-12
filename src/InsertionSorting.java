import java.util.Arrays;

public class InsertionSorting{
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
    public static void insertionSort(int[] data){



        for (int unsort = 1; unsort < data.length; unsort++)
        {
            int temp = data[unsort];
            int len = unsort;

            while (len > 0 && data[len-1]> temp)
            {
                data[len] = data[len-1];
                len--;

            }

            data[len] = temp;
        }




    }

    public static void main(String[] args){
        int[] a = {77,44,99,66,33,55,88,22};
        System.out.println("Insertion Sort");
        print(a);
        insertionSort(a);
        print(a);
    }


}





