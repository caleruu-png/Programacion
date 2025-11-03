package boletin_4;

import java.util.Scanner;

public class Ejercicio_3 {
	public static void main(String[] args) {
		System.out.println("Dame un número del mes");

		int numMes = 0;
		Scanner sc = new Scanner(System.in);
		numMes = sc.nextInt();
		int piezas = 0;
		int diaMasPiezas = 0;
		int menosPiezas = Integer.MAX_VALUE;
		int mayorPiezas = Integer.MIN_VALUE;
		int dias = 0;
		
		int sumaMotores = 0;
		switch (numMes) {
		case 1, 3, 5, 7, 8, 10, 12:
			dias = 31;
		break;
		case 4, 6, 9, 11:
			dias =30;
		break;
		case 2:
			dias =28;
		break;
		default:
			System.out.println("Número no valido.");
		break;

		}
		for (int i = 1; i <= dias; i++) {
			
			System.out.println("Dime el número de piezas que se han fabricadoen el dia "+i);
			piezas = sc.nextInt();
			sumaMotores+=piezas;
			
			if(piezas<menosPiezas) {
				menosPiezas = piezas;
			}
			if(piezas>mayorPiezas) {
				mayorPiezas = piezas;
				diaMasPiezas=i;
			}
		}
		System.out.println("Día que se fabricaron mas piezas: "+	diaMasPiezas);
		System.out.println("Minimo de piezas hechas: "+menosPiezas);
		System.out.println("Motores que se han fabricado en el mes: "+sumaMotores);
		if(menosPiezas<300)System.out.println("Existen dias con menos de 300 piezas");
		sc.close();
		
	}
}
