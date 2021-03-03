package aula07;

public class Hotel extends Alojamento {
	
	private String tipo;
	
	public Hotel(String código, String nome, String local, double preço, double avaliação, String tipo) {
		super(código, nome, local, preço, avaliação);
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}

	@Override
	public String toString() {
		return super.toString() + " / Tipo de Quarto: " + this.getTipo();
	}
	
}
