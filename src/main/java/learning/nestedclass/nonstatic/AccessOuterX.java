package learning.nestedclass.nonstatic;

public class AccessOuterX {
	
	int x=10;
	static int y=20;

	class Inner{
		int x =20;
		void show() {
			System.out.println(x);
			System.out.println(y);
			System.out.println(AccessOuterX.this.x); // access x of outer class
		}
	}
	
	public static void main(String[] args) {
		AccessOuterX outer= new AccessOuterX();
		AccessOuterX.Inner inner= outer.new Inner();
		inner.show(); 
	}
}