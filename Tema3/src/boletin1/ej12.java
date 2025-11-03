package boletin1;

import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el numero para calcular su factorial");
		int x=sc.nextInt();
		System.out.println("El factorial de "+x+" es "+factorial(x));
		sc.close();
	}
	public static int factorial(int a) {
		int res=1;
		if(a==0) {
			a=1;
		}else {
			res=a*factorial(a-1);
		}
		return res;
	}

}
