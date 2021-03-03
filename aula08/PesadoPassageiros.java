package aula08;

public class PesadoPassageiros extends Pesado {

	public int numPassageiros;
	
	public PesadoPassageiros(String matrícula, String marca, String modelo, int cilindrada, int numQuadro, int peso, int numPassageiros) {
		super(matrícula, marca, modelo, cilindrada, numQuadro, peso);
		this.numPassageiros = numPassageiros;
	}
	
	public int getNumPassageiros() {
		return this.numPassageiros;
	}

	@Override
	public String toString() {
		return "Pesado de passageiros | " + super.toString() + " | Num. Passageiros: " + numPassageiros;
	}
	
	
	
}
