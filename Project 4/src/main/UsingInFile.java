package main;
import java.io.FileReader;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;

public class UsingInFile 
{
	public static final int MAX_TICKETS = 128;

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scanner = new Scanner
				(new FileReader("data.txt"));
		int ticketprice1 = scanner.nextInt();
		int ticket1 = scanner.nextInt();
		int ticketprice2 = scanner.nextInt();
		int ticket2 = scanner.nextInt();
		int ticketprice3 = scanner.nextInt();
		int ticket3 = scanner.nextInt();
		int ticketprice4 = scanner.nextInt();
		int ticket4 = scanner.nextInt();
		int totalrevenue = 0, totaltickets = 0;
		totalrevenue = (ticket1*ticketprice1)+(ticket2*ticketprice2)+(ticket3*ticketprice3)+(ticket4*ticketprice4);
		totaltickets = ticket1 + ticket2 + ticket3 + ticket4;
		scanner.close();
		System.out.printf("We got %d tickets and %s dollars.\n", totaltickets, totalrevenue);
		try (PrintWriter out = new PrintWriter("sales.txt")) {
			out.printf("We got %d tickets and %s dollars.\n", totaltickets, totalrevenue);
		}
	}
}
