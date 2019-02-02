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
public class Ingresos {
    Object empresa;
    Object freelance;
    double dinero;
    ArrayList<Double> Ingresos = new ArrayList();

    public Ingresos(Object empresa, Object freelance, double dinero) {
        this.empresa = empresa;
        this.freelance = freelance;
        this.dinero = dinero;
    }

    public Ingresos() {
    }

    public Object getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Object empresa) {
        this.empresa = empresa;
    }

    public Object getFreelance() {
        return freelance;
    }

    public void setFreelance(Object freelance) {
        this.freelance = freelance;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Double> getIngresos() {
        return Ingresos;
    }

    public void setIngresos(ArrayList<Double> Ingresos) {
        this.Ingresos = Ingresos;
    }

    @Override
    public String toString() {
        return "Ingresos{" + "empresa=" + empresa + ", freelance=" + freelance + /*" dinero=" + dinero +*/ ", Ingresos=" + Ingresos + '}';
    }
    
    

    
    
    
    
    
}
