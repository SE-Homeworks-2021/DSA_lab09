public class BinarySearch {
    public static void main(String[] args) {
        int[] data = { 2, 4, 5, 7, 8, 9, 12, 14, 17, 19, 22, 25, 27, 28, 33, 37 };
        //searching value
        int value = 22;

        //searching
        int position = search(data, value);

        System.out.println("Found " + value + " at position " + position);

    }


    public static int search(int[] data, int value) {

        int first = 0;
        int last = data.length;

        int mid = (first+last)/2;

        while (first-1 < last)
        {
            if( value == data[mid])
            {
                return mid;
            }

            else if( value < data[mid])
            {
                last = mid - 1;
            }

            else {
                first = mid + 1;
            }

            mid = (first+last)/2;

//            System.out.println("first : " + first);
//            System.out.println("last  : " + last);
//            System.out.println("mid   : " + mid);
//            System.out.println(first < last);
//            System.out.println("\n");
        }

//        System.out.println(value == data[mid]);
        return -1;
    }



}
