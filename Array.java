
public class Array {
	
	static int[] values = {10,2,5,35,40,31,30 };
	
	public static int Maximum(int[] values) {
       
		int Maximum = values[0];
		for(int i =0; i< values.length; i++) {
			if (values[i] > Maximum) {
				Maximum = values[i];
			}
		}
		System.out.println("Maximum number in list is");
		System.out.println(Maximum);
		return Maximum;
		
	}
	
	public static int Minimum(int[] values) {
		
		int Minimum = values[0];
		for(int i =0; i > values.length; i++) {
			if (values[i] > Minimum) {
				Minimum = values[i];
			}
		}
		System.out.println("Minimum number in list is");
		System.out.println(Minimum);
		return Minimum;
		
	}
	

	public static void main(String[] args) {
		
		System.out.println("Difference between Max and Min numbers from list is " + (Maximum(values) - Minimum(values)));
	

	}
}
