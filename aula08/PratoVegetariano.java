package aula08;

public class PratoVegetariano extends Prato {
	
	//Construtor
	public PratoVegetariano(String nome) {
		super(nome);		
	}
	
	public boolean addIngrediente(Alimento al) {
		if((this.getClass().isAssignableFrom(PratoVegetariano.class)) && (al.getClass().isAssignableFrom(Carne.class) || al.getClass().isAssignableFrom(Peixe.class)))
			return false;
		ingredientes.add(al);
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + " - Prato Vegetariano";
	}
	
}
