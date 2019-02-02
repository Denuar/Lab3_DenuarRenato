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
public class Administrador extends Personas{
    String usuario,contrasena;

    public Administrador(String usuario, String contrasena, String numero_identidad, String correo_Electronica) {
        super(numero_identidad, correo_Electronica);
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public Administrador(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }


    @Override
    public String toString() {
        return "Administrador{" + "usuario=" + usuario + ", contrasena=" + contrasena +'}';
    }
    
    
    
}
