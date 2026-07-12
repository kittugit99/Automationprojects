import java.util.HashMap;
import java.util.Map;

public class Task1 {
	public static void main(String[] args) {
		int[] value = {11,22,33,44,55,66,77,88,99, 22, 33, 44};
		Map<Integer, Integer> unique = new HashMap<Integer, Integer>();
		for(int c : value) {
			unique.put(c, unique.getOrDefault(c, 0) +1);
			}
		System.out.println(unique);
			}
}

