package Project_3;

/*
 * Jack Taylor  
 */ 
import static java.lang.Math.sqrt;

public class SolvingQuadratics {
	
	public static void main(String[] args) {
		Calculate1(18,15,3);
		Calculate2(18,15,3);
	}

	public static void Calculate1 (double a, double b, double c) {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		double d = sqrt((b * b) - (4 * a * c));
		double x1 = (-b + d) / (2 * a);
		System.out.println(x1);
	}
	
	public static void Calculate2 (double a, double b, double c) {
		double d = sqrt((b * b) - (4 * a * c));
		double x2 = (-b - d) / (2 * a);
		System.out.println(x2);
	}
}