/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;



/**
 *
 * @author ASUS
 */

public class Cliente extends Usuario{

    
    public Cliente(String id, String nombre, String apellidos, String contraseña, String correo, String telefono) {
        super(id, nombre, apellidos, contraseña, correo, telefono);
    }
    
    public Cliente() {
    super();
}
}
