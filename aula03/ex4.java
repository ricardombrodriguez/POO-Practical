package aula03;
import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, n1, sum, min, max, numLidos;
		double media;
		numLidos = 1;
		System.out.print("Para acabar com a leitura de n�meros, insira um n�mero igual ao primeiro.\n");
		System.out.print("1� n�mero: ");
		n1 = sc.nextInt();
		min = max = sum = n1;
		do {
			System.out.printf("%d� n�mero: ", ++numLidos);
			n = sc.nextInt();
			if (n < min)
				min = n;
			else if (n > max)
				max = n;
			sum += n;
		} while (n != n1);
		media = sum / numLidos;
		sc.close();
		System.out.printf("M�dia = %.2f \n", media);
		System.out.println("M�nimo = " + min);
		System.out.println("M�ximo = " + max);
		System.out.println("N�meros Lidos = " + numLidos);
	}
}