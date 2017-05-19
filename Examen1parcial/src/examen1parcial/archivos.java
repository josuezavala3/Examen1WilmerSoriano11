/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1parcial;

/**
 *
 * @author HP
 */
public class archivos {
    private String nombre;
    private double tamaño;

    public archivos(String nombre, double tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public archivos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "archivos{" + "nombre=" + nombre + ", tama\u00f1o=" + tamaño + '}';
    }
    
}
