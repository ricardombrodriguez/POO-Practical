package aula08;

public class Pesado extends QuatroRodas {
	
	private int peso;
	
	public Pesado(String matr�cula, String marca, String modelo, int cilindrada, int numQuadro, int peso) {
		super(matr�cula, marca, modelo, cilindrada, numQuadro);
		this.peso = peso;
	}
	
	public int getPeso() {
		return this.peso;
	}

	@Override
	public String toString() {
		return super.toString() + " | Peso: " + peso + " kg";
	}
}
