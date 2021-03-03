package aula07;

public class Apartamento extends Alojamento {
	
	private int numQuartos;
	
	public Apartamento(String c�digo, String nome, String local, double pre�o, double avalia��o, int numQuartos) {
		super(c�digo, nome, local, pre�o, avalia��o);
		this.numQuartos = numQuartos;
	}
	
	public int getNumQuartos() {
		return this.numQuartos;
	}

	@Override
	public String toString() {
		return super.toString() + " / N�mero de quartos: " + this.getNumQuartos();
	}
	
	
}
