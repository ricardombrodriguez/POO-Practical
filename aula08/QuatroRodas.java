package aula08;

public class QuatroRodas extends Viatura {
	
	private int numQuadro;
	
	public QuatroRodas(String matr�cula, String marca, String modelo, int cilindrada, int numQuadro) {
		super(matr�cula, marca, modelo, cilindrada);
		this.numQuadro = numQuadro;
	}
	
	public int getNumQuadro() {
		return this.numQuadro;
	}

	@Override
	public String toString() {
		return super.toString() + " | N�mero de quadro: " + numQuadro;
	}
}
