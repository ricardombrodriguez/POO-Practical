package aula02;
import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		double d1,v1,t1,d2,v2,t2,vm;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a distância (em metros) do 1º trajeto: ");
		d1 = sc.nextDouble();
		System.out.print("Insira a velocidade (em metros/segundo) do 1º trajeto: ");
		v1 = sc.nextDouble();
		System.out.print("Insira a distância (em metros) do 2º trajeto: ");
		d2 = sc.nextDouble();
		System.out.print("Insira a velocidade (em metros/segundo) do 2º trajeto: ");
		v2 = sc.nextDouble();
		sc.close();
		t1 = d1 / v1;
		t2 = d2 / v2;
		vm = (d1 + d2) / (t1 + t2);
		System.out.printf("A velocidade média dos dois trajetos é de %.2f m/s", vm);
	}
}