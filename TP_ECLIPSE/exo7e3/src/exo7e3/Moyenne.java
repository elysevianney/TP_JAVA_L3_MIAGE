package exo7e3;

public class Moyenne {
	public static void main(String[] args) {
		double[] tab = {4,6};
		
		if(tab.length == 0) {
			System.out.print("Le tableau ne doit pas etre vide");
		}else {
			System.out.println("La moyenne des nombres de ce tableau  est : " + moyenne(tab));
		}
	}
	
	static double moyenne(double[] tab) {
		double somme = 0;
		int i = 0; 
		double moyenne = 0;
		while (i < tab.length ){
			if(tab[i] >=0) {
				somme += tab[i];
				i++;
			}
		}
		return somme/tab.length ;
	}

}
