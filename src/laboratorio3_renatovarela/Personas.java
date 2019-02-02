/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3_renatovarela;

/**
 *
 * @author Asus Pc
 */
public class Personas  {
    String numero_identidad , correo_Electronica;

    public Personas(String numero_identidad, String correo_Electronica) {
        this.numero_identidad = numero_identidad;
        this.correo_Electronica = correo_Electronica;
    }

    public Personas() {
    }

    public String getNumero_identidad() {
        return numero_identidad;
    }

    public void setNumero_identidad(String numero_identidad) {
        this.numero_identidad = numero_identidad;
    }

    public String getCorreo_Electronica() {
        return correo_Electronica;
    }

    public void setCorreo_Electronica(String correo_Electronica) {
        this.correo_Electronica = correo_Electronica;
    }

    @Override
    public String toString() {
        return "Personas{" + "numero_identidad=" + numero_identidad + ", correo_Electronica=" + correo_Electronica + '}';
    }
    
    
    
    
}
