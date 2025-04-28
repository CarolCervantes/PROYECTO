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
   private int numero;
   private int capacidad;
   private boolean disponible;
   
       
    public Mesa(int numero, int capacidad, boolean disponible) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.disponible= disponible;
       
    }
    
    public boolean estaDisponible(Date fecha) {
        // Implementación real verificaría reservas existentes
        return true;
    }
    
    // Getters
    public int getNumero(){ 
        return numero; 
    }
    public int getCapacidad(){ 
        return capacidad; 
    
    }
    
    public boolean getDisponible(){
        return disponible;
    }
   
}
