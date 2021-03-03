package aula04;
import java.util.Scanner;

public class ex4 {
	
	public static void main(String[] args) {
		
		int year, month, startingDay;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Year: ");
		year = sc.nextInt();

		do {
			System.out.print("Month: ");
			month = sc.nextInt();
		} while ((month < 1) || (month > 12));
		
		do {
			System.out.print("Starting day of the month (1-7): ");
			startingDay = sc.nextInt();
		} while ((startingDay < 1) || (startingDay > 7));
		
		int space = startingDay;
		
		sc.close();

		int numDays = monthDays(year, month); 
		
		String[] months = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
		
		String monthName = months[month];
		
		calendar(year,numDays,monthName,startingDay,space);
	}
	
	public static int monthDays(int y, int m){
		if ((m == 1) || (m == 3) || (m == 5) || (m == 7) || (m == 8) || (m == 10) || (m == 12)) {
			return 31;
		}	
		else if ((m == 2) && ((y % 4) == 0) && ((y % 100) != 0))
			return 29;
		else if ((m == 2) && ((y % 4) != 0))
			return 28;
		else
			return 30;
	}
	
	public static void calendar(int y, int d, String n, int s, int spaces) {
		System.out.println("\n   " + n + " " + y);
		System.out.println("Su Mo Tu We Th Fr Sa");
		
		if (s != 7) {
			for (int i = 0; i < s; i++) {
				System.out.print("   ");
			}
		}
	    for (int i = 1; i <= d; i++) {
	         System.out.printf("%2d ", i);
	         if (((i + spaces) % 7 == 0) || (i == d)) 
	        	 System.out.println();
	     }
	}
}
