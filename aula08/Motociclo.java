package aula08;

public class Motociclo extends Viatura {
	
	private String tipo;
	
	public Motociclo(String matrícula, String marca, String modelo, int cilindrada, String tipo) {
		super(matrícula, marca, modelo, cilindrada);
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}

	@Override
	public String toString() {
		return "Motociclo | " + super.toString() + " | Tipo: " + tipo;
	}
}
