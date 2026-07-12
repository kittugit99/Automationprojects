import java.util.HashMap;

public class Charwisecount {

	public static void main(String[] args) {
		String name = "krishnaprasad"; 

    
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                
                charCountMap.put(ch, 1);
            }
        }

        System.out.println("Character count in the string \"" + name + "\":");
        for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

	}


