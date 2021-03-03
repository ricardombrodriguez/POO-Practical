package aula12;
import java.util.*;

public class Movie {
	
	private String name, rating, genre;
	private double score;
	private int runningTime;
	
	public Movie(String name, double score, String rating, String genre, int runningTime) {
		this.name = name;
		this.score = score;
		this.rating = rating;
		this.genre = genre;
		this.runningTime = runningTime;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getScore() {
		return this.score;
	}
	
	public String getRating() {
		return this.rating;
	}
	
	public String getGenre() {
		return this.genre;
	}
	
	public int getRunningTime() {
		return this.runningTime;
	}
	
	public static int compareName(Movie m1, Movie m2) {
		return m1.getName().compareToIgnoreCase(m2.getName());
    }

	public static int compareScore(Movie m1, Movie m2) {
		return Double.compare(m2.getScore(), m1.getScore());
	}
	
	public static int compareRunningTime(Movie m1, Movie m2) {
		return Double.compare(m1.getRunningTime(), m2.getRunningTime());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + runningTime;
		long temp;
		temp = Double.doubleToLongBits(score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (runningTime != other.runningTime)
			return false;
		if (Double.doubleToLongBits(score) != Double.doubleToLongBits(other.score))
			return false;
		return true;
	}

	@Override
	public String toString() {
	return String.format("%-38s | %-5.1f | %-8s | %-8s | %-4d", name, score, rating, genre, runningTime);
	}
}
