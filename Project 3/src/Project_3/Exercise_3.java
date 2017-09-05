package Project_3;

public class Exercise_3 {
	public static void main(String[] args) {
		System.out.println(printAmerican("Saturday", "July", 22, 2015));
	}
	public static String printAmerican(String day, String month, int date, int year) {
		return (day + ", " + month + " " + date + ", " + year);
	}
}
