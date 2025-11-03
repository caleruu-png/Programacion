package boletin2;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		float d, p, a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el radio de la circunferencia:");
		float r = sc.nextFloat();
		System.out.println("Elige entre estas opciones:");
		System.out.println("1. Calcular diámetro");
		System.out.println("2. Calcular perímetro");
		System.out.println("3. Calcular área");
		byte x = sc.nextByte();
		if (x == 1) {
			d = 2 * r;
			System.out.println("El diametro es: " + d);
		} else if (x == 2) {
			p = (float) (2 * Math.PI * r);
			System.out.println("El perimetro es: " + p);

		} else {
			a = (float) (Math.PI * Math.pow(r, 2));
			System.out.println("El area es: " + a);
		}

		sc.close();
	}

}
