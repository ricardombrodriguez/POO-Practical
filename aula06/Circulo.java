package aula06;

import aula05.Ponto;

public class Circulo extends Figura {
	
	private Ponto centro;
	private double raio;
	
	public Circulo(Ponto centro, double raio, String cor) {
		super(cor);
		this.centro = centro;
		this.raio = raio;
	}
	
	public Ponto getCentro() {
		return this.centro;
	}
	
	public double getRaio() {
		return this.raio;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * this.raio;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.raio, 2);
	}

	@Override
	public String toString() {
		return "Círculo | Centro: " + centro + " | Raio: " + raio + " | Cor: " + this.getCor() + " | Perímetro: " + String.format("%4.4f", this.getPerimeter()) + " | Área: " + String.format("%4.4f", this.getArea());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
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
		if (!super.equals(obj))
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
