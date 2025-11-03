package boletin1;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("intrude un número");
		int x=sc.nextInt();
		sc.close();
		if((x%2)==0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
	}

}
