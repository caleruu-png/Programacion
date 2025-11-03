package boletin3;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		int max, min, x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los valores minimo y maximo del rango");
		min = sc.nextInt();
		max = sc.nextInt();
		while (!(x > min && x < max)) {
			System.out.println("introduce un numero dentro del rango");
			x = sc.nextInt();
		}
		sc.close();
	}

}
