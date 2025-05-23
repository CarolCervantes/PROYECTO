/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import Model.Reserva;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ASUS
 */
public class ReservasDAO {
    private final String archivo = "C:\\Users\\ASUS\\Documents\\MARIA PAULINA\\ProyectoAula\\src\\Data\\Reservas.json";
    private final Gson gson = new Gson();

    
      private List<Reserva> cargarReservas() {
       List<Reserva> reservas = new ArrayList<>();
    try (Reader reader = new FileReader(archivo)) {
        Type listType = new TypeToken<List<Reserva>>() {}.getType();
        List<Reserva> cargadas = new Gson().fromJson(reader, listType);
        if (cargadas != null) {
            reservas.addAll(cargadas);
        }
    } catch (FileNotFoundException e) {
        System.out.println("Archivo de reservas no encontrado. Se creará uno nuevo.");
    } catch (IOException e) {
        e.printStackTrace();
    }
    return reservas;
    }
      
      public void guardarReservas(List<Reserva> reservas) {
        try (Writer writer = new FileWriter(archivo)) {
            Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .setDateFormat("yyyy-MM-dd")        
            .create();
            // o el formato que uses
            gson.toJson(reservas, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
      
      public void agregarReserva(Reserva nueva) {
        List<Reserva> reservas = cargarReservas();
        reservas.add(nueva);
        guardarReservas(reservas);
    }
      
        public List<Reserva> listarReservas() {
        return cargarReservas();
    }
        public List<Reserva> listarReservasPorCliente(String email) {
        return listarReservas().stream()
        .filter(r -> r.getEmail().equals(email))
        .collect(Collectors.toList());
}
       
         public boolean eliminarReservaPorEmail(String email) {
        List<Reserva> todas = listarReservas();
        boolean eliminado = false;

        Iterator<Reserva> iter = todas.iterator();
        while (iter.hasNext()) {
            Reserva r = iter.next();
            if (r.getEmail().equals(email)) {
                iter.remove();
                eliminado = true;
            }
        }

        if (eliminado) {
            guardarReservas(todas);
        }

        return eliminado;
    }
         
     
        public boolean modificarReservaPorEmail(String email, Reserva nuevaReserva) {
    List<Reserva> reservas = listarReservas();
    boolean modificada = false;

    for (int i = 0; i < reservas.size(); i++) {
        Reserva r = reservas.get(i);
        if (r.getEmail().equals(email)) {
            reservas.set(i, nuevaReserva); // Reemplaza la reserva antigua
            modificada = true;
            break;
        }
    }

    if (modificada) {
        guardarReservas(reservas); // Guardar la lista actualizada
    }

    return modificada;
    }
        
}
