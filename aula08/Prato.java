package aula08;
import java.util.ArrayList;
import java.lang.Comparable;

public class Prato implements Comparable<Prato>{
	
	private String nome;
	ArrayList<Alimento> ingredientes;
	private double totalCalorias;
	
	public Prato(String nome) {
		this.nome = nome;
		this.totalCalorias = 0;
		this.ingredientes = new ArrayList<Alimento>();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getTotalCalorias() {
		return this.totalCalorias;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean addIngrediente(Alimento al) {
		ingredientes.add(al);
		return true;
	}
	
	public int compareTo(Prato p) {
		
		if (this.totalCalorias > p.getTotalCalorias())
			return 1;
		
		else if (this.totalCalorias < p.getTotalCalorias())
			return -1;
		
		return 0;
	}

	@Override
	public String toString() {
		return "Prato '" + nome + "', composto por " + this.ingredientes.size() + " Ingredientes";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ingredientes == null) ? 0 : ingredientes.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalCalorias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prato other = (Prato) obj;
		if (ingredientes == null) {
			if (other.ingredientes != null)
				return false;
		} else if (!ingredientes.equals(other.ingredientes))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(totalCalorias) != Double.doubleToLongBits(other.totalCalorias))
			return false;
		return true;
	}

}
