package boletin_4;

import java.util.Scanner;

public class Ejercicio_4 {
	public static void main(String[] args) {
		System.out.println("Número de región del que se van a introducir datos.");
		Scanner sc = new Scanner(System.in);
		int numRegion = sc.nextInt();
		int provincia = 0;
		String nombreProvincia = "";
		
		int numeroVotosA = 0;
		int numeroVotosB = 0;
		int abstenciones = 0;
		int totalVotosA = 0;
		int totalVotosB = 0;
		int totalAbstenciones = 0;
		
		String ProvinciaAFavorita = "";
		String ProvinciaBFavorita = "";
		
		int mayorVotosB = Integer.MIN_VALUE;
		int mayorVotosA = Integer.MIN_VALUE;
		
		boolean altaAbstencion =false;
		
		switch (numRegion) {
		case 1:
			provincia = 10;
			break;
		case 2:
			provincia = 4;
			break;
		case 3:
			provincia = 6;
			break;
		case 4:
			provincia =1;
			break;
		default:System.out.println("No has introducido un numero valido.");
			break;
		}
		for (int i = 1; i <= provincia; i++) {
			
			System.out.println("Dame el nombre de la provincia");
			nombreProvincia = sc.next();
			
			
			System.out.println("¿Número de votos obtenidos por el partido A?");
			numeroVotosA = sc.nextInt();
			totalVotosA += numeroVotosA;
			if(numeroVotosA>mayorVotosA) {
				mayorVotosA = numeroVotosA;
				ProvinciaAFavorita =nombreProvincia;
			}
				
			System.out.println("¿Número de votos obtenidos por el partido B?");
			numeroVotosB = sc.nextInt();
			totalVotosB += numeroVotosB;
			if(numeroVotosB>mayorVotosB) {
				mayorVotosB = numeroVotosB;
				ProvinciaBFavorita =nombreProvincia;
			}
			
			System.out.println("¿Número de abstenciones?");
			abstenciones =sc.nextInt();
			totalAbstenciones += abstenciones; 
			if(abstenciones>100000)altaAbstencion=true;
		}
		int votosTotales = totalVotosA + totalVotosB;
		int censoTotal = votosTotales + totalAbstenciones;

		double porcentajeVotos = (votosTotales * 100.0) / censoTotal;
		double porcentajeAbstencion = (totalAbstenciones * 100.0) / censoTotal;

		System.out.println("Porcentaje de votos totales: " + porcentajeVotos + "%");
		System.out.println("Porcentaje de abstenciones: " + porcentajeAbstencion + "%");
		System.out.println("El partido A obtenido mas votos en: "+ProvinciaAFavorita);
		System.out.println("El partido B obtenido mas votos en: "+ProvinciaBFavorita);
		if (altaAbstencion) System.out.println("Alta abstención");
		
		sc.close();
	}

}
