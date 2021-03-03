package aula07;

public class Robô extends Objeto {
	
	private String id;
	private String posição;
	private int golos;
	
	public Robô(int x, int y, String id, String posição) {
		super(x,y);
		this.id = id;
		this.posição = posição;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getPosição() {
		return this.posição;
	}
	
	public void setPosição(String posição) {
		this.posição = posição;
	}
	
	public int getGolos() {
		return this.golos;
	}
	
	public void marcarGolo() {
		this.golos++;
		System.out.println("Golo do " + this.id + "!");
	}

	@Override
	public String toString() {
		return id + " / Posição: " + posição + "\n";
	}
}
