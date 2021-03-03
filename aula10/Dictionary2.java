package aula10;
import java.util.*;

public class Dictionary2 {
	Scanner sc = new Scanner(System.in);
	Map<String,ArrayList<String>> d = new HashMap<String,ArrayList<String>>();
	
	public Dictionary2() {};
	
	public Map<String, ArrayList<String>> adicionar(){
		String termo, significado;
		ArrayList<String> significados = new ArrayList<String>();
		do {
			System.out.print("Termo: ");
			termo = sc.next();
			sc.nextLine();
			if (d.containsKey(termo)) {
				System.out.println("Termo já existente.");
			}
		} while (d.containsKey(termo));
		System.out.println("Introdução de significado(s). Para parar de adicionar significados, escreva 'stop'");
		do {
			System.out.print("Adicionar significado: ");
			significado = sc.nextLine();
			if ((!significados.contains(significado)) && (!significado.equalsIgnoreCase("stop")))
				significados.add(significado);
		} while(!significado.equalsIgnoreCase("stop"));
		d.put(termo, significados);
		return d;
	}
	
	public Map<String,ArrayList<String>> alterar(){
		String termo, significado;
		ArrayList<String> significados = new ArrayList<String>();
		do {
			System.out.print("Termo para modificar significado: ");
			termo = sc.next();
		} while (!d.containsKey(termo));
		sc.nextLine();
		System.out.println("Alteração de significado(s). Para parar de adicionar significados, escreva 'stop'");
		do {
			System.out.print("Adicionar significado: ");
			significado = sc.nextLine();
			if ((!significados.contains(significado)) && (!significado.equalsIgnoreCase("stop")))
				significados.add(significado);
		} while(!significado.equalsIgnoreCase("stop"));
		d.put(termo, significados);
		return d;
	}
	
	public Map<String,ArrayList<String>> remover(){
		String termo;
		do {
			System.out.print("Termo para ser removido: ");
			termo = sc.next();
		} while (!d.containsKey(termo));
		sc.nextLine();
		d.remove(termo);
		return d;
	}
	
	public void randomSignificado(){
		String termo, significado;
		do {
			System.out.print("Selecione o termo: ");
			termo = sc.next();
		} while (!d.containsKey(termo));
		sc.nextLine();
		ArrayList<String> lst = d.get(termo);
		significado = lst.get((int)(Math.random() * (lst.size() - 1)));
		System.out.println(significado);
	}

	@Override
	public String toString() {
		if (d.isEmpty())
			return "Lista vazia";
		String s = "";
		for (Map.Entry<String, ArrayList<String>> entry : d.entrySet()) {
		    s += entry.getKey() + " ---> " + entry.getValue() + "\n";
		}
		return s;
	}
	
	public void toStringK() {
		if (d.isEmpty())
			System.out.println("Lista vazia");
		for (Map.Entry<String, ArrayList<String>> entry : d.entrySet())
		    System.out.println(entry.getKey());
	}
	
	public void toStringV() {
		if (d.isEmpty())
			System.out.println("Lista vazia");
		for (Map.Entry<String, ArrayList<String>> entry : d.entrySet())
		    System.out.println(entry.getValue());
	}
	
	public Map<String,ArrayList<String>> limparDicionário(){
		d.clear();
		System.out.println("Lista eliminada");
		return d;
	}
	
}