# 💻 Documentación del Programa

---

## 📝 Descripción Breve del Programa

Este programa fue desarrollado con el propósito de **gestionar proyectos y calcular costos asociados a horas trabajadas, tarifas base y bonificaciones para clientes**.  
Permite al usuario ingresar datos por consola, realizar operaciones matemáticas y mostrar resultados organizados de forma clara.

---

## 🐞 Errores Encontrados

Durante el análisis del código, se detectaron los siguientes errores:

1. ⚠️ SDK incorrecto en la configuración del proyecto.
2. ❌ Falta de importación del paquete `java.util.*`.
3. ❌ Ausencia de puntos y comas `;` al final de algunas líneas.
4. ❌ Paréntesis incompletos en declaraciones y métodos.
5. ❌ Declaración incompleta del objeto `Scanner`.
6. ❌ Uso incorrecto del nombre del objeto `Scanner` (se usaba `Scaner` en lugar de `sc`).
7. ❌ Signos de comparación `==` usados en lugar del signo de asignación `=` en la variable `subtotal`.
8. ❌ Error de ortografía en la variable `horasProyecto1`.
9. ❌ Uso incorrecto de `sc.nextline()` (la `L` debe ser mayúscula: `sc.nextLine()`).
10. ❌ Error de sintaxis en `sc.next()` (faltaba la letra `t`).
11. ❌ En `tarifaBase`, se utilizaron comas `,` en lugar de puntos `.` como separador decimal.
12. ❌ Ortografía incorrecta en la variable `tarifaHorasFinal`.
13. ❌ Ortografía incorrecta en la variable `bonusCliente`.
14. ❌ Parte funcional del código estaba comentada, lo que impedía su ejecución correcta.

---

## 🔧 Correcciones Realizadas

A continuación, se detallan las soluciones implementadas:

- ✅ Se cambió el **SDK** a una versión compatible.
- ✅ Se agregó `import java.util.*;` al inicio del archivo.
- ✅ Se colocaron los **puntos y comas** `;` faltantes.
- ✅ Se completaron todos los **paréntesis** necesarios.
- ✅ Se corrigió la declaración del objeto `Scanner sc = new Scanner(System.in);`.
- ✅ Se reemplazaron las entradas `Scaner` por `sc` para mantener consistencia.
- ✅ Se corrigieron los `==` usados erróneamente por `=` en operaciones de asignación.
- ✅ Se corrigió la ortografía de `horasProyecto1`.
- ✅ Se usó `sc.nextLine()` correctamente con `L` mayúscula.
- ✅ Se completó la palabra `next()` correctamente.
- ✅ Se cambiaron las `,` por `.` en los valores decimales de `tarifaBase`.
- ✅ Se corrigió la ortografía de `tarifaHorasFinal`.
- ✅ Se corrigió la ortografía de `bonusCliente`.
- ✅ Se **descomentaron** líneas clave del código para asegurar su ejecución adecuada.

---