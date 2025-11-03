package bol1;

import java.util.Scanner;

public class Ejercicio_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese horas, minutos y segundos:");
        int horas = sc.nextInt();
        int minutos = sc.nextInt();
        int segundos = sc.nextInt();
        
        minutos += segundos / 60;
        segundos %= 60;
        
        horas += minutos / 60;
        minutos %= 60;
        
        horas %= 24;
        
        System.out.println("La hora correcta es: "+horas +"horas "+ minutos +"minutos "+ segundos+" segundos");
        
        sc.close();
	}

}
