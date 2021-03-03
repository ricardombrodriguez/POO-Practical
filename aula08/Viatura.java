package aula08;

public class Viatura implements Comparable<Viatura>, KmPercorridosInterface {
	
	private String matr�cula;
	private String marca;
	private String modelo;
	private int cilindrada;
	private int trajeto;
	private int distanciaTotal;
	
	public Viatura(String matr�cula, String marca, String modelo, int cilindrada) {
		this.matr�cula = matr�cula;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
	}
	
	public String getMatricula() {
		return this.matr�cula;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public int getCilindrada() {
		return this.cilindrada;
	}
	
	public void trajeto(int quilometros) {
		this.trajeto = quilometros;
		this.distanciaTotal += quilometros;
	}
	
	public int ultimoTrajeto() {
		return this.trajeto;
	}
	
	public int distanciaTotal() {
		return this.distanciaTotal;
	}
	
	@Override
    public int compareTo(Viatura v) {
        int cilindrada = ((Viatura)v).getCilindrada();
        return this.cilindrada - cilindrada;
   }

	@Override
	public String toString() {
		return "Matr�cula: " + matr�cula + " | " + marca + " " + modelo + " | " 
				+ cilindrada + " cm3 | �ltimo trajeto: " +  trajeto + "km | Dist�ncia total: " + distanciaTotal + " km";
	}
		
}
