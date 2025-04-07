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
     private final int numero;
    private final int capacidad;
    private final String ubicacion;
    
    public Mesa(int numero, int capacidad, String ubicacion) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
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
    public String getUbicacion() { 
        return ubicacion; 
    }
}
