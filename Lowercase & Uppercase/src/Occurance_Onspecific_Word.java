
public class Occurance_Onspecific_Word {

	public static void main(String[] args) {
	String se = "get the future you want";
	String[] word = se.split(" ");
	StringBuilder rev = new StringBuilder(word[1]).reverse();
	String value = word[0] + " " + rev + " " + word[2];
	System.out.println(value);
	}

}
