package boletin_4;

import java.util.Scanner;

public class Ejercicio_1 {
	public static void main(String[] args) {

			System.out.println("Dame la letra del grupo que vas a introcir ");
			Scanner sc = new Scanner(System.in);
			char grupo=sc.next().charAt(0);
			String nombreAlumno ="";
			int notaPrimerParcial = 0;
			int notaSegundoParcial = 0;
			int notaTercerParcial = 0;
			String alumnoSupremo ="";
			double notaMedia= 0;
			double mayorMedia=0;
			int suspensos=0;
			
			switch (grupo) {
			case 'A':
				for (int i = 1; i <= 25; i++) {
					System.out.println("¿Nombre del alumno?");
					nombreAlumno= sc.next();
					System.out.println("¿Nota del primer parcial?");
					notaPrimerParcial= sc.nextInt();
					System.out.println("¿Nota del segundo parcial?");
					notaSegundoParcial= sc.nextInt();
					System.out.println("¿Nota del tercer parcial?");
					notaTercerParcial= sc.nextInt();
					notaMedia = (notaPrimerParcial+notaSegundoParcial+notaTercerParcial)/3;
					if(notaMedia<5) suspensos++;
					if(notaMedia>mayorMedia) {
						mayorMedia=notaMedia;
						alumnoSupremo =nombreAlumno;
					}
					if (mayorMedia>=9) {
						System.out.println("Existen sobresalientes");
					}
					
				}
				System.out.println("El alumno con mayor nota media es: "+alumnoSupremo);
				System.out.println("El número de alumnos suspesos son: "+suspensos);
				
				break;
			case 'B':
				for (int i = 1; i <= 28; i++) {
					System.out.println("¿Nombre del alumno?");
					nombreAlumno= sc.next();
					System.out.println("¿Nota del primer parcial?");
					notaPrimerParcial= sc.nextInt();
					System.out.println("¿Nota del segundo parcial?");
					notaSegundoParcial= sc.nextInt();
					System.out.println("¿Nota del tercer parcial?");
					notaTercerParcial= sc.nextInt();
					notaMedia = (notaPrimerParcial+notaSegundoParcial+notaTercerParcial)/3;
					if(notaMedia<5) suspensos++;
					if(notaMedia>mayorMedia) {
						mayorMedia=notaMedia;
						alumnoSupremo =nombreAlumno;
					}
					if (mayorMedia>=9) {
						System.out.println("Existen sobresalientes");
					}
					
				}
				System.out.println("El alumno con mayor nota media es: "+alumnoSupremo);
				System.out.println("El número de alumnos suspesos son: "+suspensos);
				
				break;
			case 'C':
				for (int i = 1; i <= 31; i++) {
					System.out.println("¿Nombre del alumno?");
					nombreAlumno= sc.next();
					System.out.println("¿Nota del primer parcial?");
					notaPrimerParcial= sc.nextInt();
					System.out.println("¿Nota del segundo parcial?");
					notaSegundoParcial= sc.nextInt();
					System.out.println("¿Nota del tercer parcial?");
					notaTercerParcial= sc.nextInt();
					notaMedia = (notaPrimerParcial+notaSegundoParcial+notaTercerParcial)/3;
					if(notaMedia<5) suspensos++;
					if(notaMedia>mayorMedia) {
						mayorMedia=notaMedia;
						alumnoSupremo =nombreAlumno;
					}
					if (mayorMedia>=9) {
						System.out.println("Existen sobresalientes");
					}
					
				}
				System.out.println("El alumno con mayor nota media es: "+alumnoSupremo);
				System.out.println("El número de alumnos suspesos son: "+suspensos);
				
				break;
			case 'D':
				for (int i = 1; i <= 29; i++) {
					System.out.println("¿Nombre del alumno?");
					nombreAlumno= sc.next();
					System.out.println("¿Nota del primer parcial?");
					notaPrimerParcial= sc.nextInt();
					System.out.println("¿Nota del segundo parcial?");
					notaSegundoParcial= sc.nextInt();
					System.out.println("¿Nota del tercer parcial?");
					notaTercerParcial= sc.nextInt();
					notaMedia = (notaPrimerParcial+notaSegundoParcial+notaTercerParcial)/3;
					if(notaMedia<5) suspensos++;
					if(notaMedia>mayorMedia) {
						mayorMedia=notaMedia;
						alumnoSupremo =nombreAlumno;
					}
					if (mayorMedia>=9) {
						System.out.println("Existen sobresalientes");
					}
					
				}
				System.out.println("El alumno con mayor nota media es: "+alumnoSupremo);
				System.out.println("El número de alumnos suspesos son: "+suspensos);
				
				break;
			default:System.out.println("Introduce una letra valida");
				break;
			}
			sc.close();
		
	}

}
