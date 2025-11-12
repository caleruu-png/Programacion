package ej_examen1;

import java.util.Scanner;

public class SolIncompleta202111 {

	public static void main(String[] args) {

		float[][] dineroTransferencias = new float[20][20];
		

		for (int i = 0; i < dineroTransferencias.length; i++) {
			for (int j = 0; j < dineroTransferencias[0].length; j++) {
				dineroTransferencias[i][j] = -1;
			}
		}
		Scanner sc = new Scanner(System.in);

		System.out.println("1- Introducir transferencia de una a otra sucursal.\r\n"
				+ "2- Mostrar todos los datos introducidos.\r\n" + "3- Mostrar sucursal que ha recibido más dinero.\r\n"
				+ "4- Mostrar en cuántas sucursales el total de lo enviado supera 10.000€.\r\n" + "5- Finalizar.");
		int opcion = sc.nextInt();
		while (opcion < 5) {

			switch (opcion) {
			case 1:
				System.out.println("Suc envía");
				int sucEnvia = sc.nextInt();
				System.out.println("Suc recibe");
				int sucRecibe = sc.nextInt();

				System.out.println("Dinero que se transfiere");
				dineroTransferencias[sucEnvia][sucRecibe] = sc.nextFloat();

				break;
			case 2:
				for (int i = 0; i < dineroTransferencias.length; i++) {
					if (hayDatos(dineroTransferencias, i)) {
						System.out.println("La sucursal num. " + i + " ha enviado:");
						for (int j = 0; j < dineroTransferencias[0].length; j++) {
							if (dineroTransferencias[i][j] > -1) {
								System.out.println("\ta la sucursal " + j + ", " + dineroTransferencias[i][j] + "€");
							}
						}
					}
				}

				break;
			case 3:
				float sumaMaxImportesRecibidos = Float.MIN_VALUE;
				float sumaImportesRecibidos = 0;
				int sucursalMasRecibido = Integer.MIN_VALUE;
				for (int j = 0; j < dineroTransferencias[0].length; j++) {
					sumaImportesRecibidos = 0;
					for (int i = 0; i < dineroTransferencias.length; i++) {
						if (dineroTransferencias[i][j] > 0) {
							sumaImportesRecibidos += dineroTransferencias[i][j];
						}
					}
					if (sumaImportesRecibidos > sumaMaxImportesRecibidos) {
						sumaMaxImportesRecibidos = sumaImportesRecibidos;
						sucursalMasRecibido = j;
					}
				}
				System.out.println("La sucusrsal que ha recibido mas dinero  es la: " + sucursalMasRecibido
						+ " que recibio un total de: " + sumaMaxImportesRecibidos);
				break;
			case 4:
				int contadorSucursalEnviaMas10000=0;
				float sumaImportesTransferidos = 0;
				for(int i=0;i<dineroTransferencias.length;i++) {
					sumaImportesTransferidos=0;
					for(int j=0;j<dineroTransferencias[0].length;j++) {
						sumaImportesTransferidos+=dineroTransferencias[i][j];
					}
				}
				if(sumaImportesTransferidos>10000) {
					contadorSucursalEnviaMas10000++;
				}
				System.out.println("El numero de sucursales que han enviado mas de 10000 es: "+contadorSucursalEnviaMas10000);
				break;

			}

			System.out.println("1- Introducir transferencia de una a otra sucursal.\r\n"
					+ "2- Mostrar todos los datos introducidos.\r\n"
					+ "3- Mostrar sucursal que ha recibido más dinero.\r\n"
					+ "4- Mostrar en cuántas sucursales el total de lo enviado supera 10.000€.\r\n" + "5- Finalizar.");
			opcion = sc.nextInt();
		}
	}

	// devuelve true si hay datos en la fila "fila" de la matriz "matriz"
	public static boolean hayDatos(float[][] matriz, int fila) {
		boolean hay = false;

		for (int j = 0; j < matriz[0].length && !hay; j++) {
			if (matriz[fila][j] > -1) {
				hay = true;
			}
		}

		return hay;
	}
}
