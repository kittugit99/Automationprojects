import java.util.HashMap;
import java.util.Map;

public class Occurance_2 {
	public static void getnewcode(String name) {
		Map<Character, Integer> charcount =  new HashMap<Character, Integer>();
		char strvalue[] = name.toCharArray();
		for(char c : strvalue) {
			if(charcount.containsKey(c)) {
				charcount.put(c, charcount.get(c) +1);
				
			}
			else {
				charcount.put(c, 1);
			}
			
		}
		System.out.println(name+ ":" +charcount);
	}

	public static void main(String[] args) {
		getnewcode("Automation test");
		// TODO Auto-generated method stub
	}
}
