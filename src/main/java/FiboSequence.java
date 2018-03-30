import java.util.ArrayList;
import java.util.stream.Stream;

public class FiboSequence {
    public static Integer[] getFiboSequence(int finalFiboNumber){
        int first=1, second=1, last=0;

        ArrayList<Integer> arrayOfFiboNumbers = new ArrayList<>();
        arrayOfFiboNumbers.add(1);
        arrayOfFiboNumbers.add(1);

        if (finalFiboNumber == 0){
            return new Integer[] {0};
        }

        if (finalFiboNumber == 1){
            return new Integer[] {1,1};
        }

        while (last<=finalFiboNumber){
            last = first+second;
            arrayOfFiboNumbers.add(last);
            first=second;
            second=last;
        }

        Integer[] array = new Integer[arrayOfFiboNumbers.size()];
        return arrayOfFiboNumbers.toArray(array);
    }
}
