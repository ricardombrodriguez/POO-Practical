package aula06;

public class Retangulo extends Figura {
		
	private double comprimento;
	private double largura;
	
	public Retangulo(double c, double l, String cor) {
		super(cor);
		this.comprimento = c;
		this.largura = l;
	}
	
	public double getComprimento() {
		return this.comprimento;
	}

	public double getLargura() {
		return this.largura;
	}
	
	public double getPerimeter() {
		return comprimento * 2 + largura * 2;
	}
	
	public double getArea() {
		return comprimento * largura;
	}

	@Override
	public String toString() {
		return "Retângulo | Comprimento: " + comprimento + " | Largura: " + largura + " | Cor: " + this.getCor() + " | Perímetro: " + String.format("%4.3f",this.getPerimeter()) + " | Área: " + String.format("%4.3f",this.getArea());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(comprimento);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(largura);
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
		Retangulo other = (Retangulo) obj;
		if (Double.doubleToLongBits(comprimento) != Double.doubleToLongBits(other.comprimento))
			return false;
		if (Double.doubleToLongBits(largura) != Double.doubleToLongBits(other.largura))
			return false;
		return true;
	}
	
}
