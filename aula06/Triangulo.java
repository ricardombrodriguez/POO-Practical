package aula06;

public class Triangulo extends Figura {
	
	private double hipotenusa;
	private double cateto1;
	private double cateto2;
	
	public Triangulo(double hip, double c1, double c2, String cor) {
		super(cor);
		this.hipotenusa = hip;
		this.cateto1 = c1;
		this.cateto2 = c2;
	}
	
	public double getHip() {
		return this.hipotenusa;
	}
	
	public double getCateto1() {
		return this.cateto1;
	}
	
	public double getCateto2() {
		return this.cateto2;
	}
	
	public double getPerimeter() {
		return this.hipotenusa + this.cateto1 + this.cateto2;
	}
	
	public double getArea() {
		return (this.cateto1 * this.cateto2) / 2;
	}

	@Override
	public String toString() {
		return "Triangulo | Hip.: " + hipotenusa + " | Cat1: " + cateto1 + " | Cat2: " + cateto2 + " | Cor: " + this.getCor() + " | Perímetro: " + String.format("%4.3f", this.getPerimeter()) + " | Área: " + String.format("%4.3f",this.getArea());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(cateto1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(cateto2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(hipotenusa);
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
		Triangulo other = (Triangulo) obj;
		if (Double.doubleToLongBits(cateto1) != Double.doubleToLongBits(other.cateto1))
			return false;
		if (Double.doubleToLongBits(cateto2) != Double.doubleToLongBits(other.cateto2))
			return false;
		if (Double.doubleToLongBits(hipotenusa) != Double.doubleToLongBits(other.hipotenusa))
			return false;
		return true;
	}
	
}
