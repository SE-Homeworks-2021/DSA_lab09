import java.util.Arrays;

public class QuickSort_Explain {

    //print() method
    private static void print(int[] a){

        System.out.println(Arrays.toString(a));

    }

    private static void qSort(int[] a, int low, int high) {

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

        System.out.println();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Start");
        System.out.println("Pivot :" + pivot);
        System.out.println("First :" + pivot);
        System.out.println("Last  :" + a[high]);

        for (int next = low + 1; next <= high; next++)
        {

            if (a[next] < pivot)
            {
                System.out.println();
                System.out.println("first : " + a[first]);
                System.out.println("next  : "+a[next]+" < "+"pivot"+"");
                System.out.print("move  : " + a[next] + " ");
                System.out.println("after first");
                System.out.println("(aka. go S1)");


                System.out.println("move first");
                first++;       // next value become first

                System.out.println();


                System.out.println("Before");
                print(a);

                swap(a,next,first);     // go to S1
                System.out.println("=================================");


                System.out.println("After");
                print(a);


            }



            if (next+1 < a.length-1)
            {
                System.out.println("\nfirst : " + a[first]);
                System.out.println("next  : " + a[next+1]);
            }



        }

        System.out.println();
        System.out.println("=============="+" END "+"==============");
        System.out.println("move pivot to after S1");

        System.out.println();
        System.out.println("Before");
        print(a);

        swap(a,low,first);      // take pivot to border S1
        System.out.println("=================================");

        System.out.println("After");
        print(a);

        System.out.println();
        System.out.println("pivotInedx : " + first);
        System.out.println();


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
        System.out.println();
        qSort(data, 0, data.length- 1);
        print(data);
    }
}
