import java.util.*;
import java.util.stream.Collectors;

public class Cliente {
    private final String nombre;
    private final String telefono;
    private final Restaurante restaurante;
    
    public Cliente(String nombre, String telefono, Restaurante restaurante) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.restaurante = restaurante;
    }
    
    public Reserva crearReserva(Date fecha, int personas, int numeroMesa) throws Exception {
        List<Mesa> mesasDisponibles = restaurante.buscarMesasDisponibles(fecha, personas, true);
        
        Mesa mesaSeleccionada = mesasDisponibles.stream()
            .filter(m -> m.getNumero() == numeroMesa)
            .findFirst()
            .orElseThrow(() -> new Exception("Mesa no disponible"));
        
        Reserva nuevaReserva = new Reserva(nombre, telefono, fecha, personas, mesaSeleccionada);
        
        if (!restaurante.crearReserva(nuevaReserva)) {
            throw new Exception("No se pudo crear la reserva");
        }
        
        return nuevaReserva;
    }
    
    public List<Reserva> obtenerMisReservas() {
        return restaurante.obtenerReservasCliente(nombre);
    }
    
    public Reserva modificarReserva(int idReserva, Date nuevaFecha, int nuevasPersonas) throws Exception {
        Reserva reserva = validarReservaPropia(idReserva);
        
        List<Mesa> mesasDisponibles = restaurante.buscarMesasDisponibles(nuevaFecha, nuevasPersonas, true);
        if (mesasDisponibles.isEmpty()) {
            throw new Exception("No hay mesas disponibles");
        }
        
        reserva.setFechaHora(nuevaFecha);
        reserva.setCantidadPersonas(nuevasPersonas);
        reserva.setMesa(mesasDisponibles.get(0));
        
        if (!restaurante.actualizarReserva(reserva)) {
            throw new Exception("Error al actualizar reserva");
        }
        
        return reserva;
    }
    
    public boolean cancelarReserva(int idReserva) throws Exception {
        validarReservaPropia(idReserva);
        return restaurante.cancelarReserva(idReserva);
    }
    
    public List<Mesa> consultarMesasDisponibles(Date fecha, int personas) {
        return restaurante.buscarMesasDisponibles(fecha, personas, true);
    }
    
    private Reserva validarReservaPropia(int idReserva) throws Exception {
        Reserva reserva = restaurante.buscarReservaPorId(idReserva);
        if (reserva == null || !reserva.getNombreCliente().equals(nombre)) {
            throw new Exception("Reserva no encontrada o no pertenece al cliente");
        }
        return reserva;
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
}