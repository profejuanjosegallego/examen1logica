package org.example;  // Se define el paquete  correctamente.

import java.time.LocalDate;  // Importación correcta para manejar fechas.
import java.util.Scanner;    // Importación correcta del Scanner.

public class Main {
    public static void main(String[] args) {
        // scanner y system estaban mal escritos
        // Se corrigió el tipo de dato y el nombre de la clase y objeto
        Scanner sc = new Scanner(System.in);

        // Declaración de variables
        String nombreProgramador, correo, ciudad, pais, tipoContrato, nivelExperiencia, cliente1, cliente2, cliente3;
        int edad, aniosExperiencia;
        double tarifaBase, tarifaNivel, tarifaExperiencia;

        // Faltaban paréntesis y punto y coma en varios System.out.print
        System.out.print("Ingrese el nombre del programador: ");
        // nextline estaba mal escrito y faltaba ;
        nombreProgramador = sc.nextLine();

        // scanner debía ser sc
        System.out.print("Ingrese el correo electrónico: ");
        correo = sc.nextLine();

        // leer no estaba declarado
        System.out.print("Ingrese la ciudad: ");
        ciudad = sc.nextLine();

        System.out.print("Ingrese el país: ");
        pais = sc.nextLine();

        System.out.print("Ingrese el tipo de contrato (Fulltime/Parttime/Freelance): ");
        tipoContrato = sc.nextLine();

        System.out.print("Ingrese el nivel de experiencia (Junior/Senior): ");
        nivelExperiencia = sc.nextLine();

        System.out.print("Ingrese la edad del programador: ");
        edad = sc.nextInt();

        System.out.print("Ingrese los años de experiencia: ");
        aniosExperiencia = sc.nextInt();

        // 50,0,0 no era un  válido
        tarifaBase = 50.0;
        // Cálculo condicional con operador ternario correcto
        tarifaNivel = (nivelExperiencia.equalsIgnoreCase("Senior")) ? 20 : 0;
        tarifaExperiencia = aniosExperiencia * 1.5;
        double tarifaHoraFinal = tarifaBase + tarifaNivel + tarifaExperiencia;

        System.out.println("\nTarifa final por hora calculada: $" + tarifaHoraFinal);

        // Entrada de clientes
        System.out.println("\nIngrese los nombres de los 3 clientes:");
        sc.nextLine();
        System.out.print("Cliente 1: ");
        // nex() no existe, se corrigió por nextLine()
        cliente1 = sc.nextLine();

        System.out.print("Cliente 2: ");
        cliente2 = sc.nextLine();

        System.out.print("Cliente 3: ");
        cliente3 = sc.nextLine();

        // Declaración de variables para proyectos
        int horasProyecto1, horasProyecto2, horasProyecto3;
        double bonusCliente1, bonusCliente2, bonusCliente3;
        double pagoProyecto1, pagoProyecto2, pagoProyecto3;
        double subtotal, descuentos, impuestos, totalFinal;

        // Captura de horas y bonos por cliente
        System.out.print("Horas trabajadas para " + cliente1 + ": ");
        horasProyecto1 = sc.nextInt(); // Estaba comentado
        System.out.print("Bono adicional para " + cliente1 + ": ");
        bonusCliente1 = sc.nextDouble();

        System.out.print("Horas trabajadas para " + cliente2 + ": ");
        horasProyecto2 = sc.nextInt(); // Estaba comentado
        System.out.print("Bono adicional para " + cliente2 + ": ");
        bonusCliente2 = sc.nextDouble();

        System.out.print("Horas trabajadas para " + cliente3 + ": ");
        horasProyecto3 = sc.nextInt(); // Estaba comentado
        System.out.print("Bono adicional para " + cliente3 + ": ");
        bonusCliente3 = sc.nextDouble();

        // Variables como horasProyec1 y bonusCliene1 no existían correctamente
        pagoProyecto1 = (horasProyecto1 * tarifaHoraFinal) + bonusCliente1;
        pagoProyecto2 = (horasProyecto2 * tarifaHoraFinal) + bonusCliente2;
        pagoProyecto3 = (horasProyecto3 * tarifaHoraFinal) + bonusCliente3;

        // subtotal ==== estaba mal escrito (asignación)
        subtotal = pagoProyecto1 + pagoProyecto2 + pagoProyecto3;

        // Cálculos adicionales
        descuentos = subtotal * 0.03;
        impuestos = subtotal * 0.09;
        totalFinal = subtotal - descuentos - impuestos;

        // Fecha actual del sistema
        LocalDate fechaActual = LocalDate.now();

        // Impresión del reporte final
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

        // Buenas prácticas: se cierra el Scanner
        sc.close();
    }
}
