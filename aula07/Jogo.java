package aula07;

public class Jogo {
	
	private Bola bola;
	private Equipa equipa1;
	private Equipa equipa2;
	private int golosEquipa1 = 0;
	private int golosEquipa2 = 0;
	private long start = 0;
	private long time = 0;
	
	public Jogo(Bola bola, Equipa equipa1, Equipa equipa2) {
		this.bola = bola;
		this.equipa1 = equipa1;
		this.equipa2 = equipa2;
	}
	
	public void apresentação() {
		System.out.println("E o dérbi robótico vai começar! " + bola);
		System.out.println(equipa1.getNome() + " vs. " + equipa2.getNome() + "\n");
		System.out.println(equipa1);
		System.out.println(equipa2);
	}
	
	public void start() {
		this.start = System.nanoTime();
		System.out.println("\n--------------- Começa o jogo! -----------------\n");
	}
	
	public void end() {
		this.time = System.nanoTime() - this.start;
		System.out.println("\n---------------- Fim do jogo! ------------------");
		System.out.println("\nDuração de jogo: " + this.time + " ns");
		System.out.println("Resultado Final: " + equipa1.getNome() + " [ " + golosEquipa1 + " - " + golosEquipa2 + " ] " + equipa2.getNome());
		if (golosEquipa1 > golosEquipa2)
			System.out.println("Parabéns ao " + equipa1.getNome() + "!");
		else if (golosEquipa2 > golosEquipa1)
			System.out.println("Parabéns ao " + equipa2.getNome() + "!");
		else {
			System.out.println("Empate!");
		}
	}
	
	public long getTime() {
		return this.start;
	}
	
	public void goloEquipa1() {
		this.golosEquipa1++;
	}
	
	public void goloEquipa2() {
		this.golosEquipa2++;
	}

	@Override
	public String toString() {
		return "Tempo: " + (System.nanoTime() - this.start) + " ns | " + equipa1.getNome() + " [ " + golosEquipa1 + " - " + golosEquipa2 + " ] " + equipa2.getNome();
	}
	
	
	
}
