package learning.soliddesignpprinciple;

public class OpenClosedPrinciple {

	public static void main(String[] args) {

		Emp manish = new Perm(1,"manish");
		Emp ritesh = new Perm(1,"manish");
		System.out.println(manish+" "+manish.calculateBonus(10000));
		System.out.println(ritesh+" "+ritesh.calculateBonus(10000));
	}
}

abstract class Emp {
	public int id;// with getter n setter
	public String name; // with getter n setter

	public Emp() {

	}

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

//	abstract public double calculateBonus(double salary) {
//		return salary * (0.1); // 10 pct
//	}
	
	abstract public double calculateBonus(double salary);
}

class Temp extends Emp{
	public Temp() {
        super();
	}

	public Temp(int id, String name) {
		super(id,name);
	}
	
	public double calculateBonus(double salary) {
		return salary * (0.05); // 5 pct
	}
}

class Perm extends Emp{
	public Perm() {
        super();
	}

	public Perm(int id, String name) {
		super(id,name);
	}
	
	public double calculateBonus(double salary) {
		return salary * (0.010); // 10 pct
	}
}