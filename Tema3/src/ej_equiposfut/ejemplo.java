package ej_equiposfut;

import java.util.Scanner;

public class ejemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1- Introducir resultado de un partido.\r\n"
				+ "2- Mostrar todos los partidos introducidos.\r\n" + "3- Mostrar el equipo ganador de la liga.\r\n"
				+ "4- Mostrar el porcentaje de partidos en los que perdió el equipo local.\r\n"
				+ "5- Introducir nombre de equipo y mostrar los resultados de todos sus partidos\r\n"
				+ "6- Finalizar.\r\n");
		String tabla[] = new String[20];
		int equipos[][][] = new int[20][20][2];
		for (int i = 0; i < equipos.length; i++) {
			for (int j = 0; j < equipos[0].length; j++) {
				for (int x = 0; x < equipos[0][0].length; x++) {
					equipos[i][j][x] = -1;
				}
			}
		}
		int nEquipos = 0;
		int opcion = sc.nextInt();
		while (opcion != 6) {
			switch (opcion) {
			case 1:
				System.out.println("Introduce el equipo local");

				String local = sc.next();
				int indiceEquipoLocal = getIndexOf(tabla, nEquipos, local);
				if (indiceEquipoLocal == -1) {
					indiceEquipoLocal = nEquipos;
					tabla[nEquipos++] = local;
				}
				System.out.println("Introduce el equipo visitante");
				String visitante = sc.next();
				int indiceEquipoVisitante = getIndexOf(tabla, nEquipos, visitante);
				if (indiceEquipoVisitante == -1) {
					indiceEquipoVisitante = nEquipos;
					tabla[nEquipos++] = visitante;
				}
				System.out.println("Introduce los goles del equipo local");
				int golesLocal = sc.nextInt();

				System.out.println("Introduce los goles del equipo visitante");

				int golesVisitante = sc.nextInt();

				equipos[indiceEquipoLocal][indiceEquipoVisitante][0] = golesLocal;
				equipos[indiceEquipoLocal][indiceEquipoVisitante][1] = golesVisitante;

				break;

			case 2:
				System.out.println(" PARTIDOS INTRODUCIDOS HASTA EL MOMENTO");
				for (int i = 0; i < nEquipos; i++) {
					for (int j = 0; j < nEquipos; j++) {
						if (equipos[i][j][0] != -1) {
							System.out.println(
									tabla[i] + " " + equipos[i][j][0] + " - " + equipos[i][j][1] + " " + tabla[j]);
						}
					}
				}
				break;

			case 3:

				break;

			case 4:

				break;

			case 5:

				break;

			}
			System.out.println("1- Introducir resultado de un partido.\r\n"
					+ "2- Mostrar todos los partidos introducidos.\r\n" + "3- Mostrar el equipo ganador de la liga.\r\n"
					+ "4- Mostrar el porcentaje de partidos en los que perdió el equipo local.\r\n"
					+ "5- Introducir nombre de equipo y mostrar los resultados de todos sus partidos\r\n"
					+ "6- Finalizar.\r\n" + "");
		}
		sc.close();
	}

	public static int getIndexOf(String[] arrays, int numElem, String elemBuscar) {

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
}
