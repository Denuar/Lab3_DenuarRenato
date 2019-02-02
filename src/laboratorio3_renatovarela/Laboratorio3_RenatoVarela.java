/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3_renatovarela;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Asus Pc
 */
public class Laboratorio3_RenatoVarela {

    /**
     * @param args the command line arguments
     */
    static Connective_Line conective;
    static ArrayList empresa = new ArrayList();
    static ArrayList<Administrador> administrador = new ArrayList();
    static ArrayList proyecto= new ArrayList();
    static ArrayList freelance = new ArrayList();
    static Scanner leer = new Scanner (System.in); 
    static String id, correo, nombre, contraseña, genero, ciudad, universidad, hobbies, nombreMarca, 
            modeloCamara, redSocial, Empresa, estado, descripcion, tel, lenguaje, idioma;
    static int edad, dinero, inicioAdmin=0, inicioEmpresa=0, inicioFree=0;
    static boolean perito=false;
    public static void main(String[] args) {
        // TODO code application logic here
        int cond=1, opcion=0;
        while (cond==1){
            System.out.println("Ingrese \n"
                    + "[1] registrar administrador/freelance/empresa\n"
                    + "[2] LogIng empresa/administrador/freelance\n"
                    + "Se necesita correo y contraseña\n"
                    + "[3] Visualizar los ingresos de la empresa (se necesita LogIn del administrador)\n"
                    + "[4] Modificar datos\n"
                    + "Se necesita inicio de sesion de administrador, freelance y empresas\n"
                    + "[5] Eliminar empresa, administrados ó freelance\n"
                    + "(se necesita correo y contraseña de la empresa a eliminar\n"
                    + "[6] Crear, eliminar y modificar datos de los proyectos\n"
                    + "se necesita LogIn de empresa\n"
                    + "[7] Visualizar proyectos segun su tipo\n"
                    + "Se necesita LogIn de freelance/n"
                    + "[8] Salir");
            opcion=leer.nextInt();
            if (opcion==8){
                cond=0;
            }
        
            switch (opcion){
                case 1://registrar administrador/freelance/empresa
                    System.out.println("Ingrese [1] para registrar administrador\n"
                            + "[2] para freelance\n"
                            + "[3] para empresa: ");
                    opcion=leer.nextInt();
                    Registro(opcion);
                    break;//fin registrar administrador/freelance/empresa

                case 2://LogIng empresa/administrador/freelance
                    login();
                    break;//fin LogIng empresa/administrador/freelance

                case 3: //Visualizar los ingresos de la empresa (se necesita LogIn del administrador)
                    if (inicioAdmin==0){
                        System.out.println("Se necesita Inicio de Sesion de un Administrador");
                    }
                    else{//permite Visualizar los ingresos de la empresa
                        
                    }

                    break;//fin Visualizar los ingresos de la empresa

                case 4://Modificar datos, Se necesita inicio de sesion de administrador, freelance y empresas
                    if (inicioAdmin==1 && inicioEmpresa==1 && inicioFree==1){// Permite Modificar datos
                        
                    }
                    else{
                        System.out.println("Se necesita Inicio de Sesion de un Administrador, un FreeLance y una Empresa");
                    }
                    break;//fin modificar datos

                case 5://Eliminar empresa, administrados ó freelance, se necesita correo y contraseña de la empresa a eliminar
                    Eliminar();
                    break;// fin Eliminar empresa, administrados ó freelance

                case 6://Crear, eliminar y modificar datos de los proyectos, se necesita LogIn de empresa
                    if (inicioEmpresa==0){
                        System.out.println("Se necesita Inicio de Sesion de una Empresa");
                    }
                    else{
                         empresa();
                        //Permite crear, eliminar y modificar todos los datos de los proyectos
                    }
                    break;// fin Crear, eliminar y modificar datos de los proyectos

                case 7://Visualizar proyectos segun su tipo, Se necesita LogIn de freelance");
                    if (inicioFree == 0) {
                        System.out.println("Se necesita Inicio de Sesion de un FreeLance");
                    } else {
                        //Permite visualizar los proyectos según su tipo
                        freelancer();
                    }
                    break;//Visualizar proyectos segun su tipo
            }
        }
    }//fin main
    public static void login() {
        int opcion = 0;
        while (opcion < 1 || opcion > 3) {

            System.out.println("Ingrese una de la siguientes opciones "
                    + "\n1)Administrador "
                    + "\n2)Freelance(desarrollador web, fotografo, disenador grafico, medios audiovisuales , marketing y contador) "
                    + "\n3)Empresas (nacional y extranjera)");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                     if (Acceso(opcion)==1){
                        System.out.println("Administrador registrado correctamente");
                        inicioAdmin=1;
                     }
                    break;
                    
                case 2:
                    if (Acceso(opcion)==1){
                        System.out.println("Freelance registrado correctamente");
                        inicioFree=1;
                     }
                    break;

                case 3:
                    if (Acceso(opcion)==1){
                        System.out.println("Empresa registrada correctamente");
                        inicioEmpresa=1;
                     }
                    break;
            }

        }
    }
     public static int Acceso(int opcion) {
        correo="-1";
        contraseña="-1";
        int estado=0, regreso=0;
        while (estado==0){//mientras usuario y contraseña incorrecta
            if (opcion==1){
                System.out.println("Ingrese correo: ");
                correo=leer.next();
                System.out.println("Ingrese contraseña: ");
                contraseña=leer.next();                
                for (int i = 0; i < administrador.size(); i++) {
                    if (correo.equals(administrador.get(i).getCorreo_Electronica()) && contraseña.equals(administrador.get(i).getContrasena())){
                        estado=1;    
                        regreso=estado;
                    }
                }
            }
            else if (opcion==2){
                System.out.println("Ingrese correo: ");
                correo=leer.next();
                System.out.println("Ingrese contraseña: ");
                contraseña=leer.next();
                for (int i = 0; i < freelance.size(); i++) {//recorrer arreglo freelancer
                    if (freelance.get(i) instanceof Contador){
                        if (correo.equals(((Contador)freelance.get(i)).getCorreo_Electronica()) && contraseña.equals(((Contador)freelance.get(i)).getContrasena())){
                            estado=1;
                            regreso=estado;
                        }
                    }
                    else if (freelance.get(i) instanceof Desarrollador_Web){
                        if (correo.equals(((Desarrollador_Web)freelance.get(i)).getCorreo_Electronica()) && contraseña.equals(((Desarrollador_Web)freelance.get(i)).getContrasena())){
                            estado=1;
                            regreso=estado;
                        }
                    }
                    else if (freelance.get(i) instanceof Diseno_Grafico){
                        if (correo.equals(((Diseno_Grafico)freelance.get(i)).getCorreo_Electronica()) && contraseña.equals(((Diseno_Grafico)freelance.get(i)).getContrasena())){
                            estado=1; 
                            regreso=estado;
                        }
                    }
                    else if (freelance.get(i) instanceof Medios_audiovisuales){
                        if (correo.equals(((Medios_audiovisuales)freelance.get(i)).getCorreo_Electronica()) && contraseña.equals(((Medios_audiovisuales)freelance.get(i)).getContrasena())){
                            estado=1;
                            regreso=estado;
                        }
                    }
                    else if (freelance.get(i) instanceof Marketing){
                        if (correo.equals(((Marketing)freelance.get(i)).getCorreo_Electronica()) && contraseña.equals(((Marketing)freelance.get(i)).getContrasena())){
                            estado=1;
                            regreso=estado;
                        }
                    }
                }//fin recorrer arreglo freelancer
            }
            else if (opcion==3){
                System.out.println("Ingrese correo: ");
                correo=leer.next();
                System.out.println("Ingrese contraseña: ");
                contraseña=leer.next();
                for (int i = 0; i < empresa.size(); i++) {//recorrer arreglo empresar
                    if (empresa.get(i) instanceof Extranjeras){
                        if (correo.equals(((Extranjeras)empresa.get(i)).getCorreo()) && contraseña.equals(((Extranjeras)empresa.get(i)).getContrasena())){
                            estado=1;
                            regreso=estado;
                        }
                    }
                    else if (empresa.get(i) instanceof Nacionales){
                        if (correo.equals(((Nacionales)empresa.get(i)).getCorreo()) && contraseña.equals(((Nacionales)empresa.get(i)).getContrasena())){
                            estado=1;
                            regreso=estado;
                        }
                    }
                }
            }
            if (estado==0){
                System.out.println("Correo ó contraseña Invalida \nIngrese 0 para volver a intentar: ");
                estado=leer.nextInt();
            }
        }//fin mientras usuario y contraseña incorrecta
        return regreso;
    }//fin acceso

    public static void Eliminar() {
        int opcion = 0;
        int posicion = 0;

        while (opcion < 1 && opcion > 3) {

            System.out.println("Ingrese que es lo que desea modificar "
                    + "\n1)Administrador "
                    + "\n2)Freelance(desarrollador web, fotografo, disenador grafico, medios audiovisuales , marketing y contador) "
                    + "\n3)Empresas (nacional y extranjera)"
            );

            opcion = leer.nextInt();
            
            System.out.println("Ingrese la posicion del lo que desea eliminar ");
            posicion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    administrador.remove(posicion);
                    break;
                    
                case 2:
                    freelance.remove(posicion);
                    break;
                    
                    
                case 3:
                    freelance.remove(posicion);
                    break;
            }

        }
    }//fin eliminar
    
    public static void Registro(int opcion){
        int fl;
        switch (opcion){            
            case 1:
                
            case 2:
                System.out.println("Ingrese identidad: ");
                id=leer.next();
                System.out.println("Ingrese correo: ");
                correo = leer.next();
                if (opcion==1){
                    System.out.println("Ingrese nombre de usuario:");
                    nombre=leer.next();
                    System.out.println("Ingrese contraseña: ");
                    contraseña=leer.next();
                    administrador.add(new Administrador(nombre,contraseña,id,correo));
                }
                else if (opcion==2){
                    System.out.println("Ingrese [1] para contador\n"
                            + "[2] para Desarrollador web\n"
                            + "[3] para Desarrrollador Grafico\n"
                            + "[4] para Fotografo\n"
                            + "[5] para Medios Audiovisuales:");
                    fl=leer.nextInt();
                    System.out.println("Ingrese nombre completo: ");
                    nombre=leer.next();
                    System.out.println("Ingrese contraseña:");
                    contraseña=leer.next();
                    System.out.println("Ingrese genero M/F: ");
                    genero=leer.next();
                    System.out.println("Ingrese edad:");
                    edad=leer.nextInt();
                    System.out.println("Ingrese dinero: ");
                    dinero=leer.nextInt();
                    System.out.println("Ingrese numero de telefono: ");
                    tel=leer.next();
                    System.out.println("Ingrese ciudad: ");
                    ciudad=leer.next();
                    switch(fl){
                        case 1://contador
                            System.out.println("Ingrese universiad: ");
                            universidad=leer.next();
                            System.out.println("Ingrese estado de colegio Peritos Mercantiles\n"
                                    + "true, otra palabra para false");
                            String ent=leer.next();
                            ent=ent.toLowerCase();
                            if (ent.equals("true")){
                                perito=true;
                            }
                            System.out.println("Sout Ingrese hobbies (separados por coma): ");
                            hobbies=leer.next();                       
                            freelance.add(new Contador(universidad, hobbies, perito, nombre, contraseña, genero, ciudad, tel, edad, dinero));
                            break;//fin contador
                            
                        case 2://DesarrolladorWeb
                            System.out.println("Ingrese lenguaje de programacion: ");
                            lenguaje = leer.next();
                            System.out.println("Ingrese universidad");
                            universidad=leer.next();
                            System.out.println("Ingrese idioma: ");
                            idioma=leer.next();
                            freelance.add(new Desarrollador_Web(lenguaje,universidad, idioma, nombre, contraseña, genero, ciudad, tel, edad, dinero));
                            break;//fin desarrolladorWeb
                            
                        case 3: //Fotografo
                            System.out.println("Ingrese nombre de marca: ");
                            nombreMarca=leer.next();
                            System.out.println("Ingrese modelo de camara: ");
                            modeloCamara=leer.next();
                            freelance.add(new Fotografo(nombreMarca, modeloCamara, nombre, contraseña, genero, ciudad, tel,edad, dinero));
                            break; //fin fotografo
                        case 4://Medios Audiovisuales
                            System.out.println("Ingrese nombre de marca: ");
                            nombreMarca=leer.next();
                            System.out.println("Ingrese modelo de camara: ");
                            modeloCamara=leer.next();
                            freelance.add(new Medios_audiovisuales(nombreMarca, modeloCamara, nombre, contraseña, genero, ciudad, tel, edad, dinero));
                            break;//fin medios audiovisuales
                    }
                }
                break;
            case 3://registro empresa
                String nombre, telefono, correo,contrasena, descripcion;
                String pais , pagina_web , ciudad;
                String departamento, municipio,mision , vision;

                System.out.println("Ingrese el tipo \n1)Extranjero \n2)Nacionales");
                opcion = leer.nextInt();

                System.out.println("Ingrese el nombre de la empresa");
                nombre = leer.next();

                System.out.println("Ingrese el telefono de la empresa");
                telefono = leer.next();

                System.out.println("Ingrese el correo Electronico de la Empresa");
                correo = leer.next();

                System.out.println("Ingrese la contrasena");
                contrasena = leer.next();

                System.out.println("Ingrese una descripcion");
                descripcion = leer.next();
       
                switch(opcion){           
                    case 1:
                        System.out.println("Ingrese el pais de la empresa");
                        pais = leer.next();

                        System.out.println("Ingrese el nombre de la pagina web");
                        pagina_web = leer.next();

                        System.out.println("Ingrese la ciudad de la empresa");
                        ciudad = leer.next();

                        empresa.add(new Extranjeras(pais,pagina_web,ciudad,nombre, telefono, correo, contrasena, descripcion));
                        break;


                    case 2:
                        System.out.println("Ingrese el departamento donde se ubica la empresa");
                        departamento = leer.next();

                        System.out.println("Ingrese el municipio");
                        municipio = leer.next();


                        System.out.println("Ingrese la ciudad");
                        ciudad = leer.next();

                        System.out.println("Ingreso la mision");
                        mision = leer.next();

                        System.out.println("Ingrese la vision");
                        vision = leer.next();

                        empresa.add(new Nacionales(departamento,municipio,ciudad,mision, vision ,nombre, telefono, correo, contrasena, descripcion));                
                        break;
                }                
            break;//fin registro empresa
        }//fin opciones (empresas nacionales, extranjeras / administradores, freelance)
    }//fin registro
    
    
    
    
 
    
    public static void empresa(){
        int opcion;
        
        
        System.out.println("Ingrese una de las siguientes opciones \n1)Crear Proyecto  \n2)Modificar Proyeto  \n3)Eliminar Proyecto");
        opcion = leer.nextInt();
        
        switch(opcion){
            
            case 1:
                agregarProyecto();
                break;
                
                
            case 2:
                 eliminarProyecto();
                break;
                
                
            case 3:
                 modificarProyecto();
                break;
            
        }
        
    }

    private static void agregarProyecto() {
        String nombre, empresa, estado, descripcion;
        double precio;
        Date fecha_ini=new Date(); 
        int opcion;
        
        System.out.println("Ingrese el tipo de proyeto \n1)Proyecto Web \n2)Proyecto Publicitario \n3)Proyecto comercial");
        opcion = leer.nextInt();

        System.out.println("Ingrese el nombre del Proyecto");
        nombre = leer.next();
        
        System.out.println("Ingrese el precio del proyecto");
        precio = leer.nextInt();
        
        System.out.println("INgrese el nomrbe de la empresa");
        empresa = leer.next();
        
        System.out.println("Ingrese el estado del proyecto");
        estado = leer.next();
        
        System.out.println(" Ingrese la descripcion del proyecto");
        descripcion = leer.next();
        Date fecha_entrega=new Date();
        switch(opcion){
            case 1:
                proyecto.add(new proyecto_web(nombre, empresa,estado,descripcion,precio,fecha_ini,fecha_entrega));
              
                break;
                
                
             case 2:
                 
                  proyecto.add(new Proyecto_Comercial(nombre, empresa,estado,descripcion,precio,new Date(),new Date()));
                
                break;
                
                
                 case 3:
                proyecto.add(new Proyecto_Publicitario(nombre, empresa,estado,descripcion,precio,new Date(),new Date()));
                break;
               
            
            
        }
        
        
        
        
        /*******------------------------------Agrega el proyecto al freeelancer   **********************/
        
        
      
        
        
        
        
        
        
        
        
          

    }

    private static void eliminarProyecto() {
        
        int posicion;
        
        System.out.println("Ingrese la posicion que desea eliminar");
        posicion = leer.nextInt();
     
        
        proyecto.remove(posicion);
     
    }

    private static void modificarProyecto() {
       
    }
    
    
    
    public static void freelancer(){
        
        
        /*
         static ArrayList<Desarrollador_Web> desarrollo_web = new ArrayList();
    static ArrayList<Diseno_Grafico> disenador = new ArrayList();
    static ArrayList<Fotografo> fotografo = new ArrayList();
    static ArrayList<Medios_audiovisuales> medios = new ArrayList() ;
     static ArrayList<Marketing> Marketing = new ArrayList() ;
        
        
        */
        
        String proye;
        
        proye = proyecto.getClass().getSimpleName();
        for (int i = 0; i < proyecto.size(); i++) {
            
            if (proye.equals("proyecto_web")) {
                ((Desarrollador_Web)freelance.get(i)).getProyectos().add((proyecto_web)freelance.get(i));
            }
            
            if (proye.equals("Proyecto_Comercial")) {
                ((Marketing)freelance.get(i)).getMarketing().add((Proyecto_Comercial)freelance.get(i));
                ((Contador)freelance.get(i)).getProyecto_c().add((Proyecto_Comercial)freelance.get(i));
              
                
            }
            
            if (proye.equals("Proyecto_Publicitario")) {
                ((Diseno_Grafico)freelance.get(i)).getProyecto_Publi().add((Proyecto_Publicitario)freelance.get(i));
                ((Medios_audiovisuales)freelance.get(i)).getProyecto_publi().add((Proyecto_Publicitario)freelance.get(i));
                ((Fotografo)freelance.get(i)).getProyecto_Publi().add((Proyecto_Publicitario)freelance.get(i));
                
                
                
                
            }
}
       
        /**
         * ---------Imprime los Proyetcs
         */
        for (int i = 0; i < proyecto.size(); i++) {

            if (proye.equals("proyecto_web")) {
                System.out.println(proyecto.get(i));
            }

            if (proye.equals("Proyecto_Comercial")) {
                System.out.println(proyecto.get(i));

            }

            if (proye.equals("Proyecto_Publicitario")) {
                System.out.println(proyecto.get(i));

            }
        }

    }

}
