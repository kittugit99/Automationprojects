import java.util.Arrays;

public class Second_largest_and_Second_smallest {
	public static void main(String[] args) {
	int[] value = {12, 23, 90, 99, 78, 67, 54, 45, 10, 55};
	Arrays.sort(value);
	int second_largest = value[1];
	int secons_smallest = value[value.length -2];
	System.out.println("Second smallest number: " + second_largest);
    System.out.println("Second largest number: " + secons_smallest);
	}
	
	

}

