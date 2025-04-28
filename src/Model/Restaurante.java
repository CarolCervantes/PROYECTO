/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

/**
 *
 * @author ASUS
 */
public class Restaurante {
      
    private final String nombre;
    private final List<Mesa> mesas;
    private final List<Reserva> reservas;
    
    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.mesas = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }
    
    // Operaciones básicas
    public boolean crearReserva(Reserva reserva) {
        if (reserva.getMesa().estaDisponible(reserva.getFechaHora())) {
            return reservas.add(reserva);
        }
        return false;
    }
    
    public List<Reserva> obtenerTodasReservas() {
        return new ArrayList<>(reservas);
    }
    
    public List<Reserva> obtenerReservasCliente(String nombreCliente) {
        return reservas.stream()
            .filter(r -> r.getNombreCliente().equalsIgnoreCase(nombreCliente))
            .collect(Collectors.toList());
    }
    
    public Reserva buscarReservaPorId(int id) {
        return reservas.stream()
            .filter(r -> r.getId() == id)
            .findFirst()
            .orElse(null);
    }
    
    public boolean actualizarReserva(Reserva reservaActualizada) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getId() == reservaActualizada.getId()) {
                reservas.set(i, reservaActualizada);
                return true;
            }
        }
        return false;
    }
    
    public boolean cancelarReserva(int id) {
        return reservas.removeIf(r -> r.getId() == id);
    }
    
    // Gestión de mesas
    public void agregarMesa(Mesa mesa) {
        mesas.add(mesa);
    }
    
    public List<Mesa> buscarMesasDisponibles(Date fecha, int personas, boolean exacto) {
        return mesas.stream()
            .filter(m -> exacto ? m.getCapacidad() == personas : m.getCapacidad() >= personas)
            .filter(m -> m.estaDisponible(fecha))
            .collect(Collectors.toList());
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public List<Mesa> getMesas() { return new ArrayList<>(mesas); }
}
