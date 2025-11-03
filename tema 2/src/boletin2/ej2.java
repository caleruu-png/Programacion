package boletin2;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		int par, par2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int x=sc.nextInt();
		if(x%2==0) {
			par=1;
		}else {
			par=0;
		}
		System.out.println(par);
		System.out.println("Dime otro para hacerlo con operadores logicos");
		int y=sc.nextInt();
		par2 = (y % 2 == 0) ? 1 : 0;
		System.out.println(par2);
		sc.close();
	}

}
