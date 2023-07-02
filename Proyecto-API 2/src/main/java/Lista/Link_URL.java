/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class Link_URL {
     
     URL url =null;
    
    public void Link(String Link){
         
         try {
             url = new URL(Link);
             
             try {
                 try {
                     Desktop.getDesktop().browse(url.toURI());
                     
                 } catch (IOException ex) {
                     Logger.getLogger(Link_URL.class.getName()).log(Level.SEVERE, null, ex);
                 }
             } catch (URISyntaxException ex) {
                 Logger.getLogger(Link_URL.class.getName()).log(Level.SEVERE, null, ex);
             }
             
         } catch (MalformedURLException ex) {
             Logger.getLogger(Link_URL.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
    }
    
    
    public void Ejecutar(String Link_Dato){
        Runtime.getRuntime().load(Link_Dato);
        
    }
    
     public void Enlace_Link(String Link) throws IOException{
        if(Link!=null){
         String Dato= "\""+Link+"\"";      
        // Process p = new ProcessBuilder("Spotify.exe", "/spotify:track:63bmZnBN1CiJ9sA4qTEe8y").start();
         Process p = new ProcessBuilder("explorer.exe",Dato).start();
          }
        
        
    }
    
    
}
