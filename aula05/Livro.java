package aula05;

public class Livro {
	
	private int id = 100;
	private String titulo;
	private String TipoEmprestimo;
	private static int counter;
	private boolean disponibilidade;
	
	public Livro(String titulo, String TipoEmprestimo) {
		this.id = id + counter;
		counter++;
		this.titulo = titulo;
		this.TipoEmprestimo = TipoEmprestimo;
		this.disponibilidade = true;
	}
	
	public Livro(String titulo) {
		this.id = id + counter;
		counter++;
		this.titulo = titulo;
		setTipoEmprestimo("NORMAL");
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getTipoEmprestimo() {
		return this.TipoEmprestimo;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setTipoEmprestimo(String TipoEmprestimo) {
		this.TipoEmprestimo = TipoEmprestimo;
	}
	
	public boolean getDisponibilidade() {
		return this.disponibilidade;
	}
	
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	@Override
	public String toString() {
		return "Livro " + id + "; " + titulo + "; " + TipoEmprestimo + "; " + (disponibilidade ? "Disponível" : "Indisponível");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((TipoEmprestimo == null) ? 0 : TipoEmprestimo.hashCode());
		result = prime * result + id;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Livro other = (Livro) obj;
		if (TipoEmprestimo == null) {
			if (other.TipoEmprestimo != null)
				return false;
		} else if (!TipoEmprestimo.equals(other.TipoEmprestimo))
			return false;
		if (id != other.id)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
}
