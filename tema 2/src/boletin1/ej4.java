package boletin1;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		int z=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("intrude dos números");
		int x=sc.nextInt();
		int y=sc.nextInt();
		sc.close();
		if((x%2)==0) {
			z=z+1;
		}
		if((y%2)==0) {
			z=z+1;
		}
		System.out.println(z+" de los números son pares.");
	}

}
