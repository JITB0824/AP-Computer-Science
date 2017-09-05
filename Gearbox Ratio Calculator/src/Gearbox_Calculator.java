import java.util.Scanner;
public class Gearbox_Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("How many stages do you have in your gearbox?");
		int Stages = scanner.nextInt();
		System.out.println("You entered " + Stages + " stages. is this correct?");
		String StageAnswer = scanner.next();
		if (StageAnswer.equals("No") || StageAnswer.equals("N") || StageAnswer.equals("no") || StageAnswer.equals("n")) {
			System.out.print("Re-enter the number of stages: ");
			Stages = scanner.nextInt();
		}
		System.out.println("You are using " + Stages + " Stages in your gearbox.");
		
	}

}
