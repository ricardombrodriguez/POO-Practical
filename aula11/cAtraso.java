package aula11;

public class cAtraso  implements Comparable<cAtraso>{
	String nome;
	Hora atraso;
	String rawData;
	
	public cAtraso(String a) {
		String[] data = a.split(";");
		this.nome=data[0];
		this.atraso=Hora.getHora(data[1]);
		this.rawData=a;
	}
	
	public Hora getAtraso() {
		return atraso;
	}
	
	public int compareTo(cAtraso outra) {
		return this.atraso.compareTo(outra.getAtraso());
	}
	
	public String toString() {
		return rawData;
	}

}
