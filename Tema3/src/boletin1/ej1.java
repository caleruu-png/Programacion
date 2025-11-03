package boletin1;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		eco(a);
		sc.close();
	}

	static void eco(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println("Eco...");
		}
	}
}
