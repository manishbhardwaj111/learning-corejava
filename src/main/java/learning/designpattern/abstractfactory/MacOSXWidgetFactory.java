package learning.designpattern.abstractfactory;

//ConcreteFactory2
public class MacOSXWidgetFactory implements AbstractWidgetFactory {
	// create a MacOSXWindow
	public Window createWindow() {
		MacOSXWindow window = new MacOSXWindow();
		return window;
	}
}