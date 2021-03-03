package aula10;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Dictionary1 d = new Dictionary1();
		Scanner sc = new Scanner(System.in);
		int opt;
		do {
			System.out.println("\nGestor de Dicionário");
			System.out.println("1 - Adicionar termo e significado");
			System.out.println("2 - Alterar significado");
			System.out.println("3 - Remover termo");
			System.out.println("4 - Listar termos + significados");
			System.out.println("5 - Listar termos");
			System.out.println("6 - Listar significados");
			System.out.println("7 - Limpar dicionário");
			System.out.println("8 - Sair do programa");
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
				System.out.println(d);
				break;
			case 5:
				d.toStringK();
				break;
			case 6:
				d.toStringV();
				break;
			case 7:
				d.limparDicionário();
				break;
			case 8:
				System.out.println("Fim do programa.");
				break;
			default:
				System.out.println("Opção inexistente. Tente outra vez.\n");
			}
		} while (opt != 8);
		sc.close();
	}
}
