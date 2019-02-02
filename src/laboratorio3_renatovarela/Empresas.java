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
public class Empresas {
    String nombre, telefono, correo,contrasena, descripcion;
    ArrayList<Proyectos> Proyecto = new ArrayList();
    
    

    public Empresas(String nombre, String telefono, String correo, String contrasena, String descripcion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
        this.descripcion = descripcion;
    }

    public Empresas() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Proyectos> getProyecto() {
        return Proyecto;
    }

    public void setProyecto(ArrayList<Proyectos> Proyecto) {
        this.Proyecto = Proyecto;
    }

    @Override
    public String toString() {
        return "Empresas{" + "nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + ", contrasena=" + contrasena + ", descripcion=" + descripcion + ", Proyecto=" + Proyecto + '}';
    }
    
    
    
    
    
    
}
