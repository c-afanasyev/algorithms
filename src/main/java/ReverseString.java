public class ReverseString {
    public static String reverseString(String string){
        char[] reversed = string.toCharArray();

        char temp;
        int i, j;

        for (i = 0, j = string.length()-1; i < j; i++, j--){
            temp = reversed[i];
            reversed[i] = reversed[j];
            reversed[j] = temp;
        }

        return String.valueOf(reversed);
    }
}