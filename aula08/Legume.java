package aula08;

public class Legume extends Vegetal {

	public Legume(String nome, double proteínas, double calorias, double peso) {
		super(nome, proteínas, calorias, peso);
	}

	@Override
	public String toString() {
		return "Legume Couve Flor, " + super.toString();
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
