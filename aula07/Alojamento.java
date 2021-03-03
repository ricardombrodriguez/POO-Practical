package aula07;

public class Alojamento {
	
	private String código;
	private String nome;
	private String local;
	private double preço;
	private boolean	disponibilidade;
	private double avaliação;
	
	public Alojamento(String código, String nome, String local, double preço, double avaliação) {
		this.código = código;
		this.nome = nome;
		this.local = local;
		this.preço = preço;
		this.avaliação = avaliação;
		this.disponibilidade = true;
	}
	
	public String getCódigo() {
		return this.código;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getLocal() {
		return this.local;
	}
	
	public double getPreço() {
		return this.preço;
	}
	
	public boolean getDisponibilidade() {
		return this.disponibilidade;
	}
	
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	public double getAvaliação() {
		return this.avaliação;
	}

	@Override
	public String toString() {
		return "Código: " + código + " / Nome: " + nome + " / Local: " + local + " / Preço por noite: " + preço
				+ "€ / Disponível: " + (disponibilidade ? "Sim" : "Não") + " / Avaliação: " + avaliação;
	}
	
	
}
