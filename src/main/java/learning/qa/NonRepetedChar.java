package learning.qa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NonRepetedChar {

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
