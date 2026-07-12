import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Character_and_vowels_count {
	public static void gettextvalue(String name) {
		Map<Character, Integer> charcount = new HashMap<>();
		Set<Character> vowel = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		int vowelcount = 0;
		char[] Stringvalue = name.toCharArray();
		for(char c : Stringvalue) {
			
			if(vowel.contains(c)) {
				vowelcount++;
			}
			charcount.put(c, charcount.getOrDefault(0, 1) + 1);
		}
		System.out.println("vowel count is : "+vowelcount);
		System.out.println("Char count is : "+charcount);
	}

	public static void main(String[] args) {
		gettextvalue("capgemini office");

	}

}
