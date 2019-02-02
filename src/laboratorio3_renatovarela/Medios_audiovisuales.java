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
public class Medios_audiovisuales extends Freelancer {
    String marca , modelo;
     ArrayList<Proyecto_Publicitario> Proyecto_publi = new ArrayList();

    public Medios_audiovisuales(String marca, String modelo, String nombre, String contrasena, String genero, String ciudad, String telefono, int edad, int dinero, String numero_identidad, String correo_Electronica) {
        super(nombre, contrasena, genero, ciudad, telefono, edad, dinero, numero_identidad, correo_Electronica);
        this.marca = marca;
        this.modelo = modelo;
    }

    public Medios_audiovisuales(String marca, String modelo, String nombre, String contrasena, String genero, String ciudad, String telefono, int edad, int dinero) {
        super(nombre, contrasena, genero, ciudad, telefono, edad, dinero);
        this.marca = marca;
        this.modelo = modelo;
    }

    public Medios_audiovisuales(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Medios_audiovisuales() {
    }
     
     ///*------------------------

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Proyecto_Publicitario> getProyecto_publi() {
        return Proyecto_publi;
    }

    public void setProyecto_publi(ArrayList<Proyecto_Publicitario> Proyecto_publi) {
        this.Proyecto_publi = Proyecto_publi;
    }

    @Override
    public String toString() {
        return "Medios_audiovisuales{" + "marca=" + marca + ", modelo=" + modelo + ", Proyecto_publi=" + Proyecto_publi + '}';
    }
    
    
     
    
}
