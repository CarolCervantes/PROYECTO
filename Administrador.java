import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
}