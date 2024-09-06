package exo5e2;

public class SommeChiffres {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if (n < 0) {
			System.out.println("n doit etre superieur a 0");
		} else {
			System.out.println(
					"La somme des chiffre de " + n + " avec la méthode itérative est " + sommeOfDigitIterative(n));
			System.out.println(
					"La somme des chiffre de " + n + " avec la méthode récursive est " + sommeOfDigitRecursive(n, 0));
		}
	}

	static int sommeOfDigitIterative(int n) {

		int somme = 0;

		while (n > 0) {

			somme += n % 10;
			n /= 10;
		}

		return somme;
	}
	
	static int compteur = 0;
	static int sommeOfDigitRecursive(int n, int somme) {
		
		if (n <= 0) {

			return somme;
		} else {
			
			compteur++;
			System.out.println("C'est l'itération n°" + compteur);
			somme += n % 10;
			return sommeOfDigitRecursive(n / 10, somme);
		}
	}

}
