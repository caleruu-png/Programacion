package boletin1;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el numero 12");
		int x=sc.nextInt();
		sc.close();
		if(x==12){
			System.out.println("Correcto!");
		}else {
			System.out.println("Incorrecto!");
		}
	}

}
