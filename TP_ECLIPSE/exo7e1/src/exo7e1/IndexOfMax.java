package exo7e1;

public class IndexOfMax {
	public static void main (String[] args) {
		
		int[] tab = {2, 8, 9,0,6,9,2, 5};
		
		if(tab.length == 0) {
			System.out.print("Le tableau ne doit pas etre vide");
		}else {
			System.out.println("L'indice du maximum de ce tableau est : " + indexOfMax(tab));
		}
	}
	
	static int indexOfMax(int[] tab) {
		int index = 0;
		int i = 0;
		
		while(i < tab.length ) {
			if(tab[i] >= tab[0]) {
				tab[0] = tab[i];
				index = i;
			}
			i++;
			
		}
		
		/*for(int i = 0; i < tab.length; i++) {
			if(tab[i] > tab[0]) {
				tab[0] = tab[i];
				index = i;
			}
		}*/
		
		return index;
		
	}
}
