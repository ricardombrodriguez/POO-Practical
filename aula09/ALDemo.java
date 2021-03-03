package aula09;
import java.util.*;
import aula06.Pessoa;
import aula06.Data;

public class ALDemo {
	public static void main(String[] args) {
		ArrayList<Integer> c1 = new ArrayList<>();
		for (int i = 10; i <= 100; i+=10)
			c1.add(i);
		System.out.println("Size: " + c1.size());
		for (int i = 0; i < c1.size(); i++)
			System.out.println("Elemento: " + c1.get(i));
		
		ArrayList<String> c2 = new ArrayList<>();
		c2.add("Vento");
		c2.add("Calor");
		c2.add("Frio");
		c2.add("Chuva");
		c2.add(3, "Granizo");
		c2.add(0, "Tempestade");
		c2.add("Vento");
		if (c2.contains("Chuva"))
			System.out.println("It's raining men, aleluia!");
		System.out.println("'Frio' está no index nº " + c2.indexOf("Frio"));
		System.out.println("O último index com o elemento 'Vento' é o nº " + c2.lastIndexOf("Vento"));
		c2.set(6, "Tsunami");
		System.out.println("Os três primeiros elementos da lista: " + c2.subList(0, 3));
		System.out.println(c2);
		Collections.sort(c2);
		System.out.println(c2);
		c2.remove("Frio");
		c2.remove(0);
		System.out.println(c2);
		System.out.println();
		
		//---------------------------------------------------------------------------------------------
		
		Set<Pessoa> c3 = new HashSet<>();
		c3.add(new Pessoa("Cristiano Ronaldo", 987765, new Data(5,2,1985)));
		c3.add(new Pessoa("Fernando Palmiro", 987766, new Data(9,1,1989)));
		c3.add(new Pessoa("Samuel Massas", 992235, new Data(5,2,1985)));
		c3.add(new Pessoa("José Machado", 991085, new Data(7,1,1989)));
		c3.add(new Pessoa("José Machado", 991085, new Data(7,1,1989)));
		
		/*
		for (Pessoa p : c3)
			System.out.println(p);
		*/
		
		Iterator <Pessoa> pi = c3.iterator();
		while (pi.hasNext()) {
			System.out.println(pi.next());
		}
		
		Set<Data> c4 = new TreeSet<>();
		c4.add(new Data(5,2,1985));
		c4.add(new Data(9,1,1989));
		c4.add(new Data(5,2,1985));
		c4.add(new Data(7,1,1989));
		c4.add(new Data(7,2,1989));
		c4.add(new Data(8,1,1989));
		
		System.out.println("\nLista ordenada de datas: " + c4);
	}
}
