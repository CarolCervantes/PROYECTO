/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class Usuario {
<<<<<<< HEAD
    private String id;
=======
    private String user;
>>>>>>> 2271861ab0ec6047f06121967f4d036459c1848b
    private String nombre;
    private String apellidos;
    private String contraseña;
    private String correo;
<<<<<<< HEAD
    private String telefono;
    //
           
    public Usuario(String id, String nombre, String apellidos, String contraseña, String correo,String telefono){
=======
    private String tipo;
    private String telefono;
           
    public Usuario(String user, String nombre, String apellidos, String contraseña, String correo, String tipo, String telefono){
        this.user = user;
>>>>>>> 2271861ab0ec6047f06121967f4d036459c1848b
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.correo = correo;
<<<<<<< HEAD
        this.telefono = telefono;
        
    }
    public Usuario() {
    
    }

    
    public String getId(){
        return id;
    }
    
=======
        this.tipo = tipo;
        this.telefono = telefono;
        
    }
    
    public String getUser(){
        return user;
    }
>>>>>>> 2271861ab0ec6047f06121967f4d036459c1848b
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

<<<<<<< HEAD
   
=======
    public String getTipo() {
        return tipo;
    }
    
>>>>>>> 2271861ab0ec6047f06121967f4d036459c1848b
    public String getTelefono(){
        return telefono;
    }
    
<<<<<<< HEAD
     public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
=======
    public void MostrarInfo(){
        
    }
>>>>>>> 2271861ab0ec6047f06121967f4d036459c1848b
}
