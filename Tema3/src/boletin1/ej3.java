package boletin1;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 para area, 2 para volumen");
		int a = sc.nextInt();
		System.out.println("Indica el radio de la base");
		double radio = sc.nextFloat();
		System.out.println("Indica la altura");
		double altura = sc.nextFloat();
		System.out.println("El resultado es " + calculo(a, radio, altura));
		sc.close();
	}

	static double calculo(int a, double r, double h) {
		double resultado;
		if (a == 1) {
			resultado = (2 * Math.PI * r )* (h + r);
		} else {
			resultado = Math.PI * Math.pow(r, 2) * h;
		}
		return resultado;
	}
}
