
public class Count_Upper_Lowercase {
	public static void main(String[] args) {
		String value = "Welcome To AuatomtioN";
		int Upper = 0;
		int Lower = 0;
		for(int i =0; i<value.length();i++) {
			char ch =value.charAt(i);
			if(ch>=65 && ch<=90) {
				Upper++;
			}
			else {
				Lower++;
			}
		}
		System.out.println("Upper char are" +Upper);
		System.out.println("Lower char are" +Lower);
	}

}
