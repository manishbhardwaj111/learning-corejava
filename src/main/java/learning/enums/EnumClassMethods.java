package learning.enums;

public class EnumClassMethods {

	public static void main(String[] args) {
		Beer b = Beer.KO;
		System.out.println(b.name()); // KO
		System.out.println(b.ordinal()); // 1
		System.out.println(Beer.valueOf("KO")); // KO
		System.out.println(Beer.valueOf(Beer.class,"KO")); // KO
		System.out.println(Beer.values()); // [Llearning.enumm.Beer;@4e25154f
	}

	enum Beer {
		KF(5), KO(10), RC(20);

		int i;

		Beer(int i){

		}
	}
}