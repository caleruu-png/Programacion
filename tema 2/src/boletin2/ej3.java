package boletin2;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		byte menor, menor2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime dos numeros:");
		byte x = sc.nextByte();
		byte y = sc.nextByte();
		if (x < y) {
			menor = x;
		} else {
			menor = y;
		}
		System.out.println("El menor es " + menor);
		System.out.println("Dime otros dos numeros:");
		byte a = sc.nextByte();
		byte b = sc.nextByte();
		menor2 = (a < b) ? a : b;
		System.out.println("El menor es " + menor2);
		sc.close();
	}

}
