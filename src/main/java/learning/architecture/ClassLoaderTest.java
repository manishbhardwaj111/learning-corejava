package learning.architecture;

public class ClassLoaderTest {
	
	public static void main(String[] args) {
		System.out.println(System.getProperty("java.ext.dirs"));
		System.out.println(ClassLoaderTest.class.getClassLoader());
	}
}