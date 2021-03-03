package aula11;

public class Hora implements Comparable<Hora>{
	private int hh, mm;
	
	public Hora(int hh, int mm) {
		this.hh=hh;
		this.mm=mm;
	}

	public Hora(int m) { 
		this.hh = m / 60;
		this.mm = m % 60;
	}
	
	public int getHoras() {
		return hh;
	}
	
	public int getMinutos() {
		return mm;
	}
	
	public Hora calcularSoma(String h) {
		String[] hData = h.split(":");
		Hora novaHora = new Hora(Integer.parseInt(hData[0]), Integer.parseInt(hData[1]));
		return this.calcularSoma(novaHora);
	}
	
	public Hora calcularSoma(Hora h1) {
		int mmf = 0, hhf = 0;
		mmf += h1.getMinutos() + this.mm;
		if (mmf >= 60) {
			mmf -= 60;
			hhf += 1;
		}
		hhf += h1.getHoras() + this.hh;
		if (hhf >= 24) {
			hhf -= 24;
		}
		return new Hora(hhf, mmf);
	}
	
	public void add(String h) {
		Hora novaHora = Hora.getHora(h);
		this.add(novaHora);
	}
	
	public void add(Hora h1) {
		this.mm += h1.getMinutos();
		if (this.mm >= 60) {
			this.mm -= 60;
			this.hh += 1;
		}
		this.hh += h1.getHoras();
		if (this.hh >= 24) {
			this.hh -= 24;
		}
	}
	
	public String toString() {
		return String.format("%02d:%02d", hh, mm);
	}

	@Override
	public int hashCode() {
		//Returns value in minutes
		return hh*60+mm;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (!(obj instanceof Hora))
			return false;
		Hora other = (Hora) obj;
		if (hh != other.hh)
			return false;
		if (mm != other.mm)
			return false;
		return true;
	}

	@Override
	public int compareTo(Hora h) {
		return this.hashCode()-h.hashCode();
	}
	
	public static Hora getHora(String h) { 
		String[] hora = h.trim().split(":");
		return new Hora(Integer.parseInt(hora[0]), Integer.parseInt(hora[1]));
	}
	
	public static Hora getHora(int h) {
		int hh = h / 60;
		int mm = h % 60;
		return new Hora(hh, mm);
	}
	
	
	

}