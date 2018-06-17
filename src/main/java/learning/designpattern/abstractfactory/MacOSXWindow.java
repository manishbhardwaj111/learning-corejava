package learning.designpattern.abstractfactory;

// ConcreteProductA2
public class MacOSXWindow implements Window {
	public void setTitle(String text) {
		// Mac OSX specific behaviour
	}

	public void repaint() {
		// Mac OSX specific behaviour
	}
}