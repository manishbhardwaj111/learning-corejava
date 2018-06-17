package learning.collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		Object INSTANCE = new Object();
		HashMap<Stud,Object> map = new HashMap<>();
		map.put(new Stud(1,"Manish1",101),INSTANCE);
		map.put(new Stud(2,"Manish2",102),INSTANCE);
		map.put(new Stud(3,"Manish3",103),INSTANCE);
		map.put(new Stud(4,"Manish4",104),INSTANCE);
		map.put(new Stud(5,"Manish5",105),INSTANCE);
		System.out.println(map.get(new Stud(2,"",105)));	
	}
}

class Stud {
	int id;
	@Override
	public String toString() {
		return "Studentt [id=" + id + ", name=" + name + ", rollno=" + rollno + "]";
	}


	@Override
	public int hashCode() {
		return rollno;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.rollno == ((Stud)obj).rollno;
	}
	
	public Stud(int id, String name, int rollno) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
	}
	String name;
	int rollno;
}
