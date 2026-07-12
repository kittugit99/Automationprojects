
public class Target_matchingnumbers {

	public static void main(String[] args) {
		int[] value = {1,2,3,4,5,6,7,8,9};
		int target = 13;
		for(int i = 0; i<value.length; i++) {
			for(int j = i+1; j<value.length; j++) {
				if(value[i] + value[j] == target) {
					System.out.println(value[i] + " " + value[j] + " = "+ target);
				}
			}
		}

	}


}
