package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("inserte cuantos numeros quiere introducir");
		int num = sc.nextInt();
		int[] codSecreto = new int[num];
		int[] intento = new int[num];
		for (int i = 0; i < num; i++) {
			codSecreto[i] = (int) (Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(codSecreto));
		while (!Arrays.equals(codSecreto, intento)) {
			System.out.println("introduzca los valores para adivinar (del 1 al 5)");
			for (int i = 0; i < num; i++) {
				intento[i] = sc.nextInt();
			}
			for (int i = 0; i < num; i++) {
				if (intento[i] == codSecreto[i]) {
					System.out.println(i + 1 + "- " + intento[i] + " Correcto");
				}
				if (intento[i] < codSecreto[i]) {
					System.out.println(i + 1 + "- " + intento[i] + " es menor");
				}
				if (intento[i] > codSecreto[i]) {
					System.out.println(i + 1 + "- " + intento[i] + " es mayor");
				}
			}
		}
		sc.close();
	}

}
