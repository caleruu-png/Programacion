package boletin3;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		int x = sc.nextInt();
		sc.close();
		for (i = 1; i <= x; i++) {
			System.out.println(i);
		}
	}

}
