package aula08;
import java.util.ArrayList;

public class Empresa {
	
	public String nome;
	public String cp;
	public String email;
	private ArrayList<Viatura> lista;
	
	public Empresa(String nome, String cp, String email) {
		this.nome = nome;
		this.cp = cp;
		this.email = email;
		this.lista = new ArrayList<>();
	}
	
	public ArrayList<Viatura> getLista(){
		return lista;
	}
	
	public Viatura getViaturaMaiorDistancia(){
		Viatura maior = this.lista.get(0);
		for (Viatura viat : this.lista) {
			if (viat.distanciaTotal() > maior.distanciaTotal())
				maior = viat;
		}
		return maior;
	}
	
	public String mostrarLista() {
		String lst = "";
		for (Viatura v : lista) {
			lst += v + "\n";
		}
		return lst;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCp() {
		return this.cp;
	}
	
	public String getEmail() {
		return this.email;
	}

	@Override
	public String toString() {
		return nome + " | Código Postal: " + cp + " | E-mail: " + email + "\n\nLista de viaturas:\n" + mostrarLista();
	}
	
	
}
