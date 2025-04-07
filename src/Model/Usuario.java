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
    private String user;
    private String nombre;
    private String apellidos;
    private String contraseña;
    private String correo;
    private String tipo;
    private String telefono;
           
    public Usuario(String user, String nombre, String apellidos, String contraseña, String correo, String tipo, String telefono){
        this.user = user;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.correo = correo;
        this.tipo = tipo;
        this.telefono = telefono;
        
    }
    
    public String getUser(){
        return user;
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

    public String getTipo() {
        return tipo;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void MostrarInfo(){
        
    }
}
