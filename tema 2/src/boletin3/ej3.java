package boletin3;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		int y = 0, x = (int) (Math.random() * 100) + 1;
		System.out.println("Puedes rendirte poniendo un numero negativo");
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("intenta adivinar el numero del 1-100");
			y = sc.nextInt();
			if (y < 0) {
				System.out.println("Te rendiste");
				break;
			} else if (y == x) {
				System.out.println("Correcto!!");
				break;
			}
		} while (y != x);
		sc.close();
	}

}
