package learning.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;

public class SpliteratorExample {

	public static void print(Spliterator<String> splititerator) {
		System.out.println(splititerator.characteristics()+" == "+splititerator.estimateSize());
	}
	
	public static void main(String[] args) {
		List<String> people = new ArrayList<>();
		Set<String> set = new TreeSet<>();
		int count = 0;
		while (count < 455) {
			people.add(""+Math.random());
			set.add(""+count++);
		}
				
		Spliterator<String> splititerator = people.spliterator();
		print(splititerator);
		Spliterator<String> splititerator1 = set.spliterator();
		print(splititerator);				
	}

}
