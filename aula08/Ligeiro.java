package aula08;

public class Ligeiro extends QuatroRodas {
	
	private int capacidadeBagageira;
	
	public Ligeiro(String matrícula, String marca, String modelo, int cilindrada, int numQuadro, int capacidadeBagageira) {
		super(matrícula, marca, modelo, cilindrada, numQuadro);
		this.capacidadeBagageira = capacidadeBagageira;
	}
	
	public int getCapacidadeBagageira() {
		return this.capacidadeBagageira;
	}

	@Override
	public String toString() {
		return "Ligeiro | " + super.toString() + " | Capacidade bagagem: " + capacidadeBagageira + " l";
	}
}
