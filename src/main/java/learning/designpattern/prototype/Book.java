package learning.designpattern.prototype;

public class Book implements Cloneable {
	private String name;

	protected Book clone() throws CloneNotSupportedException {
		return (Book) super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "B" + hashCode();
	}
}