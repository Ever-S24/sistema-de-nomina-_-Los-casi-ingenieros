package main;
import model.*;
import java.util.Scanner;
public class Main {
    public static void main(String [] arg) {

        Scanner scanner = new Scanner(System.in);

        //menú para tipos de empleados
        System.out.print(" == SISTEMA DE NOMINA ==");
        System.out.println("Seleccione un tipo de empleado:");
        System.out.println("1. Asalariado");
        System.out.println("2. Por Horas");
        System.out.println("3. Por Comision");
        System.out.println("4. Temporal");
        System.out.print("\nOpcion: ");
        int opcion=scanner.nextInt();

        //mostrar el tipo de empleado
        System.out.println("Tipo de empleado: " +opcion);
        scanner.nextLine();

        //pedir el nombre del empleado
        System.out.print("Nombre del empleado: ");
        String nombre = scanner.nextLine();

        EmpleadoGeneral empleado = null ;

        // si el empleado es asalariado se deben pedir el salario base y los años de antiguedad
        if (opcion==1){
            System.out.print("Salario base: ");
            double salarioBase=scanner.nextDouble();
            System.out.print("Años en la empresa: ");
            int años=scanner.nextInt();
            empleado=new EmpleadoAsalariado(nombre, salarioBase, años);

        }

       









        scanner.close();



    }
}