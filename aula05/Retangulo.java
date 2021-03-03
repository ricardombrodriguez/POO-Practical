package aula05;

public class Retangulo {
	private double c;
	private double l;
	
	public Retangulo(double c, double l) {
		this.c = c;
		this.l = l;
	}
	
	public double getC() {
		return c;
	}
	
	public double getL() {
		return l;
	}
	
	public double getPerimeter() {
		return c * 2 + l * 2;
	}
	
	public double getArea() {
		return c * l;
	}

	@Override
	public String toString() {
		return "Retangulo [c=" + c + ", l=" + l + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(c);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(l);
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
		Retangulo other = (Retangulo) obj;
		if (Double.doubleToLongBits(c) != Double.doubleToLongBits(other.c))
			return false;
		if (Double.doubleToLongBits(l) != Double.doubleToLongBits(other.l))
			return false;
		return true;
	}
}
