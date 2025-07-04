# 💻 Proyecto Java: Calculadora de Pago para Programadores Freelance

Este programa en Java permite calcular el pago total que recibe un programador freelance, 
tomando en cuenta la tarifa por hora, los años de experiencia, tipo de contrato
y los bonos adicionales otorgados por tres clientes.

## 🛠️ Corrección Código Java

## 🐞 Errores encontrados

A continuación, se detallan algunos errores detectados durante la ejecución inicial del programa:

1. ❌ `Scanner sc = new scanner(system);`  
   ➤ Uso incorrecto de mayúsculas y objetos (`scanner` y `system` deben estar en mayúscula como `Scanner` y `System`).
   ➤ Además, la clase Scanner no se había importado, por lo que el compilador no la reconocía.
2. ❌ `correo = Scanner.nextLine();`  
   ➤ Mal uso del objeto: se debe usar la instancia `sc`, no la clase `Scanner`.

3. ❌ Uso de `,` en vez de `.` en valores numéricos:  
   Ejemplo: `tarifaBase = 50,0,0;`  
   ➤ En Java se usan puntos (`.`) para los valores decimales, no comas.

4. ❌ Declaración incorrecta: `subtotal ==== pagoProyecto1 + pagoProyecto2;`  
   ➤ Se usaron múltiples signos de igual (`====`) en vez de solo uno (`=`).

5. ❌ Uso de `sc.next();` en lugar de `sc.nextLine();` para capturar textos con espacios.  
   ➤ Esto causaba que nombres de clientes solo capturaran una palabra.

6. ❌ No se importó la clase java.time.LocalDate
   ➤ Esto causaba errores al intentar obtener la fecha actual.

## ✅ Soluciones Realizadas 

1. ✅ Se corrigió la sintaxis con mayúsculas adecuadas:  
   `Scanner sc = new Scanner(System.in);`

2. ✅ Se reemplazó el uso incorrecto de la clase por la instancia:  
   `correo = sc.nextLine();`

3. ✅ Se reemplazaron comas por puntos en números decimales:  
   `tarifaBase = 50.0;`

4. ✅ Se corrigió la asignación:  
   `subtotal = pagoProyecto1 + pagoProyecto2 + pagoProyecto3;`

5. ✅ Se agregó `sc.nextLine()` después de `sc.nextInt()` 
para limpiar el buffer, y se usó `sc.nextLine()` para capturar textos con espacios.

6. ✅ Se importaron Scanner y LocalDate.


## 📚 Referencias y ayudas consultadas

📘 Documentación oficial de Java 

📓 Apuntes tomados en clases 

🤖 ChatGPT (IA) 

## 📅 Fecha de Corección

Juli0 04 del 2025

## 🙌 Autor

Jessica Mora