package learning.designpattern.prototype;

public class BookShopFactory {

	private static BookShop bookShop;

	public static BookShop createBookShop() {
		if (bookShop == null) {
			bookShop = new BookShop();
		}
		return bookShop.clone();
	}
}