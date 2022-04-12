import java.util.Arrays;

public class SelectionSorting{

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

    public static void selectionSort(int[] data){

        for (int length = data.length-1 ; length != 0; length--)
        {
            int position = 0;
            int max = data[position];


            for (int i = 0 ; i <= length; i++)
            {
                if (max < data[i])
                {
                    position = i;
                    max = data[i];
                }

            }

            swap(data,position,length);

        }

    }

    public static void main(String[] args){
        int[] data = {77,44,99,66,33,55,88,22};
        System.out.println("Selection Sort");
        print(data);
        selectionSort(data);
        print(data);
    }


}




