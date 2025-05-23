/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Administrador;
import Model.Cliente;
import Model.Mesa;
import Model.Reserva;
import Model.Restaurante;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    private static Restaurante restaurante;
    private static Scanner scanner;
    private static SimpleDateFormat sdf;
    
    public static void main(String[] args) {
        inicializarSistema();
        mostrarMenuPrincipal();
    }
    
    private static void inicializarSistema() {
        scanner = new Scanner(System.in);
        sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        restaurante = new Restaurante("Restaurante El Buen Sabor");
        
       // Configuración inicial de mesas (versión más legible)
    restaurante.agregarMesa(new Mesa(1, 2, "Interior"));
    restaurante.agregarMesa(new Mesa(2, 4, "Interior"));
    restaurante.agregarMesa(new Mesa(3, 4, "Terraza"));
    restaurante.agregarMesa(new Mesa(4, 6, "Terraza"));
    restaurante.agregarMesa(new Mesa(5, 8, "Terraza"));
    restaurante.agregarMesa(new Mesa(6, 2, "Barra"));
    }
    
    private static void mostrarMenuPrincipal() {
        while (true) {
            System.out.println("\n=== SISTEMA DE RESERVAS ===");
            System.out.println("1. Soy Cliente");
            System.out.println("2. Soy Administrador");
            System.out.println("3. Salir");
            System.out.print("Seleccione opción: ");
            
            int opcion = leerEntero();
            switch (opcion) {
                case 1: menuCliente(); break;
                case 2: menuAdministrador(); break;
                case 3: System.exit(0);
                default: System.out.println("Opción inválida");
            }
        }
    }
    
    private static void menuCliente() {
        System.out.print("\nIngrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su teléfono: ");
        String telefono = scanner.nextLine();
        
        Cliente cliente = new Cliente(nombre, telefono, restaurante);
        
        while (true) {
            System.out.println("\n=== MENÚ CLIENTE ===");
            System.out.println("1. Crear reserva");
            System.out.println("2. Ver mis reservas");
            System.out.println("3. Modificar reserva");
            System.out.println("4. Cancelar reserva");
            System.out.println("5. Ver mesas disponibles");
            System.out.println("6. Volver al menú principal");
            System.out.print("Seleccione opción: ");
            
            try {
                int opcion = leerEntero();
                switch (opcion) {
                    case 1: crearReserva(cliente); break;
                    case 2: listarReservas(cliente); break;
                    case 3: modificarReserva(cliente); break;
                    case 4: cancelarReserva(cliente); break;
                    case 5: consultarMesasDisponibles(cliente); break;
                    case 6: return;
                    default: System.out.println("Opción inválida");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    
    private static void menuAdministrador() {
        System.out.print("\nIngrese contraseña de administrador: ");
        String password = scanner.nextLine();
        
        if (!"admin123".equals(password)) {
            System.out.println("Contraseña incorrecta");
            return;
        }
        
        Administrador admin = new Administrador(restaurante);
        
        while (true) {
            System.out.println("\n=== MENÚ ADMINISTRADOR ===");
            System.out.println("1. Ver todas las reservas");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Ver disponibilidad completa");
            System.out.println("4. Agregar nueva mesa");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione opción: ");
            
            try {
                int opcion = leerEntero();
                switch (opcion) {
                    case 1: listarTodasReservas(admin); break;
                    case 2: cancelarReservaAdmin(admin); break;
                    case 3: consultarDisponibilidadCompleta(admin); break;
                    case 4: agregarMesa(admin); break;
                    case 5: return;
                    default: System.out.println("Opción inválida");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    
    // Métodos de operaciones del cliente
    private static void crearReserva(Cliente cliente) throws Exception {
        System.out.println("\n--- NUEVA RESERVA ---");
        Date fecha = leerFecha("Fecha y hora (dd/MM/yyyy HH:mm): ");
        int personas = leerEnteroPositivo("Número de personas: ");
        
        List<Mesa> mesasDisponibles = cliente.consultarMesasDisponibles(fecha, personas);
        
        if (mesasDisponibles.isEmpty()) {
            System.out.println("No hay mesas disponibles para esos parámetros");
            return;
        }
        
        System.out.println("\nMesas disponibles:");
        mesasDisponibles.forEach(m -> 
            System.out.printf("Mesa #%d - %s (%d personas)\n", 
                m.getNumero(), m.getUbicacion(), m.getCapacidad()));
        
        int numMesa = leerEnteroPositivo("\nSeleccione mesa: ");
        Reserva reserva = cliente.crearReserva(fecha, personas, numMesa);
        
        System.out.println("\nReserva creada exitosamente!");
        System.out.println("ID: " + reserva.getId());
        System.out.println("Mesa: #" + reserva.getMesa().getNumero());
        System.out.println("Fecha: " + sdf.format(reserva.getFechaHora()));
    }
    
    private static void listarReservas(Cliente cliente) {
        List<Reserva> reservas = cliente.obtenerMisReservas();
        
        if (reservas.isEmpty()) {
            System.out.println("\nNo tiene reservas registradas");
            return;
        }
        
        System.out.println("\n--- SUS RESERVAS ---");
        reservas.forEach(r -> {
            System.out.println("\nID: " + r.getId());
            System.out.println("Fecha: " + sdf.format(r.getFechaHora()));
            System.out.println("Personas: " + r.getCantidadPersonas());
            System.out.println("Mesa: #" + r.getMesa().getNumero() + 
                             " (" + r.getMesa().getUbicacion() + ")");
        });
    }
    
    private static void modificarReserva(Cliente cliente) throws Exception {
        System.out.println("\n--- MODIFICAR RESERVA ---");
        int idReserva = leerEnteroPositivo("ID de reserva a modificar: ");
        
        System.out.println("\nNuevos datos:");
        Date nuevaFecha = leerFecha("Nueva fecha y hora (dd/MM/yyyy HH:mm): ");
        int nuevasPersonas = leerEnteroPositivo("Nuevo número de personas: ");
        
        Reserva reservaModificada = cliente.modificarReserva(idReserva, nuevaFecha, nuevasPersonas);
        
        System.out.println("\nReserva modificada exitosamente!");
        System.out.println("Nueva fecha: " + sdf.format(reservaModificada.getFechaHora()));
        System.out.println("Nuevo número de personas: " + reservaModificada.getCantidadPersonas());
        System.out.println("Nueva mesa: #" + reservaModificada.getMesa().getNumero());
    }
    
    private static void cancelarReserva(Cliente cliente) throws Exception {
        System.out.println("\n--- CANCELAR RESERVA ---");
        int idReserva = leerEnteroPositivo("ID de reserva a cancelar: ");
        
        if (cliente.cancelarReserva(idReserva)) {
            System.out.println("\nReserva cancelada exitosamente!");
        } else {
            System.out.println("\nNo se pudo cancelar la reserva");
        }
    }
    
    private static void consultarMesasDisponibles(Cliente cliente) {
        System.out.println("\n--- CONSULTAR DISPONIBILIDAD ---");
        Date fecha = leerFecha("Fecha a consultar (dd/MM/yyyy HH:mm): ");
        int personas = leerEnteroPositivo("Número de personas: ");
        
        List<Mesa> mesasDisponibles = cliente.consultarMesasDisponibles(fecha, personas);
        
        if (mesasDisponibles.isEmpty()) {
            System.out.println("\nNo hay mesas disponibles para esos parámetros");
            return;
        }
        
        System.out.println("\nMesas disponibles para " + personas + " personas:");
        mesasDisponibles.forEach(m -> 
            System.out.printf("Mesa #%d - %s (%d personas)\n", 
                m.getNumero(), m.getUbicacion(), m.getCapacidad()));
    }
    
    // Métodos de operaciones del administrador
    private static void listarTodasReservas(Administrador admin) {
        List<Reserva> reservas = admin.obtenerTodasReservas();
        
        if (reservas.isEmpty()) {
            System.out.println("\nNo hay reservas registradas");
            return;
        }
        
        System.out.println("\n--- TODAS LAS RESERVAS ---");
        reservas.forEach(r -> {
            System.out.println("\nID: " + r.getId());
            System.out.println("Cliente: " + r.getNombreCliente());
            System.out.println("Teléfono: " + r.getTelefonoCliente());
            System.out.println("Fecha: " + sdf.format(r.getFechaHora()));
            System.out.println("Personas: " + r.getCantidadPersonas());
            System.out.println("Mesa: #" + r.getMesa().getNumero() + 
                             " (" + r.getMesa().getUbicacion() + ")");
        });
    }
    
    private static void cancelarReservaAdmin(Administrador admin) {
        System.out.println("\n--- CANCELAR RESERVA ---");
        int idReserva = leerEnteroPositivo("ID de reserva a cancelar: ");
        
        if (admin.cancelarReserva(idReserva)) {
            System.out.println("\nReserva cancelada exitosamente!");
        } else {
            System.out.println("\nNo se encontró la reserva con ese ID");
        }
    }
    
    private static void consultarDisponibilidadCompleta(Administrador admin) {
        System.out.println("\n--- DISPONIBILIDAD COMPLETA ---");
        Date fecha = leerFecha("Fecha a consultar (dd/MM/yyyy HH:mm): ");
        
        List<Mesa> mesasDisponibles = admin.consultarDisponibilidadCompleta(fecha);
        
        if (mesasDisponibles.isEmpty()) {
            System.out.println("\nNo hay mesas disponibles para esa fecha");
            return;
        }
        
        System.out.println("\nMesas disponibles:");
        mesasDisponibles.forEach(m -> 
            System.out.printf("Mesa #%d - %s (%d personas)\n", 
                m.getNumero(), m.getUbicacion(), m.getCapacidad()));
    }
    
    private static void agregarMesa(Administrador admin) {
        System.out.println("\n--- AGREGAR MESA ---");
        int numero = leerEnteroPositivo("Número de mesa: ");
        int capacidad = leerEnteroPositivo("Capacidad: ");
        System.out.print("Ubicación: ");
        String ubicacion = scanner.nextLine();
        
        admin.agregarMesa(new Mesa(numero, capacidad, ubicacion));
        System.out.println("\nMesa agregada exitosamente!");
    }
    
    // Métodos auxiliares
    private static int leerEntero() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    
    private static int leerEnteroPositivo(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                int valor = Integer.parseInt(scanner.nextLine());
                if (valor > 0) return valor;
                System.out.println("Debe ser un número positivo");
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido");
            }
        }
    }
    
    private static Date leerFecha(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return sdf.parse(scanner.nextLine());
            } catch (ParseException e) {
                System.out.println("Formato inválido. Use dd/MM/yyyy HH:mm");
            }
        }
    }
}
