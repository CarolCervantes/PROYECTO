/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ReservaSalonDAO;
import Model.ReservaSalon;
import Model.Session;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class SalonesController {
    private final ReservaSalonDAO reservaSalonDao = new ReservaSalonDAO();
    
     public List<ReservaSalon> obtenerReservaSalon() {
        return reservaSalonDao.listarReservaSalones();
    }
      
      public void cargarReservas(DefaultTableModel modelo){
         List<ReservaSalon> reservas = reservaSalonDao.listarReservaSalones();
         System.out.println("Reservas cargadas: " + reservas.size());
        for (ReservaSalon reserva : reservas) {
            Object[] fila = {
                reserva.getSalon(),
                reserva.getNombre(),
                reserva.getApellidos(),
                reserva.getCedula(),
                reserva.getEmail(),
                reserva.getTelefono(),
                reserva.getInvitados(),
                reserva.getFecha(),
                reserva.getHora(),
              
            };
            modelo.addRow(fila);
        }
    }
     
       public void crearReserva(ReservaSalon reserva) {
        reservaSalonDao.agregarReserva(reserva);
    }
    
        public boolean EliminarReserva(String cedula) {
        return reservaSalonDao.eliminarReservaPorCedula(cedula);
    }
     
    public boolean modificarReserva(String cedula, ReservaSalon nuevaReserva) {
    return reservaSalonDao.modificarReservaPorCedula(cedula, nuevaReserva);
}    
    
    public List<ReservaSalon> buscarReservaPorCedula(String cedula) {
    return reservaSalonDao.listarReservasPorCedula(cedula);
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
