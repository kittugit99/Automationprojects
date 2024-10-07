
public class test6 {

	public static void main(String[] args) {
	int[] value = {12, 14, 16, 18, 20, 21, 25, 30};
	int maximumvalue = value[0];
	int minimumvalue = value[0];
	for(int i=1; i < value.length; i++) {
		if (value[i] > maximumvalue){
			maximumvalue = value[i];
		}
		else if(value[i] < minimumvalue) {
			minimumvalue = value[i];
		}
	}
	System.out.println("maximum value is :" +maximumvalue);
	System.out.println("minimum value is :" +minimumvalue);
	}

}
