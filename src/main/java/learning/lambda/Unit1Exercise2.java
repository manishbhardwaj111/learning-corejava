package learning.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1Exercise2 {

	public static void main(String[] args) {

		List<Integer> numbers=Arrays.asList(7,8,2,3,4,5);
		// Create a method that prints all elements
		System.out.println("Prints all elements");
		printAll(numbers, n -> true);
		//Create a method that prints all odd element
		System.out.println("Prints all odd elements");
		printAll(numbers, n -> n%2 != 0);
		//Create a method that prints all even element
		System.out.println("Prints all even elements");
		printAll(numbers, n -> n%2 == 0);
		// Create a method that prints all elements in sorted order
		System.out.println("Prints all elements in sorted order");
		Collections.sort(numbers, (n1,n2) -> n1.compareTo(n2));
		printAll(numbers, n -> true);		
	}

	private static void printAll(List<Integer> number,Predicate<Integer> condition) {
		number.stream()
		      .filter(condition)
		      .forEach(System.out::println);
	}
}