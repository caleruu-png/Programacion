package boletin2;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		final int X = 12;
		final int Y = 16;
		int z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce las horas semanales trabajadas:");
		int h = sc.nextInt();
		if (h <= 40) {
			z = h * X;
		} else {
			z = (40 * X) + ((h - 40) * Y);
		}
		System.out.println("el salario es de "+z);
		sc.close();
	}

}
