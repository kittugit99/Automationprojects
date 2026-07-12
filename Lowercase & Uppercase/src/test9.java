

public class test9 {

	public static void main(String[] args) {
	String S = "Automation1009@!#$%";
	int alphabatic =0;
	int numeric =0;
	int specialchar = 0;
	for(int i=0; i<S.length(); i++) {
	char ch = S.charAt(i);
	if(Character.isLetter(ch)) {
		alphabatic++;
	}
	else if(Character.isDigit(ch)) {
		numeric++;
	}
	else {
		specialchar++;
	}
	
	
	}
	System.out.println("Alphabatic value is :" +alphabatic);
	System.out.println("Numeric value is :" +numeric);
	System.out.println("specialchar value is :" +specialchar);
	
	}

	}

