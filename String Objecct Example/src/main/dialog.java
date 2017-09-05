package main;
import javax.swing.JOptionPane;

public class dialog {
	public static void main(String [] args) {
		//Display box 
		String firstNum = JOptionPane.showInputDialog("Enter the first number: ");
		String secondNum = JOptionPane.showInputDialog("Enter the second number: ");
		
		//convert to integers
		int a = Integer.parseInt(firstNum);
		int b = Integer.parseInt(secondNum);
		
		//Reads answer
		JOptionPane.showMessageDialog(null, a + b, "Result", JOptionPane.INFORMATION_MESSAGE);
	}

}
