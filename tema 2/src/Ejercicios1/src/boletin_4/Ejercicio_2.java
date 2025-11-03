package boletin_4;

import java.util.Scanner;

public class Ejercicio_2 {
	public static void main(String[] args) {
		System.out.println("Dime el número de árboles que se van a introducir");
		Scanner sc = new Scanner(System.in);
		
		int numArboles = sc.nextInt();
		
		int diametro =0;
		int diametroMin= Integer.MAX_VALUE;
		int diametroMax = Integer.MIN_VALUE;
		
		int altura = 0;
		int alturaMax = Integer.MIN_VALUE;
		int alturaMin = Integer.MAX_VALUE;
		int sumaAltura =0;
		
		int edad = 0;
		int contadorBArboles = 0;
		int sumaEdad = 0;

		for (int i = 0; i <numArboles ; i++) {
			System.out.println("Dime el tipo de árbol");
			String tipoArbol = sc.next();
			
			tipoArbol = tipoArbol.toLowerCase();
			
			if(tipoArbol.equals("b")) {
				contadorBArboles++;
				System.out.println("Dime su edad");
				edad = sc.nextInt();
				sumaEdad+=edad;
			}

			System.out.println("Dame el diametro del tronco");
			diametro =sc.nextInt();
			if(diametro>diametroMax) {
				diametroMax = diametro;
			}
			if(diametro<diametroMin) {
				diametroMin = diametro;
			}
			System.out.println("Dame la altura de tu árbol");
			altura = sc.nextInt();
			
			sumaAltura+=altura;
			
			if(altura>alturaMax) {
				alturaMax = altura;
			}
			if(altura<alturaMin) {
				alturaMin = altura;
			}
		}
		System.out.println("La media de altura de los árboles es: " + sumaAltura/numArboles);
		System.out.println("La altura maxima de los árboles es: " + alturaMax);
		System.out.println("La altura minima de los árboles es: " + alturaMin);
		
		System.out.println("El diametro maximo de los árboles es: " + diametroMax);
		System.out.println("El diametro minima de los árboles es: " + diametroMin);
		if(contadorBArboles>0) {
			System.out.println("La media de edad de los árboles es: " +sumaEdad/contadorBArboles);
		}else {
			System.out.println("No se introdujeron árboles tipo b");
		}
		if(alturaMax>=30) {
			System.out.println("Existen\r\n"
					+ "árboles de más de 30 m.");
		}
		sc.close();
	}



	}


