
public class Reverese_1 {

	public static void main(String[] args) {
	String s = "Automation value";
//		int len = s.length();
//		String rev = "";
//		for(int i=len-1; i>=0; i--) {
//			rev = rev+s.charAt(i);
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
			
//		}
	//	System.out.println(rev);
	}
}