package org.example;
//Se actualiza el jdk a 19
import java.util.Scanner; //Se hace incorporacion de la Scanner
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Se corrige mayuscula en Scanner y se agrega .in en parentesis

        // Información general
        String nombreProgramador, correo, ciudad, pais, tipoContrato, nivelExperiencia, cliente1, cliente2, cliente3;
        int edad, aniosExperiencia;
        double tarifaBase, tarifaNivel, tarifaExperiencia;

        // Entrada de información general
        System.out.print("Ingrese el nombre del programador: "); //Se agrega parentesis que abre el sout
        nombreProgramador = sc.nextLine(); //Se le pone mayuscula en Line

        System.out.print("Ingrese el correo electrónico: "); //Se agrega ;
        correo = sc.nextLine(); //Se cambia nombre de scanner a sc

        System.out.print("Ingrese la ciudad: ");
        ciudad = sc.nextLine();   //Se cambia nombre de scanner a sc

        System.out.print("Ingrese el país: ");//Se agrega ;
        pais = sc.nextLine();

        System.out.print("Ingrese el tipo de contrato (Fulltime/Parttime/Freelance): "); //Se agrega ;
        tipoContrato = sc.nextLine();

        System.out.print("Ingrese el nivel de experiencia (Junior/Senior): ");
        nivelExperiencia = sc.nextLine();

        System.out.print("Ingrese la edad del programador: ");
        edad = sc.nextInt();

        System.out.print("Ingrese los años de experiencia: ");
        aniosExperiencia = sc.nextInt();

        // Ajuste de tarifa según experiencia
        tarifaBase = 5000; // base por hora ---- //Se quitan las coma a los valores
        tarifaNivel = (nivelExperiencia.equalsIgnoreCase("Senior")) ? 20 : 0;
        tarifaExperiencia = aniosExperiencia * 1.5;
        double tarifaHoraFinal = tarifaBase + tarifaNivel + tarifaExperiencia;

        System.out.println("\nTarifa final por hora calculada: $" + tarifaHoraFinal); //Se agrega ;

        // Información de proyectos3
        System.out.println("\nIngrese los nombres de los 3 clientes:");
        sc.nextLine(); // limpiar buffer
        System.out.print("Cliente 1: "); //Se agrega ;
        cliente1 = sc.nextLine(); //Se corrije nextLine estaba nex
        System.out.print("Cliente 2: "); //Se agrega ;
        cliente2 = sc.next();
        System.out.print("Cliente 3: "); //Se agrega ;
        cliente3 = sc.next();

        int horasProyecto1, horasProyecto2, horasProyecto3;
        double bonusCliente1, bonusCliente2, bonusCliente3;
        double pagoProyecto1, pagoProyecto2, pagoProyecto3;
        double subtotal, descuentos, impuestos, totalFinal;

        // Captura de horas
        sc.nextLine();
        System.out.print("Horas trabajadas para " + cliente1 + ": ");
        horasProyecto1 = sc.nextInt(); //Se quita comentario
        System.out.print("Bono adicional para " + cliente1 + ": ");
        bonusCliente1 = sc.nextDouble();

        System.out.print("Horas trabajadas para " + cliente2 + ": ");
        horasProyecto2 = sc.nextInt(); //Se quita comentario
        System.out.print("Bono adicional para " + cliente2 + ": ");
        bonusCliente2 = sc.nextDouble();

        System.out.print("Horas trabajadas para " + cliente3 + ": ");
        horasProyecto3 = sc.nextInt(); //Se quita comentario
        System.out.print("Bono adicional para " + cliente3 + ": ");
        bonusCliente3 = sc.nextDouble();

        // Cálculos de pago por proyecto
        pagoProyecto1 = (horasProyecto1 * tarifaHoraFinal) + bonusCliente1; //Se corrije nombre variables horasProyecto1 y bonusCliente1
        pagoProyecto2 = (horasProyecto2 * tarifaHoraFinal) + bonusCliente2; //Se corrije nombre variables tarifaHoral y bonusCliente2
        pagoProyecto3 = (horasProyecto3 * tarifaHoraFinal) + bonusCliente3; //Se corrije nombre variable bonusCliente3

        subtotal = pagoProyecto1 + pagoProyecto2 + pagoProyecto3;

        // Operaciones adicionales
        descuentos = subtotal * 0.03; // 3% de fondo de ahorro
        impuestos = subtotal * 0.09;  // 9% de retenciones

        totalFinal = subtotal - descuentos - impuestos;

        // Captura fecha actual
        LocalDate fechaActual = LocalDate.now();

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