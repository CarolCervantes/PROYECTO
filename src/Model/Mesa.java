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
<<<<<<< HEAD
   private String numero;
   private int capacidad;
   private String descripcion;
   private boolean disponible;
   
       
    public Mesa(String numero, int capacidad, boolean disponible, String descripcion) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.disponible= disponible;
       this.descripcion = descripcion;
=======
     private final int numero;
    private final int capacidad;
    private final String ubicacion;
    
    public Mesa(int numero, int capacidad, String ubicacion) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
>>>>>>> 2271861ab0ec6047f06121967f4d036459c1848b
    }
    
    public boolean estaDisponible(Date fecha) {
        // Implementación real verificaría reservas existentes
        return true;
    }
    
    // Getters
<<<<<<< HEAD
    public String getNumero(){ 
=======
    public int getNumero(){ 
>>>>>>> 2271861ab0ec6047f06121967f4d036459c1848b
        return numero; 
    }
    public int getCapacidad(){ 
        return capacidad; 
    
    }
<<<<<<< HEAD
    
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
=======
    public String getUbicacion() { 
        return ubicacion; 
>>>>>>> 2271861ab0ec6047f06121967f4d036459c1848b
    }
}
