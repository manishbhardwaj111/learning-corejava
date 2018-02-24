package learning.collection;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExp {

	public static void main(String[] args) {

		List<String> alpha = Arrays.asList("a", "b", "c", "d");
		List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect); // [A, B, C, D]

		// A List of Strings to Uppercase
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
		System.out.println(collect1); // [2, 4, 6, 8, 10]
				
		List<Staff> staff = Arrays.asList( new Staff("mkyong", 30, new BigDecimal(10000)),
				            			   new Staff("jack", 27, new BigDecimal(20000)),
				            			   new Staff("lawrence", 33, new BigDecimal(30000))
				            			 );
		
		//List of objects -> List of String
		List<String> collect2 = staff.stream().map(x -> x.getName()).collect(Collectors.toList());
		System.out.println(collect2); // [mkyong, jack, lawrence]
		
		
		// List of objects -> List of other objects
        List<StaffPublic> result = staff.stream().map(temp -> {
            StaffPublic obj = new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            if ("mkyong".equals(temp.getName())) {
                obj.setExtra("this field is for mkyong only!");
            }
            return obj;
        }).collect(Collectors.toList());
        System.out.println(result);
	}
}


class Staff {
	private String name;
	private int age;
	private BigDecimal salary;

	public Staff(String name, int age, BigDecimal salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
}

class StaffPublic {
	private String name;
	private int age;
	private String extra;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}
}