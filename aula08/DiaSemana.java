package aula08;

public enum DiaSemana {
	Segunda, Ter�a, Quarta, Quinta, Sexta, S�bado, Domingo;
	
	static DiaSemana getEnum(int i){
		return DiaSemana.values()[i];	
	}
}
