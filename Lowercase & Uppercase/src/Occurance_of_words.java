import java.util.*;
public class Occurance_of_words {
	public static void gettext(String name) {
		Map<Character, Integer> charcount = new HashMap<Character, Integer>();
				
		char[] Stringvalue = name.toCharArray();
		for(char c : Stringvalue) {
			
			charcount.put(c, charcount.getOrDefault(c, 0) +1);
		}
		System.out.println("Char count is : " +charcount);
				
	}

	public static void main(String[] args) {
		gettext("Automation");

	}

}
