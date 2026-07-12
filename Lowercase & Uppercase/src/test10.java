public class test10 {

	public static void main(String[] args) {
		
		        String sr = "I like to work on Automation testing and like to work on functional testing";
		        String word = "like";
		        int count = 0;
		        int index = 0;

		        // Loop to find each occurrence of the word
		        while ((index = sr.indexOf(word, index)) != -1) {
		            count++;
		            index += word.length();  // Move the index to the end of the found word
		        }

		        System.out.println("The word '" + word + "' occurs " + count + " times.");
		    }
		}

