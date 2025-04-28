package DAO;



import Model.Cliente;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class ClienteDao {
    private final String archivo = "Data/Clientes.json";
    private final Gson gson = new Gson();
    
    //Metodo para cargar clientes
     private List<Cliente> cargarClientes() {
        try (Reader reader = new FileReader(archivo)) {
            return gson.fromJson(reader, new TypeToken<List<Cliente>>() {}.getType());
        } catch (Exception e) {
            return new ArrayList<>(); // Si no existe o error, devuelve lista vacía
        }
    }
     
     //Metodo para guardar Clientes 
     private void guardarClientes(List<Cliente> clientes) {
        try (Writer writer = new FileWriter(archivo)) {
            gson.toJson(clientes, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     
      public void agregarCliente(Cliente cliente) {
        List<Cliente> clientes = cargarClientes();
        clientes.add(cliente);
        guardarClientes(clientes);
    }
      
      public Cliente buscarClientePorId(String id) {
        for (Cliente cliente : cargarClientes()) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }
        }
        return null;
    }
      
      public void actualizarCliente(Cliente clienteActualizado) {
        List<Cliente> clientes = cargarClientes();
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId().equals(clienteActualizado.getId())) {
                clientes.set(i, clienteActualizado);
                break;
            }
        }
        guardarClientes(clientes);
    }
      
      public void eliminarClientePorId(String id) {
        List<Cliente> clientes = cargarClientes();
        clientes.removeIf(cliente -> cliente.getId().equals(id));
        guardarClientes(clientes);
    }
      
      public List<Cliente> listarClientes() {
        return cargarClientes();
    }
}
