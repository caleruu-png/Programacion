package Practica;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {

		System.out.println("Dame dos números para ver cuantos de ellos son pares");
		Scanner sc = new Scanner(System.in);
		int Num1 = sc.nextInt();
		int Num2 = sc.nextInt();
		
		if (Num1%2==0 && Num2%2==0 ) {
			System.out.println("Hay dos números pares");
		}else if((Num1%2==0 && Num2%2!=0) || (Num1%2!=0 && Num2%2==0)) {
			System.out.println("Hay un número par");
		}else {
			System.out.println("No hay ningún número par");
		}
		sc.close();
	}

}
