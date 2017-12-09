package learning.swing.calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Calculator extends KeyAdapter implements ActionListener {
	JMenuBar menubar;
	JMenu help;
	JMenuItem item;
	JFrame jf;
	JTextField tf, tf1;
	JButton[] bt;
	JPanel jp1, jp2;
	static double result = 0;

	Calculator(String s) {
		jf = new JFrame("Calculator");
		jf.setResizable(false);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		WindowUtilities.setNimbusLookAndFeel();
		jp1 = new JPanel();
		jp1.setLayout(new BorderLayout());

		menubar = new JMenuBar();
		help = new JMenu("Help");
		item = new JMenuItem("View Help");
		item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.SHIFT_MASK));
		help.add(item);
		item = new JMenuItem("About Calculator");
		item.addActionListener(this);
		item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.SHIFT_MASK));
		help.add(item);

		menubar.add(help);
		jp1.add(menubar, BorderLayout.NORTH);

		tf = new JTextField("");
		tf.addKeyListener(this);
		tf1 = new JTextField("0");
		jf.add(tf1);
		tf1.setVisible(false);
		Border b = BorderFactory.createTitledBorder("Display");
		tf.setBorder(b);
		Font font = new Font("Sans_Serif", Font.PLAIN, 18);
		tf.setFont(font);
		tf.setBackground(new Color(176, 174, 187));
		jp1.add(tf, BorderLayout.SOUTH);
		jf.add(jp1, BorderLayout.NORTH);

		jp2 = new JPanel();
		jp2.setLayout(new GridLayout(4, 5, 2, 2));
		jp2.setBackground(new Color(202, 164, 249));
		bt = new JButton[20];
		String[] bString = { "9", "8", "7", "6", "5", "4", "3", "2", "1", "0", "+", "-", "/", "*", ".", "1/x", "CLR",
				"^", "sqrt", "=" };
		for (int i = 0; i < bt.length; i++) {
			bt[i] = new JButton(bString[i]);
			bt[i].addActionListener(this);
			bt[i].setForeground(Color.black);
			bt[i].setFont(new Font("Sans_Serif", Font.PLAIN, 16));
			jp2.add(bt[i]);
		}
		jf.add(jp2, BorderLayout.CENTER);

		jf.pack();
		jf.setVisible(true);
	}

	public static void main(String[] s) {
		new Calculator("Calculator");
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("About Calculator")) {
			JFrame frame = new JFrame("About Calculator");
			// frame.setUndecorated(true);
			frame.setResizable(false);
			String text = "<html><b>Oracle Java</b><br><p>This product is property of oracle foundation.All trademark and copy right are reserved by <b>ORCALE</b>.</p><br>Developer is <b><i>MANISH BHARDWAJ</b></i>.<html>";
			JLabel label = new JLabel(text, JLabel.CENTER);
			frame.add(label, BorderLayout.NORTH);
			Toolkit t = frame.getToolkit();
			Dimension screensize = t.getScreenSize();
			int width = screensize.width * 8 / 10;
			int height = screensize.height * 8 / 10;
			frame.setBounds(width / 4, height / 4, width, height);
			frame.pack();
			frame.setVisible(true);
		}
		if (e.getSource() == bt[0]) {
			String s = tf.getText();
			tf.setText(s + "9");
			String s1 = tf1.getText();
			tf1.setText(s1 + "9");
		}

		if (e.getSource() == bt[1]) {
			String s = tf.getText();
			tf.setText(s + "8");
			String s1 = tf1.getText();
			tf1.setText(s1 + "8");
		}

		if (e.getSource() == bt[2]) {
			String s = tf.getText();
			tf.setText(s + "7");
			String s1 = tf1.getText();
			tf1.setText(s1 + "7");
		}

		if (e.getSource() == bt[3]) {
			String s = tf.getText();
			tf.setText(s + "6");
			String s1 = tf1.getText();
			tf1.setText(s1 + "6");
		}

		if (e.getSource() == bt[4]) {
			String s = tf.getText();
			tf.setText(s + "5");
			String s1 = tf1.getText();
			tf1.setText(s1 + "5");
		}

		if (e.getSource() == bt[5]) {
			String s = tf.getText();
			tf.setText(s + "4");
			String s1 = tf1.getText();
			tf1.setText(s1 + "4");
		}

		if (e.getSource() == bt[6]) {
			String s = tf.getText();
			tf.setText(s + "3");
			String s1 = tf1.getText();
			tf1.setText(s1 + "3");
		}

		if (e.getSource() == bt[7]) {
			String s = tf.getText();
			tf.setText(s + "2");
			String s1 = tf1.getText();
			tf1.setText(s1 + "2");
		}

		if (e.getSource() == bt[8]) {
			String s = tf.getText();
			tf.setText(s + "1");
			String s1 = tf1.getText();
			tf1.setText(s1 + "1");
		}

		if (e.getSource() == bt[9]) {
			String s = tf.getText();
			tf.setText(s + "0");
			String s1 = tf1.getText();
			tf1.setText(s1 + "0");

		}

		if (e.getSource() == bt[10]) {

			String s = tf1.getText();
			result = Double.parseDouble(s);
			if (result == (int) result) {
				tf.setText(String.valueOf((int) result) + "+");
			} else
				tf.setText(String.valueOf(result) + "+");
			tf1.setText(new String());

		}

		if (e.getSource() == bt[11]) {
			String s = tf1.getText();
			result = Double.parseDouble(s);
			if (result == 0) {
				tf.setText("-");
				tf1.setText("-");
			} else {
				tf.setText(String.valueOf(result) + "-");
				tf1.setText(new String());
			}
		}

		if (e.getSource() == bt[12]) {
			String s = tf1.getText();
			result = Double.parseDouble(s);
			if (result == (int) result) {
				tf.setText(String.valueOf((int) result) + "/");
			} else
				tf.setText(String.valueOf(result) + "/");
			tf1.setText(new String());
		}

		if (e.getSource() == bt[13]) {
			String s = tf1.getText();
			result = Double.parseDouble(s);
			if (result == (int) result) {
				tf.setText(String.valueOf((int) result) + "*");
			} else
				tf.setText(String.valueOf(result) + "*");
			tf1.setText(new String());
		}

		if (e.getSource() == bt[14]) {
			String s = tf.getText();
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '.') {
					count++;
				}
			}

			if (count == 0) {

				tf.setText(s + ".");
				String s1 = tf1.getText();
				tf1.setText(s1 + ".");

			}
		}

		if (e.getSource() == bt[16]) {
			result = 0.0;
			tf.setText("");
			tf1.setText("0");
		}

		if (e.getSource() == bt[15]) {
			String s = tf1.getText();
			double temp = Double.parseDouble(s);
			if (temp != 0) {
				tf.setText(String.valueOf(1 / temp));
				tf1.setText(String.valueOf(1 / temp));
			}
		}
		if (e.getSource() == bt[18]) {
			String s = tf1.getText();
			double temp = Double.parseDouble(s);
			if (temp >= 0) {
				tf.setText(String.valueOf(Math.sqrt(temp)));
				tf1.setText(String.valueOf(Math.sqrt(temp)));
			}
		}

		if (e.getSource() == bt[17]) {
			String s = tf1.getText();
			result = Double.parseDouble(s);
			if (result != 0) {
				tf.setText(String.valueOf(result) + "^");
				tf1.setText(new String());
			}
		}

		if (e.getSource() == bt[19]) {
			int sg = 0;
			String s = tf.getText();
			String s1 = tf1.getText();
			double temp = Double.parseDouble(s1);
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '+') {
					sg = 1;
				}
				if (s.charAt(i) == '-') {
					sg = 2;
				}
				if (s.charAt(i) == '*') {
					sg = 3;
				}
				if (s.charAt(i) == '/') {
					sg = 4;
				}
				if (s.charAt(i) == '^') {
					sg = 5;
				}
			}
			if (sg == 1)// Addition
			{
				result += temp;
				tf.setText(String.valueOf(result));
				tf1.setText(String.valueOf(result));
			}

			if (sg == 2)// Subtraction
			{
				if (result != 0) {
					result -= temp;
					tf.setText(String.valueOf(result));
					tf1.setText(String.valueOf(result));
				}
			}

			if (sg == 3)// Multiplication
			{
				result *= temp;
				tf.setText(String.valueOf(result));
				tf1.setText(String.valueOf(result));
			}

			if (sg == 4)// Dividedation
			{
				result /= temp;
				tf.setText(String.valueOf(result));
				tf1.setText(String.valueOf(result));
			}

			if (sg == 5)// Power
			{
				double number = Math.pow(result, temp);
				tf.setText(String.valueOf(number));
				tf1.setText(String.valueOf(number));
			}
		}
	}

	public void keyTyped(KeyEvent e) {
		e.consume();
	}

}