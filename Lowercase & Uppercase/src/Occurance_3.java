import java.util.*;
public class Occurance_3 {
	public static void getvalue(String name) {
		Map<Character, Integer> charcount = new HashMap<Character, Integer>();
		char ch[] = name.toCharArray();
		for(char c : ch) {
			if(charcount.containsKey(c)) {
			charcount.put(c, charcount.get(c));
		}
		else {
			charcount.put(c, 1);
			}
				}
		System.out.println(name + " : " +charcount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getvalue("prasad");
	}

}
