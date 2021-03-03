package aula08;

public class Taxi extends Ligeiro {
	
	private int numLicença;
	
	public Taxi(String matrícula, String marca, String modelo, int cilindrada, int numQuadro, int capacidadeBagageira, int numLicença) {
		super(matrícula, marca, modelo, cilindrada, numQuadro, capacidadeBagageira);
		this.numLicença = numLicença;
	}
		
	public int getNumLicença() {
		return this.numLicença;
	}

	@Override
	public String toString() {
		return "Taxi | " + super.toString() + "Num. Licença: " + numLicença;
	}
}
