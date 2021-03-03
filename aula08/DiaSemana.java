package aula08;

public enum DiaSemana {
	Segunda, Terça, Quarta, Quinta, Sexta, Sábado, Domingo;
	
	static DiaSemana getEnum(int i){
		return DiaSemana.values()[i];	
	}
}
