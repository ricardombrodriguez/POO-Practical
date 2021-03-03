package aula07;
import java.util.Scanner;

public class Menu {
	
	public static final Scanner sc = new Scanner(System.in);
	private static Ag�ncia ag;
	private static int counter = 6;
	private static int n = 4;
	
	public static void main(String[] args) {
		
		System.out.print("Gest�o de Produtos - Ag�ncia de Viagens\n");
		System.out.print("\nNome da ag�ncia de viagens: ");
		String nome = sc.nextLine();
		System.out.print("Endere�o da ag�ncia de viagens: ");
		String endere�o = sc.nextLine();
		
		ag = new Ag�ncia(nome, endere�o);
		Apartamento a1 = new Apartamento("1","Apartamentos Novo Horizonte","Aveiro", 50.0, 3.50, 15);
		Hotel a2 = new Hotel("2","Melia Hotel Ria","Aveiro", 90.0, 4.00, "double");
		Hotel a3 = new Hotel("3","Hotel Tulip Inn","Estarreja", 65.0, 4.25, "triple");
		Apartamento a4 = new Apartamento("4","Apartamentos Jo�o Felizardo","Porto", 30.0, 3.00, 30);
		Hotel a5 = new Hotel("5","H10 Hotel","Lisboa", 120.0, 5.00, "double");
		ag.getAlojamentos().add(a1); ag.getAlojamentos().add(a2); ag.getAlojamentos().add(a3); ag.getAlojamentos().add(a4); ag.getAlojamentos().add(a5);
		
		Carros c1 = new Carros("1",'B',"gasolina");
		Carros c2 = new Carros("2",'D',"diesel");
		Carros c3 = new Carros("3",'A',"gasolina");
		ag.getCarros().add(c1); ag.getCarros().add(c2); ag.getCarros().add(c3); 
		
		int op = 0;
		do {
			System.out.println("\n----------------------");
	        System.out.println("1 - Inserir alojamento");
	        System.out.println("2 - Listar alojamentos");
	        System.out.println("3 - Inserir carro");
	        System.out.println("4 - Listar carros");
	        System.out.println("5 - Check-in");
	        System.out.println("6 - Check-out");
	        System.out.println("7 - Alugar carro");
	        System.out.println("8 - Entregar carro");
	        System.out.println("0 - Sair");
	        System.out.println("----------------------");
	        
	        System.out.print("Op��o: ");
			op = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (op) {
			case 1:
				inserirAlojamento();
				break;
			case 2:
				listarAlojamentos();
				break;
			case 3:
				inserirCarro();
				break;
			case 4:
				listarCarro();
				break;
			case 5:
				checkIn();
				break;
			case 6:
				checkOut();
				break;
			case 7:
				alugarCarro();
				break;
			case 8:
				entregarCarro();
				break;
			case 0:
				break;
			default:
				System.out.print("Op��o inexistente.\n");
			}
		} while (op != 0);
		
		System.out.println("Fim do programa. Obrigado. ");
		System.out.println(ag);
		sc.close();
	}
	
	public static void inserirAlojamento() {
		int tipoAlojamento;
		double avalia��o; String tipo;
		do {
			System.out.print("Tipo de alojamento a ser adicionado (1 - APARTAMENTO / 2 - HOTEL): ");
			tipoAlojamento = sc.nextInt();
		} while ((tipoAlojamento != 1) && (tipoAlojamento != 2));
		sc.nextLine();
		if (tipoAlojamento == 1) {
			String c�digo = String.valueOf(counter);
			System.out.print("Nome do apartamento: ");
			String nome = sc.nextLine();
			System.out.print("Local: ");
			String local = sc.nextLine();
			System.out.print("Pre�o por noite: ");
			double pre�o = sc.nextDouble();
			do {
				System.out.print("Avalia��o (1.0-5.0): ");
				avalia��o = sc.nextDouble();
			} while (avalia��o < 1.0 || avalia��o > 5.0);
			System.out.print("N�mero de quartos: ");
			int numQuartos = sc.nextInt();
			Apartamento ap = new Apartamento(c�digo, nome, local, pre�o, avalia��o, numQuartos);
			ag.addApartamento(ap);
			counter++;
		}
		
		else {
			String c�digo = String.valueOf(counter);
			System.out.print("Nome do hotel: ");
			String nome = sc.nextLine();
			System.out.print("Local: ");
			String local = sc.nextLine();
			System.out.print("Pre�o por noite: ");
			double pre�o = sc.nextDouble();
			do {
				System.out.print("Avalia��o (1.0-5.0): ");
				avalia��o = sc.nextDouble();
			} while (avalia��o < 1.0 || avalia��o > 5.0);
			do {
				System.out.print("Tipo de quarto (single/double/twin/triple): ");
				tipo = sc.next();
				tipo = tipo.toLowerCase();
			} while(!tipo.equals("single") && !tipo.equals("double") && !tipo.equals("twin") && !tipo.equals("triple"));
			Hotel h = new Hotel(c�digo, nome, local, pre�o, avalia��o, tipo);
			ag.addHotel(h);
			counter++;
		}
	}
	
