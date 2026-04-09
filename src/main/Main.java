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

        // PEDIR DATOS SEGÚN EL TIPO DE EMPLEADO SELECCIONADO

            //EMPLEADO ASALARIADO
        if (opcion==1){
            System.out.print("Salario base: ");
            double salarioBase=scanner.nextDouble();
            System.out.print("Años en la empresa: ");
            int años=scanner.nextInt();
            empleado=new EmpleadoAsalariado(nombre, salarioBase, años);}

            //EMPLEADO POR HORAS
        else if (opcion == 2) {
            System.out.print("Pago por hora: ");
            double pagoPorHora = scanner.nextDouble();
            System.out.print("Horas trabajadas en el mes: ");
            int horas = scanner.nextInt();
            System.out.print("Años en la empresa: ");
            int años = scanner.nextInt();

            boolean aceptaFondo = false;

            // Solo se pregunta si lleva mas de 1 año en la empresa
            if (años > 1) {
            System.out.print("¿Acepta ingresar al fondo de ahorro? (1=Si, 2=No): ");
            int fondoOpcion = scanner.nextInt();
            aceptaFondo = fondoOpcion == 1;}
            empleado = new EmpleadoPorHoras(nombre, pagoPorHora, horas, años, aceptaFondo);
}

       









        scanner.close();



    }
}