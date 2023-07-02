package Consulta_API;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luis
 */
public class Consulta {
    
    String Query;
    String Type;
    String Date;
    String Limit;
    //Recolecion_Datos Recolectar =new Recolecion_Datos();

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public Consulta() {
    }

    public Consulta(String Query, String Type, int Limit) {
        this.Query = Query;
        this.Type = Type;
    }

    private static String sin_Espacios(String Dato){
        Dato=Dato.replaceAll(" ", "%20");
        return Dato; 
    }
   
    public void Consultar(String Busqueda, String Tipo, String Limite ){
        String Consult;
        Query= sin_Espacios(Busqueda);
        Type=Tipo;
        Limit=Limite;
        Consult="https://spotify23.p.rapidapi.com/search/?q="+Query+"&type="+Type+"&offset=0&limit="+Limit+"&numberOfTopResults=5" ;
        HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create(Consult))
		.header("X-RapidAPI-Key", "c08719b887msh7460e0b14e68162p17ad64jsn35784b4935f3")
		.header("X-RapidAPI-Host", "spotify23.p.rapidapi.com")
		.method("GET", HttpRequest.BodyPublishers.noBody())
		.build();

        HttpResponse<String> response = null;
        
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
           Date= response.body();
          // Recolectar.trasladar_datos(response.body());
           // Recolectar.trasladar_datos(response.body());
           //  System.out.println(response.body());   // mostrar datos cambiar a comentario despues 
          //  System.out.print(Query);  //prueba cambiar a comentario despues 
          
    }
  
}
