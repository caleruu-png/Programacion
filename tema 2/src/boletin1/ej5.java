package boletin1;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tres numeros enteros.");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		sc.close();
		if (x>y && x>z) {
			System.out.println("El numero "+x+" es el mayor");
		}else if (y>x && y>z){
			System.out.println("El numero "+y+" es el mayor");
		}else {
			System.out.println("El numero "+z+" es el mayor");
		}
		
	}

}
