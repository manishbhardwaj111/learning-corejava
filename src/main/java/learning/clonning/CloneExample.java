package learning.clonning;

import learning.model.Person;

public class CloneExample implements Cloneable {

	private Person person; 
	
	public CloneExample(Person person) {
		this.person=person;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException  {

		CloneExample obj = new CloneExample(new Person("1","Manish","Bhardwaj",12));
		CloneExample obj1 = obj.clone();
		CloneExample obj2 = obj.clone();
		
		System.out.println("obj="+obj);
		System.out.println("obj1="+obj1);
		System.out.println("obj2="+obj2);
		
	}

	@Override
	public String toString() {
		return "CloneExample [person=" + person + "]";
	}

	@Override
    protected CloneExample clone() throws CloneNotSupportedException {
		CloneExample clone = (CloneExample) super.clone();
		clone.person = this.person.clone(); // To be eager cloning of EmbeddedObject
        return clone;
    }
}