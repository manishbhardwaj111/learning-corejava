package learning.io;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;;
public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your rollno");
		int rollno = sc.nextInt();
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your fee");
		double fee = sc.nextDouble();
		System.out.println("Rollno:" + rollno + " name:" + name + " fee:" + fee);
		sc.close();
	}
}