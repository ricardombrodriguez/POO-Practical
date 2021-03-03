package aula05;
import java.util.Scanner;
import java.util.ArrayList;

public class ex3 {
	
	public static final Scanner sc = new Scanner(System.in);
	public static ArrayList<Utilizador> utilizadores = new ArrayList<>(100);
	public static ArrayList<Livro> livros = new ArrayList<>(100);
	
	public static void main(String[] args) {
		System.out.println("PROGRAMA DE EMPR�STIMOS BIBLIOTEC�RIOS E GEST�O DE UTILIZADORES.");
		menu();
		sc.close();
	}
	
	public static void menu() {
		System.out.print("\n1 - inscrever utilizador\n2 - remover utilizador\n3 - imprimir lista de utilizadores\n4 - registar um novo livro"
				+ "\n5 - imprimir lista de livros\n6 - emprestar\n7 - devolver\n8 - sair\n\nEscolha a op��o que pretende: ");
		int option = sc.nextInt();
		sc.nextLine();
		switch (option) {
		case 1:
			inscreverUtilizador();
			break;
		case 2:
			removerUtilizador();
			break;
		case 3:
			imprimirUtilizadores();
			break;
		
		case 4:
			registarLivro();
			break;
		case 5:
			imprimirLivros();
			break;
		case 6:
			emprestar();
			break;
		case 7:
			devolver();
			break;
		case 8:
			System.out.println("Programa encerrado!");
			break;
		default:
			System.out.println("Introduziu uma op��o n�o existente. Por favor, tente outra vez.");
			menu();
		}
	}
	
	public static void inscreverUtilizador() {
		
		String nome, curso;
		int nMec;
		
		System.out.print("\nNome: ");
		nome = sc.nextLine();
		System.out.print("N�mero mecanogr�fico: ");
		nMec = sc.nextInt();
		while (nMec < 1 || nMec > 200000) {
			System.out.println("N�mero mecanogr�fico inv�lido, tente outra vez.");
			System.out.print("N�mero mecanogr�fico: ");
			nMec = sc.nextInt();
		}
		sc.nextLine();
		System.out.print("Curso: ");
		curso = sc.nextLine();
		utilizadores.add(new Utilizador(nome, nMec, curso));
		menu();
	}
	
	public static void removerUtilizador() {
		int valid = 0;
		System.out.print("\nInsira o n�mero mecanogr�fico do utilizador que pretende remover: ");
		int nMec = sc.nextInt();
		for (int i = 0; i < utilizadores.size(); i++) {
			if (utilizadores.get(i).getnMec() == nMec) {
				utilizadores.remove(i);
				valid = 1;
				break;
			}
		}
		if (valid == 0)
			System.out.println("Utilizador n�o encontrado.");
		menu();
	}
	
	public static void imprimirUtilizadores() {
		System.out.println();
		if (utilizadores.size() == 0)
			System.out.println("N�o existe nenhum utilizador.");
		else {
			for (Utilizador u : utilizadores) {
				System.out.println(u);
			}
		}
		menu();
	}
	
	public static void registarLivro() {
		String titulo;
		int TipoEmprestimo;
		System.out.print("\nT�tulo do livro: ");
		titulo = sc.nextLine();
		System.out.print("Tipo de empr�stimo (1 = NORMAL / 2 = CONDICIONAL): ");
		TipoEmprestimo = sc.nextInt();
		while (TipoEmprestimo != 1 && TipoEmprestimo != 2) {
			System.out.println("Sele��o inv�lida. Tente outra vez.");
			System.out.print("Tipo de empr�stimo (1 = NORMAL / 2 = CONDICIONAL): ");
			TipoEmprestimo = sc.nextInt();
		}
		sc.nextLine();
		livros.add(new Livro(titulo, (TipoEmprestimo == 1) ? "NORMAL" : "CONDICIONAL"));
		menu();
	}
	
	public static void imprimirLivros() {
		System.out.println();
		if (livros.size() == 0)
			System.out.print("N�o existe nenhum livro dispon�vel.");
		else {
			for (Livro l : livros) {
				System.out.println(l);
			}
		}
		menu();
	}
	
	public static void emprestar() {
		
		System.out.print("N�mero mecanogr�fico do aluno a requisitar o livro: ");
		int nMec = sc.nextInt();
		sc.nextLine();
		
		int id = -1;
		for (Utilizador u : utilizadores) {
			if (u.getnMec() == nMec) {
				id = utilizadores.indexOf(u);
			}				
		}
		
		if (id != -1) {
			if (utilizadores.get(id).getNumLivros() < 3) {
				System.out.print("ID do livro para requisi��o: ");
				int idLivro = sc.nextInt();
				sc.nextLine();
				Livro livro = null;
				
				for (Livro l : livros) {
					if (l.getId() == idLivro) {
						livro = l;
					}
				}
				
				if (livro != null) {
					if (livro.getTipoEmprestimo().equals("CONDICIONAL")) {
						System.out.println("N�o pode requisitar livros condicionados.");
						emprestar();
					}
					else if (livro.getDisponibilidade()) {
						utilizadores.get(id).addLivro(idLivro);
						livro.setDisponibilidade(false);
					}
				}
				
				else {
					System.out.println("O livro n�o existe.");
				}
							
			}
			
			else {
				System.out.println("O aluno j� atingiu o m�ximo de 3 livros.");
			}
		}
		else {
			System.out.println("O n�mero mecanogr�fico inserido n�o corresponde a nenhum aluno existente.");
		}
		menu();
	}
	
	public static void devolver() {
		
		System.out.print("\nN�mero mecanogr�fico do aluno a devolver o livro: ");
		int nMec = sc.nextInt();
		sc.nextLine();
		
		int id = -1;
		for (Utilizador u : utilizadores) {
			if (u.getnMec() == nMec) {
				id = utilizadores.indexOf(u);
			}				
		}
		
		if (id != -1) {
			
			if (utilizadores.get(id).getNumLivros() > 0) {
				System.out.print("ID do livro para devolu��o: ");
				int idLivro = sc.nextInt();
				sc.nextLine();
				Livro livro = null;
				
				for (Livro l : livros) {
					if (l.getId() == idLivro)
						livro = l;
				}
				
				if (livro != null) {
					if (livro.getDisponibilidade() == false) {
						utilizadores.get(id).devolverLivro(idLivro);
						livro.setDisponibilidade(true);
					}
				}
				
				else {
					System.out.println("O livro n�o existe.");
				}
				
			}
			else {
				System.out.println("O utilizador n�o possui nenhum livro para poder devolver.");
			}
		}
		else {
			System.out.println("O n�mero mecanogr�fico inserido n�o corresponde a nenhum aluno existente.");
		}
	menu();
	}
}
