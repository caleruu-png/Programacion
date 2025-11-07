package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tabla = { 2, 4, 3, 9, 4, 7,7, 6,2, 6, 5 };
		System.out.println(Arrays.toString(sinRepetidos(tabla)));
		sc.close();
	}

	public static int[] sinRepetidos(int t[]) {
		int contadorunicos = 0;
		int num;

		for (int i = 0; i < t.length; i++) {
			if (esUnico(t[i], t, i)) {
				contadorunicos++;
			}
		}
		int[] resultado = new int[contadorunicos];
		int indice = 0;
		for (int i = 0; i < t.length; i++) {
			boolean esUnico = true;
			for (int j = 0; j < indice; j++) {
				if (t[i] == resultado[j]) {
					esUnico = false;
				}
			}
			if (esUnico) {
				resultado[indice] = t[i];
				indice++;
			}
		}
		return resultado;

	}

	public static boolean esUnico(int num, int[] tabla, int indice) {
		boolean esUnico = true;
		for (int j = 0; j < indice && esUnico; j++) {
			if (num == tabla[j]) {
				esUnico = false;
			}
		}
		return esUnico;
	}

}
