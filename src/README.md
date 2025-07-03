
# 📘 Informe de Correcciones - Proyecto Java

Este documento contiene un resumen detallado de los errores encontrados en el código Java, cómo fueron corregidos, y las herramientas utilizadas para organizar la documentación.

---

## ✨ Descripción breve del programa

Este proyecto en Java realiza operaciones básicas de entrada de datos y lógica simple utilizando la clase `Scanner`. Se enfoca en la interacción con el usuario y el procesamiento de valores numéricos y cadenas. 🖥️🧮

---

## ❌ Listado de errores encontrados

- En la línea 2 faltaba importar la clase, que sería `java.util.Scanner`.
- En la línea 5 el `Scanner` tenía la "s" en minúscula y también el `System`; además, faltaba el `.in`.
- En la línea 13 faltaba un paréntesis después del `System.out.println`.
- En la línea 14 y 16 faltaban puntos y coma.
- En la línea 17 se usó `Scanner` en lugar de `sc`.
- En la línea 20 se usó `leer` en vez de `sc`.
- En la línea 22 y 25 faltaban puntos y coma.
- En la línea 39 había un error de sintaxis: comas mal ubicadas.
- En la línea 42 había tres signos de igual (`===`) de más.
- En la línea 43, 48, 50 y 52 faltaban puntos y coma.
- En las líneas 49, 51 y 53 faltaba la "t" en `nextLine`.
- En la línea 55 faltaba inicializar la variable `horasProyecto`.
- En las líneas 77, 78 y 79 había errores de sintaxis al declarar variables.
- En la línea 91 solo faltaba importar una clase.
- En las líneas 63, 68 y 73 no había errores de sintaxis, pero se generaba un salto de línea por un `Scanner` comentado con `//`.

---

## 🛠️ ¿Cómo se corrigieron?

- Se agregaron las declaraciones `import java.util.Scanner;` donde faltaban.
- Se corrigieron errores de mayúsculas y minúsculas en nombres sensibles.
- Se agregaron los puntos y coma faltantes al final de las sentencias.
- Se reemplazaron nombres incorrectos de variables y objetos por los correctos (`leer` por `sc`, etc.).
- Se corrigieron estructuras de código mal escritas (paréntesis, signos de igual, etc.).
- Se limpiaron los comentarios que afectaban el flujo del programa.

---

## 📚 Referencias y ayudas consultadas

- Ayuda de compañeros de clase.
- ✅ Utilicé **ChatGPT** para organizar y redactar el archivo `README.md` de forma clara y estructurada, incluyendo emojis y secciones.

---

## 👨‍💻 Autor

Braian Alejandro Marin Montoya
