/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import java.util.Date;
import java.util.stream.Collectors;

/**
 *
 * @author ASUS
 */
// public class Administrador extend Usuario
<<<<<<< HEAD
public class Administrador extends Usuario{
    
     
     public Administrador(String id, String nombre, String apellidos, String contraseña, String correo, String telefono) {
        super(id, nombre, apellidos, contraseña, correo, telefono);
      
    }
   
    
=======
public class Administrador {
    
   private final Restaurante restaurante;
    
    public Administrador(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
    
    public List<Reserva> obtenerTodasReservas() {
        return restaurante.obtenerTodasReservas();
    }
    
    public boolean cancelarReserva(int idReserva) {
        return restaurante.cancelarReserva(idReserva);
    }
    
    public List<Mesa> consultarDisponibilidadCompleta(Date fecha) {
        return restaurante.getMesas().stream()
            .filter(mesa -> mesa.estaDisponible(fecha))
            .collect(Collectors.toList());
    }
    
    public void agregarMesa(Mesa mesa) {
        restaurante.agregarMesa(mesa);
    }
>>>>>>> 2271861ab0ec6047f06121967f4d036459c1848b
}
