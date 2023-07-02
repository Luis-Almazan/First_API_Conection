/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

import Arbol_avl.AVLNodeWord;
import Arbol_avl.AVLTreeWord;
import Arbol_avl.AVLTreeWordGraph;
import Datos.*;
import Lista_Enlazada.Enlazar_Lista;
import javax.swing.DefaultListModel;


/**
 *
 * @author Luis
 */
public class Ingresar_Datos_Lista {
    
     AVLTreeWord a =new AVLTreeWord();
     
     public AVLNodeWord getRoot() {
        return a.getRoot();
    }
     
     
     DefaultListModel<String> Modelo_Album = new DefaultListModel<>();
     DefaultListModel<String> Modelo_Canciones = new DefaultListModel<>();
     DefaultListModel<String> Modelo_Artistas = new DefaultListModel<>();
     DefaultListModel<String> Modelo_Episodios = new DefaultListModel<>();
     DefaultListModel<String> Modelo_Generos = new DefaultListModel<>();
     DefaultListModel<String> Modelo_Playlist = new DefaultListModel<>();
     DefaultListModel<String> Modelo_Podcast = new DefaultListModel<>();
     DefaultListModel<String> Modelo_Usuario = new DefaultListModel<>();
    Enlazar_Lista List_Enlazada =new Enlazar_Lista();
    Root Consulta;
    String URL;

    public void Ingresar_datos_lista(Root Ingreso){
        Consulta=Ingreso;
        if(Consulta.Artists!=null){
            int SIZE_Artist=Consulta.Artists.items.size()-1;
            for(int i=0;i<=SIZE_Artist;i++){
                Consulta_Artistas(i);    
            }
        }
    
        if(Consulta.albums!=null){
            int SIZE_Album=Consulta.albums.items.size()-1;
            for(int i=0;i<=SIZE_Album;i++){
            Consulta_Albumes(i);}
        }
        
        if(Consulta.episodes!=null){
            int SIZE_Episodes=Consulta.episodes.items.size()-1;
            for(int i=0;i<=SIZE_Episodes;i++){
           Consulta_Episodios(i);}
        }
        
        if(Consulta.genres!=null){
            int SIZE_Generos=Consulta.genres.items.size()-1;
            for(int i=0;i<=SIZE_Generos;i++){
           Consulta_Generos(i);}
        }
        
        if(Consulta.playlists!=null){
            int SIZE_Playlist=Consulta.playlists.items.size()-1;
            for(int i=0;i<=SIZE_Playlist;i++){
         Consulta_PlayList(i);}
        }
        
        if(Consulta.podcasts!=null){
            int SIZE_Podcast=Consulta.podcasts.items.size()-1;
            for(int i=0;i<=SIZE_Podcast;i++){
            Consulta_PodCasts(i);}
        }
        
        if(Consulta.tracks!=null){
            int SIZE_Canciones=Consulta.tracks.items.size()-1;
            for(int i=0;i<=SIZE_Canciones;i++){
            Consulta_Canciones(i);}
             AVLTreeWordGraph graph = new AVLTreeWordGraph(a.getRoot());
        }
        
        if(Consulta.users!=null){
            int SIZE_Usuarios=Consulta.users.items.size()-1;
            for(int i=0;i<=SIZE_Usuarios;i++){
            Consulta_Usuarios(i);}
        }
        
        
    }
    
   public void Consulta_Canciones (int Contador){
       Modelo_Canciones.addElement(Consulta.tracks.items.get(Contador).data.name);
       List_Enlazada.Agregar_Canciones(Consulta.tracks.items.get(Contador).data.name, Consulta.tracks.items.get(Contador).data.uri,Contador);
       a.insert(Consulta.tracks.items.get(Contador).data.name);
       
   }
   
   public void Consulta_Albumes (int Contador){
      Modelo_Album.addElement(Consulta.albums.items.get(Contador).data.name);
      List_Enlazada.Agregar_Album(Consulta.albums.items.get(Contador).data.name, Consulta.albums.items.get(0).data.uri);
   }
   
   public void Consulta_Artistas (int Contador){
       Modelo_Artistas.addElement(Consulta.Artists.items.get(Contador).data.profile.name);
       List_Enlazada.Agregar_Artist(Consulta.Artists.items.get(Contador).data.profile.name, Consulta.Artists.items.get(Contador).data.uri);
   }
    
