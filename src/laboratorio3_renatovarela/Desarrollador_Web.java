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
public class Desarrollador_Web extends Freelancer {
    String lenguaje_Progra,universidad,idioma;
    ArrayList<proyecto_web> proyectos = new ArrayList();

    
    ///--------------------------------------------------------Constructores
    public Desarrollador_Web(String lenguaje_Progra, String universidad, String idioma, String nombre, String contrasena, String genero, String ciudad, String telefono, int edad, int dinero, String numero_identidad, String correo_Electronica) {
        super(nombre, contrasena, genero, ciudad, telefono, edad, dinero, numero_identidad, correo_Electronica);
        this.lenguaje_Progra = lenguaje_Progra;
        this.universidad = universidad;
        this.idioma = idioma;
    }

    public Desarrollador_Web(String lenguaje_Progra, String universidad, String idioma, String nombre, String contrasena, String genero, String ciudad, String telefono, int edad, int dinero) {
        super(nombre, contrasena, genero, ciudad, telefono, edad, dinero);
        this.lenguaje_Progra = lenguaje_Progra;
        this.universidad = universidad;
        this.idioma = idioma;
    }

    public Desarrollador_Web(String lenguaje_Progra, String universidad, String idioma) {
        this.lenguaje_Progra = lenguaje_Progra;
        this.universidad = universidad;
        this.idioma = idioma;
    }

    public Desarrollador_Web() {
    }
    
    //--------------------------------------------Termina los contructores

    public String getLenguaje_Progra() {
        return lenguaje_Progra;
    }

    public void setLenguaje_Progra(String lenguaje_Progra) {
        this.lenguaje_Progra = lenguaje_Progra;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public ArrayList<proyecto_web> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<proyecto_web> proyectos) {
        this.proyectos = proyectos;
    }

    @Override
    public String toString() {
        return "Desarrollador_Web{" + "lenguaje_Progra=" + lenguaje_Progra + ", universidad=" + universidad + ", idioma=" + idioma + ", proyectos=" + proyectos + '}';
    }

  
    
    
    
    
    
    
    
    
}
