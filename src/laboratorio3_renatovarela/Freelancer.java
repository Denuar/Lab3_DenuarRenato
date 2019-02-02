/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3_renatovarela;

import java.util.ArrayList;

public class Freelancer extends Personas {
    String nombre,contrasena,genero,ciudad,telefono;
    int edad,dinero;
    ArrayList<Empresas> empresas = new ArrayList();

    public Freelancer(String nombre, String contrasena, String genero, String ciudad, String telefono, int edad, int dinero, String numero_identidad, String correo_Electronica) {
        super(numero_identidad, correo_Electronica);
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.genero = genero;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.edad = edad;
        this.dinero = dinero;
    }

    
    public Freelancer(String nombre, String contrasena, String genero, String ciudad, String telefono, int edad, int dinero) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.genero = genero;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.edad = edad;
        this.dinero = dinero;
    }

    public Freelancer() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Empresas> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresas> empresas) {
        this.empresas = empresas;
    }

    @Override
    public String toString() {
        return "Freelancer{" + "nombre=" + nombre + ", contrasena=" + contrasena + ", genero=" + genero + ", ciudad=" + ciudad + ", telefono=" + telefono + ", edad=" + edad + ", dinero=" + dinero + ", empresas=" + empresas + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
