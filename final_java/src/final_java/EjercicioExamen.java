package final_java;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioExamen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		int nSuc = 0;
		int[] indexAños = new int[21];/* Tabla con los años que se estecifican */
		String[] indexCodSuc = new String[10];/* Tabla con los codigos de las sucursales */
		int[][] clientesCierre = new int[21][10];/*
													 * En esta tabla se almacenaran el numero de clientes, teniendo en
													 * cuenta los indices de los años y codigos de sucursal
													 */
		for (int i = 0, añoInic = 2000; i < indexAños.length; i++) {
			indexAños[i] = añoInic;
			añoInic++;
		} /* Inicializo los años con los respectivos */
		for (int i = 0; i < clientesCierre.length; i++) {
			for (int j = 0; j < clientesCierre[0].length; j++) {
				clientesCierre[i][j] = -1;
			}
		}

		System.out.println("1- Introducir dato.\r\n" + "2- Listar todos los datos.\r\n"
				+ "3- Sucursal con más clientes en un año concreto.\r\n"
				+ "4- Listado de sucursales y años con menos de 1000 clientes.\r\n"
				+ "5- Listado ordenado de sucursales con más de 2000 clientes de media.\r\n" + "6- Fin.");
		opcion = sc.nextInt();
		while (opcion < 6) {
			switch (opcion) {
			case 1:
				int año;
				String codSucursal;
				int numClientes;
				int indiceAño;
				int indiceCodSuc;
				System.out.println("Introduce el año");
				año = sc.nextInt();
				indiceAño = getindexint(indexAños, año);

				System.out.println("Introduce el codigo de la sucursal");
				codSucursal = sc.next();
				indiceCodSuc = getindexString(indexCodSuc, nSuc, codSucursal);
				if (indiceCodSuc == -1) {
					indiceCodSuc = nSuc;
					indexCodSuc[nSuc++] = codSucursal;
				}

				while (clientesCierre[indiceAño][indiceCodSuc] == -1) {
					System.out.println("Introduce el numero de clientes");
					numClientes = sc.nextInt();

					clientesCierre[indiceAño][indiceCodSuc] = numClientes;
				}
				break;
			case 2:
				for (int i = 0; i < clientesCierre.length; i++) {
					System.out.println(indexAños[i] + " :");
					for (int j = 0; j < clientesCierre[0].length; j++) {
						if (clientesCierre[i][j] != -1) {
							System.out.println(indexCodSuc[j] + " : " + clientesCierre[i][j] + " clientes.");
						}
					}
				}
				break;
			case 3:
				System.out.println("Año: ");
				año = sc.nextInt();
				indiceAño = getindexint(indexAños, año);
				int indiceMaxClientes = 0;
				for (int j = 0; j < clientesCierre[indiceAño].length; j++) {
					if (clientesCierre[indiceAño][j] > clientesCierre[indiceAño][indiceMaxClientes]) {
						indiceMaxClientes = j;
					}
				}
				System.out.println("La sucursal: " + indexCodSuc[indiceMaxClientes]
						+ " es la que mas clientes ha tenido ese año.");
				break;
			case 4:
				for (int j = 0; j < nSuc; j++) {
					int añosMenos1000Clientes = 0;
					for (int i = 0; i < clientesCierre.length; i++) {
						if (clientesCierre[i][j] != -1) {
							if (clientesCierre[i][j] < 1000) {
								añosMenos1000Clientes++;
							}
						}

					}
					System.out.println(
							indexCodSuc[j] + ": " + añosMenos1000Clientes + " años con menos de 1000 clientes.");
				}

				break;
			case 5:
				String[] sucMas200Media = new String[10];
				int nsucMas200Media = 0;
				float media;
				int suma = 0;
				int cont = 0;
				for (int j = 0; j < nSuc; j++) {
					for (int i = 0; i < clientesCierre.length; i++) {
						if (clientesCierre[i][j] != -1) {
							suma += clientesCierre[i][j];
							cont++;
						}
					}
					media = suma / cont;
					if (media > 2000) {
						sucMas200Media[nsucMas200Media++] = indexCodSuc[j];
					}
				}
				for (int i = 0; i < nsucMas200Media; i++) {
					System.out.println(sucMas200Media[i]);
				}

				/* ; Arrays.sort(sucMas200Media); */
				Arrays.copyOf(sucMas200Media, nsucMas200Media);
				System.out.println(Arrays.toString(sucMas200Media));

				break;
			default:
			}
			System.out.println("1- Introducir dato.\r\n" + "2- Listar todos los datos.\r\n"
					+ "3- Sucursal con más clientes en un año concreto.\r\n"
					+ "4- Listado de sucursales y años con menos de 1000 clientes.\r\n"
					+ "5- Listado ordenado de sucursales con más de 2000 clientes de media.\r\n" + "6- Fin.");
			opcion = sc.nextInt();
		}
		sc.close();
	}/**/

	/* Funcion para sacar el indice de el elemanto a buscar */
	public static int getindexint(int[] index, int elemBuscar) {
		int indice = -1;
		for (int i = 0; i < index.length; i++) {
			if (index[i] == elemBuscar) {
				indice = i;
			}
		}
		return indice;
	}

	public static int getindexString(String[] index, int numsuc, String elemBuscar) {
		int indice = -1;
		for (int i = 0; i < numsuc; i++) {
			if (index[i].equals(elemBuscar)) {
				indice = i;
			}
		}
		return indice;
	}

}
