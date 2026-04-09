package main;
import java.util.Scanner;
public class Main {
    public static void main(String [] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" == SISTEMA DE NOMINA ==");
        System.out.println("Seleccione un tipo de empleado:");
        System.out.println("1. Asalariado");
        System.out.println("2. Por Horas");
        System.out.println("3. Por Comision");
        System.out.println("4. Temporal");
        System.out.print("\nOpcion: ");
        int opcion=scanner.nextInt();

        System.out.println("Tipo de empleado: " +opcion);
        scanner.nextLine();

        System.out.print("Nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.println("Tipo: " + opcion + " | Nombre: " + nombre);









        scanner.close();



    }
}