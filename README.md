# BuggyActividad
# BuggyActividad – Corrección de Código en Java  

<p align="center">
  <img src="https://img.shields.io/badge/Java-Project-red?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/Estado-Completado-green?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Autor-Carlos%20Arce-orange?style=for-the-badge" />
</p>

##  Descripción  

Este repositorio contiene un **ejemplo práctico en Java** sobre cómo **detectar y corregir errores comunes** al trabajar con `List`, `Map` y `Set`.  
Además, se aplican **buenas prácticas** en:  
- Manejo de cadenas  
- Validación de datos  
- Prevención de errores comunes  
- Detección de duplicados lógicos en colecciones  

---

## Estructura del Proyecto  

- **`BuggyActividadCorregido.java`** → Contiene el método `main` y la lógica principal.  
- **`Alumno.java`** → Clase modelo con implementación de `equals`, `hashCode` y `toString`.  

---

## 🔧 Problemas Corregidos  

|  Error Original |  Solución Aplicada |
|------------------|----------------------|
| Índice fuera de rango en `ArrayList` | Validación de índice antes de acceder |
| Comparación de cadenas con `==` | Uso correcto de `.equals()` |
| Sobrescritura en `HashMap` | Verificación con `containsKey()` |
| `NullPointerException` en valores nulos | Validación previa y operador ternario |
| Duplicados lógicos en `HashSet` | Implementación de `equals()` y `hashCode()` |

---
