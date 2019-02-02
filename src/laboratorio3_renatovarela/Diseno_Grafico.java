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
public class Diseno_Grafico extends Freelancer {
    String universidad, hobbies;
    ArrayList<Proyecto_Publicitario> Proyecto_Publi = new ArrayList();

    ////*------------------------------------------------------
    public Diseno_Grafico(String universidad, String hobbies, String nombre, String contrasena, String genero, String ciudad, String telefono, int edad, int dinero, String numero_identidad, String correo_Electronica) {
        super(nombre, contrasena, genero, ciudad, telefono, edad, dinero, numero_identidad, correo_Electronica);
        this.universidad = universidad;
        this.hobbies = hobbies;
    }

    public Diseno_Grafico(String universidad, String hobbies, String nombre, String contrasena, String genero, String ciudad, String telefono, int edad, int dinero) {
        super(nombre, contrasena, genero, ciudad, telefono, edad, dinero);
        this.universidad = universidad;
        this.hobbies = hobbies;
    }

    public Diseno_Grafico(String universidad, String hobbies) {
        this.universidad = universidad;
        this.hobbies = hobbies;
    }

    public Diseno_Grafico() {
    }
    
    ////*---------------------------------------------------------

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

    public ArrayList<Proyecto_Publicitario> getProyecto_Publi() {
        return Proyecto_Publi;
    }

    public void setProyecto_Publi(ArrayList<Proyecto_Publicitario> Proyecto_Publi) {
        this.Proyecto_Publi = Proyecto_Publi;
    }

    @Override
    public String toString() {
        return "Diseno_Grafico{" + "universidad=" + universidad + ", hobbies=" + hobbies + ", Proyecto_Publi=" + Proyecto_Publi + '}';
    }
    
    
    
    
    
    
    
}
