package aula07;
import java.util.ArrayList;

public class Agência {
	
	private String nome;
	private String endereço;
	
	private ArrayList<Alojamento> alojamentos;
	private ArrayList<Carros> carros;
	

	public Agência(String nome, String endereço) {
		this.nome = nome;
		this.endereço = endereço;
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
	
	public String getEndereço() {
		return this.endereço;
	}
	
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	@Override
	public String toString() {
		return "Agência " + nome + " / Endereço: " + endereço;
	}
}
