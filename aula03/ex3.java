package aula03;
import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		int n, resto;
		boolean numPrimo = true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Valor de n: ");
			n = sc.nextInt();
		} while (n <= 0);
		sc.close();
		// loop entre o i = 2 at� � metade de n para descobrir se n � divis�vel por algum n�mero primo previo
		for (int i = 2; i <= n/2; i++) {
			resto = n % i;
			// se o resto entre o n % i for 0, significa que n n�o � primo, uma vez que � divis�vel por algum i (false)
			if (resto == 0) {
				numPrimo = false;
				break;
			}
		}
		if(numPrimo)
		    System.out.println(n + " � um n�mero primo!");
		else
			System.out.println(n + " n�o � n�mero primo!");
		
	}
}

