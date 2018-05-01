import java.util.Scanner;

public class Fibonacci {
	int a=0, b=1, c;
	
	public int fibo(int n) {
		
	for(int i=1;i<=n;i++) {
			
			c=a+b;
			System.out.print( " "  + a +" ");
			a=b;
			b=c;
		}
	return a;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = input.nextInt();
		
		
		System.out.println("Fibonacci sequance");
		
		Fibonacci F1 = new Fibonacci();
		
		F1.fibo(n);

	}

}
