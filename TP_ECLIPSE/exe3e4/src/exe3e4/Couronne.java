package exe3e4;

public class Couronne {
	public static void main (String[] args){
		System.out.println(surfaceCouronne(Double.parseDouble(args[0]), Double.parseDouble(args[1]))); 
    }
	
	public static double surfaceCercle(double rayon) {
		return rayon * rayon * Math.PI;
	}
	
	public static double surfaceCouronne(double rayon1, double rayon2) {
		
		
		return Math.abs(surfaceCercle(rayon1) - surfaceCercle(rayon2));
	}
}
