package aula10;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class ex4 {
	
	public static void main(String[] args) throws IOException{
		//alguns casos que levantam o ioexception: ler ficheiro e não estar mais disponível / outro processo interrompeu processo de leitura, etc...
		Scanner input = new Scanner(new FileReader("src/aula10/words.txt"));
		Set<String> palavras = new HashSet<String>();
		
		//b
		while (input.hasNext()) {
			String word = input.next().trim().toLowerCase();
			if (word.length() > 2)
				palavras.add(word);
		}
		System.out.println("b) Palavras com pelo menos três caracteres:\n" + palavras);
		
		//c
		System.out.println("\nc) Palavras que acabam em 's': ");
		for (String p : palavras) {
			if (p.endsWith("s"))
				System.out.print(p + ", ");
		}
		
		//d
		System.out.println("\n\nd) Palavras que só contém letras:");
		for (String p : palavras) {
			if (p.matches("[a-zA-Z]*"))
				System.out.print(p + ", ");
		}
		input.close();
	}
}
