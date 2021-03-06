import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] array, final int search){
        Arrays.sort(array);
        int first = 0;
        int last = array.length - 1;
        int middle = (first + last) / 2;

        while (first <= last){
            if (search == array[middle])
                return middle;

            else if (search > array[middle])
                first = middle + 1;

            //i.e. if (search < array[middle])
            else
                last = middle - 1;

            middle = (first + last) / 2;
        }

        //if the searched number wasn't found -> return -1
        return -1;
    }
}
