package tech.chairforce.app;
import javax.swing.JOptionPane;

public class Methods {

	public static void main(String[] args) {
		
		System.out.println("Main method. Always runs first.");
		
		String name = "Ryan";
		
		greeting(name);
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Enter value one: "));
		
		int y = Integer.parseInt(JOptionPane.showInputDialog("Enter value two: "));
		
		
		int z = sumOfNums(x, y);
		
		JOptionPane.showMessageDialog(null, "" + x + " + " + y + " = " + z);
		
	}
	
	static void greeting(String name) {
		
		System.out.println("Hello " + name);
		
	}
	
	static int sumOfNums(int x, int y) {
		
		int z = x + y;
		
		return z;
		
	}
	
}

