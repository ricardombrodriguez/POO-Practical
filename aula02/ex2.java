package aula02;
import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		double celsius, fahrenheit;
		Scanner sc = new Scanner(System.in);
		System.out.print("Celsius: ");
		celsius = sc.nextDouble();
		fahrenheit = 1.8 * celsius + 32;
		sc.close();
		System.out.print("Fahrenheit: " + fahrenheit);
	}	
}
