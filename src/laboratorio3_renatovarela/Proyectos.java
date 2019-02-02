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
public class Proyectos {
    String nombre, empresa , estado, descripcion;
    double precio;
    Date fecha_ini , fecha_entrega;

    public Proyectos(String nombre, String empresa, String estado, String descripcion, double precio, Date fecha_ini, Date fecha_entrega) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.estado = estado;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha_ini = fecha_ini;
        this.fecha_entrega = fecha_entrega;
    }

    public Proyectos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(Date fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    @Override
    public String toString() {
        return "Proyectos{" + "nombre=" + nombre + ", empresa=" + empresa + ", estado=" + estado + ", descripcion=" + descripcion + ", precio=" + precio + ", fecha_ini=" + fecha_ini + ", fecha_entrega=" + fecha_entrega + '}';
    }
    
    
    
}
