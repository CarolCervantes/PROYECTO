/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.ReservaSalon;
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
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ASUS
 */
public class ReservaSalonDAO {
     private final String archivo = "C:\\Users\\ASUS\\Documents\\MARIA PAULINA\\ProyectoAula\\src\\Data\\ReservaSalon.json";
    private final Gson gson = new Gson();
    
      private List<ReservaSalon> cargarReservaSalon() {
       List<ReservaSalon> reservas = new ArrayList<>();
        try (Reader reader = new FileReader(archivo)) {//Para leer el archivo
        Type listType = new TypeToken<List<ReservaSalon>>() {}.getType();//Se crea un objeto Type que representa el tipo de 
        //dato esperado: una lista (List) de objetos ReservaSalon.
        List<ReservaSalon> cargadas = new Gson().fromJson(reader, listType);
        if (cargadas != null) {
            reservas.addAll(cargadas);
        }
    } catch (FileNotFoundException e) {
        System.out.println("Archivo de reservas de salones no encontrado. Se creará uno nuevo.");
    } catch (IOException e) {
        e.printStackTrace();
    }
    return reservas;
    }
      
       public void guardarReservaSalones(List<ReservaSalon> reservas) {
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
       
         public List<ReservaSalon> listarReservaSalones() {
        return cargarReservaSalon();
    }
         
       public void agregarReserva(ReservaSalon nueva) {
        List<ReservaSalon> reservas = cargarReservaSalon();//se cargan todas las reservas actuales que están guardadas 
        reservas.add(nueva);//Se añade al final de la lista
        guardarReservaSalones(reservas);
    }
       
       public boolean eliminarReservaPorCedula(String cedula) {
        List<ReservaSalon> todas = listarReservaSalones();
        boolean eliminado = false;

        
        //Un iterador opara eliminar elementos mientras se recorre la lista
        Iterator<ReservaSalon> iter = todas.iterator();
        while (iter.hasNext()) {
            ReservaSalon r = iter.next();
            if (r.getCedula().equals(cedula)) {
                iter.remove();
                eliminado = true;
            }
        }

        if (eliminado) {
            guardarReservaSalones(todas);
        }

        return eliminado;
    }
       
       
        public List<ReservaSalon> listarReservasPorCedula(String cedula) {//Cedula como parametro
        return listarReservaSalones().stream()
        .filter(r -> r.getCedula().equals(cedula))//solo deja pasar las reservas donde la cédula del objeto ReservaSalon 
                //coincida exactamente con la cédula proporcionada.
        .collect(Collectors.toList());
}
        
        public boolean modificarReservaPorCedula(String cedula, ReservaSalon nuevaReserva) {
    List<ReservaSalon> reservas = listarReservaSalones();
    boolean modificada = false;

    for (int i = 0; i < reservas.size(); i++) {//Bucle para recorrer todas las reservas por índice
        ReservaSalon r = reservas.get(i);
        if (r.getCedula().equals(cedula)) {
            reservas.set(i, nuevaReserva); // Reemplaza la reserva antigua
            modificada = true;
            break;
        }
    }

    if (modificada) {
        guardarReservaSalones(reservas); // Guardar la lista actualizada
    }

    return modificada;
}
}
