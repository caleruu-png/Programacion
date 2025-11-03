package boletin3;

import java.util.Scanner;

public class el1 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("introduce un numero");
			x = sc.nextInt();
			if (x % 2 == 0) {
				System.out.println("Es par");
			}
			if (x > 0) {
				System.out.println("Es positivo");
			}
			System.out.println("El cuadrado de " + x + " es: " + (Math.pow(x, 2)));

		} while (x != 0);
		sc.close();
	}

}
