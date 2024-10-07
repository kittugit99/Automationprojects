
public class test4 {

	public static void main(String[] args) {
		String name = "AutomatiON";
		int lowercase = 0;
		int uppercase = 0;
		for(int i=0; i< name.length(); i++) {
			char ch = name.charAt(i);
			if (ch>=65 && ch<=90) {
				uppercase++;
				
				
			}
			else if (ch>=97 && ch<=122) {
				lowercase++;
			}
		}
		System.out.println("Lower case char :" +lowercase);
		System.out.println("Upper case char :" +uppercase);
		

	}

}
