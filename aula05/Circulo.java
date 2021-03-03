package aula05;

public class Circulo {
	private Ponto centro;
	private double raio;
	
	public Circulo(Ponto centro, double raio) {
		setCentro(centro);
		setRaio(raio);
	}
	
	public void setCentro(Ponto centro) {
		this.centro = centro;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getCentroX() {
		return this.centro.getX();
	}

	public double getCentroY() {
		return this.centro.getY();
	}
	
	public Ponto getCentro() {
		return centro;
	}
	
	public double getRaio() {
		return this.raio;
	}
	
	public double getDiameter() {
		return this.raio * 2;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * this.raio;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.raio, 2);
	}
	
	public boolean intersection(Circulo c1) {
		if (this.centro.equals(c1.centro))
			return true;
		else if (this.centro.distanciaPontos(c1.centro) <= this.raio + c1.raio)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Circulo [centro=" + centro + ", raio=" + raio + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centro == null) ? 0 : centro.hashCode());
		long temp;
		temp = Double.doubleToLongBits(raio);
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
		Circulo other = (Circulo) obj;
		if (centro == null) {
			if (other.centro != null)
				return false;
		} else if (!centro.equals(other.centro))
			return false;
		if (Double.doubleToLongBits(raio) != Double.doubleToLongBits(other.raio))
			return false;
		return true;
	}
}
