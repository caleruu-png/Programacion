package boletin1;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		final float gravedad = 9.8f;
		float velocidad;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tiempo");
		float tiempo = sc.nextFloat();
		sc.close();
		if (tiempo <= 0) {
			System.out.println("Tiempo incorrecto");
		} else {
			velocidad = gravedad * tiempo;
			System.out.println("La velocidad es: " + velocidad);
		}
	}

}
