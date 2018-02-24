package learning.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExp {

	public static void main(String[] args) {
		
		//Streams filter() and collect()
		List<String> lines = Arrays.asList("spring", "node", "mkyong");
        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"mkyong".equals(line))     // we dont like mkyong
                .collect(Collectors.toList());              // collect the output and convert streams to a List
        result.forEach(System.out::println);                //output : spring, node
        
        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        //Streams filter(), findAny() and orElse()
        Person result1 = persons.stream()                        // Convert to steam
                .filter(x -> "jack".equals(x.getName()))        // we want "jack" only
                .findAny()                                      // If 'findAny' or 'findFirst' then return found
                .orElse(null);                                  // If not found, return null
        System.out.println(result1);

        Person result2 = persons.stream()
                .filter(x -> "ahmook".equals(x.getName()))
                .findAny()
                .orElse(null);
        System.out.println(result2);
        
        //Streams filter() and map()
        String name = persons.stream()
                .filter(x -> "jack".equals(x.getName()))
                .map(Person::getName)                        //convert stream to String
                .findAny()
                .orElse("");
        System.out.println("name : " + name);

	}

}

class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
    

}
