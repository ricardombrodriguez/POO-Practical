package aula07;
import java.util.ArrayList;

public class Ag�ncia {
	
	private String nome;
	private String endere�o;
	
	private ArrayList<Alojamento> alojamentos;
	private ArrayList<Carros> carros;
	

	public Ag�ncia(String nome, String endere�o) {
		this.nome = nome;
		this.endere�o = endere�o;
		this.alojamentos = new ArrayList<>();
		this.carros = new ArrayList<>();
	}
	
	public ArrayList<Alojamento> getAlojamentos(){
		return alojamentos;
	}
	
	public void setAlojamentos(ArrayList<Alojamento> alojamentos) {
		this.alojamentos = alojamentos;
	}
	
	public void addApartamento(Apartamento ap) {
		alojamentos.add(ap);
	}
	
	public void addHotel(Hotel h) {
		alojamentos.add(h);
	}
	
	public ArrayList<Carros> getCarros(){
		return carros;
	}
	
	public void setCarros(ArrayList<Carros> carros) {
		this.carros = carros;
	}
	
	public void addCarros(Carros c) {
		carros.add(c);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndere�o() {
		return this.endere�o;
	}
	
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	@Override
	public String toString() {
		return "Ag�ncia " + nome + " / Endere�o: " + endere�o;
	}
}
