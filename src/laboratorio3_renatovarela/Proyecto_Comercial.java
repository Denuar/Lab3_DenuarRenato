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
public class Proyecto_Comercial extends Proyectos {
    Object Freelance;

    public Proyecto_Comercial(/*Object Freelance,*/ String nombre, String empresa, String estado, String descripcion, double precio, Date fecha_ini, Date fecha_entrega) {
        super(nombre, empresa, estado, descripcion, precio, fecha_ini, fecha_entrega);
        this.Freelance = Freelance;
    }

    public Proyecto_Comercial(Object Freelance) {
        this.Freelance = Freelance;
    }

    public Proyecto_Comercial() {
    }
    
    

    public Object getFreelance() {
        return Freelance;
    }

    public void setFreelance(Object Freelance) {
        this.Freelance = Freelance;
    }

    @Override
    public String toString() {
        return "Proyecto_Comercial{" + "Freelance=" + Freelance + '}';
    }
    
    
    
    
}
