package aula11;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class ex1 {
	
	public static void main(String[] args){
		
		try {
			
			Scanner ficheiro = new Scanner(new FileReader("src/aula11/major.txt"));
			String regex = "[\\s\t\n.,:'‘’;?!--*\\{\\}=+&/()\\[\\]”“\\\"\\']";
			ficheiro.useDelimiter(regex);

			Map<String,TreeMap<String,Integer>> dict = new TreeMap<>();
			String palavraAnterior=null;
			
			while(ficheiro.hasNext()) {
				String word = ficheiro.next().toLowerCase();
				if (word.length() >= 3) {
					
					if (!(palavraAnterior == null)) {
						if (!(dict.containsKey(palavraAnterior))){
							TreeMap<String,Integer> seguintes = new TreeMap<>();
							seguintes.put(word, 1);
							dict.put(palavraAnterior, seguintes);
						}
						
						else if (dict.containsKey(palavraAnterior)) {
							TreeMap<String,Integer> seguintes = dict.get(palavraAnterior);
							if(!(seguintes.containsKey(word))) {
								seguintes.put(word, 1);
								dict.put(palavraAnterior,seguintes);
							}
							else {
								seguintes.put(word,seguintes.get(word)+1);
								dict.put(palavraAnterior, seguintes);
							}
							
						}
					}
					palavraAnterior = word;
				}
				
			}
			ficheiro.close();
			
			
			for(String s : dict.keySet()) {
				System.out.println(s + "=" + dict.get(s));
			}
			
			}
			catch (FileNotFoundException e) {
				System.out.println("Exceção. Ficheiro não encontrado.");
			}
			
	}
}
