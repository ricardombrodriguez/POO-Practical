package aula04;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		String text;
		Scanner sc = new Scanner(System.in);
		System.out.print("Texto: ");
		text = sc.nextLine();
		sc.close();
		System.out.println("M�nusculas: " + text.toLowerCase());
		System.out.println("Mai�sculas: " + text.toUpperCase());
		System.out.println("�ltimo caracter da frase: " + text.charAt(text.length() - 1));
		System.out.println("Tr�s primeiros caracteres: " + text.substring(0,3));
		System.out.println("Tamanho da frase: " + text.length());
		System.out.println("Substitui��o da letra 'a' por 'u': " + text.replace('a', 'u'));
	}
}
