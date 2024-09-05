package exo5e2;

public class SommeChiffres {
	
	public static void main (String[] args) {
		System.out.println(sommeOfDigitIterative(2222));
	}
	
	static int sommeOfDigitIterative(int n) {
		
		int somme = 0;
		
		while(n%10 > 0) {

			somme += n%10;
			n/=10;
		}
		
		return somme;
	}
	
	static int sommeOfDigitRecursive(int n) {
		int somme = 0;
		
		if(n == 0) {
			return 0;
		}else {
			return somme + sommeOfDigitRecursive(n-1);
		}
	}
	
	static int digitIterative(int n, int i) {
		for(int j = 0; j < i; j++) {
			n /= 10;
		}
		return n%10;
	}

}
