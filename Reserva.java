import java.util.Date;

public class Reserva {
    private static int nextId = 1;
    
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
}