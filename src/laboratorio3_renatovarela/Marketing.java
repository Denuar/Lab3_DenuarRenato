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
public class Marketing extends Freelancer{
    String red_social;
     ArrayList<Proyecto_Comercial> marketing = new ArrayList();

    public Marketing(String red_social, String nombre, String contrasena, String genero, String ciudad, String telefono, int edad, int dinero, String numero_identidad, String correo_Electronica) {
        super(nombre, contrasena, genero, ciudad, telefono, edad, dinero, numero_identidad, correo_Electronica);
        this.red_social = red_social;
    }

    public Marketing(String red_social, String nombre, String contrasena, String genero, String ciudad, String telefono, int edad, int dinero) {
        super(nombre, contrasena, genero, ciudad, telefono, edad, dinero);
        this.red_social = red_social;
    }

    public Marketing(String red_social) {
        this.red_social = red_social;
    }

    public Marketing() {
    }
    
     ////*-----------------------------

    public String getRed_social() {
        return red_social;
    }

    public void setRed_social(String red_social) {
        this.red_social = red_social;
    }

    public ArrayList<Proyecto_Comercial> getMarketing() {
        return marketing;
    }

    public void setMarketing(ArrayList<Proyecto_Comercial> marketing) {
        this.marketing = marketing;
    }

    @Override
    public String toString() {
        return "Marketing{" + "red_social=" + red_social + ", marketing=" + marketing + '}';
    }
    
    
    
    
    
    
    
     
}
