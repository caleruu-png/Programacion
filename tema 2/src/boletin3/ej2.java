package boletin3;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		int x, c = 0, s = 0, me = 0, m = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce la edad de un alumno");
			x = sc.nextInt();
			c++;// cuenta los alumnos introducidos
			if (x >= 18) {
				me++;
			} // cuenta los mayores de edad
			s = s + x;// suma de las edades
			m = s / c;// media de la edad de los alumnos
			System.out.println("La suma de las edades es: " + s);
			System.out.println("La media de los " + c + " alumnos es: " + m);
			System.out.println(me + " Alumnos son mayores de edad");
		} while (x > 0);
		sc.close();
	}

}
