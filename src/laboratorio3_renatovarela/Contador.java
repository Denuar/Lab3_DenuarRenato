/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3_renatovarela;

import java.util.ArrayList;

/**
 *
 * @author Asus Pc
 */
public class Contador extends Freelancer {
    String universidad, hobbies;
    boolean  perito; 
    ArrayList<Proyecto_Comercial> proyecto_c = new ArrayList();

    public Contador(String universidad, String hobbies, boolean perito, String nombre, String contrasena, String genero, String ciudad, String telefono, int edad, int dinero, String numero_identidad, String correo_Electronica) {
        super(nombre, contrasena, genero, ciudad, telefono, edad, dinero, numero_identidad, correo_Electronica);
        this.universidad = universidad;
        this.hobbies = hobbies;
        this.perito = perito;
    }

    public Contador(String universidad, String hobbies, boolean perito, String nombre, String contrasena, String genero, String ciudad, String telefono, int edad, int dinero) {
        super(nombre, contrasena, genero, ciudad, telefono, edad, dinero);
        this.universidad = universidad;
        this.hobbies = hobbies;
        this.perito = perito;
    }

    public Contador(String universidad, String hobbies, boolean perito) {
        this.universidad = universidad;
        this.hobbies = hobbies;
        this.perito = perito;
    }

    public Contador() {
    }
    
    ////*----------------------------------

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public boolean isPerito() {
        return perito;
    }

    public void setPerito(boolean perito) {
        this.perito = perito;
    }

    public ArrayList<Proyecto_Comercial> getProyecto_c() {
        return proyecto_c;
    }

    public void setProyecto_c(ArrayList<Proyecto_Comercial> proyecto_c) {
        this.proyecto_c = proyecto_c;
    }

    @Override
    public String toString() {
        return "Contador{" + "universidad=" + universidad + ", hobbies=" + hobbies + ", perito=" + perito + ", proyecto_c=" + proyecto_c + '}';
    }
    
    
    
    
    
    
    
    
    
}
