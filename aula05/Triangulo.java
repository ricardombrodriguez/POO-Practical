package aula05;

public class Triangulo {
	private double hip;
	private double cat1;
	private double cat2;
	
	public Triangulo(double hip, double cat1, double cat2) {
		this.hip = hip;
		this.cat1 = cat1;
		this.cat2 = cat2;
	}
	
	public double getPerimeter() {
		return this.hip + this.cat1 + this.cat2;
	}
	
	public double getArea() {
		return (this.cat1 * this.cat2) / 2;
	}

	@Override
	public String toString() {
		return "Triangulo [hip=" + hip + ", cat1=" + cat1 + ", cat2=" + cat2 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cat1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(cat2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(hip);
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
		Triangulo other = (Triangulo) obj;
		if (Double.doubleToLongBits(cat1) != Double.doubleToLongBits(other.cat1))
			return false;
		if (Double.doubleToLongBits(cat2) != Double.doubleToLongBits(other.cat2))
			return false;
		if (Double.doubleToLongBits(hip) != Double.doubleToLongBits(other.hip))
			return false;
		return true;
	}

}
