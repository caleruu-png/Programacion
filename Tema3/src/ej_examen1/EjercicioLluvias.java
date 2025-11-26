package ej_examen1;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioLluvias {

	public static void main(String[] args) {

		final int NUM_CIUDADES = 20;

		int nCiudades = 0;

		String[] tCiudades = new String[NUM_CIUDADES];
		float[][] tLluvias = new float[NUM_CIUDADES][12];
		for (int i = 0; i < tLluvias.length; i++) {
			for (int j = 0; j < tLluvias[0].length; j++) {
				tLluvias[i][j] = -1;
			}
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("1- Introducir dato.\r\n" + "2- Listar todos los datos.\r\n"
				+ "3- Mostrar la media de lluvias anual en una ciudad dada.\r\n"
				+ "4- Listado alfabético por ciudades y su cantidad de lluvia anual.\r\n"
				+ "5- Listado (ordenado por cantidad de lluvia) de ciudades y su lluvia en\r\n" + "mes dado.\r\n"
				+ "6- Fin.");
		int opcion = sc.nextInt();

		while (opcion != 6) {
			switch (opcion) {
			case 1: {
				System.out.println("Di el nombre de una ciudad");
				String nombre_Ciudad = sc.next();
				int indiceCiudad = getIndexOf(tCiudades, nCiudades, nombre_Ciudad);
				if (indiceCiudad == -1) {
					indiceCiudad = nCiudades;
					tCiudades[nCiudades++] = nombre_Ciudad;
				}

				System.out.println("Di el mes (1-12)");
				int nMes = sc.nextInt();
				nMes = nMes - 1;
				System.out.println("Introduzca la cantidad de lluvia que ha caído");
				float cantidadLluvia = sc.nextFloat();
				tLluvias[indiceCiudad][nMes] = cantidadLluvia;
			}
				break;

			case 2: {
				String[] tCiudadesOrdenada = Arrays.copyOf(tCiudades, nCiudades);
				Arrays.sort(tCiudadesOrdenada);

				for (int i = 0; i < nCiudades; i++) {
					int indiceTablaCiudades = getIndexOf(tCiudades, tCiudadesOrdenada[i], nCiudades);
					System.out.println(tCiudades[indiceTablaCiudades] + ":");
					for (int j = 0; j < tLluvias[0].length; j++) {
						if (tLluvias[indiceTablaCiudades][j] > -1) {
							System.out.println("Mes:" + (j + 1) + " litros:" + tLluvias[indiceTablaCiudades][j]);
						}
					}
				}
			}
				break;

			case 3: {
				System.out.println("Di ciudad");
				String nombreCiudad = sc.next();
				float sumaLitros = 0.0f;

				int indiceCiudad = getIndexOf(tCiudades, nCiudades, nombreCiudad);
				for (int j = 0; j < tLluvias[indiceCiudad].length; j++) {
					if (tLluvias[indiceCiudad][j] > -1) {
						sumaLitros = sumaLitros + tLluvias[indiceCiudad][j];
					}
				}
				System.out.println("Para la ciudad: " + tCiudades[indiceCiudad] + ": Media anual de lluvias:"
						+ (float) sumaLitros / 12);
			}
				break;

			case 4: {
				String[] tCiudadesOrdenada = Arrays.copyOf(tCiudades, nCiudades);
				Arrays.sort(tCiudadesOrdenada);
				for (int i = 0; i < nCiudades; i++) {
					int indiceTablaCiudades = getIndexOf(tCiudades, tCiudadesOrdenada[i], nCiudades);
					float suma = 0.0f;
					for (int j = 0; j < tLluvias[indiceTablaCiudades].length; j++) {
						if (tLluvias[indiceTablaCiudades][j] > -1) {
							suma += tLluvias[indiceTablaCiudades][j];
						}
					}
					System.out.println(tCiudades[indiceTablaCiudades] + " litros......: " + suma);
				}
			}
				break;

			case 5: {
				String[] tCiudadesOrdenada = Arrays.copyOf(tCiudades, nCiudades);
				Arrays.sort(tCiudadesOrdenada);
				System.out.println("Di un mes");
				int mes = sc.nextInt();
				mes = mes - 1;
				System.out.println("Para el mes " + mes);
				for (int i = 0; i < nCiudades; i++) {
					int indiceTablaCiudades = getIndexOf(tCiudades, tCiudadesOrdenada[i], nCiudades);
					if (tLluvias[indiceTablaCiudades][mes] > -1) {
						System.out.println(tCiudades[indiceTablaCiudades] + " lluvias en el mes:"
								+ tLluvias[indiceTablaCiudades][mes]);
					}

				}
			}
			}
			System.out.println("1- Introducir dato.\r\n" + "2- Listar todos los datos.\r\n"
					+ "3- Mostrar la media de lluvias anual en una ciudad dada.\r\n"
					+ "4- Listado alfabético por ciudades y su cantidad de lluvia anual.\r\n"
					+ "5- Listado (ordenado por cantidad de lluvia) de ciudades y su lluvia en\r\n" + "mes dado.\r\n"
					+ "6- Fin.");
			opcion = sc.nextInt();
		}
		sc.close();
	}

	public static int getIndexOf(String tNombreCiudades[], int nCiudades, String nombreCiudades) {
		int indice = -1;
		boolean hay = false;
		for (int i = 0; i < nCiudades && !hay; i++) {
			if (tNombreCiudades[i].equals(nombreCiudades)) {
				indice = i;
				hay = true;
			}
		}
		return indice;
	}

	public static int getIndexOf(String tNombreCiudades[], String ciudadABuscar, int nCiudades) {
		int indice = 0;
		boolean hay = false;
		for (int i = 0; i < nCiudades && !hay; i++) {
			if (tNombreCiudades[i].equals(ciudadABuscar)) {
				indice = i;
				hay = true;
			}
		}
		return indice;
	}
}
