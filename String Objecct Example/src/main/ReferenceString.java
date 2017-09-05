package main;

public class ReferenceString {
	public static void main(String[] args) {
		
		//int a = 23, b = 23;
		String a = "John Smith";
		String b = new String("John Smith");
		
		/*Incorrect for comparing objects for equality
		if (a==b) {
			System.out.println("Equal");
		}
		*/
		if (a.equals(b)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}
}

