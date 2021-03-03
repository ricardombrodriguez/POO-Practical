package aula08;

public class Taxi extends Ligeiro {
	
	private int numLicen�a;
	
	public Taxi(String matr�cula, String marca, String modelo, int cilindrada, int numQuadro, int capacidadeBagageira, int numLicen�a) {
		super(matr�cula, marca, modelo, cilindrada, numQuadro, capacidadeBagageira);
		this.numLicen�a = numLicen�a;
	}
		
	public int getNumLicen�a() {
		return this.numLicen�a;
	}

	@Override
	public String toString() {
		return "Taxi | " + super.toString() + "Num. Licen�a: " + numLicen�a;
	}
}
