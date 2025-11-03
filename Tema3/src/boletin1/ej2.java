package boletin1;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce dos numeros");
		int x=sc.nextInt();
		int y=sc.nextInt();
		funcion(x,y);
		sc.close();
		
	}
	static void funcion(int a, int b) {
		for(int i=a;i<=b;i++) {
			System.out.println(i);
		}
	}
}
