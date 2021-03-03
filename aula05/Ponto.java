package aula05;

public class Ponto {
	
	private double x;
	private double y;
	
	public Ponto(double x, double y) {
		setX(x);
		setY(y);
	}
	
	public double getX() { 
		return this.x; 
		}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return this.y;
		}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double distanciaOrigem() {
		return Math.sqrt( Math.pow(this.getX(),2) + Math.pow(this.getY(), 2) );
	}
	
	public double distanciaPontos(Ponto p2) {
		return Math.sqrt(Math.pow(this.getX() - p2.getX() , 2) + Math.pow(this.getY() - p2.getY(), 2));
	}

	@Override
	public String toString() {
		return "(" + this.getX() + "," + this.getY() + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
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
		Ponto other = (Ponto) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
}