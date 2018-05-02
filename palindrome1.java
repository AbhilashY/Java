import java.util.Scanner;

public class palindrome1 {
	
	public static void palindrome(String revString, String str) {
		
		
		
		str = str.replace(" ", "");

		for(int i=str.length()-1;i>=0;i--) {
			
			revString=revString + str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(revString) ){
			System.out.println( "is a Palindrome");
		}
		else {
			System.out.println( "is not a Palindrome");
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = input.nextLine();
		String revString="";
		palindrome(revString,str);
		
	}

}
