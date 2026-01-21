package refuerzo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Profesor p1 = new Profesor("Gerardo", 40, "Matematicas");
		Profesor p2 = new Profesor("Pepi", 65, "Lengua");

		
		System.out.println(p1 + ", " + p2);

		Grupo g1 = new Grupo("DAW1", p1);
		System.out.println(g1);

		System.out.println("Elige una opcion \r\n" + "\t 1. Añadir alumno al grupo. \r\n"
				+ "\t 2. Listar el grupo. \r\n" + "\t 3. Salir.");
		
		int opcion = sc.nextInt();
		
		while (opcion <= 3) {
			
			switch (opcion) {
			case 1:
				String nombre;
				int edad;
				long expediente;
				System.out.println("Dame los parametros del alumno");
				System.out.println("Dime el nombre");
				nombre=sc.next();
				System.out.println("Dime la edad");
				edad=sc.nextInt();
				System.out.println("Dime el expediente");
				expediente=sc.nextLong();
				
				if(!g1.addAlumno(new Alumno(nombre, edad, expediente))) {
					System.out.println("No se ha podido añadir");
				}
				break;
			case 2:
				System.out.println(g1);
				break;
			case 3:
				break;
			default:
			}
			
			System.out.println("Elige una opcion \r\n" + "\t 1. Añadir alumno al grupo. \r\n"
					+ "\t 2. Listar el grupo. \r\n" + "\t 3. Salir.");
			
			opcion = sc.nextInt();
		}
		sc.close();
	}

}
