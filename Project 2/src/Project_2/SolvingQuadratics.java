package Project_2;
/*
 * Jack Taylor  
 * Period 4
 * 8/23/17
 */
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class SolvingQuadratics {
	public static void main(String[] args) {
		while(true) {
			Scanner console = new Scanner(System.in);
			System.out.println("Enter the three values in alphabetical order:");
			int a = console.nextInt();
			int b = console.nextInt();
			int c = console.nextInt();
			System.out.println("You entered: ");
			System.out.println("a: " + a);
			System.out.println("b: " + b);
			System.out.println("c: " + c);
			double d = sqrt((b*b)-(4*a*c));
			double x1 = (-b + d)/(2*a);
			double x2 = (-b-d)/(2*a);
			System.out.println(x1);
			if (x1 != x2) {
				System.out.println(x2); 
			}
		}
	}
}