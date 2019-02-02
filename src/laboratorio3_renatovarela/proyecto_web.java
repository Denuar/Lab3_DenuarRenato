/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3_renatovarela;

import java.util.Date;

/**
 *
 * @author Asus Pc
 */
public class proyecto_web extends Proyectos{
    Desarrollador_Web desarrollado_web;

    public proyecto_web(/*Desarrollador_Web desarrollado_web,*/ String nombre, String empresa, String estado, String descripcion, double precio, Date fecha_ini, Date fecha_entrega) {
        super(nombre, empresa, estado, descripcion, precio, fecha_ini, fecha_entrega);
        this.desarrollado_web = desarrollado_web;
    }

    public proyecto_web(Desarrollador_Web desarrollado_web) {
        this.desarrollado_web = desarrollado_web;
    }

    public proyecto_web() {
    }
    
    //*---------------

    public Desarrollador_Web getDesarrollado_web() {
        return desarrollado_web;
    }

    public void setDesarrollado_web(Desarrollador_Web desarrollado_web) {
        this.desarrollado_web = desarrollado_web;
    }

    @Override
    public String toString() {
        return "proyecto_web{" + "desarrollado_web=" + desarrollado_web + '}';
    }
    
    
    
    
}
