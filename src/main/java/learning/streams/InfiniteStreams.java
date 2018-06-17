package learning.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreams {
	public static void main(String args[]) {

		
		boolean lengthOver5 = Stream.of("two", "three", "eighteen").anyMatch(
	            s -> s.length() > 5);
Object[] objects = Stream.of(1, 2).toArray();
List<Person> sortedNumbers = Stream.of(new Person("Manish"),new Person("Bharti"))
				                           .sorted((p,q) -> p.getName().compareTo(q.getName()))
	            .collect(Collectors.toList());
		System.out.println(sortedNumbers);//                 
	}
}    

class Person{
	private String name;

	Person(String name){
		this.name=name;
	} 
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
}