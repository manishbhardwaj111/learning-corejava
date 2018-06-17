package learning.collection;

import java.util.ArrayList;

public class ArrayListSearchingDemo {

	public static void main(String[] args) {
		
		ArrayList<Studentt> list = new ArrayList<>();
		list.add(new Studentt(1,"Manish1",101));
		list.add(new Studentt(2,"Manish2",102));
		list.add(new Studentt(3,"Manish3",103));
		list.add(new Studentt(4,"Manish4",104));
		list.add(new Studentt(5,"Manish5",105));
		
		System.out.println(list);
		System.out.println(list.indexOf(new Studentt(1,"Manish1",101)));
	    
	}

}



class Studentt {
	int id;
	@Override
	public String toString() {
		return "Studentt [id=" + id + ", name=" + name + ", rollno=" + rollno + "]";
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + rollno;
//		return result;
//	}
	@Override
	public boolean equals(Object obj) {
		return this.rollno == ((Studentt)obj).rollno;
	}
	public Studentt(int id, String name, int rollno) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
	}
	String name;
	int rollno;
}
