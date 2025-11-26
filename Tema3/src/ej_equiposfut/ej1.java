package ej_equiposfut;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1- Introducir el resultado de un partido. \r\n"
				+ "2- Mostrar todos los partidos introducidos. \r\n" + "3- Mostrar el equipo ganador de la liga \r\n"
				+ "4- Mostrar el porcentaje de partidos en los que perdio el equipo local. \r\n"
				+ "5- Introducir nombre de equipoo y mostrar los resultados de todos sus partidos. \r\n"
				+ "6- Finalizar.");
		int opc = sc.nextInt();
		String indiceEquipos[] = new String[20];/* tabla indice con los nombres de los equipos */
		int partidos[][][] = new int[20][20][2];/*
												 * tabla de los pertidos en la que se almacenan el local el visitante y
												 * los goles de cada equipo en cada partido
												 */
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				partidos[i][j][0] = -1;
				partidos[i][j][1] = -1;
			}
		}
		int nEquipos = 0;
		while (opc < 6) {
			switch (opc) {
			case 1:
				/* Insercion de equipos en la tabla */
				System.out.println("introduce el equipo local");
				String eqLocal = sc.next();
				/*
				 * saca el indice del equipo dentro de la tabla y sino lo inserta en la tabla
				 * indice
				 */
				int indiceEquipoLocal = getindex(indiceEquipos, nEquipos, eqLocal);
				if (indiceEquipoLocal == -1) {
					indiceEquipoLocal = nEquipos;
					indiceEquipos[nEquipos++] = eqLocal;
				}

				System.out.println("introduce el equipo visitante");
				String eqVisitante = sc.next();
				int indiceEquipoVisitante = getindex(indiceEquipos, nEquipos, eqVisitante);
				if (indiceEquipoVisitante == -1) {
					indiceEquipoVisitante = nEquipos;
					indiceEquipos[nEquipos++] = eqVisitante;
				}
				/* insercion de goles */
				System.out.println("Introduce los goles del equipo local");
				int golesLocal = sc.nextInt();

				System.out.println("Introduce los goles del equipo visitante");
				int golesVisitante = sc.nextInt();

				partidos[indiceEquipoLocal][indiceEquipoVisitante][0] = golesLocal;
				partidos[indiceEquipoLocal][indiceEquipoVisitante][1] = golesVisitante;
				break;
			case 2:
				System.out.println("PARTIDOS INTRODUCIDOS HASTA EL MOMENTO");
				for (int i = 0; i < nEquipos; i++) {
					for (int j = 0; j < nEquipos; j++) {
						if (i != j && partidos[i][j][0] != -1) {
							System.out.println(indiceEquipos[i] + " " + partidos[i][j][0] + " - " + partidos[i][j][1]
									+ " " + indiceEquipos[j]);
						}
					}
				}
				break;
			case 3:
				int maxPuntos;
				Integer[] puntos = new Integer[nEquipos];
				for (int i = 0; i < nEquipos; i++) {
					puntos[i] = 0;
				}
				for (int i = 0; i < nEquipos; i++) {
					for (int j = 0; j < nEquipos; j++) {
						if (i != j && partidos[i][j][0] != -1) {
							if (partidos[i][j][0] > partidos[i][j][1]) {
								puntos[i] += 3;
							} else if (partidos[i][j][0] == partidos[i][j][1]) {
								puntos[i] = puntos[i] + 1;
							}
						}
					}
				}
				maxPuntos = eqMaxPts(puntos);
				System.out.println(
						"El equipo ganador es " + indiceEquipos[maxPuntos] + " con " + puntos[maxPuntos] + " puntos.");
				break;
			case 4:
				break;
			case 5:
				break;
			default:
			}
			System.out.println("1- Introducir el resultado de un partido. \r\n"
					+ "2- Mostrar todos los partidos introducidos. \r\n"
					+ "3- Mostrar el equipo ganador de la liga \r\n"
					+ "4- Mostrar el porcentaje de partidos en los que perdio el equipo local. \\r\\n"
					+ "5- Introducir nombre de equipoo y mostrar los resultados de todos sus partidos. \\r\\n"
					+ "6- Finalizar.");
			opc = sc.nextInt();
		}
		sc.close();
	}

	public static int getindex(String[] arrays, int numElem, String elemBuscar) {
		/* saca el indice de l equipo que se introduce al llamar la funcion */
		int indice = -1;
		boolean enc = false;
		for (int i = 0; i < numElem; i++) {
			if (arrays[i].equals(elemBuscar)) {
				indice = i;
				enc = true;
			}
		}
		return indice;
	}

	public static int eqMaxPts(Integer[] pts) {
		/* Funcion para sacar el nombre del equipo con mas puntos */
		int indiceMaxPts = 0;
		for (int i = 0; i < pts.length; i++) {
			if (pts[i] > pts[indiceMaxPts]) {
				indiceMaxPts = i;
			}
		}

		return indiceMaxPts;
	}

}
