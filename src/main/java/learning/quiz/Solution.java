package learning.quiz;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        char[] ac = a.toCharArray();
        Arrays.sort(ac);
        a = new String(ac);
        ac = b.toCharArray();
        Arrays.sort(ac);
        b = new String(ac);

        if (a.equals(b)) {
            System.out.println(0);
        } else {
            HashMap<Character, Integer> anargam_char = new HashMap<>();
            int length = a.length();
            if (b.length() > a.length()) {
                length = b.length();
            }
            for (int i = 0; i < length; i++) {
                if (i < a.length())
                    anargam_char.put(a.charAt(i), anargam_char.containsKey(a.charAt(i)) ? anargam_char.get(a.charAt(i)) + 1 : 1);
                if (i < b.length())
                    anargam_char.put(b.charAt(i), anargam_char.containsKey(b.charAt(i)) ? anargam_char.get(b.charAt(i)) - 1 : -1);
            }
            int count = 0;
            for(Map.Entry<Character,Integer> entry: anargam_char.entrySet()){
                count += Math.abs(entry.getValue());
            }
            System.out.println(count);
        }
        scanner.close();
    }
}
