package boletin2;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		double a, b, c, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime los coeficientes para la ecuacion ax2+bx+c = 0");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = Math.pow(b, 2) - 4 * a * c;
		sc.close();
		if (d > 0) {
			double x1 = (-b + Math.sqrt(d)) / (2 * a);
			double x2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("Dos soluciones reales: " + x1 + " y " + x2);
		} else if (d == 0) {
			double x = (-b) / (2 * a);
			System.out.println("Una solución real: = " + x);
		} else {
			System.out.println("No existen soluciones reales.");
		}

	}

}
