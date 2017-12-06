package learning.nestedclass;

public class Outer {

	private String fname = "manish bhardwaj";	
//	public static void main(String[] hjhjh) {
//		Outer outer= new Outer();
//		Outer.Inner inner= outer.new Inner();
//		inner.print();
//	}
}

class Inner {

	Outer outer=null;
	Inner(Outer outer){
		this.outer=outer;
	}
	
	public void print() {
		//System.out.println("name :: "+outer.fname);
	}
}