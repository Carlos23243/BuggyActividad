/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buggyactividadv;

/**
 *
 * @author admin
 */
import java.util.Objects;

public class Alumno {
    int id;
    String nombre;

    public Alumno(int id, String nombre) { 
        this.id = id; 
        this.nombre = nombre; 
    }

    // toString para mostrar objetos
    @Override
    public String toString() {
        return "Alumno{id=" + id + ", nombre='" + nombre + "'}";
    }

    // equals y hashCode para evitar duplicados en HashSet
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;
        Alumno a = (Alumno) o;
        return id == a.id && Objects.equals(nombre, a.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }
}