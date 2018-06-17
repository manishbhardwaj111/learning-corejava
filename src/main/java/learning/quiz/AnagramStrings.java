package learning.quiz;

import java.util.Arrays;

public class AnagramStrings {

    public static void main(String[] args) {
        System.out.println(checkAngram("bba", "abb"));
    }

    public static int checkAngram(String str1, String str2) {
        if (str1.equalsIgnoreCase("str2")) {
            return 0;
        } else if (str1.length() != str2.length()) {
            return -1;
        } else {
            char[] char_array1 = str1.toLowerCase().toCharArray();
            char[] char_array2 = str2.toLowerCase().toCharArray();
            Arrays.sort(char_array1);
            Arrays.sort(char_array2);
            str1 = new String(char_array1);
            str2 = new String(char_array2);
            if (str1.equals(str2))
                return 0;
            else {
                int count = 0;
                for (int i = 0; i < str1.length(); i++) {
                    if (str1.charAt(i) != str2.charAt(i))
                        count++;
                }
                return count;
            }
        }
    }
}