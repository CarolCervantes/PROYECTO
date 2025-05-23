/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.AdminDAO;
import Model.Administrador;

import java.util.List;

/**
 *
 * @author ASUS
 */
public class AdminController {
    private AdminDAO adminDao;
    
   public AdminController() {
        this.adminDao = new AdminDAO();
    }
    
   public List<Administrador> listarAdmins() {
        return adminDao.listarAdmins();
    }
    
    public Administrador login(String correo, String contraseña) {
        List<Administrador> admin = adminDao.listarAdmins();

        for (Administrador Admins: admin) {
            if (Admins.getCorreo().equalsIgnoreCase(correo) &&
                Admins.getContraseña().equals(contraseña)) {
                return Admins; // login exitoso
            }
        }
        return null; // no encontrado
    }
}
