package aula03;
import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Contagem decrescente! \n");
		System.out.print("N�mero: ");
		n = sc.nextInt();
		sc.close();
		decrescente(n);
	}
		
	public static void decrescente(int n) {
		System.out.println(n);
		n--;
		if (n>0) 
			decrescente(n);		
	}
}

		
