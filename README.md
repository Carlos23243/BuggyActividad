# BuggyActividad
Descripción

Este repositorio contiene un ejemplo práctico en Java sobre cómo detectar y corregir errores comunes al trabajar con List, Map y Set, además de aplicar buenas prácticas en el manejo de cadenas, validación de datos y duplicados lógicos en colecciones.

Se reorganizó el código en dos clases:

BuggyActividadCorregido.java → contiene el método main y la lógica principal.

Alumno.java → clase modelo con equals, hashCode y toString.

🔎 Problemas corregidos
Error original	Solución aplicada
Índice fuera de rango en ArrayList	Validación de índice antes de acceder
Comparación de cadenas con ==	Uso de .equals()
Sobrescritura en HashMap	Verificación con containsKey()
NullPointerException en valores nulos	Validación previa y operador ternario
Duplicados lógicos en HashSet	Implementación de equals() y hashCode()
