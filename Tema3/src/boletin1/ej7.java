package boletin1;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero=sc.nextInt();
		System.out.println("el numero es primo?"+esPrimo(numero));
		sc.close();
	}
	public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;
    }

}
