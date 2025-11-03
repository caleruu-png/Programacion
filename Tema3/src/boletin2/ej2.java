package boletin2;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("inserte cuantos numeros quiere introducir");
		int num = sc.nextInt();
		int[] numeros = new int[num];
		System.out.println("inserte los numeros decimales");
		for (int i = 0; i < num; i++) {
			numeros[i] = sc.nextInt();
		}
		for (int i = num - 1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
		sc.close();
	}

}
