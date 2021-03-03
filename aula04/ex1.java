package aula04;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		String text;
		Scanner sc = new Scanner(System.in);
		System.out.print("Texto: ");
		text = sc.nextLine();
		sc.close();
		System.out.println("Mínusculas: " + text.toLowerCase());
		System.out.println("Maiúsculas: " + text.toUpperCase());
		System.out.println("Último caracter da frase: " + text.charAt(text.length() - 1));
		System.out.println("Três primeiros caracteres: " + text.substring(0,3));
		System.out.println("Tamanho da frase: " + text.length());
		System.out.println("Substituição da letra 'a' por 'u': " + text.replace('a', 'u'));
	}
}