	public static void listarAlojamentos() {
		for (Alojamento el : ag.getAlojamentos()) {
			System.out.println(el);
		}
	}
	
	public static void inserirCarro() {
		String c�digo = String.valueOf(n);
		char classe; String combust�vel;
		do {
			System.out.print("Classe do carro (A-F): ");
			classe = sc.next().charAt(0);
		} while(classe > 'F');
		do {
			System.out.print("Combust�vel (gasolina/diesel): ");
			combust�vel = sc.next();
			combust�vel = combust�vel.toLowerCase();
		} while(!combust�vel.equals("gasolina") && !combust�vel.equals("diesel"));
		Carros c = new Carros(c�digo, classe, combust�vel);
		ag.addCarros(c);
		n++;
	}
	
	public static void listarCarro() {
		for (Carros el : ag.getCarros()) {
			System.out.println(el);
		}
	}
	
	public static void checkIn() {
		int code; String confirm;
		System.out.println("Lista de alojamentos dispon�veis:");
		for (Alojamento el : ag.getAlojamentos()) {
			if (el.getDisponibilidade() == true)
				System.out.println(el);
		}
		do {
			System.out.print("Insira o c�digo do alojamento para check-in: ");
			code = sc.nextInt();
			sc.nextLine();
			System.out.println("\n" + ag.getAlojamentos().get(code-1));
			System.out.print("Para fazer o check-in do alojamento selecionado digite 'Sim': ");
			confirm = sc.next();
		} while(!confirm.equalsIgnoreCase("Sim"));
		ag.getAlojamentos().get(code-1).setDisponibilidade(false);
		System.out.print("Check-in realizado.\n");
	}
	
	public static void checkOut() {
		int code; String confirm;
		System.out.println("Lista de alojamentos ocupados: ");
		for (Alojamento el : ag.getAlojamentos()) {
			if (el.getDisponibilidade() == false)
				System.out.println(el);
		}
		do {
			System.out.print("Insira o c�digo do alojamento para check-out: ");
			code = sc.nextInt();
			sc.nextLine();
			System.out.println("\n" + ag.getAlojamentos().get(code-1));
			System.out.print("Para fazer o check-out do alojamento selecionado digite 'Sim': ");
			confirm = sc.next();
		} while(!confirm.equalsIgnoreCase("Sim"));
		ag.getAlojamentos().get(code-1).setDisponibilidade(true);
		System.out.print("Check-out realizado.\n");
	}
	
	public static void alugarCarro() {
		int code; String confirm;
		System.out.println("Lista de carros dispon�veis: ");
		for (Carros el : ag.getCarros()) {
			if (el.getDisponibilidade() == true)
				System.out.println(el);
		}
		do {
			System.out.print("Insira o c�digo do carro a alugar: ");
			code = sc.nextInt();
			sc.nextLine();
			System.out.println("\n" + ag.getCarros().get(code-1));
			System.out.print("Para alugar o carro selecionado digite 'Sim': ");
			confirm = sc.next();
		} while(!confirm.equalsIgnoreCase("Sim"));
		ag.getCarros().get(code-1).setDisponibilidade(false);
		System.out.print("Carro alugado.\n");
	}
	
	public static void entregarCarro() {
		int code; String confirm;
		System.out.println("Lista de carros ocupados: ");
		for (Carros el : ag.getCarros()) {
			if (el.getDisponibilidade() == false)
				System.out.println(el);
		}
		do {
			System.out.print("Insira o c�digo do carro a entregar: ");
			code = sc.nextInt();
			sc.nextLine();
			System.out.println("\n" + ag.getCarros().get(code-1));
			System.out.print("Para fazer a entrega do carro selecionado digite 'Sim': ");
			confirm = sc.next();
		} while(!confirm.equalsIgnoreCase("Sim"));
		ag.getCarros().get(code-1).setDisponibilidade(true);
		System.out.print("Carro entregue.\n");
	}
}
