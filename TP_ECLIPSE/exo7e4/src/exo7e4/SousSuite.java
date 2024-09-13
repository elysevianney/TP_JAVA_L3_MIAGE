package exo7e4;

import java.util.Scanner;

public class SousSuite {
	
public static void main(String[] args) {
	
		int[] tab = {7,5,5,4,1,1,1,1,8,8,4,1};
		
		if(tab.length == 0) {
			System.out.print("Le tableau ne doit pas etre vide");
		}else {
			System.out.println("La longueur de la plus longue sous-suite constante est "+sousSuite(tab)+" suite de "+suiteMax);
		}
		
	}

	
	static int suiteMax = 0;
	
	static int sousSuite(int[] tab) {
			int max = 0;
			int i = 0;
			int j = 1;
			int entreePrev = tab[i];
			
			while(i < tab.length) {
				
				if(entreePrev == tab[i]) {
					
					j++;
					if(j > max) {
						max = j;
						suiteMax = tab[i];
					}
				}
				else {
					entreePrev = tab[i];
					j = 1;
				}
				i++;
			}
		
		return max;
			
		}

}
