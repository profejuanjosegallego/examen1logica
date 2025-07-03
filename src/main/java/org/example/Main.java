package org.example; //Error 1: Se actualiza el JDK al 19

import java.util.Scanner; //Error 2: Se importa la Clase Scanner
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Error 2: Se cambia de s a S mayuscula del Scanner y se pone el .in

        // Información general
        String nombreProgramador, correo, ciudad, pais, tipoContrato, nivelExperiencia, cliente1, cliente2, cliente3;
        int edad, aniosExperiencia;
        double tarifaBase, tarifaNivel, tarifaExperiencia;

        // Entrada de información general
        System.out.print("Ingrese el nombre del programador: "); //Error 3: El string se pone entre parentesis
        nombreProgramador = sc.nextLine(); //Error 4: Se cambia de nextline a nextLine y se pone ;

        System.out.print("Ingrese el correo electrónico: "); //Error 5: Se pone ;
        correo = sc.nextLine(); //Error 6: Se cambia de scanner a sc

        System.out.print("Ingrese la ciudad: ");
        ciudad = sc.nextLine(); //Error 7: Se cambia de leer a sc

        System.out.print("Ingrese el país: "); //Error 8: Se pone ;
        pais = sc.nextLine();

        System.out.print("Ingrese el tipo de contrato (Fulltime/Parttime/Freelance): "); //Error 9: Se pone ;
        tipoContrato = sc.nextLine();

        System.out.print("Ingrese el nivel de experiencia (Junior/Senior): ");
        nivelExperiencia = sc.nextLine();

        System.out.print("Ingrese la edad del programador: ");
        edad = sc.nextInt();

        System.out.print("Ingrese los años de experiencia: ");
        aniosExperiencia = sc.nextInt();

        // Ajuste de tarifa según experiencia
        tarifaBase = 5000; // base por hora ////Error 10: se cambia de 50,0,0 a un valor valido -> 5000
        tarifaNivel = (nivelExperiencia.equalsIgnoreCase("Senior")) ? 20 : 0;
        tarifaExperiencia = aniosExperiencia * 1.5;
        double tarifaHoraFinal = tarifaBase + tarifaNivel + tarifaExperiencia;

        System.out.println("\nTarifa final por hora calculada: $" + tarifaHoraFinal); //Error 11: Se pone ;

        // Información de proyectos
        System.out.println("\nIngrese los nombres de los 3 clientes:");
        sc.nextLine(); // limpiar buffer
        System.out.print("Cliente 1: "); //Error 12: Se pone ;
        cliente1 = sc.nextLine();//Error 13: Se le agrega la letra t a la palabra nex y la palabra Line
        System.out.print("Cliente 2: "); //Error 14: Se pone ;
        cliente2 = sc.nextLine();//Error 15: Se le agrega la palabra Line ;
        System.out.print("Cliente 3: "); //Error 16: Se pone ;
        cliente3 = sc.nextLine();//Error 17: Se le agrega la letra t a la palabra nex y la palabra Line

        int horasProyecto1, horasProyecto2, horasProyecto3;
        double bonusCliente1, bonusCliente2, bonusCliente3;
        double pagoProyecto1, pagoProyecto2, pagoProyecto3;
        double subtotal, descuentos, impuestos, totalFinal;

        // Captura de horas
        System.out.print("Horas trabajadas para " + cliente1 + ": ");
        horasProyecto1 = sc.nextInt(); //Error 18: Se le quita el comentario
        System.out.print("Bono adicional para " + cliente1 + ": ");
        bonusCliente1 = sc.nextDouble();

        System.out.print("Horas trabajadas para " + cliente2 + ": ");
        horasProyecto2 = sc.nextInt(); //Error 19: Se le quita el comentario
        System.out.print("Bono adicional para " + cliente2 + ": ");
        bonusCliente2 = sc.nextDouble();

        System.out.print("Horas trabajadas para " + cliente3 + ": ");
        horasProyecto3 = sc.nextInt(); //Error 20: Se le quita el comentario
        System.out.print("Bono adicional para " + cliente3 + ": ");
        bonusCliente3 = sc.nextDouble();

        // Cálculos de pago por proyecto
        pagoProyecto1 = (horasProyecto1 * tarifaHoraFinal) + bonusCliente1; //Error 21: se corrigen las palabras horasProyec1 y bonusCliene1
        pagoProyecto2 = (horasProyecto2 * tarifaHoraFinal) + bonusCliente2; // Error 22: se corrigen las palabras  tarifaHoraFnal y bonusCliene2
        pagoProyecto3 = (horasProyecto3 * tarifaHoraFinal) + bonusCliente3; // Error 23: se corrige la palabra  bonusCliene3

        subtotal = pagoProyecto1 + pagoProyecto2 + pagoProyecto3; // Error 24: SE le quitan 3 = y se deja solo 1 =

        // Operaciones adicionales
        descuentos = subtotal * 0.03; // 3% de fondo de ahorro
        impuestos = subtotal * 0.09;  // 9% de retenciones

        totalFinal = subtotal - descuentos - impuestos;

        // Captura fecha actual
        LocalDate fechaActual = LocalDate.now(); // Error 25: Se importa la clase LocalDate

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