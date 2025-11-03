package boletin_examenes;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombreCurso = " ", menosSuspensos1 = " ", menosSuspensos2 = " ", mayorNotaMedia = " ",
				menorNotaMedia = " ";
		int numAlumnos, notaAlumno, menosAlumnos = 0, i, sumaNotas = 0;
		float mediaNotas = 0, maxNotaMedia = Float.MIN_VALUE, minNotaMedia = Float.MAX_VALUE;
		System.out.println("Introduce el nmbre del curso (1-ESO-A, por ejemplo):");
		nombreCurso = sc.next();
		while (!nombreCurso.equals("fin")) {
			System.out.println("Introduce cuantos alumnos tiene el curso:");
			numAlumnos = sc.nextInt();
			if (numAlumnos < 8) { // se utiliza el contador en las clases con un numero de alumnos menor a 8
				menosAlumnos++;
			}
			for (i = 0; i < numAlumnos; i++) {
				System.out.println("introduce las notas de los alumnos");
				notaAlumno = sc.nextInt();
				sumaNotas = sumaNotas + notaAlumno; // la suma de todas las notas
				mediaNotas = sumaNotas / numAlumnos;// se calcula la nota media
			}
			if (mediaNotas < maxNotaMedia) {
				mayorNotaMedia = nombreCurso;
			}
			if (mediaNotas > minNotaMedia) {
				menorNotaMedia = nombreCurso;
			}

			System.out.println(mediaNotas);
			System.out.println("Introduce el nmbre del curso (1-ESO-A, por ejemplo):");
			nombreCurso = sc.next();
		}
		sc.close();
	}

}
