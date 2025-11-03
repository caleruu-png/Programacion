package boletin1;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce nos numeros");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("El mayor es "+mayorMenor(a,b));
		sc.close();
	}
	public static int mayorMenor(int a,int b) {
		int resultado;
		if (a>b) {
			resultado=a;
		} else {
			resultado=b;
		}
		return resultado;
	}
}
