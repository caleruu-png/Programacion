package boletin2;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float[] numeros = new float[5];
		System.out.println("inserte cinco numeros decimales");
		for (int i = 0; i < 5; i++) {
			numeros[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(numeros[i]);
		}
		sc.close();
	}

}
