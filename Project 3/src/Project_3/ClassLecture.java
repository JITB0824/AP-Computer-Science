package Project_3;
/*
 * Examples of writing and invoking Methods in Java. 
 */
public class ClassLecture {
	public static void main(String[] args) {
		
		//invoking calculateArea method
		//calculateArea(4, 5.7);
		
		// invoking a non void method and composing with system.out.println
		//System.out.println(findSum(2, 3, 7));
		int answer = findSum(2, 3, 7);
		System.out.println("Answer: " + answer);
	}
	public static void calculateArea (double a, double b) {
		double area = a*b;
		System.out.println("The area is: " + area + " square units. ");
	}
	
	//Method that returns a value
	public static int findSum (int x, int y, int z) {
		return x + y + z;
	}
	
}
