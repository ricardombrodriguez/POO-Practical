package aula06;
import java.time.LocalDate;

public class Aluno extends Pessoa {
	
	private int nMec;
	private static int n = 100;
	private Data iDataInsc = null;
	LocalDate now = LocalDate.now();
	
	public Aluno(String iNome, int iBI, Data iDataNasc, Data iDataInsc){
		super(iNome, iBI, iDataNasc);
		this.nMec = n++;
		this.iDataInsc = iDataInsc;
	}
	
	public Aluno(String iNome, int iBI, Data iDataNasc){
		super(iNome, iBI, iDataNasc);
		this.nMec = n++;
		this.iDataInsc = new Data(Integer.parseInt(now.toString().split("-")[2]), Integer.parseInt(now.toString().split("-")[1]), Integer.parseInt(now.toString().split("-")[0])); 
	}
	
	public int getNMec() {
		return this.nMec;
	}
	
	public Data getDataInsc() {
		return this.iDataInsc;
	}

	@Override
	public String toString() {
		return "Pessoa: " + this.getNome() + " | Cartão de cidadão: " + this.getcc() + " | Nº Mec.: " + nMec + " | Data de nascimento: " + this.getData() + " | Data de inscrição: " + iDataInsc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((iDataInsc == null) ? 0 : iDataInsc.hashCode());
		result = prime * result + nMec;
		result = prime * result + ((now == null) ? 0 : now.hashCode());
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
		Aluno other = (Aluno) obj;
		if (iDataInsc == null) {
			if (other.iDataInsc != null)
				return false;
		} else if (!iDataInsc.equals(other.iDataInsc))
			return false;
		if (nMec != other.nMec)
			return false;
		if (now == null) {
			if (other.now != null)
				return false;
		} else if (!now.equals(other.now))
			return false;
		return true;
	}
}
