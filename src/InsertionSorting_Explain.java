import java.util.Arrays;

public class InsertionSorting_Explain {
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



        for (int unsorted = 1; unsorted < data.length; unsorted++)
        {
            int temp = data[unsorted];

            int len = unsorted;

            System.out.println("=========== Copy " + data[unsorted]+" ============");
            print(data);
            System.out.println("================================");
            System.out.println();

            while (len > 0 && data[len-1] > temp)
            {



                System.out.println("========= "+ "Move "+ data[len-1] + " To " + data[len]+" ========");

                data[len] = data[len-1];

                print(data);
                System.out.println("================================");
                System.out.println();

                len--;

            }

            data[len] = temp;
            System.out.println("============ "+"Drop " + temp+" ===========");
            print(data);

            System.out.println("============== END =============");
            System.out.println();

        }




    }

    public static void main(String[] args){
        int[] a = {77,44,99,66,33,55,88,22};
        System.out.println("Insertion Sort");
        System.out.println();
//        print(a);
        insertionSort(a);
//        print(a);
    }


}





