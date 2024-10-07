
public class test5 {

	public static void main(String[] args) {
		String name = "AutomatION";
		int lowsercase = 0;
		int uppercase = 0;
		for (int i=0; i < name.length(); i++) {
			char ch =  name.charAt(i);
			if (ch>=65 && ch<=90) {
				lowsercase++;
				
			}
			else if (ch>=97 && ch<=122) {
				
				uppercase++;
		}
		
			
		}
		System.out.println("lower case chat :" +lowsercase);
		System.out.println("upper  case chat :" +uppercase);

	}

}
