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
    private String id;
    private String nombre;
    private String apellidos;
    private String contraseña;
    private String correo;
    private String telefono;
    //
           
    public Usuario(String id, String nombre, String apellidos, String contraseña, String correo,String telefono){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.correo = correo;
        this.telefono = telefono;
        
    }
    public Usuario() {
    
    }

    
    public String getId(){
        return id;
    }
    
    
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

   
    public String getTelefono(){
        return telefono;
    }
    
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
    
}
