package exo4e2;

public class Mediane {
	
	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);
		
		if( (n1 == maxDe3Nombres(n1,n2,n3)) ) {
			System.out.println("La médiane est : "+max(n2,n3));
		}
		
		else if( (n1 == minDe3Nombres(n1,n2,n3)) ) {
			System.out.println("La médiane est : "+min(n2,n3));
		}
		
		
	}
	
	static int max(int n1,int n2) {
		
		if(n1 >= n2) {
			return n1;
		}
		else {
			return n2;
		}
		 
	}
	
	static int maxDe3Nombres(int n1, int n2, int n3) {
		return (max(n1,max(n2,n3)));
	}
	
	static int min(int n1,int n2) {
			
			if(n1 <= n2) {
				return n1;
			}
			else {
				return n2;
			}
			 
		}
		
		static int minDe3Nombres(int n1, int n2, int n3) {
			return (min(n1,min(n2,n3)));
		}
	

}
