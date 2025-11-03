package boletin3;

import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		int x,i=0,f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero");
		x=sc.nextInt();
		sc.close();
		while(i<x) {
			i++;
			f=f*i;
		}
		System.out.println("El factorial de "+x+" es "+f);
	}

}
