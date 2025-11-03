package boletin4;

import java.util.Scanner;

public class ej2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numArboles, i, edad = 0, contadorEdad = 0;
		String tipo = " ";
		float diametro, altura, mediaAlturas = 0, sumaAlturas = 0, alturaMax = Float.MIN_VALUE,
				alturaMin = Float.MAX_VALUE, diametroMax = Float.MIN_VALUE, diametroMin = Float.MAX_VALUE, sumaEdad = 0,
				mediaEdad = 0;
		boolean hayMas30 = false;
		System.out.println("Introduce el numero de arboles que se van a introducir");
		numArboles = sc.nextInt();
		for (i = 1; i <= numArboles; i++) {
			System.out.println("Introduce el tipo de arbol");
			tipo = sc.next();
			System.out.println("Introduce el diametro");
			diametro = sc.nextFloat();
			System.out.println("Introduce la altura");
			altura = sc.nextFloat();
			if (tipo.equals("B")) {
				System.out.println("Introduce la edad");
				edad = sc.nextInt();
				contadorEdad++;
			}
			sumaAlturas = sumaAlturas + altura;
			mediaAlturas = sumaAlturas / numArboles;
			if (altura > alturaMax) {
				alturaMax = altura;
			}
			if (altura < alturaMin) {
				alturaMin = altura;
			}
			if (diametro > diametroMax) {
				diametroMax = diametro;
			}
			if (diametro < diametroMin) {
				diametroMin = diametro;
			}
			sumaEdad = sumaEdad + edad;
			mediaEdad = sumaEdad / contadorEdad;
			if (altura > 30) {
				hayMas30 = true;
			}
		}
		sc.close();
		System.out.println("La media de la altura de los arboles es " + mediaAlturas);
		System.out.println("La altura maxima es " + alturaMax);
		System.out.println("La altura minima es " + alturaMin);
		System.out.println("El diametro maximo es " + diametroMax);
		System.out.println("El diametro minimo es " + diametroMin);
		System.out.println("La media de las edades de los arboles tipo b es " + mediaEdad);
		if (hayMas30) {
			System.out.println("Existen árboles de más de 30 m.");
		} else {
			System.out.println("No existen árboles de más de 30 m.");
		}
	}
}
