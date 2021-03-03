package aula11;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class ex2 {
	
	public static void main (String[] arg) throws IOException, Exception{
		
		TreeMap <Hora, HashSet<ArrayList<String>>> voos = new TreeMap<>();
		HashMap <String, ArrayList<Object>> companhias = new HashMap<>();
		HashMap<String, Integer> cidades = new HashMap<>();
		
		try(Scanner inputCompanhias = new Scanner(new FileReader("src/Aula11/companhias.txt"))) {
			inputCompanhias.nextLine(); //ignorar primeira linha
			while(inputCompanhias.hasNext()) {
				String[] data= inputCompanhias.nextLine().split("\\t");
				ArrayList<Object> valor = new ArrayList<Object>();
				valor.add(data[1]);
				valor.add(0);
				valor.add(Hora.getHora("00:00")); 
				valor.add(Hora.getHora("00:00")); 
				companhias.put(data[0].trim(), valor);
			}
			inputCompanhias.close();
			
		}catch(IOException e) {
			System.err.printf("ERRO: %s\n", e.getMessage());
		}catch(Exception e) {
			System.err.printf("ERRO: %s\n", e.getMessage());
		}
		
		try(Scanner inputVoos = new Scanner(new FileReader("src/Aula11/voos.txt"))) {
			inputVoos.nextLine();
			while(inputVoos.hasNext()) {
				String[] data= inputVoos.nextLine().split("\\t");
				Hora h;
				String[] ht = data[0].split(":");
				h = new Hora(Integer.parseInt(ht[0]), Integer.parseInt(ht[1]));
				ArrayList<String> outros = new ArrayList<String>();
				for(int n=1; n<data.length; n++) { 
					outros.add(data[n]);
				}
				
				String cidade = outros.get(1);
				int c = 1;
				if(cidades.containsKey(cidade)) {
					c+=cidades.get(cidade);
				}
				cidades.put(cidade, c);

				if(outros.size() == 2) {
					outros.add("00:00");
				} else {
					String ciaCode = outros.get(0).substring(0, 2);
					boolean companhiaExists = companhias.containsKey(ciaCode);
					if(companhiaExists) { 
						ArrayList<Object> dadosCompanhia = companhias.get(ciaCode);
						int voosAtraso = Integer.parseInt(dadosCompanhia.get(1).toString())+1;
						dadosCompanhia.set(1, voosAtraso);
						Hora tempoAtraso = Hora.getHora(dadosCompanhia.get(2).toString());
						tempoAtraso.add(outros.get(2));
						dadosCompanhia.set(2, tempoAtraso);
						int minAtraso = tempoAtraso.hashCode();
						int mediaAtraso = minAtraso/voosAtraso;
						dadosCompanhia.set(3, new Hora(mediaAtraso));
					}
				}
				
				outros.add(h.calcularSoma(outros.get(2)).toString());
				HashSet<ArrayList<String>> valor = new HashSet<ArrayList<String>>();
				valor.add(outros);
				voos.put(h, valor);
			}
			inputVoos.close();
			
		}catch(IOException e) {
			System.err.printf("ERRO: %s\n", e.getMessage());
		}catch(Exception e) {
			System.err.printf("ERRO: %s\n", e.getMessage());
		}
		
		try(PrintWriter fileInfoPublico = new PrintWriter(new File("src/Aula11/Infopublico.txt"))){
			System.out.println("\n");
			System.out.printf("%-7s%-10s%-20s%-25s%-8s%-20s\n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
			fileInfoPublico.printf("%-7s%-10s%-20s%-25s%-8s%-20s\n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
			for(Hora h:voos.keySet()) {
				HashSet<ArrayList<String>> dataVoos = voos.get(h);
				Iterator<ArrayList<String>> itt = dataVoos.iterator();
				while (itt.hasNext()) {
					ArrayList<String> vooData = itt.next();
					String ciaCode = vooData.get(0).substring(0, 2).trim();
					boolean companhiaExists = companhias.containsKey(ciaCode);
					String companhia=ciaCode;
					if(companhiaExists) {
						companhia=companhias.get(ciaCode).get(0).toString();
					}
					System.out.printf("%-7s%-10s%-20s%-25s", h.toString(), vooData.get(0) , companhia, vooData.get(1));
					fileInfoPublico.printf("%-7s%-10s%-20s%-25s", h.toString(), vooData.get(0) , companhia, vooData.get(1));
					if(vooData.get(2)!="00:00") {
						System.out.printf("%-8s", vooData.get(2));
						System.out.printf("Previsto: %-8s", vooData.get(3));
						fileInfoPublico.printf("%-8s", vooData.get(2));
						fileInfoPublico.printf("Previsto: %-8s", vooData.get(3));
					}
					System.out.println("");
					fileInfoPublico.println("");
				}
			}			
			fileInfoPublico.close();
			System.out.println("\n\n");
			System.out.println("Infopublico.txt foi criado no diretório src/Aula11/Infopublico.txt");
		}catch(IOException e) {
			System.err.printf("ERRO: %s\n", e.getMessage());
		}catch(Exception e) {
			System.err.printf("ERRO: %s\n", e.getMessage());
		}
		
		System.out.println("\n\n");
		ArrayList<cAtraso> atrasosMedios = new ArrayList<>(); 
		companhias.forEach((k,v) -> atrasosMedios.add(new cAtraso(v.get(0).toString()+";"+v.get(3).toString())));
		Collections.sort(atrasosMedios);
		System.out.printf("%-25s%-7s\n", "Companhia", "Atraso médio");
		atrasosMedios.forEach(v -> System.out.printf("%-25s%-7s\n", v.toString().split(";")[0], v.toString().split(";")[1]));
			
		try(PrintWriter fileCidades = new PrintWriter(new File("src/Aula11/cidades.txt"))){
			System.out.println("\n\n");

	        comparadorCidades bvc = new comparadorCidades(cidades);
	        TreeMap<String, Integer> sortedCidades = new TreeMap<String, Integer>(bvc);
	        sortedCidades.putAll(cidades);
	        System.out.printf("%-25s%-7s\n", "Cidade", "Voos");
	        fileCidades.printf("%-25s%-7s\n", "Cidade", "Voos");
			sortedCidades.forEach((k, v) -> System.out.printf("%-25s%-7d\n", k, v));
			sortedCidades.forEach((k, v) -> fileCidades.printf("%-25s%-7d\n", k, v));
			fileCidades.close();
			System.out.println("\n\n\n");
			System.out.println("cidades.txt foi criado no diretório src/Aula11/cidades.txt");
			
		} catch(IOException e) {
			System.err.printf("ERRO: %s\n", e.getMessage());
		} catch(Exception e) {
			System.err.printf("ERRO: %s\n", e.getMessage());
		}
	}
}