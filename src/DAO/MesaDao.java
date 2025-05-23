/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Mesa;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class MesaDao {
       private final String archivo = "C:\\Users\\ASUS\\Documents\\MARIA PAULINA\\ProyectoAula\\src\\Data\\Mesa.json";
       private final Gson gson = new Gson();
       
       
          private List<Mesa> obtenerMesas() {
       List<Mesa> mesas = new ArrayList<>();
    try (Reader reader = new FileReader(archivo)) {
        Type listType = new TypeToken<List<Mesa>>() {}.getType();
        List<Mesa> cargadas = new Gson().fromJson(reader, listType);
        if (cargadas != null) {
            mesas.addAll(cargadas);
        }
    } catch (FileNotFoundException e) {
        System.out.println("Archivo de mesas no encontrado. Se creará uno nuevo.");
    } catch (IOException e) {
        e.printStackTrace();
    }
    return mesas;
    }
          
     public void guardarTodas(List<Mesa> mesas) {
        try (Writer writer = new FileWriter(archivo)) {
            gson.toJson(mesas, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     
     //Guardar o actualizar solo una mesa
     public void guardarMesa(Mesa nuevaMesa) {
        List<Mesa> mesas = obtenerMesas();
        boolean actualizada = false;

        for (int i = 0; i < mesas.size(); i++) {
            if (mesas.get(i).getNumero() == nuevaMesa.getNumero()) {
                mesas.set(i, nuevaMesa);
                actualizada = true;
                break;
            }
        }

        if (!actualizada) {
            mesas.add(nuevaMesa);
        }

        guardarTodas(mesas);
    }

      public List<Mesa> listarMesas() {
        return obtenerMesas();
    }
}
