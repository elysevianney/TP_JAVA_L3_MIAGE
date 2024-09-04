package exo3e3;

public class AverageArgs {
	public static void main(String[] arg) {
		int total = 0;
		for(int i=0; i<3; i++) {
			total += Integer.parseInt(arg[i]);
		}
		System.out.println(total/3);
	}

}
