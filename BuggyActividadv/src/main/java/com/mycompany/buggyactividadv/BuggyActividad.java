/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buggyactividadv;

/**
 *
 * @author admin
 */
import java.util.*;



public class BuggyActividad {

    public static void main(String[] args) {

        // LISTA de nombres

        List<String> nombres = new ArrayList<>();

        nombres.add("Ana");

        nombres.add("Luis");

        nombres.add("Ana");



        // Error: índice fuera de rango

        int indice = 2; // último índice válido
        if (indice < nombres.size()) {
            System.out.println("Elemento en posición " + indice + ": " + nombres.get(indice));
        } else {
            System.out.println("Índice fuera de rango");
        }


        // Error: comparación de cadenas con == en lugar de equals

        String buscado = new String("Ana");
        if (buscado.equals("Ana")) {
            System.out.println("Encontrado");
        }



        // MAPA de teléfonos

        Map<String, String> telefonos = new HashMap<>();

        telefonos.put("Ana", "0991111111");

        telefonos.put("Luis", "0992222222");

            if (!telefonos.containsKey("Ana")) {
            telefonos.put("Ana", "0993333333");
        } else {
            System.out.println("Advertencia: 'Ana' ya tiene un número asignado.");
        }



        // Error: obtener clave inexistente sin validación

         String telefono = telefonos.get("Bea");
        System.out.println("Bea: " + (telefono != null ? telefono : "No registrado"));



        // SET de inscritos (debería no permitir duplicados lógicos)

        Set<Alumno> inscritos = new HashSet<>();

        inscritos.add(new Alumno(1, "Ana"));

        inscritos.add(new Alumno(2, "Luis"));

        inscritos.add(new Alumno(1, "Ana")); // duplicado lógico



        System.out.println("Tamaño del Set: " + inscritos.size());

        System.out.println(inscritos);

    }

}





