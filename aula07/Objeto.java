package aula07;

public class Objeto {
	
	private int x;
	private int y;
	private double dist = 0;
	
	public Objeto(int x, int y) {
		this.x = x;
		this.y = y;
		this.dist = 0;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void move(int newX, int newY) {
		this.dist += Math.sqrt( Math.pow(newX - this.x, 2) + Math.pow(newY - this.y, 2) );
		this.setX(newX); this.setY(newY);
	}
}
