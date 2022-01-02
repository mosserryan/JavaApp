package tech.chairforce.app;

public class MyApp {

	public static void main(String[] args) {
		sayGreeting(myName("Ryan"));
		System.out.println(0);
		testGit("testing");

	}

	private static void sayGreeting(String word) {
		System.out.println("Hello " + word);
	}
	
	private static String myName(String name) {
		return name;
	}

	private static String testGit(String gitty) {
		return gitty;
	}
	
	// Testing github user instead of local desktop user for commits!
	
	
}
