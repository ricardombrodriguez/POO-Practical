package aula12;
import java.util.*;
import java.io.IOException;
import java.io.FileReader;

public class extra {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileReader("src/aula12/extra.txt"));
		String frase = sc.nextLine();
		String reverse = "";
		
		//a
		
		for (int i = frase.length() - 1; i > -1; i--) {
			reverse += frase.charAt(i);
		}
		
		System.out.println("Frase normal: " + frase);
		System.out.println("Frase invertida: " + reverse + "\n");
		
		//b
		
		TreeMap<String, Integer> dict = new TreeMap<String,Integer>();
		String[] palavras = frase.split("\\s");
		for (String palavra : palavras) {
			int num = 0;
			for (int i = 0; i < palavra.length(); i++) {
				char c = palavra.charAt(i);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
					++num;
			}
			dict.put(palavra, num);
		}
		
		System.out.println("Word\t\tNumber of Vowels");
		for (Map.Entry<String, Integer> pares : dict.entrySet()) {
			System.out.println(pares.getKey() + "\t\t" + pares.getValue());
		}
		
		sc.close();
	}	
}
