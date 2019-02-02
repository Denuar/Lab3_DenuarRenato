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
public class Proyecto_Publicitario extends Proyectos {
    Object freelance;

    public Proyecto_Publicitario(/*Object freelance,*/ String nombre, String empresa, String estado, String descripcion, double precio, Date fecha_ini, Date fecha_entrega) {
        super(nombre, empresa, estado, descripcion, precio, fecha_ini, fecha_entrega);
        this.freelance = freelance;
    }

    public Proyecto_Publicitario(Object freelance) {
        this.freelance = freelance;
    }

    public Proyecto_Publicitario() {
    }
    
    //*--------------------
    public Object getFreelance() {
        return freelance;
    }

    public void setFreelance(Object freelance) {
        this.freelance = freelance;
    }

    @Override
    public String toString() {
        return "Proyecto_Publicitario{" + "freelance=" + freelance + '}';
    }
    
    
    
    
    
}
