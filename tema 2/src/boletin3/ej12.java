package boletin3;

import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		int i, x;
		boolean esSuspenso = false;
		Scanner sc = new Scanner(System.in);
		for (i = 1; i <= 5 && !esSuspenso; i++) {
			System.out.println("Introduce la calificacion de un alumno");
			x = sc.nextInt();
			if (x < 5) {
				esSuspenso = true;
			}
		}
		if (esSuspenso) {
			System.out.println("Hay suspenso?" + esSuspenso);
		} else {
			System.out.println("Hay suspenso?" + esSuspenso);
		}
		sc.close();
	}

}
