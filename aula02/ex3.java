package aula02;
import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		double kg, ti, tf, energia;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quilogramas de �gua: ");
		kg = sc.nextDouble();
		System.out.print("Temperatura inicial: ");
		ti = sc.nextDouble();
		System.out.print("Temperatura final: ");
		tf = sc.nextDouble();
		sc.close();
		energia = kg * (tf - ti) * 4184;
		System.out.printf("S�o precisos %.2f Joules para aquecer %.1f kg de �gua dos %.1f �C aos %.1f �C.",energia,kg,ti,tf);
	}
}
