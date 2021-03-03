package aula07;

public class Apartamento extends Alojamento {
	
	private int numQuartos;
	
	public Apartamento(String código, String nome, String local, double preço, double avaliação, int numQuartos) {
		super(código, nome, local, preço, avaliação);
		this.numQuartos = numQuartos;
	}
	
	public int getNumQuartos() {
		return this.numQuartos;
	}

	@Override
	public String toString() {
		return super.toString() + " / Número de quartos: " + this.getNumQuartos();
	}
	
	
}
