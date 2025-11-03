package boletin1;

import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce don numeros");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Los dos numeros son amigos?" + sonAmigos(x, y));
		sc.close();
	}

	public static int sumaDivisores(int n) {
		int sum = 0;
		for (int i = n-1; i >0; i--) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static boolean sonAmigos(int a, int b) {
		
		return (sumaDivisores(a) == b && sumaDivisores(b) == a);

	}
}
