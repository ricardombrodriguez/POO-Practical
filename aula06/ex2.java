package aula06;
import aula05.Ponto;

public class ex2 {
	public static void main(String[] args) {
		
		Circulo c1 = new Circulo(new Ponto(2,3), 5, "Azul");
		Circulo c2 = new Circulo(new Ponto(5,2.5), 2, "Roxo");
		System.out.println(c1);
		System.out.println(c2);
		
		Retangulo r1 = new Retangulo(4, 8, "Vermelho");
		Retangulo r2 = new Retangulo(2.34, 3.1415, "Preto");
		System.out.println(r1);
		System.out.println(r2);
		
		Triangulo t1 = new Triangulo(8, 5, 4, "Amarelo");
		Triangulo t2 = new Triangulo(32.3, 17.242, 18.99, "Cinzento");
		System.out.println(t1);
		System.out.println(t2);
	}
}
