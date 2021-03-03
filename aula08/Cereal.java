package aula08;

public class Cereal extends Vegetal {
		
	public Cereal(String nome, double proteínas, double calorias, double peso) {
		super(nome, proteínas, calorias, peso);
	}

	@Override
	public String toString() {
		return "Cereal Milho, " + super.toString();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	
}
