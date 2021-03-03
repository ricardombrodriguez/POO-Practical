package aula07;

public class Carros {
	
	private char classe; //A-F
	private String combustível;
	private boolean disponibilidade;
	private String código;
	
	public Carros(String código, char classe, String combustível) {
		this.classe = classe;
		this.combustível = combustível;
		this.disponibilidade = true;
		this.código = código;
	}
	
	public char getClasse() {
		return this.classe;
	}
	
	public void setClasse(char classe) {
		this.classe = classe;
	}
	
	public String getCombustível() {
		return this.combustível;
	}
	
	public void setCombustível(String combustível) {
		this.combustível = combustível;
	}
	
	public boolean getDisponibilidade() {
		return this.disponibilidade;
	}
	
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	@Override
	public String toString() {
		return "Código: " + código + " / Classe: " + classe + " / Combustível: " + combustível + " / Disponível: " + (disponibilidade ? "Sim" : "Não");
	}
	
	
}
