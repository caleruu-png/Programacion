package boletin3;

import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {
		int x, i, m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero del 1 al 10");
		x = sc.nextInt();
		while (!(x >= 1 && x <= 10)) {
			System.out.println("Error, Introduce un numero del 1 al 10");
			x = sc.nextInt();
		}
		sc.close();
		for (i = 0; i <= 10; i++) {
			m = x * i;
			System.out.println(x + " * " + i + " = " + m);
		}
	}
}