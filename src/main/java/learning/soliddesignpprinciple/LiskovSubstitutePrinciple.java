package learning.soliddesignpprinciple;

public class LiskovSubstitutePrinciple {

	public static void main(String[] args) {

	}

}

class Employee{
	public int id;// with getter and setter
	public String name; // with getter nad setter
	
	public Employee() {
		
	}
	
    public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
    
    public double calculateBonus(double salary) {
    	return salary*(.1); // 10 pct
    }
} 
