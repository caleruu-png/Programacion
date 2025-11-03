package Practica;

import java.util.Scanner;

public class Ejercicio_1 {
	public static void main(String[] args) {
		System.out.println("Dame un número a ver si es positivo o negativo");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		if (numero>=0) {
			System.out.println("El numero es positivo");
		}else {
			System.out.println("El nuemero es negativo");
		}
		sc.close();
	}

}
