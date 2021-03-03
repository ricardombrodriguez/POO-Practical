package aula06;
import java.lang.Comparable;

public class Data implements Comparable<Data>{
	
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public int getDia() {
		return this.dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return String.format("%02d/%02d/%4d", dia, mes, ano);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + dia;
		result = prime * result + mes;
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
		Data other = (Data) obj;
		if (ano != other.ano)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}
	
	public int compareTo(Data d) {
		if (this.ano > d.ano)
			return 1;
		else if (this.ano < d.ano)
			return -1;
		else //mesmo ano
			if (this.mes > d.mes)
				return 1;
			else if(this.mes < d.mes)
				return -1;
			else
				if (this.dia > d.dia)
					return 1;
				else if (this.dia < d.dia)
					return -1;
				else
					return 0;
	}
	
}
