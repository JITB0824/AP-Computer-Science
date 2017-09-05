package Project_2;
/*
 * Jack Taylor
 * Period 4
 * 8/23/17
 */
import java.util.Scanner;
public class PaintCost {
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		double legnth, width, height;
		System.out.println("Enter legnth, then width, then height of the room: ");
		legnth = console.nextDouble();
		width = console.nextDouble();
		height = console.nextDouble();
		System.out.println(" ");
		System.out.println("You entered");
		System.out.println("Legnth: " + legnth);
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		System.out.println(" ");

		double window1width, window1height, window2width, window2height;
		System.out.println("Enter the width, then height of window one.");
		window1width = console.nextDouble();
		window1height = console.nextDouble();
		System.out.println(" ");
		System.out.println("Window 1 Dimensions:");
		System.out.println("Width: " + window1width);
		System.out.println("Height: " + window1height);
		System.out.println(" ");

		System.out.println("Enter the width, then height of the second window.");
		window2width =  console.nextDouble();
		window2height = console.nextDouble();
		System.out.println(" ");
		System.out.println("Window 2 Dimensions");
		System.out.println("Width: " + window2width);
		System.out.println("Height: " + window2height);
		System.out.println(" ");

		double doorwidth, doorheight, bookshelfwidth, bookshelfheight;
		System.out.println("Enter the width, then the height of the door:");
		doorwidth = console.nextDouble();
		doorheight =console.nextDouble();
		System.out.println(" ");
		System.out.println("Door Dimensions:");
		System.out.println("Width: " + doorwidth);
		System.out.println("Height: " + doorheight);
		System.out.println(" ");

		System.out.println("Enter the width, then the height of the bookshelf:");
		bookshelfwidth = console.nextDouble();
		bookshelfheight = console.nextDouble();
		System.out.println(" ");
		System.out.println("Bookshelf Dimensions:");
		System.out.println("Width: " + bookshelfwidth);
		System.out.println("Height: " + bookshelfheight);
		System.out.println(" ");

		double paintcost;
		System.out.print("Enter the cost of paint per square foot: ");
		paintcost  = console.nextDouble();
		System.out.println(" ");
		System.out.println("Cost per square foot is " + paintcost);
		System.out.println(" ");

		double carpetcost;
		System.out.print("Enter the cost of carpet per square foot: ");
		carpetcost = console.nextDouble();
		System.out.println(" ");
		System.out.println("Cost per square foot is " + carpetcost);
		System.out.println(" ");

		double carpettotal, painttotal, wallsize1, wallsize2, window1hole, window2hole, doorhole, bookshelfhole;
		carpettotal = legnth*width*carpetcost;
		wallsize1 = height*width*2;
		wallsize2 = legnth*height*2;
		window1hole = window1width*window1height;
		window2hole = window2width*window2height;
		doorhole = doorwidth*doorheight;
		bookshelfhole = bookshelfwidth*bookshelfheight;
		painttotal = wallsize1 + wallsize2 - window1hole - window2hole - doorhole - bookshelfhole;
		painttotal = painttotal*paintcost;
		double total = painttotal + carpettotal;
		System.out.printf("Carpet Total: $%10.2f", carpettotal);
		System.out.println("");
		System.out.printf("Paint Total: $%10.2f", painttotal);
		System.out.println("");
		System.out.printf("Price: $%10.2f", total);
		System.out.println("");

	}
}