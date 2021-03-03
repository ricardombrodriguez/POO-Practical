package aula07;
import java.util.ArrayList;

public class Equipa {
	
	private String nome;
	private String respons�vel;
	private int golosMarcados = 0;
	private int golosSofridos = 0;
	private ArrayList<Rob�> jogadores;
	
	public Equipa(String nome, String respons�vel) {
		this.nome = nome;
		this.respons�vel = respons�vel;
		this.golosMarcados = 0;
		this.golosSofridos = 0;
		this.jogadores = new ArrayList<>(3);
	}
	
	public void addRob�(Rob� r) {
		jogadores.add(r);
	}
	
	public ArrayList<Rob�> getJogadores(){
		return this.jogadores;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getRespons�vel() {
		return this.respons�vel;
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
		for (Rob� el : jogadores) {
			lista_jogadores += el;
		}
		return nome + " / Treinador: " + respons�vel + "\nLista de jogadores:\n" + lista_jogadores;
	}
	
	
}
