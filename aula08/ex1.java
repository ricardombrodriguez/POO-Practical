package aula08;
import java.util.ArrayList;
import java.util.Collections;

public class ex1 {
	
	public static void main(String[] args) {
		
		Empresa emp = new Empresa("AutoRent - Aluguer de Viaturas", "3860-123", "autorent@gmail.com");
		Motociclo m1 = new Motociclo("12-AB-34", "Yamaha", "R1", 500, "Desportivo");
		Motociclo m2 = new Motociclo("42-KL-12", "Vespa", "LX 125", 125, "Estrada");
		Ligeiro l1 = new Ligeiro("71-JE-99", "BMW", "X1", 300, 777777, 70);
		Taxi t1 = new Taxi("44-MD-01", "Mercedes", "S-Class", 250, 812763, 70, 123456);
		PesadoMercadorias pm1 = new PesadoMercadorias("92-GG-43", "Volvo", "Business", 310, 373792, 5000, 4000);
		PesadoPassageiros pp1 = new PesadoPassageiros("86-AQ-13", "Mercedes", "Transdev", 275, 141526, 3000, 40);
		
		emp.getLista().add(m1); emp.getLista().add(m2); emp.getLista().add(l1); emp.getLista().add(t1); emp.getLista().add(pm1); emp.getLista().add(pp1); 
		
		emp.getLista().get(0).trajeto(23);
		emp.getLista().get(1).trajeto(50);
		emp.getLista().get(2).trajeto(82);
		emp.getLista().get(3).trajeto(67);
		emp.getLista().get(4).trajeto(342);
		emp.getLista().get(5).trajeto(102);
		emp.getLista().get(0).trajeto(38);
		emp.getLista().get(1).trajeto(33);
		emp.getLista().get(5).trajeto(91);
		
		System.out.println("A viatura com a maior distância percorrida: \n" + emp.getViaturaMaiorDistancia() + "\n");
		
		System.out.println("Lista de viaturas ordenadas por cilindrada: ");
			ArrayList<Viatura> listaOrdenada = ordenarLista(emp.getLista());
			for(Viatura v : listaOrdenada){
				System.out.println(v);
		   }
	}
	
	public static ArrayList<Viatura> ordenarLista(ArrayList<Viatura> lista) {
	       Collections.sort(lista);
	       return lista;
	   }
	
}
