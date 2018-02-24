package learning.collection;

import java.util.Arrays;
import java.util.List;


public class StreamReduceExp {
	public static void main(String[] args) {
		// Stream.reduce() with Accumulator
		// reduce(BinaryOperator accumulator)
		int[] int_array = { 23, 43, 56, 97, 32 };
		Arrays.stream(int_array).reduce((x, y) -> x + y).ifPresent(System.out::println);
		Arrays.stream(int_array).reduce(Integer::sum).ifPresent(System.out::println);
		

		// Stream.reduce() with Identity and Accumulator
		// reduce(T identity, BinaryOperator<T> accumulator)
		// Set start value. Result will be start value + sum of array.
		int startValue = 100;
		int int_sum = Arrays.stream(int_array).reduce(startValue, (x, y) -> x + y);
		System.out.println(int_sum);
		int_sum = Arrays.stream(int_array).reduce(startValue, Integer::sum);
		System.out.println(int_sum);


		//Stream.reduce() with Identity, Accumulator and Combiner
		//reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)
		List<Integer> list2 = Arrays.asList(2, 3, 4);
		// Here result will be 2*2 + 2*3 + 2*4 that is 18.
		int res = list2.parallelStream().reduce(2, (s1, s2) -> s1 * s2, (p, q) -> p * q);
		System.out.println("ps = "+res);
		List<String> list1 = Arrays.asList("Mohan", "Sohan", "Ramesh");
		String result = list1.parallelStream().reduce("-", (s1, s2) -> s1 + s2);
		System.out.println(result);
        

		// Reduce Array to sum.
		int[] array = { 30, 10, 20, 40 };
		int sum = Arrays.stream(array).reduce(10, (x, y) -> x + y);
		System.out.println("Sum of Array: " + sum);
		
		// Reduce List to sum.
		List<Integer> list = Arrays.asList(30, 10, 20, 40);
		sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum of List: " + sum);
		
		// Reduce Array to String.
		String[] str_array = { "Mohan", "Sohan", "Mahesh" };
		Arrays.stream(str_array).reduce((x, y) -> x + ", " + y).ifPresent(s -> System.out.println("Array to String: " + s));
		 
		// Reduce List to String.
		List<String> str_list = Arrays.asList("Mohan", "Sohan", "Mahesh");
		str_list.stream().reduce((x, y) -> x + ", " + y).ifPresent(s -> System.out.println("List to String: " + s));		
		
	}
}