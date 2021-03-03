package aula03;
import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, ano;
		do {
			System.out.print("Mês: ");
			m = sc.nextInt();
		} while ((m < 1) || (m > 12));
		System.out.print("Ano: ");
		ano = sc.nextInt();
		sc.close();
		if ((m == 1) || (m == 3) || (m == 5) || (m == 7) || (m == 8) || (m == 10) || (m == 12)) {
			System.out.printf("O número de dias do %dº mês do ano %d são 31.", m,ano);
		}
		else if ((m == 2) && ((ano % 4) == 0) && ((ano % 100) != 0))
			System.out.printf("O número de dias do %dº mês do ano %d são 29.", m,ano);
		else if ((m == 2) && ((ano % 4) != 0))
			System.out.printf("O número de dias do %dº mês do ano %d são 28.", m,ano);
		else
			System.out.printf("O número de dias do %dº mês do ano %d são 30. ",m,ano);
	}
}
