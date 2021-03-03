package aula04;
import java.util.Scanner;

public class ex2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Text: ");
		String text = sc.nextLine();
		sc.close();
		
		int numDigits = countDigits(text);
		System.out.println("Number of digits = " + numDigits);
		
		int numSpaces = countSpaces(text);
		System.out.println("Number of spaces = " + numSpaces);
		
		boolean isLowerCase = isLower(text);
		System.out.println("The phrase only contains lowercase characters = " + isLowerCase);
		
		String newStr = oneSpace(text);
		System.out.println("String with only one space between each word = " + newStr);
		
		boolean isPalindrome = palindrome(text);
		System.out.println(isPalindrome ? "Palindrome" : "Not a palindrome");
	}
	
	public static int countDigits(String s){
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)))
				counter++;
		}
		return counter;
	}
	
	public static int countSpaces(String s){
		int counter = 0;
		for (int i = 0; i < s.length(); i++){
			if (s.charAt(i) == ' ')
				counter++;
		}
		return counter;
	}
	
	private static boolean isLower(String s){
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))){
				if (!Character.isLowerCase(s.charAt(i)))
					return false;
			}
		}
		return true;
	}
	
	private static String oneSpace(String s){
		String[] words = s.split("\\s+"); //separa as palavras indendentemente da quantidade de whitespaces
		String result = String.join(" ", words); //adiciona cada elemento da array "words" à string result com separação " "
		return result;
	}
	
	private static boolean palindrome(String s) {
		String reverse = "";
		String normal = s.replaceAll("\\s+",""); //replace de todos os whitespaces na string s por "", de forma a ficar tudo junto na string "normal"
		for (int i = normal.length() -1; i >= 0; i--) {
			reverse += normal.charAt(i);
		}
		//comparar a variável normal com a reverse, case-insensitive
		if (normal.equalsIgnoreCase(reverse))
			return true;
		else
			return false;
	}
}
