
public class test7 {

	public static void main(String[] args) {
		String s = "Automation@#1009";
		int numerical = 0;
		int alphabatic = 0;
		int specialchar = 0;
		for(int i=0; i< s.length(); i++) {
			char ch = s.charAt(i);
		if(Character.isLetter(ch)) {
			alphabatic++;
		}
		else if(Character.isDigit(ch)) {
			numerical++;
		}
		else {
			specialchar++;
			
		}
		}
		System.out.println("numerical value is :" +numerical);
		System.out.println("alphabatic value is :" +alphabatic);
		System.out.println("specialchar value is :" +specialchar);
	}

}
