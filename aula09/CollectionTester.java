package aula09;
import java.util.*;

public class CollectionTester {
	
	public static void main(String[] args) {
		
		System.out.printf("%-14s%-9d%-9d%-9d%-9d%-9d%-9d%n","Collection",1000,5000,10000,20000,40000,100000);
		
		Collection<Integer> al = new ArrayList<>();
		print(al);
		Collection<Integer> ll = new LinkedList<>();
		print(ll);
		Collection<Integer> hs = new HashSet<>();
		print(hs);
		Collection<Integer> ts = new TreeSet<>();
		print(ts);
		
	}
	
	private static ArrayList<Double> checkPerformance(Collection<Integer> col, int dim) {
		
		ArrayList<Double> coluna = new ArrayList<>(3);
		double start, stop, delta;
		// Add
		start = System.nanoTime(); // clock snapshot before
		for(int i=0; i<dim; i++ )
			col.add( i );
		stop = System.nanoTime(); // clock snapshot after
		delta = (stop-start)/1e6; // convert to milliseconds
		coluna.add(delta);
		
		// Search
		start = System.nanoTime(); // clock snapshot before
		for(int i=0; i<dim; i++ ) {
			int n = (int) (Math.random()*dim);
			if (!col.contains(n))
					System.out.println("Not found???"+n);
		}
		stop = System.nanoTime(); // clock snapshot after
		delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
		coluna.add(delta);
		
		// Remove
		start = System.nanoTime(); // clock snapshot before
		Iterator<Integer> iterator = col.iterator();
		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		stop = System.nanoTime(); // clock snapshot after
		delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
		coluna.add(delta);
		
		return coluna;
	}
	
	public static void print(Collection<Integer> col) {
		//Print da tabela da collection em específico
		
		int i = 0; //identificação de index da coluna (p/ dim)
		int[] DIM = {1000, 5000, 10000, 20000, 40000, 100000};
		double[][] dados = new double[3][6]; //array bidimensional (3x6) de cada tipo de coleção
		
		for(int dim : DIM) {
			ArrayList<Double> lista = checkPerformance(col, dim);
			dados[0][i] = lista.get(0);
			dados[1][i] = lista.get(1);
			dados[2][i] = lista.get(2);
			i++;
		}
		
		i = 0;
		String[] functions = {"add", "search", "remove"};
		System.out.println(col.getClass().getSimpleName());
		//foreach para permutar entre os três métodos (linha 0,1,2) e incremento para a próxima linha/método
		for (double n[] : dados) {
			System.out.printf("%-14s%-9.1f%-9.1f%-9.1f%-9.1f%-9.1f%-9.1f%n", functions[i], n[0], n[1], n[2], n[3], n[4], n[5]);
			i++;
		}
		
	}
}