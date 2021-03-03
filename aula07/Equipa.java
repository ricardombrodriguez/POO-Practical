package aula07;
import java.util.ArrayList;

public class Equipa {
	
	private String nome;
	private String responsável;
	private int golosMarcados = 0;
	private int golosSofridos = 0;
	private ArrayList<Robô> jogadores;
	
	public Equipa(String nome, String responsável) {
		this.nome = nome;
		this.responsável = responsável;
		this.golosMarcados = 0;
		this.golosSofridos = 0;
		this.jogadores = new ArrayList<>(3);
	}
	
	public void addRobô(Robô r) {
		jogadores.add(r);
	}
	
	public ArrayList<Robô> getJogadores(){
		return this.jogadores;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getResponsável() {
		return this.responsável;
	}
	
	public void marcarGolo() {
		this.golosMarcados++;
		System.out.println("E o " + this.nome + " adiciona um golo ao marcador!");
	}
	
	public void sofrerGolo() {
		this.golosSofridos++;
	}

	@Override
	public String toString() {
		String lista_jogadores = "";
		for (Robô el : jogadores) {
			lista_jogadores += el;
		}
		return nome + " / Treinador: " + responsável + "\nLista de jogadores:\n" + lista_jogadores;
	}
	
	
}
