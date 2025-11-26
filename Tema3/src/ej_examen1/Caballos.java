package ej_examen1;

import java.util.Scanner;

public class Caballos {

    public static void main(String[] args) {

        // Máximo 15 caballos
        final int MAX_CABALLOS = 15;

        // Tabla de caballos
        String[] tCaballos = new String[MAX_CABALLOS];
        int nCaballos = 0;

        // Velocidades de carreras: caballo x carrera
        // -1 indica que ese caballo NO corrió esa carrera
        double[][] tVelocidades = new double[MAX_CABALLOS][10];

        // Tabla de ciudades de cada carrera (si no es null, esa carrera existe)
        String[] tCiudades = new String[10];

        // Inicialización de velocidades
        for (int i = 0; i < MAX_CABALLOS; i++) {
            for (int j = 0; j < 10; j++) {
                tVelocidades[i][j] = -1;
            }
        }

        Scanner sc = new Scanner(System.in);

        // Primer menú
        System.out.println(
            "1- Introducir caballo, carrera, ciudad y velocidad.\n" +
            "2- Listar todos los datos\n" +
            "3- Indicar en qué ciudad ha habido más carreras.\n" +
            "4- Listado de carreras junto con el caballo que ha quedado último.\n" +
            "5- Listado (ordenado por caballo) de velocidades medias.\n" +
            "6- Fin.\n"
        );

        int opcion = sc.nextInt();
        sc.nextLine();

        while (opcion != 6) {

            switch (opcion) {

            // -------------------------------------------------------
            // 1 - Introducir datos
            // -------------------------------------------------------
            case 1: {
                System.out.println("Nombre del caballo:");
                String nombreCaballo = sc.nextLine();

                int indiceCaballo = getIndexOf(tCaballos, nCaballos, nombreCaballo);

                // Si no existe, se añade
                if (indiceCaballo == -1) {
                    indiceCaballo = nCaballos;
                    tCaballos[nCaballos++] = nombreCaballo;
                }

                System.out.println("Número de carrera (0-9):");
                int carrera = sc.nextInt();
                sc.nextLine();

                // Si esa carrera nunca ha sido registrada, pedimos ciudad
                if (tCiudades[carrera] == null) {
                    System.out.println("Ciudad de la carrera:");
                    tCiudades[carrera] = sc.nextLine();
                }

                System.out.println("Velocidad media:");
                double vel = sc.nextDouble();
                sc.nextLine();

                tVelocidades[indiceCaballo][carrera] = vel;
            }
                break;

            // -------------------------------------------------------
            // 2 - Listar todos los datos
            // -------------------------------------------------------
            case 2: {
                for (int i = 0; i < nCaballos; i++) {

                    System.out.println("Caballo: " + tCaballos[i]);

                    for (int j = 0; j < 10; j++) {

                        if (tVelocidades[i][j] != -1) {
                            System.out.println("Carrera " + j +
                                "(" + tCiudades[j] + "): " + tVelocidades[i][j]);
                        }
                    }

                    System.out.println();
                }
            }
                break;

            // -------------------------------------------------------
            // 3 - Ciudad con más carreras
            // -------------------------------------------------------
            case 3: {

                String[] ciudadesUnicas = new String[10];
                int[] contador = new int[10];
                int nCiudades = 0;

                for (int j = 0; j < 10; j++) {

                    if (tCiudades[j] != null) {
                        boolean existe = false;
                        int pos = -1;

                        for (int k = 0; k < nCiudades; k++) {
                            if (ciudadesUnicas[k].equalsIgnoreCase(tCiudades[j])) {
                                existe = true;
                                pos = k;
                                break;
                            }
                        }

                        if (!existe) {
                            ciudadesUnicas[nCiudades] = tCiudades[j];
                            contador[nCiudades] = 1;
                            nCiudades++;
                        } else {
                            contador[pos]++;
                        }
                    }
                }

                int max = -1;
                String ciudadMax = "";

                for (int i = 0; i < nCiudades; i++) {
                    if (contador[i] > max) {
                        max = contador[i];
                        ciudadMax = ciudadesUnicas[i];
                    }
                }

                System.out.println(ciudadMax);
            }
                break;

            // -------------------------------------------------------
            // 4 - Caballo último por carrera
            // -------------------------------------------------------
            case 4: {
                for (int carrera = 0; carrera < 10; carrera++) {

                    double peorVel = Double.MAX_VALUE;
                    String peorCaballo = null;

                    for (int cab = 0; cab < nCaballos; cab++) {

                        if (tVelocidades[cab][carrera] != -1) {

                            if (tVelocidades[cab][carrera] < peorVel) {
                                peorVel = tVelocidades[cab][carrera];
                                peorCaballo = tCaballos[cab];
                            }
                        }
                    }

                    if (peorCaballo != null) {
                        System.out.println("Carrera " + carrera + " -> " + peorCaballo);
                    }
                }
            }
                break;

            // -------------------------------------------------------
            // 5 - Velocidades medias ordenadas
            // -------------------------------------------------------
            case 5: {

                String[] copiaNombres = new String[nCaballos];
                double[] medias = new double[nCaballos];

                for (int i = 0; i < nCaballos; i++) {
                    copiaNombres[i] = tCaballos[i];

                    double suma = 0;
                    int cont = 0;

                    for (int j = 0; j < 10; j++) {
                        if (tVelocidades[i][j] != -1) {
                            suma += tVelocidades[i][j];
                            cont++;
                        }
                    }

                    medias[i] = suma / cont;
                }

                // Ordenación burbuja alfabética
                for (int i = 0; i < nCaballos - 1; i++) {
                    for (int j = i + 1; j < nCaballos; j++) {

                        if (copiaNombres[i].compareToIgnoreCase(copiaNombres[j]) > 0) {

                            String auxN = copiaNombres[i];
                            copiaNombres[i] = copiaNombres[j];
                            copiaNombres[j] = auxN;

                            double auxM = medias[i];
                            medias[i] = medias[j];
                            medias[j] = auxM;
                        }
                    }
                }

                for (int i = 0; i < nCaballos; i++) {
                    System.out.println(copiaNombres[i] + ": " + medias[i]);
                }

            }
                break;
            }

            // Volvemos a mostrar el menú
            System.out.println(
                "1- Introducir caballo, carrera, ciudad y velocidad.\n" +
                "2- Listar todos los datos\n" +
                "3- Indicar en qué ciudad ha habido más carreras.\n" +
                "4- Listado de carreras junto con el caballo que ha quedado último.\n" +
                "5- Listado (ordenado por caballo) de velocidades medias.\n" +
                "6- Fin.\n"
            );

            opcion = sc.nextInt();
            sc.nextLine();
        }

        sc.close();
    }

    // -------------------------------------------------------
    // Función EXACTAMENTE igual que en el ejemplo
    // -------------------------------------------------------
    public static int getIndexOf(String t[], int nElem, String nombre) {
        int indice = -1;
        boolean encontrado = false;

        for (int i = 0; i < nElem && !encontrado; i++) {
            if (t[i].equalsIgnoreCase(nombre)) {
                indice = i;
                encontrado = true;
            }
        }

        return indice;
    }
}
