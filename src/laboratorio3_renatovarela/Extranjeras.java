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
public class Extranjeras extends Empresas{
    String pais , pagina_web , ciudad;

    public Extranjeras(String pais, String pagina_web, String ciudad, String nombre, String telefono, String correo, String contrasena, String descripcion) {
        super(nombre, telefono, correo, contrasena, descripcion);
        this.pais = pais;
        this.pagina_web = pagina_web;
        this.ciudad = ciudad;
    }

    /*public Extranjeras(String pais, String pagina_web, String ciudad) {
        this.pais = pais;
        this.pagina_web = pagina_web;
        this.ciudad = ciudad;
    }*/

    public Extranjeras() {
    }
    
    

    
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPagina_web() {
        return pagina_web;
    }

    public void setPagina_web(String pagina_web) {
        this.pagina_web = pagina_web;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Extranjeras{" + "pais=" + pais + ", pagina_web=" + pagina_web + ", ciudad=" + ciudad + '}';
    }
    
    
    
    
    
    
    
    
    
}
