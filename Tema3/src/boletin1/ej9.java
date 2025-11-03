package boletin1;

import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num=sc.nextInt();
		divisores(num);
		sc.close();
	}
	public static int divisores(int n) {
		int cont=0;
		for(int i=n;i>0;i--) {
			if(n%i==0 && ej7.esPrimo(i)) {
				System.out.println(i);
			}
		}
		return cont;
	}
}
