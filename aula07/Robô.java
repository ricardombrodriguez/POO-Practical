package aula07;

public class Rob� extends Objeto {
	
	private String id;
	private String posi��o;
	private int golos;
	
	public Rob�(int x, int y, String id, String posi��o) {
		super(x,y);
		this.id = id;
		this.posi��o = posi��o;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getPosi��o() {
		return this.posi��o;
	}
	
	public void setPosi��o(String posi��o) {
		this.posi��o = posi��o;
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
		return id + " / Posi��o: " + posi��o + "\n";
	}
}
