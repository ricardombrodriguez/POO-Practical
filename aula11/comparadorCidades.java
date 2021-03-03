package aula11;

import java.util.*;

public class comparadorCidades implements Comparator<String>{
	
	private Map<String, Integer> base;

    public comparadorCidades(Map<String, Integer> base) {
        this.base = base;
    }
    
    public int compare(String a, String b) {
    	//ordem inversa
        if (base.get(a) > base.get(b)) {
            return -1;
        } else {
            return 1;
        }
    }
}
