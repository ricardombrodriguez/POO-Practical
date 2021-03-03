package aula08;

public class Alimento {
	
	private double prote�nas;
	private double calorias;
	private double peso;
	
	public Alimento(double prote�nas, double calorias, double peso) {
		this.prote�nas = prote�nas;
		this.calorias = calorias;
		this.peso = peso;
	}
	
	public double getProte�nas() {
		return this.prote�nas;
	}
	
	public double getCalorias() {
		return this.calorias;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setProte�nas(double pr) {
		this.prote�nas = pr;
	}
	
	public void setCalorias(double c) {
		this.calorias = c;
	}
	
	public void setPeso(double ps) {
		this.peso = ps;
	}

	@Override
	public String toString() {
		return "Prote�nas " + this.getProte�nas() + ", Calorias " + this.getCalorias() + ", Peso " + this.getPeso();
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
		temp = Double.doubleToLongBits(prote�nas);
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
		if (Double.doubleToLongBits(prote�nas) != Double.doubleToLongBits(other.prote�nas))
			return false;
		return true;
	}
}
