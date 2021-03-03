package aula06;
import java.util.ArrayList;

public class Conjunto {
	ArrayList<Integer> lista = new ArrayList<Integer>();
	
	public void insert(int n) {
		if (this.lista.contains(n) == false)
			this.lista.add(n);
	}
	
	public boolean contains(int n) {
		for (Integer i : lista) {
			if (i == n)
				return true;
		}
		return false;
	}
	
	public void remove (int n) {
		if (contains(n))
			this.lista.remove(this.lista.indexOf(n));
	}
	
	public void empty() {
		this.lista.clear();
	}

	@Override
	public String toString() {
		String print = "";
		for (Integer i : lista) {
			print += String.valueOf(i) + " ";
		}
		return print;
	}
	
	public int size() {
		return this.lista.size();
	}
	
	public Conjunto unir(Conjunto add) {
		Conjunto união = new Conjunto();
		união.lista.addAll(this.lista);
		for (Integer i : add.lista) {
			if (!união.contains(i))
				união.lista.add(i);
		}
		return união;
	}
	
	public Conjunto interset(Conjunto inter) {
		Conjunto interseção = new Conjunto();
		for (Integer i : this.lista) {
			if (inter.contains(i))
				interseção.lista.add(i);
		}
		return interseção;
	}
	
	public Conjunto subtrair(Conjunto dif) {
		Conjunto diferença = new Conjunto();
		for (Integer i : this.lista) {
			if (!dif.contains(i))
				diferença.lista.add(i);
		}
		return diferença;
	}
}
