package aula08;

public class Peixe extends Alimento {

	private TipoPeixe tipo;
	
	public Peixe(TipoPeixe tipo, double proteínas, double calorias, double peso) {
		super(proteínas, calorias, peso);
		this.tipo = tipo;
	}
	
	public TipoPeixe getTipoPeixe() {
		return this.tipo;
	}
	
	public void setTipoPeixe(TipoPeixe tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Peixe " + this.getTipoPeixe() + ", " + super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Peixe other = (Peixe) obj;
		if (tipo != other.tipo)
			return false;
		return true;
	}
	
}
