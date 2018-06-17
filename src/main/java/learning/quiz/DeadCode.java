package learning.quiz;

import java.util.*;

public class DeadCode {

    public void howToDoInJava_method1() {
        System.out.println("how to do");
        return;
      //  System.out.println("in java");
    }

    public void howToDoInJava_method2() {
        System.out.println("how to do");
        if (true) {
            return;
        }
        System.out.println("in java");
    }

    public void howToDoInJava_method3() {
        System.out.println("how to do");
        while (true) {
            return;
        }
       // System.out.println("in java");
    }

    public static class NonRepetedChar {

        public static void main(String[] args) {
            System.out.println(getFirstNonRepeatedChar("ammaazon"));
            System.out.println(firstNonRepeatingChar("ammaazon"));

        }

        private static Character getFirstNonRepeatedChar(String pattern) {
            Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
            for (char chars : pattern.toCharArray()) {
                if (map.containsKey(chars)) {
                    map.put(chars, map.get(chars) + 1);
                } else {
                    map.put(chars, 0);
                }
            }
            for (Character key : map.keySet()) {
                if (map.get(key) == 0) {
                    return key;
                }
            }
            return null;
        }

        public static char firstNonRepeatingChar(String word) {
            Set<Character> repeating = new HashSet<Character>();
            List<Character> nonRepeating = new ArrayList<Character>();
            for (int i = 0; i < word.length(); i++) {
                System.out.println(repeating.toString()+" <= Array  Set => "+nonRepeating.toString());
                char letter = word.charAt(i);
                if (repeating.contains(letter)) {
                    continue;
                }
                if (nonRepeating.contains(letter)) {
                    nonRepeating.remove((Character) letter);
                    repeating.add(letter);
                } else {
                    nonRepeating.add(letter);
                }

            }
            return nonRepeating.get(0);
        }

    }

    public static class Question {

        public static void main(String[] args) {
            call(null);
        }

        public static void call(Object value) {
            System.out.println("Object");
        }

        public static void call(Exception value) {
            System.out.println("Exception");
        }

        public static void call(ArithmeticException value) {
            System.out.println("ArithmeticException");
        }
    }
}