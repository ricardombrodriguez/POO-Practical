package aula02;
import java.util.Scanner;
import java.lang.Math;

public class ex8 {
	public static void main(String[] args) {
		double ca,cb,hip;
		Scanner sc = new Scanner(System.in);
		System.out.print("Cateto adjacente: ");
		ca = sc.nextDouble();
		System.out.print("Cateto oposto: ");
		cb = sc.nextDouble();
		sc.close();
		hip = Math.sqrt(Math.pow(ca, 2) + Math.pow(cb, 2));
		System.out.printf("Hipotenusa: %.3f \n",hip);
		System.out.printf("�ngulo entre o cateto A e a hipotenusa: %.2f� \n", Math.toDegrees(Math.asin(cb/hip)));
	}
}
