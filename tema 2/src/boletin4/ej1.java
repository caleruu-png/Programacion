package boletin4;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		char grupo = ' ';
		String nombreAlumno = " ", nombreMaxMedia = " ";
		int i, parcial1 = 0, parcial2 = 0, parcial3 = 0, suspenso = 0;
		float media, maxMedia = Float.MIN_VALUE;
		boolean haySobresalientes = false;
		Scanner sc = new Scanner(System.in);
		grupo = sc.next().charAt(0);
		switch (grupo) {
		case 'A':
			System.out.println("Estas en el grupo A");
			for (i = 1; i < 25; i++) {
				System.out.println("Introduce el nombre del alumno");
				nombreAlumno = sc.next();
				System.out.println("Introduce la nota del 1er parcial");
				parcial1 = sc.nextInt();
				System.out.println("Introduce la nota del 2º parcial");
				parcial2 = sc.nextInt();
				System.out.println("Introduce la nota del 3er parcial");
				parcial3 = sc.nextInt();
				media = (parcial1 + parcial2 + parcial3) / 3;
				if (media > maxMedia) {
					maxMedia = media;
					nombreMaxMedia = nombreAlumno;
				}
				if (media < 5) {
					suspenso++;
				}
				if (media >= 9) {
					haySobresalientes = true;
				}
			}
			System.out.println("El alumno con mayor nota media es: " + nombreMaxMedia);
			System.out.println(suspenso + " Alumnos tienen la nota media suspensa");
			if (haySobresalientes) {
				System.out.println("Exixten Sobresalientes");
			} else {
				System.out.println("No exixten Sobresalientes");
			}
			break;
		case 'B':
			System.out.println("Estas en el grupo B");
			for (i = 1; i < 28; i++) {
				System.out.println("Introduce el nombre del alumno");
				nombreAlumno = sc.next();
				System.out.println("Introduce la nota del 1er parcial");
				parcial1 = sc.nextInt();
				System.out.println("Introduce la nota del 2º parcial");
				parcial2 = sc.nextInt();
				System.out.println("Introduce la nota del 3er parcial");
				parcial3 = sc.nextInt();
				media = (parcial1 + parcial2 + parcial3) / 3;
				if (media > maxMedia) {
					maxMedia = media;
					nombreMaxMedia = nombreAlumno;
				}
				if (media < 5) {
					suspenso++;
				}
				if (media >= 9) {
					haySobresalientes = true;
				}
			}
			System.out.println("El alumno con mayor nota media es: " + nombreMaxMedia);
			System.out.println(suspenso + " Alumnos tienen la nota media suspensa");
			if (haySobresalientes) {
				System.out.println("Exixten Sobresalientes");
			} else {
				System.out.println("No exixten Sobresalientes");
			}
			break;
		case 'C':
			System.out.println("Estas en el grupo C");
			for (i = 1; i < 31; i++) {
				System.out.println("Introduce el nombre del alumno");
				nombreAlumno = sc.next();
				System.out.println("Introduce la nota del 1er parcial");
				parcial1 = sc.nextInt();
				System.out.println("Introduce la nota del 2º parcial");
				parcial2 = sc.nextInt();
				System.out.println("Introduce la nota del 3er parcial");
				parcial3 = sc.nextInt();
				media = (parcial1 + parcial2 + parcial3) / 3;
				if (media > maxMedia) {
					maxMedia = media;
					nombreMaxMedia = nombreAlumno;
				}
				if (media < 5) {
					suspenso++;
				}
				if (media >= 9) {
					haySobresalientes = true;
				}
			}
			System.out.println("El alumno con mayor nota media es: " + nombreMaxMedia);
			System.out.println(suspenso + " Alumnos tienen la nota media suspensa");
			if (haySobresalientes) {
				System.out.println("Exixten Sobresalientes");
			} else {
				System.out.println("No exixten Sobresalientes");
			}
			break;
		case 'D':
			System.out.println("Estas en el grupo D");
			for (i = 1; i < 29; i++) {
				System.out.println("Introduce el nombre del alumno");
				nombreAlumno = sc.next();
				System.out.println("Introduce la nota del 1er parcial");
				parcial1 = sc.nextInt();
				System.out.println("Introduce la nota del 2º parcial");
				parcial2 = sc.nextInt();
				System.out.println("Introduce la nota del 3er parcial");
				parcial3 = sc.nextInt();
				media = (parcial1 + parcial2 + parcial3) / 3;
				if (media > maxMedia) {
					maxMedia = media;
					nombreMaxMedia = nombreAlumno;
				}
				if (media < 5) {
					suspenso++;
				}
				if (media >= 9) {
					haySobresalientes = true;
				}
			}
			System.out.println("El alumno con mayor nota media es: " + nombreMaxMedia);
			System.out.println(suspenso + " Alumnos tienen la nota media suspensa");
			if (haySobresalientes) {
				System.out.println("Exixten Sobresalientes");
			} else {
				System.out.println("No exixten Sobresalientes");
			}
			break;
		default:
			System.out.println("Grupo no válido");
			break;
		}
		sc.close();
	}

}
