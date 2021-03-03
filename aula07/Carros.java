package aula07;

public class Carros {
	
	private char classe; //A-F
	private String combust�vel;
	private boolean disponibilidade;
	private String c�digo;
	
	public Carros(String c�digo, char classe, String combust�vel) {
		this.classe = classe;
		this.combust�vel = combust�vel;
		this.disponibilidade = true;
		this.c�digo = c�digo;
	}
	
	public char getClasse() {
		return this.classe;
	}
	
	public void setClasse(char classe) {
		this.classe = classe;
	}
	
	public String getCombust�vel() {
		return this.combust�vel;
	}
	
	public void setCombust�vel(String combust�vel) {
		this.combust�vel = combust�vel;
	}
	
	public boolean getDisponibilidade() {
		return this.disponibilidade;
	}
	
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	@Override
	public String toString() {
		return "C�digo: " + c�digo + " / Classe: " + classe + " / Combust�vel: " + combust�vel + " / Dispon�vel: " + (disponibilidade ? "Sim" : "N�o");
	}
	
	
}
