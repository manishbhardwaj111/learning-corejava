package learning.designpattern.abstractfactory;

public class AbsractFactoryDesignPattern {

	public static void main(String[] args) {
		String currentPlatform = "MACOSX";
		AbstractWidgetFactory widgetFactory = null;
		if (currentPlatform == "MACOSX") {
			widgetFactory = new MacOSXWidgetFactory();
		} else {
			widgetFactory = new MsWindowsWidgetFactory();
		}
		Window window=widgetFactory.createWindow();
		window.setTitle("manish");
		window.repaint();
	}
}