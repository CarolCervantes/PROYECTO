/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

<<<<<<< HEAD

=======
>>>>>>> 2271861ab0ec6047f06121967f4d036459c1848b
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Reserva {
    private static int nextId = 1;
    
<<<<<<< HEAD
    
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
    
   
   
=======
    private final int id;
    private String nombreCliente;
    private String telefonoCliente;
    private Date fechaHora;
    private int cantidadPersonas;
    private Mesa mesa;
    
    public Reserva(String nombreCliente, String telefonoCliente, Date fechaHora, 
                  int cantidadPersonas, Mesa mesa) {
        this.id = nextId++;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.fechaHora = fechaHora;
        this.cantidadPersonas = cantidadPersonas;
        this.mesa = mesa;
    }
    
    // Getters y Setters
    public int getId() { return id; }
    public String getNombreCliente() { return nombreCliente; }
    public void setNombreCliente(String nombre) { this.nombreCliente = nombre; }
    public String getTelefonoCliente() { return telefonoCliente; }
    public void setTelefonoCliente(String telefono) { this.telefonoCliente = telefono; }
    public Date getFechaHora() { return fechaHora; }
    public void setFechaHora(Date fecha) { this.fechaHora = fecha; }
    public int getCantidadPersonas() { return cantidadPersonas; }
    public void setCantidadPersonas(int personas) { this.cantidadPersonas = personas; }
    public Mesa getMesa() { return mesa; }
    public void setMesa(Mesa mesa) { this.mesa = mesa; }
>>>>>>> 2271861ab0ec6047f06121967f4d036459c1848b
}
