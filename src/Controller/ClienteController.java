/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
 import DAO.ClienteDao;
import Model.Cliente;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class ClienteController {
    
    private ClienteDao clienteDao;
    
   public ClienteController() {
        this.clienteDao = new ClienteDao();
    }
    
   public void crearCliente(Cliente cliente) {
        clienteDao.agregarCliente(cliente);
    }

    // READ - buscar por ID
    public Cliente buscarClientePorId(String id) {
        return clienteDao.buscarClientePorId(id);
    }
    
    // UPDATE
    public void actualizarCliente(Cliente clienteActualizado) {
        clienteDao.actualizarCliente(clienteActualizado);
    }

    // DELETE
    public void eliminarCliente(String id) {
        clienteDao.eliminarClientePorId(id);
    }

    // LISTAR
    public List<Cliente> listarClientes() {
        return clienteDao.listarClientes();
    }
}
