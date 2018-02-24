package learning.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamSortedExp {

	public static void main(String[] args) {
		/*
		  1. sorted(): It sorts the elements of stream using natural ordering. The element class must 
		     implement Comparable interface. 
		  2. sorted(Comparator<? super T> comparator): Here we create an instance of Comparator using 
		     lambda expression. We can sort the stream elements in ascending and descending order. 
        */
		
		//Stream sorted() using Natural Ordering, Comparator and Reverse Ordering
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Mahesh", 12));
		list.add(new Student(2, "Suresh", 15));
		list.add(new Student(3, "Nilesh", 10));
		
		System.out.println("---Natural Sorting by Name---");
		List<Student> slist = list.stream().sorted().collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
		
		System.out.println("---Natural Sorting by Name in reverse order---");
		slist = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));		
		
		System.out.println("---Sorting using Comparator by Age---");
		slist = list.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
		
		System.out.println("---Sorting using Comparator by Age with reverse order---");
		slist = list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
		
		//Stream sorted() with Set
		Set<Student> set = new HashSet<Student>();
		set.add(new Student(1, "Mahesh", 12));
		set.add(new Student(2, "Suresh", 15));
		set.add(new Student(3, "Nilesh", 10));
		
		System.out.println("---Natural Sorting by Name---");
		set.stream().sorted().forEach(e -> System.out.println("Id:"
		          + e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
		
		System.out.println("---Natural Sorting by Name in reverse order---");
		set.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println("Id:"
		          + e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));		
		
		System.out.println("---Sorting using Comparator by Age---");
		set.stream().sorted(Comparator.comparing(Student::getAge))
		  .forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
		
		System.out.println("---Sorting using Comparator by Age in reverse order---");
		set.stream().sorted(Comparator.comparing(Student::getAge).reversed())
		  .forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
		
		
		//Stream sorted() with Map
		Map<Integer, String> map = new HashMap<>();
		map.put(15, "Mahesh");
		map.put(10, "Suresh");
		map.put(30, "Nilesh");
		
		System.out.println("---Sort by Map Value---");
	        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
	          .forEach(e -> System.out.println("Key: "+ e.getKey() +", Value: "+ e.getValue()));

		System.out.println("---Sort by Map Key---");
		map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
				.forEach(e -> System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue()));

		Map<Integer, Student> custom_map = new HashMap<Integer, Student>();
		custom_map.put(1, new Student(1, "Mahesh", 12));
		custom_map.put(2, new Student(2, "Suresh", 15));
		custom_map.put(3, new Student(3, "Nilesh", 10));
		// Map Sorting by Value i.e student's natural ordering i.e by name
		custom_map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach(e -> {
			Integer key = (Integer) e.getKey();
			Student std = (Student) e.getValue();
			System.out.println(
					"Key: " + key + ", value: (" + std.getId() + ", " + std.getName() + ", " + std.getAge() + ")");
		});
	}

}

class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Student ob) {
		return name.compareTo(ob.getName());
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == null) {
			return false;
		}
		final Student std = (Student) obj;
		if (this == std) {
			return true;
		} else {
			return (this.name.equals(std.name) && (this.age == std.age));
		}
	}

	@Override
	public int hashCode() {
		int hashno = 7;
		hashno = 13 * hashno + (name == null ? 0 : name.hashCode());
		return hashno;
	}
}
