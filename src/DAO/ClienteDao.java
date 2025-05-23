package DAO;



import Model.Cliente;
import Model.ReservaSalon;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
    private final String archivo = "C:\\Users\\ASUS\\Documents\\MARIA PAULINA\\ProyectoAula\\src\\Data\\Clientes.json";
    private final Gson gson = new Gson();
    
    //Metodo para cargar clientes
     private List<Cliente> cargarClientes() {
       List<Cliente> lista = new ArrayList<>();
    try {
        Gson gson = new Gson();
        Reader reader = new FileReader(archivo);
        Cliente[] clientes = gson.fromJson(reader, Cliente[].class);
        lista = Arrays.asList(clientes);
        reader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return lista;
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
      
      public Cliente buscarClientePorEmail(String email) {
        for (Cliente cliente : cargarClientes()) {
            if (cliente.getCorreo().equals(email)) {
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
      
      public boolean eliminarClientePorId(String id) {
          List<Cliente> todas = listarClientes();
        boolean eliminado = false;

        Iterator<Cliente> iter = todas.iterator();
        while (iter.hasNext()) {
            Cliente  c = iter.next();
            if (c.getId().equals(id)) {
                iter.remove();
                eliminado = true;
            }
        }

        if (eliminado) {
            guardarClientes(todas);
        }

        return eliminado;
    }
      
      
      public List<Cliente> listarClientes() {
        return cargarClientes();
    }
      
      
}
