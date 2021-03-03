package aula05;
import java.util.Scanner;
import java.util.Arrays;

public class ex1 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		// -------------------------------------- PONTO 1 -------------------------------------------------
		System.out.println("Ponto nº 1.");
		System.out.print("Valor de x: ");
		double x = sc.nextDouble();
		System.out.print("Valor de y: ");
		double y = sc.nextDouble();
		Ponto p1 = new Ponto(x,y);
		System.out.println("p1 = (" + p1.getX() + "," + p1.getY() + "). Distância de p1 à origem = " + p1.distanciaOrigem() + "\n");
		
		// -------------------------------------- PONTO 2 -------------------------------------------------
		System.out.println("Ponto nº 2.");
		System.out.print("Valor de x: ");
		x = sc.nextDouble();
		System.out.print("Valor de y: ");
		y = sc.nextDouble();
		Ponto p2 = new Ponto(x,y);
		System.out.println("p2 = (" + p2.getX() + "," + p2.getY() + "). Distância de p2 à origem = " + p2.distanciaOrigem());
		System.out.println("Distãncia entre p1 e p2 = " + p1.distanciaPontos(p2) + "\n");
		
		// -------------------------------------- CÍRCULO 1 -------------------------------------------------
		System.out.println("Círculo nº1.");
		System.out.print("Valor de x do centro: ");
		double x1 = sc.nextDouble();
		System.out.print("Valor de y do centro: ");
		double y1 = sc.nextDouble();
		System.out.print("Valor do raio: ");
		double raio = sc.nextDouble();
		Circulo c1 = new Circulo(new Ponto(x1,y1), raio);
		System.out.println("O círculo 1 tem diâmetro " + c1.getDiameter() + ", tem perímetro " + c1.getPerimeter() + " e área " + c1.getArea() + ".\n" );
		
		// -------------------------------------- CÍRCULO 2 -------------------------------------------------
		System.out.println("Círculo nº2.");
		System.out.print("Valor de x do centro: ");
		double x2 = sc.nextDouble();
		System.out.print("Valor de y do centro: ");
		double y2 = sc.nextDouble();
		System.out.print("Valor do raio: ");
		raio = sc.nextDouble();
		Circulo c2 = new Circulo(new Ponto(x2,y2), raio);
		System.out.println("O círculo 2 tem diâmetro " + c2.getDiameter() + ", tem perímetro " + c2.getPerimeter() + " e área " + c2.getArea() + "." );
		System.out.println(c2.intersection(c1) ? "Os círculos c1 e c2 intersetam-se.\n" : "Os círculos c1 e c2 não se intersetam.\n");
		
		// -------------------------------------- RETÂNGULO -------------------------------------------------
		System.out.println("Retângulo.");
		System.out.print("Comprimento do retângulo: ");
		double c = sc.nextDouble();
		System.out.print("Largura do retângulo: ");
		double l = sc.nextDouble();
		Retangulo r = new Retangulo(c, l);
		System.out.println("O retângulo tem perímetro " + r.getPerimeter() + " e área " + r.getArea() + ".\n");
		
		// -------------------------------------- TRIÂNGULO -------------------------------------------------
		System.out.println("Triângulo.");
		double lados[] = dadosTriangulo();
		Arrays.sort(lados); //ordenar a array, o lados[2] é a hipotenusa e os restantes valores são os catetos
		Triangulo t = new Triangulo(lados[2],lados[0],lados[1]);
		System.out.println("O triângulo tem perímetro " + t.getPerimeter() + " e área " + t.getArea() + ".\n");
		System.out.println("Fim do programa.");
		
		sc.close();
	}
	
	public static double[] dadosTriangulo() {
		double l1, l2, l3;
		do {
		System.out.println("Insira corretamente a medida dos lados do triângulo.");
		System.out.print("Lado nº1: ");
		l1 = sc.nextDouble();
		System.out.print("Lado nº2: ");
		l2 = sc.nextDouble();
		System.out.print("Lado nº3: ");
		l3 = sc.nextDouble();
		if (l1 >= l2 + l3 || l2 >= l1 + l3 || l3 >= l1 + l2)
			System.out.println("Triângulo impossível.");
		} while (l1 >= l2 + l3 || l2 >= l1 + l3 || l3 >= l1 + l2);
		double lados[] = {l1,l2,l3};
		return lados;
	}
}
