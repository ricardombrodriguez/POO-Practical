package aula06;

public class Figura {
	
	private String cor;
	
	public Figura(String cor){
		this.cor = cor;
	}
	
	public String getCor() {
		return this.cor;
	}

	@Override
	public String toString() {
		return "Figura [cor=" + cor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figura other = (Figura) obj;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		return true;
	}
}
