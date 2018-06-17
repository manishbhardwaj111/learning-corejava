package learning.designpattern.prototype;

public class ProtypeDesignPattern {

	public static void main(String[] args) {

		BookShop bs = BookShopFactory.createBookShop();
		BookShop bs1 = BookShopFactory.createBookShop();
		System.out.println("Bookshop  == " + bs.toString());
		System.out.println("Bookshop1 == " + bs1.toString());
		bs.getList().clear();
		System.out.println("Bookshop  list  == " + bs.getList().toString());
		System.out.println("Bookshop1 list  == " + bs1.getList().toString());
		System.out.println("Bookshop  list  == " + System.identityHashCode(bs.getList()));
		System.out.println("Bookshop1 list  == " + System.identityHashCode(bs1.getList()));

	}
}