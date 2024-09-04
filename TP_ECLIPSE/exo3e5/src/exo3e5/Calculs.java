package exo3e5;

public class Calculs {
	
	public static void main(String[] args) {
		System.out.println("Aire de la surface du cercle est : "
		+Circle.aireCercle(Double.parseDouble(args[0])));
		
		System.out.println("Perimetre du cercle est : "
		+Circle.perimetre(Double.parseDouble(args[0])));
		
		System.out.println("Aire de la surface du rectangle est : "
		+Rectangle.aireSurface(Double.parseDouble(args[1]),Double.parseDouble(args[2])));
		
		System.out.println("Perimetre du rectangle est : "
		+Rectangle.perimetre(Double.parseDouble(args[1]),Double.parseDouble(args[2])));
	}

}
