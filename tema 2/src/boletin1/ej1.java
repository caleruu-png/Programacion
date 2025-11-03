package boletin1;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int x=sc.nextInt();
		sc.close();
		if(x>0) {
			System.out.println("El numero es positivo");
		}else {
			System.out.println("El no numero es positivo");
		}
		sc.close();

	}

}
