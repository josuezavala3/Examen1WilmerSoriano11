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
public class usuario {

    private String nombre;
    private int edad;
    private String profesion;
    private String username;
    private String contraseña;

    public usuario(String nombre, int edad, String profesion, String username, String contraseña) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.username = username;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "usuario{" + "nombre=" + nombre + ", edad=" + edad + ", profesion=" + profesion + ", username=" + username + ", contrase\u00f1a=" + contraseña + '}';
    }

}
