package learning.designpattern.command;

public interface FileSystemReceiver {
	void openFile();

	void writeFile();

	void closeFile();
}