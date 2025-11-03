package examen2015_16;

import java.util.Scanner;

public class ej1 {
	public static void main(String[] args) {
		String codigo = " ", nombreDepartamento = " ", nombreProfesor = " ", nombreAlumno = " ", especialidad = " ",
				nombreTituloFP = " ", nombreDepMasProfesores = " ", nombreAlumnoESOMayorMedia = " ",
				penultimaEspecialidad = " ", ultimaEspecialidad = " ",nombreFPMenosHoras=" ",nombreDepMenorMediaAños=" ";
		int nProfesores, i, numAsignaturas, numMaxProfesores = Integer.MIN_VALUE, contadorAlumnos = 0,
				maxNotaMedia = Integer.MIN_VALUE, contadorAsignaturas = 0, sumaAsignaturas = 0,
				contadorEspecialidad = 0,numFPMasHoras=0;
		char letraCodigo, letraClase;
		float añosProfesor = 0, notaMediaAlumno = 0, numHorasFP, mediaAsignaturas = 0, menosHorasFP=Float.MAX_VALUE,mediaAñosProfeores=0,menorMediaAñosProfesores=Float.MAX_VALUE,sumaAñosProfesores=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el codigo de la unidad");
		codigo = sc.next();
		;
		while (!codigo.equals("fin")) {
			letraCodigo = codigo.charAt(0);
			if (letraCodigo == 'D') {
				System.out.println("Introduce el nombre del departamento");
				nombreDepartamento = sc.next();
				System.out.println("Introduce el numero de profesores");
				nProfesores = sc.nextInt();
				for (i = 1; i <= nProfesores; i++) {
					System.out.println("Introduce el nombre del profesor");
					nombreProfesor = sc.next();
					System.out.println("Introduce los años que lleva en el centro");
					añosProfesor = sc.nextFloat();
					System.out.println(i);
					sumaAñosProfesores=sumaAñosProfesores+añosProfesor;
					mediaAñosProfeores=sumaAñosProfesores/nProfesores;
					if (mediaAñosProfeores<menorMediaAñosProfesores) {
						menorMediaAñosProfesores=mediaAñosProfeores;
						nombreDepMenorMediaAños=nombreDepartamento;
					}
				}
				if (nProfesores > numMaxProfesores) {
					numMaxProfesores=nProfesores;
					nombreDepMasProfesores = nombreDepartamento;
				}
			} else if (letraCodigo == 'C') {
				System.out.println("Introduce el tipo de clase(E,P,B,F)");
				letraClase = sc.next().charAt(0);
				switch (letraClase) {
				case 'E':
					System.out.println("Introduce el nombre de los alumnos, para finalizar escriba 'fin'");
					nombreAlumno = sc.next();
					while (!nombreAlumno.equals("fin")) {
						contadorAlumnos++;
						System.out.println("Introduce la nota media del alumno");
						notaMediaAlumno = sc.nextFloat();
						if (contadorAlumnos < 20 && notaMediaAlumno > maxNotaMedia) {
							nombreAlumnoESOMayorMedia = nombreAlumno;
						}
						System.out.println("Introduce el nombre del alumno");
						nombreAlumno = sc.next();
					}
					break;
				case 'P':
					System.out.println("Introduce el nombre de la especialidad");
					especialidad = sc.next();
					contadorEspecialidad++;
					penultimaEspecialidad = ultimaEspecialidad; // pasamos la anterior ultima especialidad como penultima
					ultimaEspecialidad = especialidad; // guardamos la ultima especialidad introducida
					break;
				case 'B':
					System.out.println("Introduce el numero de asignaturas");
					numAsignaturas = sc.nextInt();
					contadorAsignaturas++;
					sumaAsignaturas = sumaAsignaturas + numAsignaturas;
					mediaAsignaturas = sumaAsignaturas / contadorAsignaturas;
					break;
				case 'F':
					System.out.println("Introduce el nombre del titulo");
					nombreTituloFP = sc.next();
					System.out.println("introduce el numero de horas totales de duracion del ciclo");
					numHorasFP = sc.nextFloat();
					if (numHorasFP>1500) {
						numFPMasHoras++;
					}
					if (numHorasFP<menosHorasFP) {
						menosHorasFP=numHorasFP;
						nombreFPMenosHoras=nombreTituloFP;
					}
					break;
				default:
					System.out.println("Código no válido");
					break;
				}
			}
			System.out.println("Introduce el codigo de la unidad");
			codigo = sc.next();
		}
		sc.close();
		System.out.println("El departamento con mas profesores es " + nombreDepMasProfesores);
		System.out.println("El alumno de ESO con mayor nota media de los grupos de menos de 20 estudiantes es "+ nombreAlumnoESOMayorMedia);
		if (contadorEspecialidad > 2) {
			System.out.println("Las dos ultimas especiales de PCPI son " + penultimaEspecialidad + " y " + ultimaEspecialidad);
		} else {
			System.out.println("Hay menos de dos especialidades introducidas");
		}
		System.out.println("La media del numero de asignaturas de las clases de bachillerato es " + mediaAsignaturas);
		System.out.println(numFPMasHoras+" Ciclos de FP tienen mas de 1.500 horas ");
		System.out.println("La FP con menos horas es "+nombreFPMenosHoras);
		System.out.println("El departamento con menor media de años de permanencia es "+nombreDepMenorMediaAños);
	}

}
