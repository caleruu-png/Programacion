package boletin3;

import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		int x = 1, max, ma, h;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce la altura del arbol " + x);
			h = sc.nextInt();
			if(x==0) {}
		} while (h > -1);
		sc.close();
	}
}
