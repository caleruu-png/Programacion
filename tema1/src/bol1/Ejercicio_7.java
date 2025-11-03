package bol1;

import java.util.Scanner;

public class Ejercicio_7 {
	public static void main(String[] args) {
		System.out.println("Dame la altura del triangulo que quieres calcular su area");
		
		Scanner sc = new Scanner(System.in);
		
		int altura =sc.nextInt();
		
		System.out.println("Dame ahora la base del triangulo que quieres calcular su area");
		
		int base = sc.nextInt();
		float area = (base*altura)/2;
		System.out.println("Tu triangulo tiene un area de "+ area);
		sc.close();
		
	}

}
