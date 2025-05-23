/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.MesaDao;
import Model.Mesa;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class MesaController {
     private MesaDao mesaDAO;
     
      public MesaController() {
        this.mesaDAO = new MesaDao();
    }
      
       public List<Mesa> obtenerMesas() {
        return mesaDAO.listarMesas();
    }
       
   public void guardarMesa(Mesa mesa) {
        mesaDAO.guardarMesa(mesa);
    }
   
    
    
    // Cambiar disponibilidad de una mesa
    public void cambiarDisponibilidad(String numero, boolean disponible) {
        List<Mesa> mesas = mesaDAO.listarMesas();
        for (Mesa mesa : mesas) {
            if (mesa.getNumero() == numero) {
                mesa.setDisponible(disponible);
                break;
            }
        }
        mesaDAO.guardarTodas(mesas);
    }
    
    // Buscar una mesa por número
    public Mesa buscarMesa(String numero) {
        for (Mesa m : mesaDAO.listarMesas()) {
            if (m.getNumero() == numero) {
                return m;
            }
        }
        return null;
    }
    
      
}
