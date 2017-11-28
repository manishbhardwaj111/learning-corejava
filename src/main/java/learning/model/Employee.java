package learning.model;

public class Employee implements Cloneable{

	public Employee(int id) {
		super();
		this.id = id;
	}

	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
	
}