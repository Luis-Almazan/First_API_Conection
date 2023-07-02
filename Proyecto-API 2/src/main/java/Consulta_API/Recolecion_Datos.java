package Consulta_API;

import Datos.*;
import Lista.Ingresar_Datos_Lista;
import Lista_Enlazada.Enlazar_Lista;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *falta
 * @author Luis
 */
public class Recolecion_Datos {
    public DefaultListModel<String> Modelo = new DefaultListModel<>();
    String Name;
    Root com;
    Enlazar_Lista List_Enlazada =new Enlazar_Lista();
    Ingresar_Datos_Lista IngresoJlist =new Ingresar_Datos_Lista();

    public Recolecion_Datos() {
    }
    
    public void trasladar_datos(String dato){
        ObjectMapper file =new ObjectMapper();
        try {
              com = file.readValue(dato, Root.class);
             // System.out.println(com);
          /*    IngresoJlist.Ingresar_datos_lista(com);
              for(int i=0;i<=9;i++){
           // System.out.println(com.tracks.items.get(i)); 
         //  System.out.println(com.tracks.items.get(i).data.name);
         //  System.out.println(com.tracks.items.get(i).data.uri);
         Name =com.tracks.items.get(i).data.name;
         List_Enlazada.agregar(com.tracks.items.get(i).data.name, com.tracks.items.get(i).data.uri);
          Modelo.addElement(Name);
           
        }*/
        } catch (JsonProcessingException ex) {
            Logger.getLogger(Recolecion_Datos.class.getName()).log(Level.SEVERE, null, ex);
        }   
    
    } 

    public Root getCom() {
        return com;
    }

   /* public DefaultListModel<String> getModelo() {
        return Modelo;
    }
    public void setModelo(DefaultListModel<String> Modelo) {
        this.Modelo = Modelo;
    }*/
    
}
