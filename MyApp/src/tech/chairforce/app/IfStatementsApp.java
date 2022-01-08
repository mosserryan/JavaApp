package tech.chairforce.app;

import javax.swing.JOptionPane;

public class IfStatementsApp {

	public static void main(String[] args ) {
				
		String input = JOptionPane.showInputDialog("What is Giga Chad Daddy's favorite color?");
		System.out.println(input);
		
		if(input.equals("blue")) {
			
			JOptionPane.showMessageDialog(null, "You said blue! You're right! Giga Chad Daddy is pleased!");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "You said " + input + ", you're Wrong! You have disappointed Giga Chad Daddy :(");
			
		}
		
	}
	
}
