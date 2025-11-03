package boletin2;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tabla1 = new int[6];
		int[] tabla2 = new int[6];
		int[] fusion = new int[tabla1.length + tabla2.length];
		for (int i = 0; i < 6; i++) {
			tabla1[i] = sc.nextInt();
		}
		for (int i = 0; i < 6; i++) {
			tabla2[i] = sc.nextInt();
		}
		for (int i = 0; i < tabla1.length; i++) {
			fusion[i] = tabla1[i];
		}
		
		for (int i = 0; i < tabla2.length; i++) {
			fusion[tabla1.length + i] = tabla2[i];
		}
		sc.close();
	}

}
