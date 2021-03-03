package aula03;
import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double montante, taxa, total;
		do {
			System.out.print("Montante: ");
			montante = sc.nextInt();
		} while ((montante <= 0) || ((montante % 1000) != 0));
		do {
			System.out.print("Taxa de juro mensal: ");
			taxa = sc.nextInt();
		} while ((taxa < 0) || (taxa > 5));
		sc.close();
		for (int i = 1; i<13; i++) {
			total = montante * Math.pow(1 + taxa / 100 , i);
			System.out.printf("Total no %dº mês: %.2f€ \n",i,total);
		}
	}
}
