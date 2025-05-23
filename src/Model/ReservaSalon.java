/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class ReservaSalon {
    private String cedula;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String invitados;
    private String fecha;
    private String hora;
    private String salon;
    
    
    public ReservaSalon(){
        
    }
    public ReservaSalon(String cedula, String nombre, String apellidos, String email, String telefono, String salon, String fecha, String hora, String invitados) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono= telefono;
        this.invitados = invitados;
        this.fecha = fecha;
        this.hora = hora;
        this.salon = salon;
        
    }
    //Getters
  
     public String getNombre(){ 
        return nombre; 
    
    }
    
    public String getTelefono(){ 
        return telefono; 
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public String getEmail(){
        return email;
    }
    
     public String getFecha(){
        return fecha;
    }
    
      public String getHora(){
        return hora;
    }
      
      public String getCedula(){
        return cedula;
    }  
      
     public String getInvitados(){
        return invitados;
    }  
     
     public String getSalon(){
        return salon;
    } 
     
     // Setters
     public void setCedula(String cedula) {
        this.cedula = cedula;
    } 
     
      public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
      
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    } 
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    } 
    
    public void setEmail(String email) {
        this.email = email;
    } 
    
    public void setInvitados(String invitados) {
        this.invitados = invitados;
    } 
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    } 
    
    public void setHora(String hora) {
        this.hora = hora;
    } 
    
    public void setSalon(String salon) {
        this.salon = salon;
    } 
}
