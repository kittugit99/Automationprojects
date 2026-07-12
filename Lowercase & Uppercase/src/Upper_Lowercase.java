
public class Upper_Lowercase {
	public static void main(String[] args) {
		String value = "Welcome To AutomatioN";
		String Upper = "";
		String Lower = "";
		
		for(int i =0; i <value.length(); i++) {
			char ch = value.charAt(i);
			if(ch>=65 && ch <=90) {
				Upper = Upper+ch;
		}
			else {
				Lower = Lower+ch;
			}
	}
		System.out.println(Upper);
		System.out.println(Lower);
	}
	
}




