/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
 import DAO.ClienteDao;
import Model.Cliente;
import java.util.List;
import javax.swing.table.DefaultTableModel;
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
   /* public Cliente buscarClientePorId(String id) {
        return clienteDao.buscarClientePorId(id);
    }*/
    
    // UPDATE
    public void actualizarCliente(Cliente clienteActualizado) {
        clienteDao.actualizarCliente(clienteActualizado);
    }

    // DELETE
    public boolean eliminarCliente(String id) {
        return clienteDao.eliminarClientePorId(id);
    }

    // LISTAR
    public List<Cliente> listarClientes() {
        return clienteDao.listarClientes();
    }
    
    public void cargarClientes(DefaultTableModel modelo){
         List<Cliente> clientes = clienteDao.listarClientes();
         System.out.println("Clientes cargados: " + clientes.size());
        for (Cliente cliente : clientes) {
            Object[] fila = {
                cliente.getId(),
                cliente.getNombre(),
                cliente.getCorreo(),
                cliente.getTelefono()
            };
            modelo.addRow(fila);
        }
    }
    
    public Cliente login(String correo, String contrasena) {
        List<Cliente> clientes = clienteDao.listarClientes();

        for (Cliente cliente : clientes) {
            if (cliente.getCorreo().equalsIgnoreCase(correo) &&
                cliente.getContraseña().equals(contrasena)) {
                return cliente; // login exitoso
            }
        }
        return null; // no encontrado
    }
    public Cliente autenticarUsuario(String email) {
        
        return clienteDao.buscarClientePorEmail(email); // Llama al método de autenticación
    }
}
