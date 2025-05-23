/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Reserva {
    private static int nextId = 1;
    
    
    private String nombreCliente;
    private String apellidoCliente;
    private String telefonoCliente;
    private String emailCliente;
    private String fecha;
    private String hora;
    private int cantidadPersonas;
    private String numeroMesa;
    
    public Reserva(){
        
    }
    
    public Reserva( String nombreCliente, String apellidoCliente, String hora, int cantidadPersonas, String numeroMesa, String fecha, String telefonoCliente, String emailCliente) {
        
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.telefonoCliente = telefonoCliente;
        this.emailCliente = emailCliente;
        this.fecha = fecha;
        this.hora = hora;
        this.cantidadPersonas = cantidadPersonas;
        this.numeroMesa = numeroMesa;
    }  
     public String getNumeroMesa(){ 
        return numeroMesa; 
    }
    public String getNombreCliente(){ 
        return nombreCliente; 
    
    }
    
    public String getTelefonoCliente(){ 
        return telefonoCliente; 
    }
    
    public String getApellidoCliente(){
        return apellidoCliente;
    }
    
    public String getEmail(){
        return emailCliente;
    }
    
     public String getFecha(){
        return fecha;
    }
    
      public String getHora(){
        return hora;
    }
      
     public int getCantidadPersonas(){ 
        return cantidadPersonas; 
    }
     
    //Setters
     
     
      public void setNombre(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    } 
      
    public void setApellidos(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    } 
    
    public void setTelefono(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    } 
    
    public void setEmail(String emailCliente) {
        this.emailCliente = emailCliente;
    } 
    
    public void setInvitados(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    } 
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    } 
    
    public void setHora(String hora) {
        this.hora = hora;
    } 
    
    public void setMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    } 
    
   
   
}
