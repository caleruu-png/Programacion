package bol1;

import java.util.Scanner;

public class Ejercicio_4 {
	public static void main(String[] args) {
		System.out.println("Dame las millas de lo que quieras calcular en metros");
		
		Scanner sc = new Scanner(System.in);
		int millas = sc.nextInt();
		
		sc.close();
		
		System.out.println(millas + " Millas son exactamente "+ millas*1069 +" metros" );
	}

}
