package aula08;

public class QuatroRodas extends Viatura {
	
	private int numQuadro;
	
	public QuatroRodas(String matrícula, String marca, String modelo, int cilindrada, int numQuadro) {
		super(matrícula, marca, modelo, cilindrada);
		this.numQuadro = numQuadro;
	}
	
	public int getNumQuadro() {
		return this.numQuadro;
	}

	@Override
	public String toString() {
		return super.toString() + " | Número de quadro: " + numQuadro;
	}
}
