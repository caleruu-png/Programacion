package ejerciciosBaseExamen;

import java.util.Scanner;

public class ejercicio_1 {
	public static void main(String[] args) {
		System.out.println("Dame un números, cuando te canses introduce -1");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		int contador =0;
		int suma = 0;
		int menorCinco = 0;
		int valorMinimo = Integer.MAX_VALUE;
		int valorMaximo = Integer.MIN_VALUE;
		
		while (num1>-1) {
			
			suma+=num1;
			contador++;
			if(valorMinimo>num1) valorMinimo=num1;

			if(valorMaximo<num1) valorMaximo=num1;
			if(num1<5) menorCinco++;
			System.out.println("Dame otro número.");
			num1= sc.nextInt();
			
		}
		sc.close();
		if(contador>1) {
		System.out.println("Introduciste un -1, fin.");
		System.out.println("La media de los numeros positivos es: "+suma/contador);
		System.out.println("El valor minimo de los valores introducidos es: "+valorMinimo);
		System.out.println("El porcentaje de valores menores de cinco es: "+(100*menorCinco)/contador);
		if(valorMaximo>=100)System.out.println("Ha habido un valor mayor de 100");
		}else {
			System.out.println("Introduciste un -1, fin.");
			System.out.println("No introduciste ningun valor para poder mostrar");
		}
	}

}
