package boletin_examenes;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		int numero = 0, numeroMax = Integer.MIN_VALUE, numeroMin =Integer.MAX_VALUE, contadorMenores5 = 0, suma=0,contador=0;
		float porcentajeMenores5=0;
		boolean hayMayores100 = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entero y positivo.");
		numero = sc.nextInt();
		while (numero >= 0) {
			suma=suma+numero;
			contador++;
			if (numero > numeroMax) { // establece el numero maximo
				numeroMax = numero;
			}
			if (numero < numeroMin) { // establece el numero minimo
				numeroMin = numero;
			}
			if (numero < 5) { // establece el numero de numeros menores que 5
				contadorMenores5++;
			}
			if (numero > 100) { // establece la variable como true si hay mayores que 100
				hayMayores100 = true;
			}
			porcentajeMenores5=(float)(100*contadorMenores5)/contador;
			numero = sc.nextInt();
		}
		
		System.out.println("La media aritmetica es: "+(float)suma/contador);
		System.out.println("El valor minimo es: "+numeroMin);
		System.out.println("El vamor maximo es: "+numeroMax);
		System.out.println("El porcentaje de valores menores de 5 es: "+porcentajeMenores5);
		System.out.println("Hay numeros mayores que 100?"+hayMayores100);
		sc.close();
	}

}
