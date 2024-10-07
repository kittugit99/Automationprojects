
public class test1 {

	public class class2 {

		public static void main(String[] args) {

			String name = "Welocome to AutomatioN";
			int lower = 0;
			int upper = 0;
			
			for (int i = 0; i < name.length(); i++) {  
				char ch = name.charAt(i);
				if (ch >= 65 && ch <= 90) {  
					upper++;
				} else if (ch >= 97 && ch <= 122) {
					lower++;
				}
				
			}
			
			System.out.println("lower case characters: " + lower);  
			System.out.println("upper case characters: " + upper);

		}
	}

}

