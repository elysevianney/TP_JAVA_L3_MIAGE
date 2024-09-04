package exo4e1;

public class Maximum {
	public static void main (String args[]) {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);
		System.out.println("La maximum de " + n1 + " et "+n2 +" est : " + max(n1, n2));
		System.out.println("La maximum de " + n1 + ", " + n2 + " et " + n3 + " est : " + max3v1(n1, n2, n3));
		System.out.println("La maximum de " + n1 + ", " + n2 + " et " + n3 + " est : " + max3v2(n1, n2, n3));
	}
	
	static int max(int n1, int n2) {
		if(n1 >= n2) {
			return n1;
		}else {
			return n2;
		}
	}
	
	static int max3v1(int n1, int n2, int n3) {
		return max(n1, max(n2, n3));
	}
	
	static int max3v2(int n1, int n2, int n3) {
		if(n1 >= n2) {
			if(n1 >= n3) {
				return n1;
			}else {
				return n3;
			}
		}else if(n2>=n3){
			return n2;
		} else {
			return n3;
		}
	}
	
	
}
