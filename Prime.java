import java.util.Scanner;

public class Prime {
	
	boolean prime = true;
	
	public  void prime1(int number) {
	
	for(int i =2;i<number;i++) {
		
		if(number%i==0) {
			prime=false;
			break;
		}
	}
	if(prime==true) {
		System.out.println( number + " is a prime number");
	}
	else {
		System.out.println(number + " is not a prime number");
		
	}
}



	public static void main(String[] args) {
		 
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Any number to know it's a prime number or not:");
	
		int number =input.nextInt();
		
		Prime p = new Prime();
		
		p.prime1(number);
		
	
	}
			

}
