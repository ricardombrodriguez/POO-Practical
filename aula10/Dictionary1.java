package aula10;
import java.util.*;

public class Dictionary1 {
	Scanner sc = new Scanner(System.in);
	Map<String,String> d = new HashMap<String,String>();
	public Dictionary1() {};
	
	public Map<String, String> adicionar(){
		String termo, significado;
		do {
			System.out.print("Termo: ");
			termo = sc.next();
			sc.nextLine();
			if (d.containsKey(termo)) {
				System.out.println("Termo já existente.");
			}
		} while (d.containsKey(termo));
		System.out.print("Significado: ");
		significado = sc.nextLine();
		d.put(termo, significado);
		return d;
	}
	
	public Map<String,String> alterar(){
		String termo, significado;
		do {
			System.out.print("Termo para modificar significado: ");
			termo = sc.next();
		} while (!d.containsKey(termo));
		sc.nextLine();
		System.out.print("Novo significado: ");
		significado = sc.nextLine();
		d.put(termo, significado);
		return d;
	}
	
	public Map<String,String> remover(){
		String termo;
		do {
			System.out.print("Termo para ser removido: ");
			termo = sc.next();
		} while (!d.containsKey(termo));
		sc.nextLine();
		d.remove(termo);
		return d;
	}

	@Override
	public String toString() {
		if (d.isEmpty())
			return "Lista vazia";
		String s = "";
		for (Map.Entry<String, String> entry : d.entrySet()) {
		    s += entry.getKey() + " ---> " + entry.getValue() + "\n";
		}
		return s;
	}
	
	public void toStringK() {
		if (d.isEmpty())
			System.out.println("Lista vazia");
		for (Map.Entry<String, String> entry : d.entrySet())
		    System.out.println(entry.getKey());
	}
	
	public void toStringV() {
		if (d.isEmpty())
			System.out.println("Lista vazia");
		for (Map.Entry<String, String> entry : d.entrySet())
		    System.out.println(entry.getValue());
	}
	
	public Map<String,String> limparDicionário(){
		d.clear();
		System.out.println("Lista eliminada");
		return d;
	}
	
}
