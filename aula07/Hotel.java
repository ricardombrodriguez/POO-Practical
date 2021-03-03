package aula07;

public class Hotel extends Alojamento {
	
	private String tipo;
	
	public Hotel(String c�digo, String nome, String local, double pre�o, double avalia��o, String tipo) {
		super(c�digo, nome, local, pre�o, avalia��o);
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
