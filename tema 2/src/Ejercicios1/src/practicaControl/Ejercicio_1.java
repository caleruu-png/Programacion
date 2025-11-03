package practicaControl;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String codigo = "";
        
        // Departamentos
        String departamento = "";
        String departamentoMax = "";
        String depMenorMedia = "";
        int numProfesores = 0;
        int numProfesoresMax = Integer.MIN_VALUE;
        double minMediaAnios = Double.MAX_VALUE;
        
        // ESO
        String alumnoMejorNota = "";
        int notaMejorAlumno = Integer.MIN_VALUE;
        
        // PCPI
        int contadorPCPI = 0;
        String especialidad1 = "";
        String especialidad2 = "";
        
        // Bachillerato
        int sumaAsignaturas = 0;
        int contadorBachillerato = 0;
        
        // FP
        String nombreFPCorto = "";
        int horasCicloMin = Integer.MAX_VALUE;
        int ciclosLargaDuracion = 0;
        
        System.out.println("Introduce el código de la unidad (escribe 'fin' para terminar):");
        codigo = sc.nextLine();
        
        while (!codigo.equalsIgnoreCase("fin")) {
            
            char primerCaracter = codigo.toUpperCase().charAt(0);
            
            if (primerCaracter == 'D') {
                // DEPARTAMENTO
                System.out.println("Introduce el nombre del departamento:");
                departamento = sc.nextLine();
                
                System.out.println("Introduce el número de profesores:");
                numProfesores = sc.nextInt();
                sc.nextLine(); 
                
                if (numProfesores > numProfesoresMax) {
                    numProfesoresMax = numProfesores;
                    departamentoMax = departamento;
                }
                
                int sumaAnios = 0;
                for (int i = 1; i <= numProfesores; i++) {
                    System.out.println("Nombre del profesor " + i + ":");
                    String nombreProfesor = sc.nextLine();
                    
                    System.out.println("Años en el centro:");
                    int permanenciaCentro = sc.nextInt();
                    sc.nextLine(); 
                    
                    sumaAnios += permanenciaCentro;
                }
                
                double mediaAnios = (double) sumaAnios / numProfesores;
                if (mediaAnios < minMediaAnios) {
                    minMediaAnios = mediaAnios;
                    depMenorMedia = departamento;
                }
                
            } else if (primerCaracter == 'C') {
                // CLASE
                System.out.println("Introduce el tipo de clase (E, P, B o F):");
                String tipoClase = sc.nextLine();
                tipoClase = tipoClase.toUpperCase(); 
                switch (tipoClase) {
                    case "E":
                        // ESO
                        int contadorAlumnosClase = 0; 
                        System.out.println("Introduce nombres de alumnos (escribe 'fin' para terminar):");
                        String nombreAlumno = sc.nextLine();
                        
                        while (!nombreAlumno.equalsIgnoreCase("fin")) {
                            System.out.println("Nota media del alumno:");
                            int notaMedia = sc.nextInt();
                            sc.nextLine(); 
                            
                            contadorAlumnosClase++;
                            

                            if (contadorAlumnosClase < 20 && notaMedia > notaMejorAlumno) {
                                notaMejorAlumno = notaMedia;
                                alumnoMejorNota = nombreAlumno;
                            }
                            
                            System.out.println("Introduce nombre de alumno (escribe 'fin' para terminar):");
                            nombreAlumno = sc.nextLine();
                        }
                        break;
                        
                    case "P":
                        // PCPI
                        System.out.println("Nombre de la especialidad:");
                        String especialidad = sc.nextLine();
                        
                        especialidad2 = especialidad1;
                        especialidad1 = especialidad;
                        contadorPCPI++;
                        break;
                        
                    case "B":
                        // Bachillerato
                        System.out.println("Número de asignaturas:");
                        int numAsignaturas = sc.nextInt();
                        sc.nextLine(); 
                        
                        sumaAsignaturas += numAsignaturas;
                        contadorBachillerato++;
                        break;
                        
                    case "F":
                        // FP
                        System.out.println("Nombre del título:");
                        String nombreTitulo = sc.nextLine();
                        
                        System.out.println("Horas del ciclo:");
                        int horasCiclo = sc.nextInt();
                        sc.nextLine();
                        
                        if (horasCiclo < horasCicloMin) {
                            horasCicloMin = horasCiclo; 
                            nombreFPCorto = nombreTitulo;
                        }
                        
                        if (horasCiclo > 1500) {
                            ciclosLargaDuracion++;
                        }
                        break;
                        
                    default:
                        System.out.println("Tipo de clase no válido");
                        break;
                }
            } else {
                System.out.println(" Código no válido. Debe empezar con D o C");
            }
            
            System.out.println("Introduce el código de la unidad (escribe 'fin' para terminar):");
            codigo = sc.nextLine();
        }
        
        // MOSTRAR RESULTADOS
        System.out.println("--- RESULTADOS ---");
        System.out.println("Departamento con más profesores: " + departamentoMax);
        
        if (!alumnoMejorNota.isEmpty()) {
            System.out.println("Alumno de ESO con mayor nota (grupos < 20): " + alumnoMejorNota);
        } else {
            System.out.println("No hay alumnos de ESO en grupos de menos de 20");
        }
        
        if (contadorPCPI == 0) {
            System.out.println("No se introdujeron especialidades de PCPI");
        } else if (contadorPCPI == 1) {
            System.out.println("Solo hay una especialidad de PCPI: " + especialidad1);
        } else {
            System.out.println("Dos últimas especialidades de PCPI: " + especialidad2 + " y " + especialidad1);
        }
        
        if (contadorBachillerato > 0) {
            double mediaAsignaturas = (double) sumaAsignaturas / contadorBachillerato;
            System.out.println("Media de asignaturas en Bachillerato: " + mediaAsignaturas);
        } else {
            System.out.println("No se introdujeron clases de Bachillerato");
        }
        
        System.out.println("Ciclos de FP con más de 1500 horas: " + ciclosLargaDuracion);
        
        if (!nombreFPCorto.isEmpty()) {
            System.out.println("Ciclo de FP de menor duración: " + nombreFPCorto);
        } else {
            System.out.println("No se introdujeron ciclos de FP");
        }
        
        if (!depMenorMedia.isEmpty()) {
            System.out.println("Departamento con menor media de años: " + depMenorMedia);
        } else {
            System.out.println("No se introdujeron departamentos");
        }
        
        sc.close();
    }
}