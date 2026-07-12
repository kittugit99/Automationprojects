import java.util.HashMap;
import java.util.Map;

public class Occurance_1 {

	public static void main(String[] args) {
		String input = "Capgemini";
		input = input.toLowerCase();
		int vowelCount = 0;
		Map<Character, Integer>CharcterCount = new HashMap<>();
		String vowels = "aeiou";
		for (char ch : input.toCharArray()){
			if(vowels.indexOf(ch)!= -1) {
				vowelCount++;
				
				
			}
			CharcterCount.put(ch, CharcterCount.getOrDefault(ch,0) +1);
			
		}
		System.out.println("Vowel count" +vowelCount);
		System.out.println("Character occurancy");
		for(Map.Entry<Character, Integer> entry : CharcterCount.entrySet()) {
			System.out.println(entry.getKey() + ":" +entry.getValue());
			
		}
		

	}

}
