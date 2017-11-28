package learning.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1Exercise {

	public static void main(String[] args) {

		List<Person> people=Arrays.asList(
				new Person("EMP-1","Chris","Latham",14),		
				new Person("EMP-4","George","Bailey",3),		
				new Person("EMP-5","Chrles","Deck",4),		
				new Person("EMP-6","Smith","George",31),		
				new Person("EMP-7","John","Anderson",33),		
				new Person("EMP-8","Broad","Clerk",23),		
				new Person("EMP-9","John","Cock",54)		
		);
		// Create a method that prints all elements in list
		   System.out.println("Create a method that prints all elements in list");
		   printAll(people);
		// sort list by last name 
		   System.out.println("Sort list by last name");
		   sortBylastName(people);  	
		//Create a method that prints all elements that have last name start with C
		   System.out.println("Create a method that prints all elements that have last name start with C");
		   printAllHaveLastNameWithC(people);
	}

	private static void printAllHaveLastNameWithC(List<Person> people) {
		people.stream()
		      .filter(p -> p.getLastName().startsWith("C"))
		      .forEach(System.out::println);
	}

	private static void printAll(List<Person> people) {
		people.forEach(System.out::println);
		
	}

	private static void sortBylastName(List<Person> people) {
		Collections.sort(people, (p1 , p2) -> p1.getLastName().compareTo(p2.getLastName()));
		printAll(people);
	}	
}