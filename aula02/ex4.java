package aula02;
import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		double capital, taxa, tempo, montante;
		tempo = 3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Capital: ");
		capital = sc.nextInt();
		System.out.print("Valor da taxa (percentagem): ");
		taxa = sc.nextInt();
		sc.close();
		montante = capital * Math.pow(1 + taxa / 100 , tempo);
		System.out.printf("Montante: %.3f€", montante);
	}
}
