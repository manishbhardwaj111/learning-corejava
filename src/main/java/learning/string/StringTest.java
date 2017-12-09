package learning.string;

public class StringTest {

	public static void main(String[] args) {
           StringBuffer sb= new StringBuffer(5);
           System.out.println("length = "+sb.length());
           System.out.println("capacity = "+sb.capacity());
           sb.append("mmmmmmm");
           System.out.println("length = "+sb.length());
           System.out.println("capacity = "+sb.capacity());
           sb.append("mmmmmmm");
           System.out.println("length = "+sb.length());
           System.out.println("capacity = "+sb.capacity());
           sb.append("mmmmmmm");
           sb.append("mmmmmmm");
           System.out.println("length = "+sb.length());
           System.out.println("capacity = "+sb.capacity());
           
           String name = "Manish" + "Bhardwaj";
           name="Mr. " + name;
           name = "mane"+ "namsd"+ "kdskjds" + "dhsjdshjd" ; 
	}
}