package aula08;

public class Vegetal extends Alimento {
	
	private String nome;
	
	public Vegetal(String nome, double proteínas, double calorias, double peso) {
		super(proteínas, calorias, peso);
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Proteínas " + this.getProteínas() + ", Calorias " + this.getCalorias() + ", Peso " + this.getPeso();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vegetal other = (Vegetal) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
