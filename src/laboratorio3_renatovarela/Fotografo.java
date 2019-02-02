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
public class Fotografo extends Freelancer {
    String nombre_marca, modelo_camara;
    
     ArrayList<Proyecto_Publicitario> Proyecto_Publi = new ArrayList();

    public Fotografo(String nombre_marca, String modelo_camara, String nombre, String contrasena, String genero, String ciudad, String telefono, int edad, int dinero, String numero_identidad, String correo_Electronica) {
        super(nombre, contrasena, genero, ciudad, telefono, edad, dinero, numero_identidad, correo_Electronica);
        this.nombre_marca = nombre_marca;
        this.modelo_camara = modelo_camara;
    }

    public Fotografo(String nombre_marca, String modelo_camara, String nombre, String contrasena, String genero, String ciudad, String telefono, int edad, int dinero) {
        super(nombre, contrasena, genero, ciudad, telefono, edad, dinero);
        this.nombre_marca = nombre_marca;
        this.modelo_camara = modelo_camara;
    }

    public Fotografo(String nombre_marca, String modelo_camara) {
        this.nombre_marca = nombre_marca;
        this.modelo_camara = modelo_camara;
    }

    public Fotografo() {
    }
     
    ////*-------------------------------------------------
     
     

    public String getNombre_marca() {
        return nombre_marca;
    }

    public void setNombre_marca(String nombre_marca) {
        this.nombre_marca = nombre_marca;
    }

    public String getModelo_camara() {
        return modelo_camara;
    }

    public void setModelo_camara(String modelo_camara) {
        this.modelo_camara = modelo_camara;
    }

    public ArrayList<Proyecto_Publicitario> getProyecto_Publi() {
        return Proyecto_Publi;
    }

    public void setProyecto_Publi(ArrayList<Proyecto_Publicitario> Proyecto_Publi) {
        this.Proyecto_Publi = Proyecto_Publi;
    }
     
     
     
     
    
}
