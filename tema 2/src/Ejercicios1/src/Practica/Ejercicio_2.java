package Practica;

import java.util.Scanner;

public class Ejercicio_2 {
	public static void main(String[] args) {
		System.out.println("¡Dame el número 12!");
		Scanner sc = new Scanner(System.in);
		int Num1 = sc.nextInt();
		if (Num1==12) {
			System.out.println("¡Correcto!");
		}else {
			System.out.println("Mal, adios");
		}
		sc.close();
	}
		
}
