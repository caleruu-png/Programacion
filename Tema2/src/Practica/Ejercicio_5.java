package Practica;

import java.util.Scanner;

public class Ejercicio_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese tres números enteros largos:");
        
        System.out.print("Primer número: ");
        long num1 = sc.nextLong();
        
        System.out.print("Segundo número: ");
        long num2 = sc.nextLong();
        
        System.out.print("Tercer número: ");
        long num3 = sc.nextLong();
        
        long mayor = num1;
        
        if (num2 > mayor) mayor = num2;
        if (num3 > mayor) mayor = num3;
        
        System.out.println("El mayor de los tres números es: " + mayor);
        
        sc.close();
	}

}
