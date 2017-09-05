package main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class copyingproject 
{
	private static final int MAX_TICKETS = 128;
	
	public static void main(String[] args)
	{
		File file = new File("C:\\Users\\Jack Taylor\\Desktop\\Eclipse Directory\\Project 4\\data.txt");
		BufferedReader reader = null;
		try 
		{
			int tickets[] = new int[MAX_TICKETS];
			int prices[] = new int[MAX_TICKETS];
			int num_rows = 0;
			
			reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null)
			{
				String numbers[] = line.split(" ");
				if (numbers.length != 2)
				{
					throw new IllegalArgumentException("Got the wrong number of arguements on an input line.");
				}
				tickets[num_rows] = Integer.parseInt(numbers[1]);
				prices[num_rows] = Integer.parseInt(numbers[0]);
				num_rows++;
			}
			int totaltickets = 0;
			int totalrevenue = 0;
			for (int i =0; i < num_rows; i++)
			{
				totaltickets += tickets[i];
				totalrevenue += prices[i] * tickets[i];
			}
			System.out.printf("We got %d tickets and %s dollars.\n", totaltickets, totalrevenue);
			try (PrintWriter out = new PrintWriter("sales.txt"))
			{
				out.printf("We got %d tickets and %s dollars.\n", totaltickets, totalrevenue);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				if (reader != null)
				{
					reader.close();
				}
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
