/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_Enlazada;

/**
 *
 * @author Luis
 */
public class Nodo {
    
    String Nombre;
    String URL;
    Nodo Next;
    int id;
    
    
    

    public Nodo() {
    }  

    public Nodo(String Nombre, String URL, Nodo Next) {
        this.Nombre = Nombre;
        this.URL = URL;
        this.Next = Next;
        
    }   
}
