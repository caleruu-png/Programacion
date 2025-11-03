package boletin1;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("introduce un caracter");
		char letra=sc.next().charAt(0);
		sc.close();
		System.out.println("La entrada corresponde con una vocal? "+esVocal(letra));
	}
	public static boolean esVocal(char let) {
		boolean esvocal=false;
		switch (let) {
        case 'A', 'E','I','O','U':
        	esvocal=true;
            break;
        default:
        	esvocal=false;
            break;
	}
		return esvocal;
}
}