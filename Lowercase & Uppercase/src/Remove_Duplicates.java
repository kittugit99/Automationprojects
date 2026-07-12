import java.util.*;

public class Remove_Duplicates {
	public static void main(String[] args) {
		String input = "abcdabcaba";
		Set<Character> charcount = new LinkedHashSet<>();
		for(char c  : input.toCharArray()) {
			charcount.add(c);
			
		}
		StringBuilder result = new StringBuilder();
		for(char c : charcount) {
			result.append(c);
			}
		
		System.out.println("Print after removing suplicates :" + result.toString());

	}

}
