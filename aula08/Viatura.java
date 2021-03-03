package aula08;

public class Viatura implements Comparable<Viatura>, KmPercorridosInterface {
	
	private String matrícula;
	private String marca;
	private String modelo;
	private int cilindrada;
	private int trajeto;
	private int distanciaTotal;
	
	public Viatura(String matrícula, String marca, String modelo, int cilindrada) {
		this.matrícula = matrícula;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
	}
	
	public String getMatricula() {
		return this.matrícula;
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
		return "Matrícula: " + matrícula + " | " + marca + " " + modelo + " | " 
				+ cilindrada + " cm3 | Último trajeto: " +  trajeto + "km | Distância total: " + distanciaTotal + " km";
	}
		
}
