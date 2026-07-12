import java.util.*;
public class Merge_twoArrays {

	public static void main(String[] args) {
		int[] Array1 = {1,3,5,7,9};
		int[] Array2 = {2,4,6,8,10};
		int[] merge = new int[Array1.length + Array2.length];
		for(int i = 0 ; i < Array1.length; i ++) {
			merge[i] = Array1[i];
			
		}
		for(int i  = 0 ; i <Array2.length; i++) {
			merge[Array1.length + i] = Array2[i];
			
		}
		
		Arrays.sort(merge);
		int secondsmallest = merge[1];
		int secondbiggest = merge[merge.length -2];
		
		System.out.println(secondsmallest);
		System.out.println(secondbiggest);

	}
}