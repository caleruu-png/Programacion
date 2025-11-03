package bol1;

import java.util.Scanner;

public class Ejercicio_3 {
	public static void main(String[] args) {
		System.out.println("Introduce dos números para hacer su media");
		Scanner sc = new Scanner(System.in);
		int Num1 = sc.nextInt();
		int Num2 = sc.nextInt();
		float Media = (Num1+Num2)/2;
		System.out.println(Media);
		sc.close();
	}

}
