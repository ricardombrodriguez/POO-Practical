package aula03;
import java.util.Scanner;
import java.util.Random;

public class ex7 {
	public static void main(String[] args) {
	    Random rand = new Random();
	    Scanner sc = new Scanner(System.in);
	    int tentativas, num;
	    tentativas = 0;
	    String continuar;
	    do {
		    int randomNum = rand.nextInt((100 - 1) + 1) + 1;
		    System.out.print("Jogo do Alto e Baixo. Tente adivinhar o número misterioso entre 1 e 100! \n");
		    System.out.print("Número: ");
		    num = sc.nextInt();
		    while (num != randomNum) {
		    	if (num > randomNum) {
		    		tentativas++;
		    		System.out.print("Alto. Número: ");
		    		num = sc.nextInt();
		    	}
		    	else if (num < randomNum) {
		    		tentativas++;
		    		System.out.print("Baixo. Número: ");
		    		num = sc.nextInt();
		    	}
		    }
		    System.out.printf("Parabéns. Adivinhou o número secreto depois de %d tentativas! \n", ++tentativas);
		    System.out.print("Pretende continuar? Prima (S)im para prosseguir: ");
		    continuar = sc.next();
	    } while (continuar.equals("S") || continuar.equals("s") || continuar.equals("Sim") || continuar.equals("sim"));
	    System.out.print("Fim do programa.");
	    sc.close();
	}
}
