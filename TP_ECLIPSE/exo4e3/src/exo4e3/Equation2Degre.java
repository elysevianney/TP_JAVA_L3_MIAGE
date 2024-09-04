package exo4e3;

public class Equation2Degre {
	public static void main (String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Integer.parseInt(args[1]);
		double c = Integer.parseInt(args[2]);
		roslution2Degre(a, b, c);
	}
	
	static void roslution2Degre(double a, double b, double c) {
		
		double delta = b*b - (4*a*c);
		
		if (delta == 0) {
			
			double x0 = -b/(2*a);
			System.out.println("L'equation adment une racine unique x0 = " + x0);
		}else if (delta > 0) {
			double x1 = (-b - Math.sqrt(delta))/ (2*a);
			double x2 = (-b + Math.sqrt(delta))/ (2*a);
			System.out.println("L'equation admet deux racines distincts x1 = " + x1 + " et x2 = " + x2);
		}else {
			System.out.println("L'equation n'admet pas de racine");
		}
	}
}
