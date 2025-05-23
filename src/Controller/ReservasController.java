/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ReservasDAO;
import Model.Reserva;
import Model.Session;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class ReservasController {
    private final ReservasDAO reservaDao = new ReservasDAO();
    
     public List<Reserva> obtenerReservas() {
        return reservaDao.listarReservas();
    }
     
      public void cargarReservas(DefaultTableModel modelo){
         List<Reserva> reservas = reservaDao.listarReservas();
         System.out.println("Reservas cargadas: " + reservas.size());
        for (Reserva reserva : reservas) {//Recorre cada objeto reserva dentro de la lista reservas.
            Object[] fila = {//Para cada reserva crea un arreglo de objetos  que contiene los datos que se quieren mostrar 
                //reserva.getId(),
                reserva.getNombreCliente(),
                reserva.getApellidoCliente(),
                reserva.getTelefonoCliente(),
                reserva.getEmail(),
                reserva.getCantidadPersonas(),
                reserva.getFecha(),
                reserva.getHora(),
                reserva.getNumeroMesa()
            };
            modelo.addRow(fila);
        }
    }
      
       public void crearReserva(Reserva reserva) {
        reservaDao.agregarReserva(reserva);
    }

       
    public void cargarReservasPorCliente(DefaultTableModel modelo){
       String emailCliente = Session.clienteActual.getCorreo(); // Para obtener al cliente que inicio sesion

       // Limpiar la tabla antes de cargar
        modelo.setRowCount(0);
         List<Reserva> reservas = reservaDao.listarReservasPorCliente(emailCliente);
         System.out.println("Reservas cargadas: " + reservas.size());
        for (Reserva reserva : reservas) {
            Object[] fila = {
                //reserva.getId(),
                reserva.getNombreCliente(),
                reserva.getApellidoCliente(),
                reserva.getTelefonoCliente(),
                reserva.getEmail(),
                reserva.getCantidadPersonas(),
                reserva.getFecha(),
                reserva.getHora(),
                reserva.getNumeroMesa()
            };
            modelo.addRow(fila);
        }
    }

    public boolean EliminarReserva(String email) {
        return reservaDao.eliminarReservaPorEmail(email);
    }
     
    public boolean modificarReserva(String email, Reserva nuevaReserva) {
    return reservaDao.modificarReservaPorEmail(email, nuevaReserva);
}    
    
    public List<Reserva> buscarReservaPorEmail(String email) {
    return reservaDao.listarReservasPorCliente(email);
}
      public static boolean validarInvitados(String invitados) {
    try {
        int num = Integer.parseInt(invitados);
        return num > 0; 
    } catch (NumberFormatException e) {
        return false;
    }
}
   
   public static boolean validarNombre(String nombre) {
        return nombre.matches("[a-zA-Z ]{2,}");
    }
   
 public static boolean validarApellidos(String apellidos) {
        return apellidos.matches("[a-zA-Z ]{2,}");
    }

  public static boolean validarEmail(String email) {
        return email.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    public static boolean validarCedula(String cedula) {
        return cedula.matches("\\d{6,10}");
    }

    public static boolean validarTelefono(String telefono) {
        return telefono.matches("\\d{7,10}");
    }

}
