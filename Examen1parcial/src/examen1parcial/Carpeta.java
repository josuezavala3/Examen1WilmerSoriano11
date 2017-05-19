/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1parcial;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Carpeta extends archivos {

    ArrayList<Archivo> archivo = new ArrayList();

    public Carpeta(String nombre, double tamaño) {
        super(nombre, tamaño);
    }

    public Carpeta() {
    }

    public ArrayList<Archivo> getArchivo() {
        return archivo;
    }

    public void setArchivo(ArrayList<Archivo> archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Carpeta{" + "archivo=" + archivo + '}';
    }

}
