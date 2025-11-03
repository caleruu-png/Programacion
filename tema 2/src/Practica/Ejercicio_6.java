package Practica;

import java.util.Scanner;

public class Ejercicio_6 {
	public static void main(String[] args) {
		final float GRAVEDAD =9.8f;
		
		System.out.println("dame el tiempo en segundos");
		Scanner sc = new Scanner(System.in);
		int tiempo = sc.nextInt();
		
		if (tiempo<0) {
			System.out.println("Tiempo incorrecto");
		}else {
			System.out.println("La velocidad es: "+(GRAVEDAD*tiempo)+"m/s");
		}
		sc.close();
	}
	

}
