package learning.array.mvc;

public class AlgorithmsMVC{
	
	public static void main(String[] args) {
		
		JavaAlgorithms theView = new JavaAlgorithms();
		ArrayStructure theModel = new ArrayStructure();
		AlgorithmsController theController = new AlgorithmsController(theView, theModel);
		theView.setVisible(true);
	}
}