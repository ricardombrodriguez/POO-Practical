package aula02;
import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		double d1,v1,t1,d2,v2,t2,vm;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a dist�ncia (em metros) do 1� trajeto: ");
		d1 = sc.nextDouble();
		System.out.print("Insira a velocidade (em metros/segundo) do 1� trajeto: ");
		v1 = sc.nextDouble();
		System.out.print("Insira a dist�ncia (em metros) do 2� trajeto: ");
		d2 = sc.nextDouble();
		System.out.print("Insira a velocidade (em metros/segundo) do 2� trajeto: ");
		v2 = sc.nextDouble();
		sc.close();
		t1 = d1 / v1;
		t2 = d2 / v2;
		vm = (d1 + d2) / (t1 + t2);
		System.out.printf("A velocidade m�dia dos dois trajetos � de %.2f m/s", vm);
	}
}