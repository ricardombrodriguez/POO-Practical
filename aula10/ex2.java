package aula10;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Dictionary2 d = new Dictionary2();
		Scanner sc = new Scanner(System.in);
		int opt;
		do {
			System.out.println("\nGestor de Dicionário");
			System.out.println("1 - Adicionar termo e significado(s)");
			System.out.println("2 - Alterar significado(s)");
			System.out.println("3 - Remover termo");
			System.out.println("4 - Gerador aleatório de significado");
			System.out.println("5 - Listar termos + significado(s)");
			System.out.println("6 - Listar termos");
			System.out.println("7 - Listar significados");
			System.out.println("8 - Limpar dicionário");
			System.out.println("9 - Sair do programa");
			System.out.print("Opção pretendida: ");
			opt = sc.nextInt();
			sc.nextLine();
			switch(opt) {
			case 1:
				d.adicionar();
				break;
			case 2:
				d.alterar();
				break;
			case 3:
				d.remover();
				break;
			case 4:
				d.randomSignificado();
				break;
			case 5:
				System.out.println(d);
				break;
			case 6:
				d.toStringK();
				break;
			case 7:
				d.toStringV();
				break;
			case 8:
				d.limparDicionário();
				break;
			case 9:
				System.out.println("Fim do programa.");
				break;
			default:
				System.out.println("Opção inexistente. Tente outra vez.\n");
			}
		} while (opt != 9);
		sc.close();
	}
}
