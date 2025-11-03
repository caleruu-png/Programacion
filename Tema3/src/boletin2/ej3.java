package boletin2;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contadorPositivo = 0;
		int contadorNegativo = 0;
		int contadorCeros = 0;
		int sumaPos = 0;
		int sumaNeg = 0;
		System.out.println("inserte cuantos numeros quiere introducir");
		int num = sc.nextInt();
		int[] numeros = new int[num];
		System.out.println("inserte los numeros");
		for (int i = 0; i < num; i++) {
			numeros[i] = sc.nextInt();
		}
		for (int i = 0; i < num; i++) {
			if (numeros[i] > 0) {
				contadorPositivo++;
				sumaPos += numeros[i];
			}
			if (numeros[i] < 0) {
				contadorNegativo++;
				sumaNeg += numeros[i];
			}
			if (numeros[i] == 0) {
				contadorCeros++;
			}
		}
		System.out.println("La media de los numeros positivos es " + (float) sumaPos / contadorPositivo);
		System.out.println("La media de los numeros negativos es" + (float) sumaNeg / contadorNegativo);
		System.out.println("El numero de ceros es " + contadorCeros);
		sc.close();
	}

}
