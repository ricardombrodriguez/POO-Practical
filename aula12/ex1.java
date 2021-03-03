package aula12;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ex1 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(new FileReader("src/aula12/words.txt"));
		HashMap<String, Integer> dict = new HashMap<String,Integer>();
		int totalPalavras = 0, totalPalavrasDiferentes = 0;
		
		while (sc.hasNext()) {
			String w = sc.next().toLowerCase();
			if (!dict.containsKey(w)) {
				dict.put(w, 1);
			}
			else {
				int n = dict.get(w);
				dict.put(w, ++n);
			}
		}
		
		for (Map.Entry<String, Integer> pares : dict.entrySet()) {
		    totalPalavras += pares.getValue();
		}
		
		for (Map.Entry<String, Integer> pares : dict.entrySet()) {
		    ++totalPalavrasDiferentes;
		}
		
		sc.close();
		
		System.out.println("Número Total de Palavras = " + totalPalavras);
		System.out.println("Número Total de Palavras Diferentes = " + totalPalavrasDiferentes);
	}
}
