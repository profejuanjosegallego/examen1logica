# 💻 Proyecto Java: Liquidación de Pagos para Programadores Freelance 👨‍💻🧾💸

Este programa desarrollado en Java permite simular una liquidación de pagos para un programador freelance, calculando su tarifa por hora según nivel y experiencia, sumando bonificaciones por cliente y aplicando descuentos e impuestos. Todo se realiza mediante entrada por consola y se imprime un reporte completo. 📊

---

## 🐞 Errores encontrados

A continuación se detalla el listado de errores detectados en el código original:

1. ❌ No se importó la clase `Scanner`.
2. ❌ Instanciación incorrecta del `Scanner` (`scanner(system)` en lugar de `new Scanner(System.in)`).
3. ❌ Falta de punto y coma (`;`) en múltiples líneas (16, 18, 24, 27, 47, 50, 52, 54).
4. ❌ Falta de paréntesis en `System.out.print`, línea 15.
5. ❌ Uso de métodos mal escritos: `nextline()`, `nex()`, `scanner.nextLine()`, `leer.nextLine()`.
6. ❌ Asignación incorrecta con comas en `tarifaBase = 50,0,0;` (en lugar de `50.0`).
7. ❌ Nombres mal escritos de variables en líneas de cálculo:
    - `horasProyec1`, `bonusCliene1`, `tarifaHoraFnal`, etc.
8. ❌ Error de operador lógico: `subtotal ==== ...` (en lugar de `=`).
9. ❌ Lectura de horas comentada (`horasProyecto1`, `horasProyecto2`, `horasProyecto3`) → no inicializadas.
10. ❌ Falta de importación de `LocalDate`.
11. ❌ SDK no configurado correctamente en el entorno (generaba errores en IntelliJ).

---

## 🔧 ¿Cómo se corrigieron?

Las siguientes acciones fueron aplicadas para corregir y estabilizar el código:

- ✅ Se añadió `import java.util.Scanner;` y `import java.time.LocalDate;`.
- ✅ Se corrigió la creación del escáner: `Scanner sc = new Scanner(System.in);`.
- ✅ Se agregaron los puntos y comas (`;`) faltantes.
- ✅ Se completó el paréntesis en la línea de impresión (línea 15).
- ✅ Se reemplazaron los métodos incorrectos por `sc.nextLine()` y `sc.next()`.
- ✅ Se corrigió el valor decimal `tarifaBase = 50.0;` (con punto).
- ✅ Se renombraron correctamente las variables mal escritas:
    - `horasProyec1` → `horasProyecto1`
    - `bonusCliene1` → `bonusCliente1`
    - `tarifaHoraFnal` → `tarifaHoraFinal`, etc.
- ✅ Se reemplazó `subtotal ==== ...` por `subtotal = ...`.
- ✅ Se descomentaron las lecturas de teclado para las horas trabajadas por cliente.
- ✅ Se importó `LocalDate` y se usó `LocalDate.now()` para registrar la fecha.
- ✅ Se configuró correctamente el SDK del proyecto en IntelliJ IDEA.

---

## 📅 Fecha de entrega

**Julio 3 de 2025**

---

## 👨‍🏫 Autor

Juan Pablo Serna  
**Estudiante de Lógica de Programación – Examen**
