public class CeasarCipher {
    public static void main(String[] args) {
        System.out.println(CeasarCipher.cipher("abcdef", 1));
    }

    public static String cipher(String string, int shift){
        if (shift < 0)
            shift = (shift % 26) + 26;

        char [] stringAsCharArray = string.toCharArray();

        for (int i = 0; i < string.length(); i++){
            if (Character.isLowerCase(stringAsCharArray[i]))
                stringAsCharArray[i] = (char)(((stringAsCharArray[i]-('a'-1) + shift) % 26 ) + ('a'-1));

            //i.e. if (Character.isUpperCase(ch))
            else
                stringAsCharArray[i] = (char)(((stringAsCharArray[i]-('A'-1) + shift) % 26 ) + ('A'-1));
        }

        return String.valueOf(stringAsCharArray);
    }
}
