package learning.qa;

public class Question {

	public static void main(String[] args) {
		call(null);
	} 

	public static void call(Object value) {
		System.out.println("Object");
	}

	public static void call(Exception value) {
		System.out.println("Exception");
	}
	
	public static void call(ArithmeticException value) {
		System.out.println("ArithmeticException");
	}
}