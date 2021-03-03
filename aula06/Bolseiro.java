package aula06;

public class Bolseiro extends Aluno {
	
	private int bolsa;
	
	public Bolseiro(String nome, int cc, Data iDataNasc, Data iDataInsc, int nMec, int bolsa) {
		super(nome, cc, iDataNasc, iDataInsc);
	}
	
	public Bolseiro(String nome, int cc, Data iDataNasc) {
		super(nome, cc, iDataNasc);
	}
	
	public int getBolsa() {
		return this.bolsa;
	}
	
	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}

	@Override
	public String toString() {
		return "Bolseiro: " + this.getNome() + " | Cartão de cidadão: " + this.getcc() + " | Nº Mec.: " + this.getNMec() + " | Data de nascimento: " + this.getData() + " | Data de inscrição: " + this.getDataInsc() + " | Bolsa: " + this.bolsa + "€";     
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + bolsa;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bolseiro other = (Bolseiro) obj;
		if (bolsa != other.bolsa)
			return false;
		return true;
	}
	
	
}
