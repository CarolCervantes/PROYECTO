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
public class Mesa {
   private String numero;
   private int capacidad;
   private String descripcion;
   private boolean disponible;
   
       
    public Mesa(String numero, int capacidad, boolean disponible, String descripcion) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.disponible= disponible;
       this.descripcion = descripcion;
    }
    
    public boolean estaDisponible(Date fecha) {
        // Implementación real verificaría reservas existentes
        return true;
    }
    
    // Getters
    public String getNumero(){ 
        return numero; 
    }
    public int getCapacidad(){ 
        return capacidad; 
    
    }
    
    public boolean getDisponible(){
        return disponible;
    }
    
     public String getDescripcion(){ 
        return descripcion; 
    
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
