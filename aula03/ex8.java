package aula03;
import java.util.Scanner;
import java.lang.Math;

public class ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tabela[][] = new double[16][3];
		for (int i = 1; i <= 16; i++) {
			do {
				System.out.printf("Nota teórica do %dº aluno: ", i);
				tabela[i-1][0] = sc.nextDouble();
			} while ((tabela[i-1][0] < 0) || (tabela[i-1][0] > 20));
			do {
				System.out.printf("Nota prática do %dº aluno: ", i);
				tabela[i-1][1] = sc.nextDouble();
			} while ((tabela[i-1][1] < 0) || (tabela[i-1][1] > 20));
			tabela[i-1][2]= (tabela[i-1][0] * 0.4 + tabela[i-1][1] * 0.6); //Média
			Math.round(tabela[i-1][2]);
			if ((tabela[i-1][0] < 7) || (tabela[i-1][1] < 7))
				tabela[i-1][2] = 66;
		}
		sc.close();
		System.out.printf("NotaT\tNotaP\tPauta\n");
		for (int i = 0; i < 16; i++) {
			System.out.printf("%5.1f\t%5.1f\t%5.0f\n", tabela[i][0], tabela[i][1], tabela[i][2]);
		}
	}
}
