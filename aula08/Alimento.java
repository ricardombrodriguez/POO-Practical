package aula08;

public class Alimento {
	
	private double proteínas;
	private double calorias;
	private double peso;
	
	public Alimento(double proteínas, double calorias, double peso) {
		this.proteínas = proteínas;
		this.calorias = calorias;
		this.peso = peso;
	}
	
	public double getProteínas() {
		return this.proteínas;
	}
	
	public double getCalorias() {
		return this.calorias;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setProteínas(double pr) {
		this.proteínas = pr;
	}
	
	public void setCalorias(double c) {
		this.calorias = c;
	}
	
	public void setPeso(double ps) {
		this.peso = ps;
	}

	@Override
	public String toString() {
		return "Proteínas " + this.getProteínas() + ", Calorias " + this.getCalorias() + ", Peso " + this.getPeso();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(calorias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(peso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(proteínas);
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
		Alimento other = (Alimento) obj;
		if (Double.doubleToLongBits(calorias) != Double.doubleToLongBits(other.calorias))
			return false;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		if (Double.doubleToLongBits(proteínas) != Double.doubleToLongBits(other.proteínas))
			return false;
		return true;
	}
}
