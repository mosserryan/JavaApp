package tech.chairforce.app;

import javax.swing.JOptionPane;

public class IfStatementsApp {

	public static void main(String[] args ) {
				
		canDrive();
		
	}
	
	public static void gigaChad() {
		String input = JOptionPane.showInputDialog("What is Giga Chad Daddy's favorite color?");
		System.out.println(input);
		
		if(input.equals("blue") || input.equals("Blue")) {
			
			JOptionPane.showMessageDialog(null, "You said blue! You're right! Giga Chad Daddy is pleased!");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "You said " + input + ", you're Wrong! You have disappointed Giga Chad Daddy :(");
			
		}
	}
	
	public static void canDrive() {
		int age = 10;
		boolean hasLicense = true;
		
		if(age >= 16 && hasLicense == true) {
			
			System.out.println("Age: " + age + ", Licensed: " + hasLicense);
			JOptionPane.showMessageDialog(null, "This guy can drive!");
			
		} else if (age >= 16 && hasLicense == false) {
			
			System.out.println("Age: " + age + ", Licensed: " + hasLicense);
			JOptionPane.showMessageDialog(null, "This melvin is old enough, but no license. They can't drive!");
			
		} else {
			
			System.out.println("Age: " + age + ", Licensed: " + hasLicense);
			JOptionPane.showMessageDialog(null, "This guy barely left the craddle. You got some aging to do!");
			
		}
		
	}
	
}
