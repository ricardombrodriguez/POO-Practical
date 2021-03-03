package aula07;

public class Bola extends Objeto{
	
	private String cor;
	
	public Bola(int x, int y, String cor) {
		super(x,y);
		this.cor = cor;
	}

	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Cor da bola: " + cor;
	}
	
	
}
