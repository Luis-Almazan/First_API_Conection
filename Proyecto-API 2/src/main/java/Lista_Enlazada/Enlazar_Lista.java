/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_Enlazada;

/**
 *
 * @author Luis
 */
public class Enlazar_Lista {
     Nodo First; //Se crea el Objeto
     Nodo Album;
     Nodo Artistas;
     Nodo Episodios;
     Nodo Generos;
     Nodo Playlist;
     Nodo Podcasts;
     Nodo Canciones;
     Nodo Usuarios;
     
     public void Agregar_Album(String Objett, String URL){
          if(Album==null){
         Album=new Nodo();
         Album.Nombre=Objett;
         Album.URL=URL;
        }
        else{ //cuando ya esta el primero
         Nodo Secund =new Nodo();
         Secund.Nombre=Objett;
         Secund.URL=URL;

         if(Album.Next==null){//pregunta si el siguiente al primero esta nulo 
             Album.Next=Secund;
        }
         else{
             Nodo iterador=Album.Next;
             boolean Insertado=false;
             while (iterador!=null & Insertado==false) {                 
                 if(iterador.Next!=null){
                     iterador=iterador.Next;
                 }
                 else{
                     iterador.Next=Secund;
                     Insertado=true;
                 }     
             } 
         }
    }        
     }
     
     public void Agregar_Artist(String Objett, String URL){
          if(Artistas==null){
         Artistas=new Nodo();
         Artistas.Nombre=Objett;
         Artistas.URL=URL;

         
        }
        else{ //cuando ya esta el primero
         Nodo Secund =new Nodo();
         Secund.Nombre=Objett;
         Secund.URL=URL;

         
         if(Artistas.Next==null){//pregunta si el siguiente al primero esta nulo 
             Artistas.Next=Secund;
        }
         else{
             Nodo iterador=Artistas.Next;
             boolean Insertado=false;
             while (iterador!=null & Insertado==false) {                 
                 if(iterador.Next!=null){
                     iterador=iterador.Next;
                 }
                 else{
                     iterador.Next=Secund;
                     Insertado=true;
                 }     
             } 
         }
    }        
     }
     
     public void Agregar_Episodios(String Objett, String URL){
          if(Episodios==null){
         Episodios=new Nodo();
         Episodios.Nombre=Objett;
         Episodios.URL=URL;

        }
        else{ //cuando ya esta el primero
         Nodo Secund =new Nodo();
         Secund.Nombre=Objett;
         Secund.URL=URL;

         if(Episodios.Next==null){//pregunta si el siguiente al primero esta nulo 
             Episodios.Next=Secund;
        }
         else{
             Nodo iterador=Episodios.Next;
             boolean Insertado=false;
             while (iterador!=null & Insertado==false) {                 
                 if(iterador.Next!=null){
                     iterador=iterador.Next;
                 }
                 else{
                     iterador.Next=Secund;
                     Insertado=true;
                 }     
             } 
         }
    }        
     }
     
     public void Agregar_Generos(String Objett, String URL){
          if(Generos==null){
         Generos=new Nodo();
         Generos.Nombre=Objett;
         Generos.URL=URL;
         
        }
        else{ //cuando ya esta el primero
         Nodo Secund =new Nodo();
         Secund.Nombre=Objett;
         Secund.URL=URL;

         
         if(Generos.Next==null){//pregunta si el siguiente al primero esta nulo 
             Generos.Next=Secund;
        }
         else{
             Nodo iterador=Generos.Next;
             boolean Insertado=false;
             while (iterador!=null & Insertado==false) {                 
                 if(iterador.Next!=null){
                     iterador=iterador.Next;
                 }
                 else{
                     iterador.Next=Secund;
                     Insertado=true;
                 }     
             } 
         }
    }        
     }
     
     public void Agregar_Playlist(String Objett, String URL){
          if(Playlist==null){
         Playlist=new Nodo();
         Playlist.Nombre=Objett;
         Playlist.URL=URL;

         
        }
        else{ //cuando ya esta el primero
         Nodo Secund =new Nodo();
         Secund.Nombre=Objett;
         Secund.URL=URL;
         
         if(Playlist.Next==null){//pregunta si el siguiente al primero esta nulo 
             Playlist.Next=Secund;
        }
         else{
             Nodo iterador=Playlist.Next;
             boolean Insertado=false;
             while (iterador!=null & Insertado==false) {                 
                 if(iterador.Next!=null){
                     iterador=iterador.Next;
                 }
                 else{
                     iterador.Next=Secund;
                     Insertado=true;
                 }     
             } 
         }
    }        
     }
     
     public void Agregar_Podcast(String Objett, String URL){
          if(Podcasts==null){
         Podcasts=new Nodo();
         Podcasts.Nombre=Objett;
         Podcasts.URL=URL;
         
        }
        else{ //cuando ya esta el primero
         Nodo Secund =new Nodo();
         Secund.Nombre=Objett;
         Secund.URL=URL;
         
         
         if(Podcasts.Next==null){//pregunta si el siguiente al primero esta nulo 
             Podcasts.Next=Secund;
        }
         else{
             Nodo iterador=Podcasts.Next;
             boolean Insertado=false;
             while (iterador!=null & Insertado==false) {                 
                 if(iterador.Next!=null){
                     iterador=iterador.Next;
                 }
                 else{
                     iterador.Next=Secund;
                     Insertado=true;
                 }     
             } 
         }
    }        
     }
     
