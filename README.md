# 🧠 Registro de correcciones realizadas con apoyo de IA (ChatGPT)

Este documento describe paso a paso las correcciones realizadas al proyecto Java "Calculadora de Tarifas para Programadores", con el apoyo de la herramienta de IA generativa **ChatGPT**.

---

* 🧑‍💻 Autor de la corrección: \[Nicolas Parra]

---
Descripción del programa:

Este programa en Java permite calcular la tarifa por hora y el ingreso total de un programador, según su experiencia, nivel profesional y horas trabajadas con distintos clientes. También aplica descuentos e impuestos automáticamente y genera un reporte detallado con la información personal, tarifas y resultados finales.
## ✅ Paso a paso de las correcciones realizadas

1. **Actualización del JDK:**

    * Se ajustó la configuración para usar Java JDK 19 según el encabezado del archivo.

2. **Corrección de importaciones y objetos:**

    * Se corrigió `Scanner scanner = new Scanner();` a `Scanner sc = new Scanner(System.in);`
    * Se importó correctamente: `import java.util.Scanner;`

3. **Errores de sintaxis corregidos:**

    * Se agregaron puntos y coma `;` en múltiples sentencias `System.out.print(...)`
    * Se agregaron los paréntesis faltantes en algunos `System.out.println(...)`

4. **Estándar en nombres de variables:**

    * Se cambió `scanner` por `sc` de manera consistente en todo el código.
    * Se corrigió `nexLine()` a `nextLine()`
    * Se corrigió `tarifaHoral` a `tarifaHoraFinal`

5. **Corrección en entrada de datos:**

    * Se usó `sc.nextLine()` para limpiar el buffer después de leer enteros o doubles antes de leer texto.
    * Se cambió el uso de `next()` por `nextLine()` para capturar cadenas con espacios.

6. **Eliminación de errores numéricos:**

    * Se eliminaron las comas en números grandes (`5,000`) → `5000`, ya que no son válidas en Java.

7. **Cálculo final de tarifas:**

    * Se revisó y corrigió la fórmula para el cálculo de la tarifa final por hora usando:

      ```java
      tarifaHoraFinal = tarifaBase + tarifaNivel + tarifaExperiencia;
      ```

8. **Cálculo de pagos por cliente:**

    * Se corrigieron nombres de variables y la fórmula final para cada cliente:

      ```java
      pagoProyecto1 = (horasProyecto1 * tarifaHoraFinal) + bonusCliente1;
      ```

9. **Cálculo de subtotal, descuentos e impuestos:**

    * Se aplicaron:

        * 3% de fondo de ahorro: `descuentos = subtotal * 0.03`
        * 9% de retenciones: `impuestos = subtotal * 0.09`

10. **Incorporación de fecha actual:**

    * Se utilizó `LocalDate.now()` para capturar la fecha de liquidación.

11. **Reporte final estructurado:**

    * Se generó un bloque final con impresión clara de datos personales, pagos por cliente, totales, descuentos e impuestos.

---

## ✅ Resultado

El código ahora compila y se ejecuta correctamente, mostrando una experiencia de usuario fluida y un reporte final limpio y completo. Todas las correcciones fueron hechas con base en buenas prácticas de programación en Java y guiadas paso a paso con apoyo de ChatGPT.

---

## 🧠 Nota

Este documento fue construido como parte de la evidencia del uso de inteligencia artificial en apoyo al desarrollo y corrección de software, conforme a lo solicitado en la guía del proyecto.
