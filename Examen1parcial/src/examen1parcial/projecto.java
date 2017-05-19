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
public class projecto {
    private String nombre;
    private ArrayList<String> archivos= new ArrayList();
    private ArrayList<usuario> colaborar= new ArrayList();
    private int comit;

    public projecto(String nombre, int comit) {
        this.nombre = nombre;
        this.comit = comit;
    }

    public projecto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<String> archivos) {
        this.archivos = archivos;
    }

    public ArrayList<usuario> getColaborar() {
        return colaborar;
    }

    public void setColaborar(ArrayList<usuario> colaborar) {
        this.colaborar = colaborar;
    }

    public int getComit() {
        return comit;
    }

    public void setComit(int comit) {
        this.comit = comit;
    }
    
}
