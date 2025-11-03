package boletin3;

import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {
		int i, x, aprobados = 0, condicionados = 0, suspensos = 0;
		Scanner sc = new Scanner(System.in);
		for (i = 1; i <= 6; i++) {
			System.out.println("Introduce la calificacion del alumno");
			x = sc.nextInt();
			if (x >= 5) {
				aprobados++;
			} else if (x == 4) {
				condicionados++;
			} else if (x < 4) {
				suspensos++;
			}
		}
		System.out.println("Hay "+aprobados+" aprobados");
		System.out.println("Hay "+condicionados+" condicionados");
		System.out.println("Hay "+suspensos+" suspensos");
		sc.close();
	}

}
