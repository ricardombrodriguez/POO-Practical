package aula02;
import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		int tempo, hr, mn, sg;
		Scanner sc = new Scanner(System.in);
		System.out.print("Tempo em segundos: ");
		tempo = sc.nextInt();
		sc.close();
		hr = Math.floorDiv(tempo, 3600);
		tempo = tempo % 3600;
		mn = Math.floorDiv(tempo, 60);
		sg = tempo % 60;
		System.out.print(hr + "h:" + mn + "m:" + sg + "s");
	}
}
