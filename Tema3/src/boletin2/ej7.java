package boletin2;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] clase=new int[3][5];
		int numAlumno;
		float suma=0;
		float mediaAlumno;
		for (int i=0;i<clase.length;i++) {
			System.out.println("trimestre "+i);
			for (int j=0;j<clase[i].length;j++) {
				System.out.println("alumno "+j);
				clase[i][j]=sc.nextInt();
			}
		}
		System.out.println("La media del 1er trimestre es: "+mediaTrimestre(clase, 0));
		System.out.println("La media del 2º trimestre es: "+mediaTrimestre(clase, 1));
		System.out.println("La media del 3er trimestre es: "+mediaTrimestre(clase, 2));
		System.out.println("Introduce el numero de alumno");
		numAlumno=sc.nextInt();
		for(int i=0;i<clase.length;i++) {
			suma+=clase[i][numAlumno];
		}
		System.out.println("La media del alumno "+numAlumno+" es "+(suma/3));
		sc.close();
	}
	public static float mediaTrimestre(int[][] t, int num) {
		float media=0;
		float suma=0;
		for(int i=0;i<t[num].length;i++) {
			suma=suma+t[num][i];
		}
		media=suma/t[num].length;
		return media;
	}
}
