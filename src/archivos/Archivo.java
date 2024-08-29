/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

import domain.Usuario;
import implementsUser.DaoUsers;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Archivo implements DaoUsers{

    @Override
    public String create(String ruta, String msg,  boolean modo    ) {
        String mensaje = null;
        FileWriter escribir = null;
        try {
            File archive = new File(ruta);
            escribir = new FileWriter(ruta, modo);
            escribir.write(msg);
            escribir.close();
            mensaje = "registro se creo con exito";
        } catch (IOException ex) {
            mensaje = "Hubo un error en la escrituro del archivo";
            System.out.println("Erro de archivo");
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    @Override
    public List<Usuario> getAll(String ruta) {
        List<Usuario>lista = new ArrayList<Usuario>();
        String text = "";
        try {
            String linea ="";
            FileReader lector = new  FileReader(ruta);
            BufferedReader contenido = new BufferedReader(lector);
            while ((linea = contenido.readLine())!=null){
                text= text+linea+"\n";
                System.out.println("Prueba" + text);
                String fila []= text.split(";");
                Usuario obj = new Usuario (fila[0],fila[1],fila[2],fila[3],fila[4]);
                lista.add(obj);
                
                
            }
        } catch (IOException ex ){
            System.out.println("Erro de lectura");
            
        }
        return lista;
    }

    @Override
    public Usuario getOne(String ruta, String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String update(String ruta, Usuario obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(String ruta, String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
