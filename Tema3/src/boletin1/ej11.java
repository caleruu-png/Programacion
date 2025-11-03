package boletin1;

import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		float a = sc.nextInt();
		System.out.println("introduce el numero al que elevar");
		int n = sc.nextInt();
		System.out.println("Con funcion iterativo "+elevadoIterativa(a, n));
		System.out.println("Con funcion recursiva "+elevadoRecursiva(a, n));
		sc.close();
	}

	public static float elevadoIterativa(float x, int y) {
		float res=1;
		for(int i=0;i<y;i++) {
			res=res*x;
		}
		return res;
	}

	public static float elevadoRecursiva(float a, int b) {
		float res=1;
		if(b==0) {
			b=1;
		}else {
			res=a*elevadoRecursiva(a, b-1);
		}
		return res;
	}
}