   public void Consulta_Episodios (int Contador){
       Modelo_Episodios.addElement(Consulta.episodes.items.get(Contador).data.name);
       List_Enlazada.Agregar_Episodios(Consulta.episodes.items.get(Contador).data.name, Consulta.episodes.items.get(Contador).data.uri);
   } 
     
   public void Consulta_Generos (int Contador){
       Modelo_Generos.addElement(Consulta.genres.items.get(Contador).data.name);
       List_Enlazada.Agregar_Generos(Consulta.genres.items.get(Contador).data.name, Consulta.genres.items.get(Contador).data.uri);
   } 
    
   public void Consulta_PlayList (int Contador){
       Modelo_Playlist.addElement(Consulta.playlists.items.get(Contador).data.name);
       List_Enlazada.Agregar_Playlist(Consulta.playlists.items.get(Contador).data.name, Consulta.playlists.items.get(Contador).data.uri);       
   }

   public void Consulta_PodCasts (int Contador){
       Modelo_Podcast.addElement(Consulta.podcasts.items.get(Contador).data.name);
       List_Enlazada.Agregar_Podcast(Consulta.podcasts.items.get(Contador).data.name, Consulta.podcasts.items.get(Contador).data.uri);
   }
    
   public void Consulta_Usuarios (int Contador){
       Modelo_Usuario.addElement(Consulta.users.items.get(Contador).data.displayName);
       List_Enlazada.Agregar_Usuarios(Consulta.users.items.get(Contador).data.displayName, Consulta.users.items.get(Contador).data.uri);
   }
   
   public void SinFiltro(){
         Ingresar_datos_lista(Consulta);           
        }

    public DefaultListModel<String> getModelo_Album() {
        return Modelo_Album;
    }

    public DefaultListModel<String> getModelo_Canciones() {
        return Modelo_Canciones;
    }

    public DefaultListModel<String> getModelo_Artistas() {
        return Modelo_Artistas;
    }

    public DefaultListModel<String> getModelo_Episodios() {
        return Modelo_Episodios;
    }

    public DefaultListModel<String> getModelo_Generos() {
        return Modelo_Generos;
    }

    public DefaultListModel<String> getModelo_Playlist() {
        return Modelo_Playlist;
    }

    public DefaultListModel<String> getModelo_Podcast() {
        return Modelo_Podcast;
    }

    public DefaultListModel<String> getModelo_Usuario() {
        return Modelo_Usuario;
    }

    public void Vaciar_Listas(){
       List_Enlazada.Limpiar();
       
       Modelo_Album.clear();
       Modelo_Canciones.clear();
       Modelo_Artistas.clear();
       Modelo_Episodios.clear();
       Modelo_Generos.clear();
       Modelo_Playlist.clear();
       Modelo_Podcast.clear();
       Modelo_Usuario.clear();
       
   }
   
    public void Buscar_Enlace(int Busqueda, String Name){
   
    switch(Busqueda) {
  case 0:
      URL=List_Enlazada.Buscar_Album(Name);
      //List.Buscar(Busqueda,jList1.getSelectedValue());
      //String Objeto_List=jList1.getSelectedValue();
    break;
  case 1:
      URL=List_Enlazada.Buscar_Artist(Name);
      //List.Buscar(Busqueda,jList2.getSelectedValue());
    break;
  case 2:
      URL=List_Enlazada.Buscar_Episodios(Name);
    //List.Buscar(Busqueda,jList3.getSelectedValue());
    break;
  case 3:
      URL=List_Enlazada.Buscar_Generos(Name);
    //List.Buscar(Busqueda,jList4.getSelectedValue());
    break;
  case 4:
      URL=List_Enlazada.Buscar_Playlist(Name);
    //List.Buscar(Busqueda,jList5.getSelectedValue());
    break;
  case 5:
      URL=List_Enlazada.Buscar_Usuarios(Name);
    //List.Buscar(Busqueda,jList6.getSelectedValue());
    break;
  case 6:
      URL=List_Enlazada.Buscar_Canciones(Name);
    //List.Buscar(Busqueda,jList7.getSelectedValue());
    break;
  case 7:
      URL=List_Enlazada.Buscar_Podcast(Name);
    //List.Buscar(Busqueda,jList8.getSelectedValue());
    break;
  
}
   
}   

    public String getURL() {
        return URL;
    }

   }