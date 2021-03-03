package aula13;

public class Student {
	
	private int nmec;
	private double atp, ac, ap, media;
	private String nome;
	
	public Student(int nmec, String nome, double atp, double ac, double ap) {
		this.nmec = nmec;
		this.atp = atp;
		this.ac = ac;
		this.ap = ap;
		this.nome = nome;
	}
	
	public void setMédia() {
		this.media = (0.3 * this.atp + 0.2 * this.ac + 0.5 * this.ap);
	}

	public int getNmec() {
		return nmec;
	}

	public void setNmec(int nmec) {
		this.nmec = nmec;
	}

	public double getAtp() {
		return atp;
	}

	public void setAtp(double atp) {
		this.atp = atp;
	}

	public double getAc() {
		return ac;
	}

	public void setAc(double ac) {
		this.ac = ac;
	}

	public double getAp() {
		return ap;
	}

	public void setAp(double ap) {
		this.ap = ap;
	}

	public double getMédia() {
		return media;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nº mec: " + nmec + " | Nome: " + nome + " | ATP: " + atp + " | AC: " + ac + " | AP: " + ap + " | Média: " + media;
	}
	
	
	
}
