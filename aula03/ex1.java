package aula03;
import java.util.Scanner;
import java.lang.Math;

public class ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double notap, notat, notafinal;
		System.out.print("Para inserir valores decimais, insira a vírgula em vez do ponto \n");
		do {
		System.out.print("Insira a nota prática de POO: ");
		notap = sc.nextDouble();
		} while ( (0 > notap) || (notap > 20) );
		do {
		System.out.print("Insira a nota teórica de POO: ");
		notat = sc.nextDouble();
		} while ( (0 > notat) || (notat > 20) );
		sc.close();
		if ((notat < 7.0) || (notap < 7.0))
			System.out.print("66. Reprovado por nota mínima em pelo menos uma das componentes");
		else {
			notafinal = 0.4 * notat + 0.6 * notap;
			System.out.print("Nota final de POO: " + Math.round(notafinal));
		}
	}
}
