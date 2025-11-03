package bol1;

import java.util.Scanner;

public class Ejercicio_5 {
	public static void main(String[] args) {
		System.out.println("Dame la temperatura en grados centigrados para transformarla en Fahrenheit");
		Scanner sc = new Scanner(System.in);
		float grados = sc.nextFloat();
		System.out.println("La temperatura en Fahrenheit es "+ (grados*9)/5 + " Fahrenheit");
		sc.close();
	}

}
