/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Administrador;
import Model.Cliente;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class AdminDAO {
     private final String archivoAdmins = "Data/Admin.json";
     private final Gson gson = new Gson();
     private List<Administrador> administradores;
     
      public AdminDAO() {
        cargarAdministradores();
        //cargarReservas();
        //cargarMesas();
    }
      
       private void cargarAdministradores() {
        try (FileReader reader = new FileReader(archivoAdmins)) {
            administradores = gson.fromJson(reader, new TypeToken<List<Administrador>>(){}.getType());
            if (administradores == null) {
                administradores = new ArrayList<>();
            }
        } catch (IOException e) {
            administradores = new ArrayList<>();
        }
    }
    
       public Administrador obtenerInformacion(String idAdministrador) {
        for (Administrador admin : administradores) {
            if (admin.getId().equals(idAdministrador)) {
                return admin;
            }
        }
        return null;
    }
}
