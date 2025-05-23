/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Administrador;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class AdminDAO {
     private final String archivoAdmins = "C:\\Users\\ASUS\\Documents\\MARIA PAULINA\\ProyectoAula\\src\\Data\\Admin.json";
     private final Gson gson = new Gson();//Libreria
     private List<Administrador> administradores;
     
      public AdminDAO() {
        cargarAdmins();
       
    }
      
        private List<Administrador> cargarAdmins() {
       List<Administrador> lista = new ArrayList<>();
          try {
        Gson gson = new Gson();
        Reader reader = new FileReader(archivoAdmins); //Lee los archivos json
        Administrador[] admins= gson.fromJson(reader, Administrador[].class);
        lista = Arrays.asList(admins);
        reader.close();
              } catch (IOException e) {
                  e.printStackTrace();
               }
                  return lista;
              }
    
      public Administrador obtenerInformacion(String idAdministrador) {
        for (Administrador admin : administradores) {
            if (admin.getId().equals(idAdministrador)) {//Compara el email con el proporcionado
                return admin;
            }
        }
        return null;
    }
      
       public List<Administrador> listarAdmins() {
        return cargarAdmins();
    }
}
