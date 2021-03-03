package aula10;
import java.util.*;

public class ex3 {
	public static void main(String[] args) {
		
		String s = "Hello World";
		s = s.replaceAll("\\s","");
		Map<Character, ArrayList<Integer>> dict = new HashMap<Character, ArrayList<Integer>>();
		
		for (int i = 0; i < s.length(); i++) {
			if (!dict.containsKey(s.charAt(i))) {
				ArrayList<Integer> index = new ArrayList<Integer>();
				index.add(i);
				dict.put(s.charAt(i), index);
			}
			else {
				ArrayList<Integer> index = dict.get(s.charAt(i));
				index.add(i);
				dict.put(s.charAt(i), index);
			}
		}
		System.out.println(dict);
	}
}
