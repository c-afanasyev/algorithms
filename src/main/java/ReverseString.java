public class ReverseString {
    public static String reverseString(String string){
        char[] reversed = string.toCharArray();

        int length = string.length();

        int temp, i, j;

        for (i = 0, j = length-1; i < j; i++, j--){
            temp = reversed[i];
            reversed[i] = reversed[j];
            reversed[j] = (char)temp;
        }

        return String.valueOf(reversed);
    }
}
