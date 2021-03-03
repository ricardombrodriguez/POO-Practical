package aula12;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class ex2 {
	
	public static void main(String[] args) {
		
		TreeSet<Movie> movies = new TreeSet<Movie>(Movie::compareName);
		TreeSet<String> genres = new TreeSet<String>(); 
		
		try {
			Scanner sc = new Scanner(new FileReader("src/aula12/movies.txt"));
			sc.nextLine();
			
			while (sc.hasNextLine()) {
				String linha = sc.nextLine();
				String[] campos = linha.split("\t");
				System.out.println(Arrays.toString(campos));
				movies.add(new Movie(campos[0], Double.valueOf(campos[1]), campos[2], campos[3], Integer.valueOf(campos[4])));
				genres.add(campos[3]);
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("The file doesn't exist.");
		}
		
		System.out.println("\nb) Movies ordered by name: \n");
		System.out.printf("%-38s   %-5s   %-8s   %-8s   %-4s", "Movie name", "Score", "Rating", "Genre", "Running Time\n\n");
        movies.forEach(System.out::println);
        
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.addAll(movies);
        Collections.sort(movieList, Movie::compareScore);    
        System.out.println("\nc1) Highest to lowest score movies: \n");
        movieList.forEach(System.out::println);
        
        Collections.sort(movieList, Movie::compareRunningTime);
        System.out.println("\nc2) Lowest to highest running time movies: \n");
        movieList.forEach(System.out::println);
        
        System.out.println("\nd) Movie genres: ");
        genres.forEach(System.out::println);
        

        try (FileWriter mySelection = new FileWriter(new File("src/aula12/myselection.txt"))){
        	ArrayList<Movie> comedyMovies = new ArrayList<Movie>();
        	for (Movie m : movieList) {
        		if ((m.getGenre().equals("comedy")) && (m.getScore() > 60) )
        			comedyMovies.add(m);
        	}
        	Collections.sort(comedyMovies, Movie::compareScore);
        	System.out.println("\ne) Comedy movies with 60+ score: \n");
        	comedyMovies.forEach(System.out::println);
        	System.out.println("\nEvery comedy movie with 60+ score was written in 'myselection.txt' successfully!");
           
        } catch (IOException e) {
            System.out.print("Couldn't write in the file.");
        }
        
	}
}
