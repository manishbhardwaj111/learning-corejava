package learning.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	private ArrayList<String> empList;

	public Employees() {
		empList = new ArrayList<String>();
	}

	public Employees(ArrayList<String> list) {
		this.empList = list;
	}

	public void loadData() {
		// read all employees from database and put into the list
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}

	public ArrayList<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		ArrayList<String> temp = new ArrayList<String>();
		for (String s : this.getEmpList()) {
			temp.add(s);
		}
//		ArrayList<String> temp = (ArrayList<String>) this.getEmpList().clone();
		return new Employees(temp);
	}
}