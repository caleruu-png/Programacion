package ejerciciosBaseExamen;

import java.util.Scanner;
public class ejercicio_2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int menosDe8 = 0;
    int hayCursoMenos2Susp = 0;
    
    String curso = "";
    String cursoMax = "";
    String cursoMin = "";
    String curso1Susp = "";
    String curso2Susp = "";
    String cursoMas5 = "";
    String medias = "";
    String cursosMenos2 = "";
    
    double max = -1;
    double min = 11;
    double ultNota = 0;
    double penultNota = 0;
    
    int max1Susp = -1;
    int max2Susp = -1;
    int maxAprob5 = -1;

    System.out.println("Introduce el nombre del curso (FIN para terminar):");
    curso = sc.nextLine();
    
    while (!curso.equalsIgnoreCase("fin")) {
        System.out.println("Introduce el número de alumnos:");
        int n = sc.nextInt();
        sc.nextLine();
        
        if (n < 8) {
            menosDe8++;
        }

        double suma = 0;
        double nota = 0;
        int susp = 0;
        int aprob = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Introduce la nota del alumno " + (i + 1) + ":");
            nota = sc.nextDouble();
            suma += nota;
            
            if (nota < 5) {
                susp++;
            } else {
                aprob++;
            }
            
            if (i == n - 2) {
                penultNota = nota;
            }
            if (i == n - 1) {
                ultNota = nota;
            }
        }
        sc.nextLine();

        double media = suma / n;
        medias += curso + ": " + media + "\n";

        if (media > max) {
            max = media;
            cursoMax = curso;
        }
        if (media < min) {
            min = media;
            cursoMin = curso;
        }

        if (susp > max1Susp) {
            curso2Susp = curso1Susp;
            max2Susp = max1Susp;
            curso1Susp = curso;
            max1Susp = susp;
        } else if (susp > max2Susp) {
            curso2Susp = curso;
            max2Susp = susp;
        }

        if (susp < 2) {
            hayCursoMenos2Susp = 1;
            cursosMenos2 += curso + " ";
        }

        if (n > 5 && aprob > maxAprob5) {
            maxAprob5 = aprob;
            cursoMas5 = curso;
        }
        
        System.out.println("Introduce el nombre del curso (FIN para terminar):");
        curso = sc.nextLine();
    }

    System.out.println("\n--- RESULTADOS ---");
    System.out.println("a. Clases con menos de 8 alumnos: " + menosDe8);
    System.out.println("b. Medias:\n" + medias);
    System.out.println("c. Mayor media: " + cursoMax + " (" + max + ")");
    System.out.println("d. Menor media: " + cursoMin + " (" + min + ")");
    System.out.println("e. Mas suspensos: " + curso1Susp + "(" + max1Susp + ") " + curso2Susp + "(" + max2Susp + ")");
    
    if (hayCursoMenos2Susp == 1) {
        System.out.println("f. Curso con menos de 2 suspensos: SI " + cursosMenos2);
    } else {
        System.out.println("f. Curso con menos de 2 suspensos: NO");
    }
    
    System.out.println("g. Mas de 5 alumnos con mas aprobados: " + cursoMas5 + "(" + maxAprob5 + ")");
    System.out.println("h. Ultimas notas: " + penultNota + " y " + ultNota);
    
    sc.close();

}}
