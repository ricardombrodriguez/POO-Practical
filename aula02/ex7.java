package aula02;
import java.lang.Math;
import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		double x1,y1,x2,y2,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Coordenadas do ponto 1 no plano cartesiano. ");
		System.out.print("x1: ");
		x1 = sc.nextDouble();
		System.out.print("y1: ");
		y1 = sc.nextDouble();
		System.out.println("Coordenadas do ponto 2 no plano cartesiano. ");
		System.out.print("x2: ");
		x2 = sc.nextDouble();
		System.out.print("y2: ");
		y2 = sc.nextDouble();
		sc.close();
		d = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.printf("Distância entre os dois pontos: %.3f", d);
	}
}
