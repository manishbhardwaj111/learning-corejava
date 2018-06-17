package learning.designpattern.prototype;

import java.util.ArrayList;

public class BookShop implements Cloneable {
	private ArrayList<Book> bookList;

	public BookShop() {
		bookList = new ArrayList<>();
		this.loadData();
	}

	@Override
	protected BookShop clone() {
		try {
			BookShop bookShop = (BookShop) super.clone();
			// bookShop.setList((ArrayList<Book>)bookShop.getList().clone());
			return bookShop;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Book> getList() {
		return bookList;
	}

	public void setList(ArrayList<Book> list) {
		this.bookList = list;
	}

	private void loadData() {
		for (int i = 0; i < 25; i++) {
			Book book = new Book();
			book.setName("BOOK " + 1);
			this.bookList.add(book);
		}
	}
}