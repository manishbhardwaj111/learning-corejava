package learning.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
	    list.add(10);
	    list.add(11);
	    list.add(12);
	    list.add(13);
	    System.out.println(list.toString());
	    list.remove(10);
	    System.out.println(list.toString());
	    list.get(list.indexOf(10));
// 		list.add(10);
//		list.add(11);
//		list.add(12);
//		list.add(13);
//		list.add(14);
//		list.add(15);
//		list.add(16);
	}

}
