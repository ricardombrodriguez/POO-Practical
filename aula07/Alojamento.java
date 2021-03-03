package aula07;

public class Alojamento {
	
	private String c�digo;
	private String nome;
	private String local;
	private double pre�o;
	private boolean	disponibilidade;
	private double avalia��o;
	
	public Alojamento(String c�digo, String nome, String local, double pre�o, double avalia��o) {
		this.c�digo = c�digo;
		this.nome = nome;
		this.local = local;
		this.pre�o = pre�o;
		this.avalia��o = avalia��o;
		this.disponibilidade = true;
	}
	
	public String getC�digo() {
		return this.c�digo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getLocal() {
		return this.local;
	}
	
	public double getPre�o() {
		return this.pre�o;
	}
	
	public boolean getDisponibilidade() {
		return this.disponibilidade;
	}
	
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	public double getAvalia��o() {
		return this.avalia��o;
	}

	@Override
	public String toString() {
		return "C�digo: " + c�digo + " / Nome: " + nome + " / Local: " + local + " / Pre�o por noite: " + pre�o
				+ "� / Dispon�vel: " + (disponibilidade ? "Sim" : "N�o") + " / Avalia��o: " + avalia��o;
	}
	
	
}
