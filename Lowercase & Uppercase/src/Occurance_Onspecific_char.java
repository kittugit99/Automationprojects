import java.util.*;
public class Occurance_Onspecific_char {
	public static void gettextvalue(String name) {
		Map<Character, Integer> charcount = new HashMap<Character, Integer>();
		char strvalue[]= name.toCharArray();
		for(char c : strvalue) {
			if( c == 'A' || c == 'a' || c == 'o') {
				char lowercaseChar = Character.toLowerCase(c);
				charcount.put(lowercaseChar, charcount.getOrDefault(lowercaseChar, 0) +1);		
				}				
		}
		System.out.print("Char count of 'A' 'a' & 'o' : " +charcount);
	}
	public static void main(String[] args) {	
	gettextvalue("Automation");

	}

}
