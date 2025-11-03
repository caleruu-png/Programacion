package boletin1;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tres numeros");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("El mayor es "+mayorMenorTres(a,b,c));
		sc.close();
	}
	static int mayorMenorTres(int a,int b,int c) {
		return ej4.mayorMenor(c, ej4.mayorMenor(a, b));
	}
}
