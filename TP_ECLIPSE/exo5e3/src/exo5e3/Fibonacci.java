package exo5e3;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		
		if (n < 0) {
			System.out.println("n doit etre supérieur a 0");
		}else {
			System.out.println("La suite FIBONACCI de F("+n+")  avec la méthode recursive est "+fiboRecursive(n));
			System.out.println("La suite FIBONACCI de F("+n+")  avec la méthode itérative est "+fiboIterative(n));
		}
		
	}
	
	static int fiboRecursive(int n) {
		
		if(n <= 1) {
			return 1;
		}else {
			return fiboRecursive(n-1) + fiboRecursive(n-2);
		}
	}
	
	static int fiboIterative(int n) {
			
			int fiboPrecedent1 = 1;
			int fiboPrecedent2 = 1;
			
			int fibo = 0;
			
			for(int i = 2;i <= n; i++) {
				fibo = fiboPrecedent1 + fiboPrecedent2;
				
				fiboPrecedent1 = fiboPrecedent2;
				fiboPrecedent2 = fibo ;
			}
			
			return fiboPrecedent2;
		}

}
