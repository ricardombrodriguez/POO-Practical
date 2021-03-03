package aula08;

public class PratoDieta extends Prato {
	double limiteMaxCalorias;
	private double calorias;
	
	//Construtor
	public PratoDieta(String nome, double limiteMaxCalorias) {
		super(nome);
		this.limiteMaxCalorias=limiteMaxCalorias;
	}

	//Métodos
	public double getLimiteMaxCalorias() {
		return limiteMaxCalorias;
	}
	
	public void setLimiteMaxCalorias(double limiteMaxCalorias) {
		this.limiteMaxCalorias = limiteMaxCalorias;
	}
	
	public boolean addIngrediente(Alimento al){
		if((al.getCalorias() + calorias) > limiteMaxCalorias)
			return false;
		ingredientes.add(al);
		this.calorias += al.getCalorias();
		return true;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - Dieta (" + String.format("%.2f", this.calorias) + " Calorias)";
	}
}
