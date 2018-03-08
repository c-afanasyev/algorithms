import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {0,1,2,3,5,7,12,25,77,32}, 32));
    }

    public static int binarySearch(int[] array, final int search){
        Arrays.sort(array);
        int first = 0;
        int last = array.length - 1;
        int middle = (first + last) / 2;

        while (first <= last){
            if (array[middle] == search)
                return middle;

            else if (array[middle] < search)
                first = middle + 1;

            //i.e. if (array[middle] > search)
            else
                last = middle - 1;

            middle = (first + last) / 2;
        }

        //if the searched number wasn't found -> return -1
        return -1;
    }
}
