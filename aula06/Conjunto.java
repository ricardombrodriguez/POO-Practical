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
		Conjunto uni�o = new Conjunto();
		uni�o.lista.addAll(this.lista);
		for (Integer i : add.lista) {
			if (!uni�o.contains(i))
				uni�o.lista.add(i);
		}
		return uni�o;
	}
	
	public Conjunto interset(Conjunto inter) {
		Conjunto interse��o = new Conjunto();
		for (Integer i : this.lista) {
			if (inter.contains(i))
				interse��o.lista.add(i);
		}
		return interse��o;
	}
	
	public Conjunto subtrair(Conjunto dif) {
		Conjunto diferen�a = new Conjunto();
		for (Integer i : this.lista) {
			if (!dif.contains(i))
				diferen�a.lista.add(i);
		}
		return diferen�a;
	}
}
