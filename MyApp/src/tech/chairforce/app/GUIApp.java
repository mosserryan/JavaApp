package tech.chairforce.app;

import javax.swing.JOptionPane;

public class GUIApp {

	public static void main(String[] args) {
		
		mathStuff();
		
		
	}
	
	public static void mathStuff() {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Enter x value: "));
		JOptionPane.showMessageDialog(null, "x = " + x);
		
		int y = Integer.parseInt(JOptionPane.showInputDialog("Enter y value: "));
		JOptionPane.showMessageDialog(null, "y = " + y);
		
		double z = Math.sqrt((x*x)+(y*y));
		
		JOptionPane.showMessageDialog(null, "The hypotenuse is: " + z);
	}
	
	
	public static void userInfo() {
		String name = JOptionPane.showInputDialog("Enter your name.");
		JOptionPane.showMessageDialog(null, name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age."));
		JOptionPane.showMessageDialog(null, age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height."));
		JOptionPane.showMessageDialog(null, height);
	}
	
	
}
