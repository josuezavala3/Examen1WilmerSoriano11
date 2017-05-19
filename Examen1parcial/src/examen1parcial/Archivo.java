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
public class Archivo extends archivos{

    private String contenido;

    public Archivo(String contenido, String nombre, double tamaño) {
        super(nombre, tamaño);
        this.contenido = contenido;
    }

    public Archivo() {
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Archivo{" + "contenido=" + contenido + '}';
    }

    

}
