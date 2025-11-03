package examen;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		int cantidadInvestigadores;
		int i, j;
		String nombreInvestigador = " ";
		String lugarExplorado = " ";
		int codigoExpedicion = 0;
		int nNochesRegistro;
		int corduraRestanteInvestigador;
		int indiceActividadCultista;
		int nivelEnergiaCosmica;
		int sumaNoches = 0;
		int contadorExpediciones = 0;
		float mediaNoches = 0;
		boolean hayMiskatonic=false;
		boolean hayCulto=false;
		boolean hayIndependientes=false;
		boolean hayTresProcedencias=false;
		int nivelMaxEnergiaCosmica=Integer.MIN_VALUE;
		int codNvlMaxEnergiaCosmica=0;
		String nombreInvMaxEngCos=" ";
		int menorActCult = 0;
		int minActCult=Integer.MAX_VALUE;
		float porcetajeMas3Noches=0;
		int contadorMas3Noches = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Cantidad total de investigadores que han enviado informes:");
		cantidadInvestigadores = sc.nextInt();
		for (i = 0; i < cantidadInvestigadores; i++) {
			System.out.println("Nombre:");
			nombreInvestigador = sc.next();
			System.out.println("Lugar que ha explorado");
			lugarExplorado = sc.next();
			switch (nombreInvestigador.charAt(0)) {
			case 'M':
				hayMiskatonic=true;
				break;
			case 'C':
				hayCulto=true;
				break;
			case 'E':
				hayIndependientes=true;
				break;
			default:
				break;
			}
			if(hayMiskatonic && hayCulto && hayIndependientes) {
				hayTresProcedencias=true;
			}
			System.out.println("Codigo de expecicion:");
			codigoExpedicion = sc.nextInt();
			while (codigoExpedicion >= 0) {
				contadorExpediciones++;
				System.out.println("Número de noches de registro");
				nNochesRegistro = sc.nextInt();
				sumaNoches=sumaNoches+nNochesRegistro;
				//mediaNoches=sumaNoches/contadorExpediciones;
				if(nNochesRegistro>3) {
					contadorMas3Noches++;
				}
				for (j = 0; j < nNochesRegistro; j++) {
					System.out.println("Nivel de cordura restante del investigador (0-100)");
					corduraRestanteInvestigador = sc.nextInt();
					System.out.println("Índice de actividad cultista (en una escala del 1 al 10)");
					indiceActividadCultista = sc.nextInt();
					if(indiceActividadCultista<minActCult) {
						menorActCult=minActCult;
						minActCult=indiceActividadCultista;
					}
					System.out.println("Nivel de energía cosmica percibida (en escala Lovecraft)");
					nivelEnergiaCosmica = sc.nextInt();
					if(nivelEnergiaCosmica>nivelMaxEnergiaCosmica) {
						nivelMaxEnergiaCosmica=nivelEnergiaCosmica;
						codNvlMaxEnergiaCosmica=codigoExpedicion;
						nombreInvMaxEngCos=nombreInvestigador;
					}
				}
				System.out.println("Codigo de expecicion:");
				codigoExpedicion = sc.nextInt();
			}
		}
		mediaNoches=(float)sumaNoches/contadorExpediciones;
		porcetajeMas3Noches=(100*contadorMas3Noches)/contadorExpediciones;
		sc.close();
		System.out.println("El número promedio de noches que dura una expedición es "+mediaNoches);
		System.out.println("Han participado investigadores de las tres procedencias (Miskatonic,Culto, E.Independiente): "+hayTresProcedencias);
		System.out.println("El nivel máximo de energía cósmica registrado, junto con el identificador de expedición y el nombre del investigador que la registró son: "+nivelMaxEnergiaCosmica+", "+codNvlMaxEnergiaCosmica+", "+nombreInvMaxEngCos);
		System.out.println("Los dos valores más bajos de actividad cultista registrados en cualquier noche son: "+minActCult+" y "+menorActCult);
		System.out.println("Porcentaje de expediciones que duraron más de 3 noches: "+porcetajeMas3Noches);
	}

}
