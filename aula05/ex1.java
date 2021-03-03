package aula05;
import java.util.Scanner;
import java.util.Arrays;

public class ex1 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		// -------------------------------------- PONTO 1 -------------------------------------------------
		System.out.println("Ponto n� 1.");
		System.out.print("Valor de x: ");
		double x = sc.nextDouble();
		System.out.print("Valor de y: ");
		double y = sc.nextDouble();
		Ponto p1 = new Ponto(x,y);
		System.out.println("p1 = (" + p1.getX() + "," + p1.getY() + "). Dist�ncia de p1 � origem = " + p1.distanciaOrigem() + "\n");
		
		// -------------------------------------- PONTO 2 -------------------------------------------------
		System.out.println("Ponto n� 2.");
		System.out.print("Valor de x: ");
		x = sc.nextDouble();
		System.out.print("Valor de y: ");
		y = sc.nextDouble();
		Ponto p2 = new Ponto(x,y);
		System.out.println("p2 = (" + p2.getX() + "," + p2.getY() + "). Dist�ncia de p2 � origem = " + p2.distanciaOrigem());
		System.out.println("Dist�ncia entre p1 e p2 = " + p1.distanciaPontos(p2) + "\n");
		
		// -------------------------------------- C�RCULO 1 -------------------------------------------------
		System.out.println("C�rculo n�1.");
		System.out.print("Valor de x do centro: ");
		double x1 = sc.nextDouble();
		System.out.print("Valor de y do centro: ");
		double y1 = sc.nextDouble();
		System.out.print("Valor do raio: ");
		double raio = sc.nextDouble();
		Circulo c1 = new Circulo(new Ponto(x1,y1), raio);
		System.out.println("O c�rculo 1 tem di�metro " + c1.getDiameter() + ", tem per�metro " + c1.getPerimeter() + " e �rea " + c1.getArea() + ".\n" );
		
		// -------------------------------------- C�RCULO 2 -------------------------------------------------
		System.out.println("C�rculo n�2.");
		System.out.print("Valor de x do centro: ");
		double x2 = sc.nextDouble();
		System.out.print("Valor de y do centro: ");
		double y2 = sc.nextDouble();
		System.out.print("Valor do raio: ");
		raio = sc.nextDouble();
		Circulo c2 = new Circulo(new Ponto(x2,y2), raio);
		System.out.println("O c�rculo 2 tem di�metro " + c2.getDiameter() + ", tem per�metro " + c2.getPerimeter() + " e �rea " + c2.getArea() + "." );
		System.out.println(c2.intersection(c1) ? "Os c�rculos c1 e c2 intersetam-se.\n" : "Os c�rculos c1 e c2 n�o se intersetam.\n");
		
		// -------------------------------------- RET�NGULO -------------------------------------------------
		System.out.println("Ret�ngulo.");
		System.out.print("Comprimento do ret�ngulo: ");
		double c = sc.nextDouble();
		System.out.print("Largura do ret�ngulo: ");
		double l = sc.nextDouble();
		Retangulo r = new Retangulo(c, l);
		System.out.println("O ret�ngulo tem per�metro " + r.getPerimeter() + " e �rea " + r.getArea() + ".\n");
		
		// -------------------------------------- TRI�NGULO -------------------------------------------------
		System.out.println("Tri�ngulo.");
		double lados[] = dadosTriangulo();
		Arrays.sort(lados); //ordenar a array, o lados[2] � a hipotenusa e os restantes valores s�o os catetos
		Triangulo t = new Triangulo(lados[2],lados[0],lados[1]);
		System.out.println("O tri�ngulo tem per�metro " + t.getPerimeter() + " e �rea " + t.getArea() + ".\n");
		System.out.println("Fim do programa.");
		
		sc.close();
	}
	
	public static double[] dadosTriangulo() {
		double l1, l2, l3;
		do {
		System.out.println("Insira corretamente a medida dos lados do tri�ngulo.");
		System.out.print("Lado n�1: ");
		l1 = sc.nextDouble();
		System.out.print("Lado n�2: ");
		l2 = sc.nextDouble();
		System.out.print("Lado n�3: ");
		l3 = sc.nextDouble();
		if (l1 >= l2 + l3 || l2 >= l1 + l3 || l3 >= l1 + l2)
			System.out.println("Tri�ngulo imposs�vel.");
		} while (l1 >= l2 + l3 || l2 >= l1 + l3 || l3 >= l1 + l2);
		double lados[] = {l1,l2,l3};
		return lados;
	}
}