     public void Agregar_Canciones(String Objett, String URL, int i){
          if(Canciones==null){
         Canciones=new Nodo();
         Canciones.Nombre=Objett;
         Canciones.URL=URL;
         Canciones.id=i;
        }
        else{ //cuando ya esta el primero
         Nodo Secund =new Nodo();
         Secund.Nombre=Objett;
         Secund.URL=URL;
         Secund.id=i;
         
         if(Canciones.Next==null){//pregunta si el siguiente al primero esta nulo 
             Canciones.Next=Secund;
        }
         else{
             Nodo iterador=Canciones.Next;
             boolean Insertado=false;
             while (iterador!=null & Insertado==false) {                 
                 if(iterador.Next!=null){
                     iterador=iterador.Next;
                 }
                 else{
                     iterador.Next=Secund;
                     Insertado=true;
                 }     
             } 
         }
    }        
     }
     
     public void Agregar_Usuarios(String Objett, String URL){
          if(Usuarios==null){
         Usuarios=new Nodo();
         Usuarios.Nombre=Objett;
         Usuarios.URL=URL;
         
        }
        else{ //cuando ya esta el primero
         Nodo Secund =new Nodo();
         Secund.Nombre=Objett;
         Secund.URL=URL;
         
         if(Usuarios.Next==null){//pregunta si el siguiente al primero esta nulo 
             Usuarios.Next=Secund;
        }
         else{
             Nodo iterador=Usuarios.Next;
             boolean Insertado=false;
             while (iterador!=null & Insertado==false) {                 
                 if(iterador.Next!=null){
                     iterador=iterador.Next;
                 }
                 else{
                     iterador.Next=Secund;
                     Insertado=true;
                 }     
             } 
         }
    }        
     }
     
    public void agregar(String Objett, String URL ) //Metodo Agregar Objeto 
    {
        if(First==null){
         First=new Nodo();
         First.Nombre=Objett;
         First.URL=URL;
         
        }
        else{ //cuando ya esta el primero
         Nodo Secund =new Nodo();
         Secund.Nombre=Objett;
         Secund.URL=URL;
         
         if(First.Next==null){//pregunta si el siguiente al primero esta nulo 
             First.Next=Secund;
        }
         else{
             Nodo iterador=First.Next;
             boolean Insertado=false;
             while (iterador!=null & Insertado==false) {                 
                 if(iterador.Next!=null){
                     iterador=iterador.Next;
                 }
                 else{
                     iterador.Next=Secund;
                     Insertado=true;
                 }     
             } 
         }
    }               
}
    
    public void Limpiar(){
        Album=null;
        Artistas=null;
        Canciones=null;
        Episodios=null;
        Generos=null;
        Playlist=null;
        Podcasts=null;
        Usuarios=null;
        
    }
    
    public String Buscar_Album(String objetolista){
        Nodo temporal=Album;
        while (temporal!=null&& temporal.Nombre!=objetolista)
         {
            temporal=temporal.Next;
         }
    return temporal.URL;
    }
        
    public String Buscar_Artist(String objetolista){
        Nodo temporal=Artistas;
        while (temporal!=null&& temporal.Nombre!=objetolista)
         {
            temporal=temporal.Next;
         }
    return temporal.URL;
    }    
        
    public String Buscar_Episodios(String objetolista){
        Nodo temporal=Episodios;
        while (temporal!=null&& temporal.Nombre!=objetolista)
         {
            temporal=temporal.Next;
         }
    return temporal.URL;
    }   
        
    public String Buscar_Generos(String objetolista){
        Nodo temporal=Generos;
        while (temporal!=null&& temporal.Nombre!=objetolista)
         {
            temporal=temporal.Next;
         }
    return temporal.URL;
    }    
    
    public String Buscar_Playlist(String objetolista){
        Nodo temporal=Playlist;
        while (temporal!=null&& temporal.Nombre!=objetolista)
         {
            temporal=temporal.Next;
         }
    return temporal.URL;
    }
    
    public String Buscar_Podcast(String objetolista){
        Nodo temporal=Podcasts;
        while (temporal!=null&& temporal.Nombre!=objetolista)
         {
            temporal=temporal.Next;
         }
    return temporal.URL;
    }
    
    public String Buscar_Canciones(String objetolista){
        Nodo temporal=Canciones;
        while (temporal!=null&& temporal.Nombre!=objetolista)
         {
            temporal=temporal.Next;
         }
    return temporal.URL;
    }
    
    public String Buscar_Usuarios(String objetolista){
        Nodo temporal=Usuarios;
        while (temporal!=null&& temporal.Nombre!=objetolista)
         {
            temporal=temporal.Next;
         }
    return temporal.URL;
    }
    
}
