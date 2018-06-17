package learning.collection;

import java.util.HashSet;

public class HasSetDemo {

	public static void main(String[] args) {
		HashSet<Stu> set = new HashSet<>();
		set.add(new Stu(1,"manish"));
		set.add(new Stu(1,"manish"));
		System.out.println(set);
		System.out.println(set.contains(new Stu(1,"manish")));
	}

}

class Stu {
	
	public int id;
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stu other = (Stu) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + "]";
	}
	public Stu(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String name;
}
