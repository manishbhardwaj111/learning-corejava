package learning.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParellelProcessingTest {

	public static void main(String[] args) {

		List<String> people = new ArrayList<>();
		int count=0;
		while(count<65455) {
			people.add("");
		}
		long before  = System.currentTimeMillis();
		people.stream().forEach(name -> System.out.print(""));
		System.out.println("\nTotal time == "+ (System.currentTimeMillis() - before));
		
		before  = System.currentTimeMillis();
		people.parallelStream().forEach(name -> System.out.print(""));
		System.out.println("\nTotal time == "+ (System.currentTimeMillis() - before));
	}

}