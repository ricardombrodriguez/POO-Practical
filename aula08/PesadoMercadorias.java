package aula08;

public class PesadoMercadorias extends Pesado {
	
	private int cargaMax;
	
	public PesadoMercadorias(String matr�cula, String marca, String modelo, int cilindrada, int numQuadro, int peso, int cargaMax) {
		super(matr�cula, marca, modelo, cilindrada, numQuadro, peso);
		this.cargaMax = cargaMax;
	}
	
	public int getCargaMax() {
		return this.cargaMax;
	}

	@Override
	public String toString() {
		return "Pesado de mercadorias | " + super.toString() + " | Carga Max.:" + cargaMax + " kg";
	}
}
