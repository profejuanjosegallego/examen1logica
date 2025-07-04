package org.example;

import java.util.Scanner; // Se realiza Importación de Scanner
import  java.time.LocalDate; // Se realiza Importación de LocalDate

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Coreccion de sintaxis, mayusculas y se agrega in

        // Información general
        String nombreProgramador, correo, ciudad, pais, tipoContrato, nivelExperiencia, cliente1, cliente2, cliente3;
        int edad, anosExperiencia; // Coreccion de sintaxis, ortografía
        double tarifaBase, tarifaNivel, tarifaExperiencia;

        // Entrada de información general
        System.out.print("Ingrese el nombre del programador: ");
        nombreProgramador = sc.nextLine(); // corección sintaxis, ;

        System.out.print("Ingrese el correo electrónico: "); // corección sintaxis, ;
        correo = sc.nextLine(); // corección sintaxis, Scanner por sc

        System.out.print("Ingrese la ciudad: ");
        ciudad = sc.nextLine(); //corección sintaxis, leer por sc

        System.out.print("Ingrese el país: "); // corección sintaxis, ;
        pais = sc.nextLine();

        System.out.print("Ingrese el tipo de contrato (Fulltime/Parttime/Freelance): "); // corección sintaxis, ;
        tipoContrato = sc.nextLine();

        System.out.print("Ingrese el nivel de experiencia (Junior/Senior): ");
        nivelExperiencia = sc.nextLine();

        System.out.print("Ingrese la edad del programador: ");
        edad = sc.nextInt();

        System.out.print("Ingrese los años de experiencia: ");
        anosExperiencia = sc.nextInt(); // corección ortografía

        // Ajuste de tarifa según experiencia
        tarifaBase = 50.00; // base por hora, coreccion sintaxi, se debe utilizar punto (.)
        tarifaNivel = (nivelExperiencia.equalsIgnoreCase("Senior")) ? 20 : 0;
        tarifaExperiencia = anosExperiencia * 1.5;
        double tarifaHoraFinal = tarifaBase + tarifaNivel + tarifaExperiencia;

        System.out.println("\nTarifa final por hora calculada: $" + tarifaHoraFinal);

        // Información de proyectos
        System.out.println("\nIngrese los nombres de los 3 clientes:");
        sc.nextLine(); // limpiar buffer
        System.out.print("Cliente 1: "); //corección sintaxis, ;
        cliente1 = sc.nextLine(); //corección sintaxis, nex por nextLine
        System.out.print("Cliente 2: "); //corección sintaxis, ;
        cliente2 = sc.nextLine();  //corección sintaxis, next por nextLine
        System.out.println("Cliente 3: "); //corección sintaxis, ;
        cliente3 = sc.nextLine(); //corección sintaxis, nex por nextLine

        int horasProyecto1 , horasProyecto2 , horasProyecto3 ; //
        double bonusCliente1, bonusCliente2, bonusCliente3;
        double pagoProyecto1, pagoProyecto2, pagoProyecto3;
        double subtotal, descuentos, impuestos, totalFinal;

        // Captura de horas
        System.out.print("Horas trabajadas para " + cliente1 + ": ");
        horasProyecto1 = sc.nextInt(); // se sacan de cometarios para que puedan ser utilizadas correctamente
        System.out.print("Bono adicional para " + cliente1 + ": ");
        bonusCliente1 = sc.nextDouble();

        System.out.print("Horas trabajadas para " + cliente2 + ": ");
        horasProyecto2 = sc.nextInt(); //se sacan de cometarios para que puedan ser utilizadas correctamente
        System.out.print("Bono adicional para " + cliente2 + ": ");
        bonusCliente2 = sc.nextDouble();

        System.out.print("Horas trabajadas para " + cliente3 + ": ");
        horasProyecto3 = sc.nextInt(); //se sacan de cometarios para que pue
        System.out.print("Bono adicional para " + cliente3 + ": ");
        bonusCliente3 = sc.nextDouble();

        // Cálculos de pago por proyecto
        pagoProyecto1 = (horasProyecto1 * tarifaHoraFinal) + bonusCliente1;
        pagoProyecto2 = (horasProyecto2 * tarifaHoraFinal) + bonusCliente2;
        pagoProyecto3 = (horasProyecto3 * tarifaHoraFinal) + bonusCliente3;

        subtotal = pagoProyecto1 + pagoProyecto2 + pagoProyecto3; // correción de sintaxis, ==== por =

        // Operaciones adicionales
        descuentos = subtotal * 0.03; // 3% de fondo de ahorro
        impuestos = subtotal * 0.09;  // 9% de retenciones

        totalFinal = subtotal - descuentos - impuestos;

        // Captura fecha actual
        LocalDate fechaActual = LocalDate.now(); // se importa el LocalDate

        // Impresión del reporte
        System.out.println("\n----- REPORTE DE PAGO -----");
        System.out.println("Nombre del programador: " + nombreProgramador);
        System.out.println("Correo: " + correo);
        System.out.println("Ciudad: " + ciudad + ", " + pais);
        System.out.println("Fecha de liquidación: " + fechaActual);
        System.out.println("Tipo de contrato: " + tipoContrato);
        System.out.println("Nivel de experiencia: " + nivelExperiencia);
        System.out.println("Tarifa por hora: $" + tarifaHoraFinal);

        System.out.println("\nDetalle por cliente:");
        System.out.println(cliente1 + ": $" + pagoProyecto1);
        System.out.println(cliente2 + ": $" + pagoProyecto2);
        System.out.println(cliente3 + ": $" + pagoProyecto3);

        System.out.println("\nSubtotal: $" + subtotal);
        System.out.println("Descuentos (3%): $" + descuentos);
        System.out.println("Impuestos (9%): $" + impuestos);
        System.out.println("Total a recibir: $" + totalFinal);

        sc.close();
    }
}