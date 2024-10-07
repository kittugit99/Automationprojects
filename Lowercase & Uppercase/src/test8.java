
public class test8 {

	public static void main(String[] args) {
	String S = "Automation!@#$%12345";
	int alphabatic = 0;
	int  specialchar = 0;
	int numeric = 0;
	for(int i=0; i< S.length(); i++) {
	char ch = S.charAt(i);
	if(Character.isLetter(ch)) {
		alphabatic++;
	}
	else if (Character.isDigit(ch)) {
		numeric++;
	}
	else {
		specialchar++;
	}
	}
	System.out.println("alphabatic value is :" +alphabatic);
	System.out.println("specialchar value is :" +specialchar);
	System.out.println("numeric value is :" +numeric);
	}

}
