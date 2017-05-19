package examen1parcial;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Examen1parcial {

    static ArrayList<archivos> projectos = new ArrayList();

    public static void main(String[] args) {
        char r = 's';
        ArrayList<usuario> listaus = new ArrayList();
        while (r == 's' || r == 'S') {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Registrar usuario \n"
                    + "2. Modificar usuario \n"
                    + "3. Eliminar usuario \n"
                    + "4. Listar usuarios \n"
                    + "5. Log in"));
            if (opcion == 1) {
                String nombre = JOptionPane.showInputDialog("Nombre De usuario");
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
                String profecion = JOptionPane.showInputDialog("Profecion");
                String user = JOptionPane.showInputDialog("Username");
                String contraseña = JOptionPane.showInputDialog("Contraseña");
                listaus.add(new usuario(nombre, edad, profecion, user, contraseña));
            } else if (opcion == 2) {
                String nombre = "";
                int sele = 0;
                for (usuario t : listaus) {
                    nombre += sele + ". Nombre:   " + t.getNombre() + "   - Username:  " + t.getUsername() + "\n";
                }
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Seleccione Usuario A Modificar \n \n"
                        + nombre));
                String nuevous = JOptionPane.showInputDialog("Nuevo user");
                String contraseña = JOptionPane.showInputDialog("Nueva contraseña");
                listaus.get(numero).setUsername(nuevous);
                listaus.get(numero).setContraseña(contraseña);
            } else if (opcion == 3) {
                String nombre = "";
                int sele = 0;
                for (usuario t : listaus) {
                    nombre += sele + ". Nombre:  " + t.getNombre() + "   - Username:  " + t.getUsername() + " " + "\n";
                }
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Seleccione Usuario A Eliminar \n \n"
                        + nombre));
                listaus.remove(numero);
            } else if (opcion == 4) {
                String nombre = "";
                int sele = 0;
                for (usuario t : listaus) {
                    nombre += sele + ". Nombre:  " + t.getNombre() + "   - Username:  " + t.getUsername() + " " + "\n";
                }

                JOptionPane.showMessageDialog(null, "Usuarios \n \n" + nombre);
            } else if (opcion == 5) {
                boolean hola = true;
                String salio = "ta";
                while (hola) {
                    String username = JOptionPane.showInputDialog("Username");
                    String Contraseña = JOptionPane.showInputDialog("Contraseña");
                    for (usuario t : listaus) {
                        if (t.getUsername().equals(username) && t.getContraseña().equals(Contraseña)) {
                            hola = false;
                        }
                    }
                    if (hola == true) {
                        JOptionPane.showMessageDialog(null, "Contraseña Incorrecta o usuario");
                    }
                    String holas = salio = JOptionPane.showInputDialog("Desea volver al menu (n/s)");
                    if (holas.equalsIgnoreCase("s")) {
                        salio = "si";
                        hola = false;
                    }
                }
                if (salio.equalsIgnoreCase("s")) {

                } else if (hola == false) {
                    boolean entro = true;
                    while (entro) {
                        int seleccion = Integer.parseInt(JOptionPane.showInputDialog("1. Listar projectos \n"
                                + "2. Crear Projecto \n"
                                + "3. Modificar Projecto \n"
                                + "4. Eliminar Projecto \n"
                                + "5. Log Out"));
                        if (seleccion == 1) {

                        } else if (seleccion == 2) {

                        } else if (seleccion == 3) {
                            boolean entro2 = true;
                            while (entro2) {
                                int seleccion2 = Integer.parseInt(JOptionPane.showInputDialog("1. Listar archivos \n"
                                        + "2. Crear Archivo \n"
                                        + "3. Modificar Archivo \n"
                                        + "4. Eliminar Archivo \n"
                                        + "5. Ingresar comando"
                                        + "5. Volver"));
                                if (seleccion2 == 1) {
                                    int seleccio = Integer.parseInt(JOptionPane.showInputDialog("1. Crear archivos de texto  \n"
                                            + "2. Crear Carpeta \n"
                                    ));
                                    if (seleccio == 1) {
                                        String nombres = JOptionPane.showInputDialog(JOptionPane.showInputDialog("Nombre"));
                                        double doble = Double.parseDouble(JOptionPane.showInputDialog("Tamaño"));
                                        String contenido = JOptionPane.showInputDialog(JOptionPane.showInputDialog("Nombre"));
                                        projectos.add(new Archivo(contenido, nombres, doble));
                                    } else if (seleccio == 2) {
                                        String nombres = JOptionPane.showInputDialog(JOptionPane.showInputDialog("Nombre"));
                                        double doble = Double.parseDouble(JOptionPane.showInputDialog("Tamaño"));
                                        projectos.add(Carpeta());

                                    }
                                } else if (seleccion2 == 2) {

                                } else if (seleccion2 == 3) {

                                } else if (seleccion2 == 4) {

                                } else if (seleccion2 == 5) {
                                    entro2 = false;
                                }
                            }
                        } else if (seleccion == 4) {

                        } else if (seleccion == 5) {
                            entro = false;
                        }
                    }

                }
            } else {

            }
        }

    }
}
