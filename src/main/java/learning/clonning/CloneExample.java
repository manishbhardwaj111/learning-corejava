package learning.clonning;

import learning.model.Employee;

public class CloneExample implements Cloneable {

	private Employee emploee; 
	
	public CloneExample(Employee emploee) {
		this.emploee=emploee;
	}
	
	@Override
	public String toString() {
		return "CloneExample [emploee=" + emploee + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException  {

		CloneExample obj = new CloneExample(new Employee(12));
		CloneExample obj1 = obj.clone();
		CloneExample obj2 = obj.clone();
		
		System.out.println("obj  = "+obj);
		System.out.println("obj1 = "+obj1);
		System.out.println("obj2 = "+obj2);

		//  =======Output=========
//		obj  = CloneExample [emploee=learning.model.Employee@7852e922]
//		obj1 = CloneExample [emploee=learning.model.Employee@7852e922]
//		obj2 = CloneExample [emploee=learning.model.Employee@7852e922]
		
	    //  =======Output[After commenting line 45]=========
//		obj  = CloneExample [emploee=learning.model.Employee@7852e922]
//		obj1 = CloneExample [emploee=learning.model.Employee@4e25154f]
//		obj2 = CloneExample [emploee=learning.model.Employee@70dea4e]

		
		
	}

	@Override
    protected CloneExample clone() throws CloneNotSupportedException {
		CloneExample clone = (CloneExample) super.clone();
		clone.emploee = this.emploee.clone(); // To be eager cloning of EmbeddedObject
        return clone;
    }
}