package aula04;
import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o texto: ");
		String text = sc.nextLine();
		sc.close();
		String sigla = "";
		for (int i = 0; i < text.length(); i++) {
			if (Character.isUpperCase(text.charAt(i)))
				sigla += text.charAt(i);
		}
		System.out.print("Sigla: " + sigla);
	}
}
