package aula02;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		double km, miles;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert distance in km: ");
		km = sc.nextDouble();
		miles = km / 1.609;
		System.out.println("Miles distance: " + miles);
		sc.close();
	}
}