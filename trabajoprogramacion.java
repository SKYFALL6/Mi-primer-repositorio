import java.util.Scanner;

public class trabajoprogramacion {
    public static void main(String[] args) {
        //Daniel Alexis Sanguino Rodriguez 192365
        //Edinson Andrés Hernández 192363
        //Dorainy Guerrero Bayona 192366
        Scanner scanner = new Scanner(System.in);

        //Registro de datos de cuantos estudiantes
        System.out.println("Cuantos estudiantes se encuentran en el sistema");
        int cantidadEstudiantes = scanner.nextInt();

        //Registro de datos de cuantas materias
        System.out.println("Cuantas materias se encuentran en el sistema");
        int cantidadMaterias = scanner.nextInt();

        //Asignacion a la constante del limite de aprovacion
        final double LIMITE_APROBACION = 3.0;

        //Definicion de los arrays
        String[] nombres = new String[cantidadEstudiantes];
        String[] codigo = new String[cantidadEstudiantes];
        String[] nombreMaterias = new String[cantidadMaterias];
        double[][] notas = new double[cantidadEstudiantes][cantidadMaterias];
        double[] promedios = new double[cantidadEstudiantes];

        // Limpiar el buffer
        scanner.nextLine();

        // Registro de nombres de materias
        for (int i = 0; i < cantidadMaterias; i++) {
            System.out.println("Ingrese el nombre de la materia " + (i + 1) + ":");
            nombreMaterias[i] = scanner.nextLine();
        }

        // Registro de estudiantes y sus notas
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            nombres[i] = scanner.nextLine();
            System.out.println("Ingrese el código del estudiante " + (i + 1) + ":");
            codigo[i] = scanner.nextLine();

            // Inicializador de un contador
            double sumaNotas = 0;
            for (int j = 0; j < cantidadMaterias; j++) {
                double nota;
                // Validación de la nota
                do {
                    System.out.println("Ingrese la nota de " + nombreMaterias[j] + " para el estudiante " + nombres[i] + " (nota entre 0 y 5):");
                    nota = scanner.nextDouble();
                    if (nota < 0 || nota > 5) {
                        System.out.println("¬_¬: La nota debe estar entre 0 y 5. Tiene otra oportunidad -_-");
                    }
                } while (nota < 0 || nota > 5);

                notas[i][j] = nota;
                sumaNotas += nota;
            }

            // Limpiar el buffer
            scanner.nextLine();
            promedios[i] = sumaNotas / cantidadMaterias;
        }

        // Reporte final
        System.out.println("Resultados finales:");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Estudiante: " + nombres[i] + " (" + codigo[i] + ")");
            System.out.println("Promedio: " + promedios[i]);
            if (promedios[i] >= LIMITE_APROBACION) {
                System.out.println("El estudiante ha sido: aprobado");
            } else {
                System.out.println("El estudiante ha sido: desaprobado");
            }
        
        }
    }
    
}          
