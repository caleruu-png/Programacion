package Practica;

import java.util.Scanner;

public class Ejercicio_3 {
	public static void main(String[] args) {
		System.out.println("Dame un número y veamos si es par o impar");
		Scanner sc = new Scanner(System.in);
		int Num1 = sc.nextInt();
		if (Num1%2==0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
		sc.close();
	}

}
