package aula13;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ex1 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new FileReader("src/aula13/notas.txt"));
			ArrayList<Student> lista = new ArrayList<Student>();
			while (sc.hasNextLine()) {
				String[] lst = sc.nextLine().split("\t");
				if(lst.length == 5) {
					Student st = new Student(Integer.valueOf(lst[0]), lst[1], Double.valueOf(lst[2]), Double.valueOf(lst[3]), Double.valueOf(lst[4]));
					st.setMédia();
					lista.add(st);
				}	
			}
			
			try {
				
				PrintWriter writer = new PrintWriter("src/aula13/Results.txt", "UTF-8");
				HashMap<Integer, Integer> notas = new HashMap<Integer, Integer>();
				for (int i = 0; i < 21; i++) {
					int n = 0;
					for (Student st : lista) {
						if ((int) st.getMédia() == i)
							n++;
					}
					notas.put(i, n);
				}
				
				for (Map.Entry<Integer, Integer> entry : notas.entrySet()) {
					writer.println(entry.getKey() + " : " + entry.getValue());
				}
				
				double soma = 0.0;
				int num = 0;
				for (Student s : lista) {
					soma += s.getMédia();
					num++;
				}
				double media = soma / num;
				
				writer.printf("\nMédia final: <%4.2f>", media);
				writer.close();
			} catch (IOException e) {
				System.out.println("Ocorreu um erro.");
			}
			
			sc.close();
		} catch(FileNotFoundException e) {
			System.out.println("Ficheiro não encontrado");
		}
	}
}
