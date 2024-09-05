package exo5e1;

public class Digit {
	
	public static void main(String[] args) {
		int i = Integer.parseInt(args[1]);
		int n = Integer.parseInt(args[0]);
		if(i < 0) {
			System.out.println("Les chiffres sont numérotés à partir de 0");
		}else {
			System.out.println("Le " +i+"e chiffre de "+n+" par la méthode itérative est "+digitIterative(n,i));
			System.out.println("Le " +i+"e chiffre de "+n+" par la méthode recursive est "+digitRecursive(n,i));
		}		
	}
	
	static int digitIterative(int n, int i) {
		for(int j = 0; j < i; j++) {
			n /= 10;
		}
		return n%10;
	}
	
	static int digitRecursive(int n, int i) {
		if(i== 0) {
			return n%10 ;
		}
		else {
			return digitRecursive(n/10,i-1);
		}
		
	}

}
