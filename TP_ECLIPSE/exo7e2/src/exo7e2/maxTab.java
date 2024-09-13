package exo7e2;

public class maxTab {
	
public static void main (String[] args) {
		
		int[] tab = {2, 8, 9,0,6,15,2, 5};
		
		if(tab.length == 0) {
			System.out.print("Le tableau ne doit pas etre vide");
		}else {
			System.out.println("Le maximum de ce tableau est : " + maxTab(tab));
		}
	}
	
	static int maxTab(int[] tab) {
		int max = 0;
		int i = 0;
		
		while(i < tab.length ) {
			if(tab[i] >= max) {
				max = tab[i];
			}
			i++;
			
		}
	
		
		return max;
		
	}

}
