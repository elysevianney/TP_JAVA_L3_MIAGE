package exo7e5;

import java.util.Arrays;

public class Fusion {

	public static void main(String[] args) {
		int[] t1 = { 3, 5, 102 };
		int[] t2 = { 1, 6, 8, 14, 18, 20 };
		System.out.println(Arrays.toString(fusion(t1, t2)));
	}

	static int[] fusion(int[] t1, int[] t2) {
		int[] t3 = new int[t1.length + t2.length];
		int j = 0;
		int k = 0;

		for (int i = 0; i < t3.length; i++) {

			if (j >= t2.length) {
				t3[i] = t1[k];
				k++;
				
			} else if (k >= t1.length) {
				t3[i] = t2[j];
				j++;
				
			} else {
				if (t1[k] < t2[j]) {
					t3[i] = t1[k];
					k++;

				} else {

					t3[i] = t2[j];
					j++;

				}

			}

		}

		return t3;
	}
}
