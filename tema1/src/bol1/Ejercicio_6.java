package bol1;

import java.util.Scanner;

public class Ejercicio_6 {
	public static void main(String[] args) {
		System.out.println("Tus ultimas cuatro notas a ver si apruebas");
		
		Scanner sc = new Scanner(System.in);
		
		float Nota1 = sc.nextFloat();
		float Nota2 = sc.nextFloat();
		float Nota3 = sc.nextFloat();
		float Nota4 = sc.nextFloat();
		
		float NotaFinal= (Nota1+Nota2+Nota3+Nota4)/4;
		System.out.println("Tu nota media es:"+ Math.round(NotaFinal));
		sc.close();
		
	}

}
