/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import javax.swing.JFrame;
/**
 *
 * @author Luis
 */
public class Grafo extends javax.swing.JFrame {

    /**
     * Creates new form Grafo
     */


public Grafo()
	{
        mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();
		graph.getModel().beginUpdate();
		try
		{
                    
                    
                    Object Abuelo = graph.insertVertex(parent, null,"Dime Cómo Quieres",350 ,0,80,30);
                       
                        Object padres1 = graph.insertVertex(parent, null, "La Mitad", 175, 40,  80, 30);
                        Object padres2 = graph.insertVertex(parent, null, "No Te Contaron Mal", 525, 40,  80, 30);
                       //hijos de padre1
                        Object hijos1 = graph.insertVertex(parent, null, "Aquí Abajo",87 , 80,  80, 30);
                        Object hijos2 = graph.insertVertex(parent, null, "La Sinvergüenza",262 , 80,  80, 30);
                        
                        //hijos de padre 2
                        Object hijos3 = graph.insertVertex(parent, null, "Pa' Olvidarme De Ella",437 , 80,  80, 30);
                        Object hijos4 = graph.insertVertex(parent, null, "Si Te Falta Alguien",612 , 80,  80, 30);
                        
                      //hijos de hijo 1
                        Object hijos5 = graph.insertVertex(parent, null, "Quédate",43 , 120,  80, 30);
                        Object hijos6 = graph.insertVertex(parent, null, "Un Cumbión Dolido",130 , 120,  80, 30);
                       //        hijos de hijo 2                 
                        Object hijos7 = graph.insertVertex(parent, null, "Probablemente",219, 120,  80, 30);
                        Object hijos8 = graph.insertVertex(parent, null, "Por el Resto de Tu Vida",305, 120,  80, 30);
                       // Hijos de hijos 4
                        Object hijos9 = graph.insertVertex(parent, null, "De Los Besos Que Te Di",569, 120,  80, 30);
                        Object hijos10 = graph.insertVertex(parent, null, "Botella Tras Botella",655, 120,  80, 30);
                        
                        //
                        Object hijos11 = graph.insertVertex(parent, null, "Ya No Somos Ni Seremos",394, 120,  80, 30);
                        Object hijos12 = graph.insertVertex(parent, null, "Adiós Amor",480, 120,  80, 30);
                        
                        
                        graph.insertEdge(parent, null, "", Abuelo, padres1);
                        graph.insertEdge(parent, null, "", Abuelo, padres2);
                        
                        graph.insertEdge(parent, null, "", padres1, hijos1);
                        graph.insertEdge(parent, null, "", padres1, hijos2);
                        
                        
                        graph.insertEdge(parent, null, "", padres2, hijos3);
                        graph.insertEdge(parent, null, "", padres2, hijos4);
                       
                        
                        graph.insertEdge(parent, null, "", hijos1, hijos5);
                        graph.insertEdge(parent, null, "", hijos1, hijos6);
                        
                        graph.insertEdge(parent, null, "", hijos2, hijos7);
                        graph.insertEdge(parent, null, "", hijos2, hijos8);
                        
                        
                        graph.insertEdge(parent, null, "", hijos3, hijos11);
                        graph.insertEdge(parent, null, "", hijos3, hijos12);
                        
                        graph.insertEdge(parent, null, "", hijos4, hijos9);
                        graph.insertEdge(parent, null, "", hijos4, hijos10);
                    
			/*Object Abuelo = graph.insertVertex(parent, null, "Musica", 350, 0, 80,
					30);
                        Object papa1 = graph.insertVertex(parent, null, "Canciones", 0, 60, 80,30);
                        Object papa2 = graph.insertVertex(parent, null, "albumes", 100, 60, 80,30);
                        Object papa3 = graph.insertVertex(parent, null, "Artistas", 200, 60, 80,30);
                        Object papa4 = graph.insertVertex(parent, null, "Episodios", 300, 60, 80,30);
                        Object papa5 = graph.insertVertex(parent, null, "Geneross", 400, 60, 80,30);
                        Object papa6 = graph.insertVertex(parent, null, "Playlist", 500, 60, 80,30);
                        Object papa7 = graph.insertVertex(parent, null, "Usuarios", 600, 60, 80,30);
                        Object papa8 = graph.insertVertex(parent, null, "Podcasts", 700, 60, 80,30);
                        
                        graph.insertEdge(parent, null, "Enlace", Abuelo, papa1);
                        graph.insertEdge(parent, null, "Enlace", Abuelo, papa2);
                        graph.insertEdge(parent, null, "Enlace", Abuelo, papa3);
                        graph.insertEdge(parent, null, "Enlace", Abuelo, papa4);
                        graph.insertEdge(parent, null, "Enlace", Abuelo, papa5);
                        graph.insertEdge(parent, null, "Enlace", Abuelo, papa6);
                        graph.insertEdge(parent, null, "Enlace", Abuelo, papa7);
                        graph.insertEdge(parent, null, "Enlace", Abuelo, papa8);
                        
                        //ALBUM
			Object v2 = graph.insertVertex(parent, null, "Me Dejé Llevar", 100, 100, 80,30);
                        Object v3 = graph.insertVertex(parent, null, "Ahora",100,140,  80,30);
                        //ARTISTA
                        Object v4 = graph.insertVertex(parent, null, "Christian Nodal",200, 100, 80,30);
                        Object v5 = graph.insertVertex(parent, null, "Cristian Castro",200, 140, 80,30);
                        //EPISODEO
                        Object v6 = graph.insertVertex(parent, null, "El dominio de la música regional mexicana",300, 100, 80,30);
                        Object v7 = graph.insertVertex(parent, null, "Episode 1811 (April 17, 2023)",300, 140, 80,30);
                        //PLAYLIST
                        Object v8 = graph.insertVertex(parent, null, "This Is Christian Nodal",500, 100, 80,30);
                        Object v9 = graph.insertVertex(parent, null, "Christian Nodal presenta AYAYAY",500, 140, 80,30);
                        //PODCAST 
                        Object v10 = graph.insertVertex(parent, null, "Classic Christian Books",700, 100, 80,30);
                        Object v11 = graph.insertVertex(parent, null, "Christian Nodal",700, 140, 80,30);
                        //CANCIONES
                        Object v12 = graph.insertVertex(parent, null, "Adiós Amor",0, 100, 80,30);
                        Object v13 = graph.insertVertex(parent, null, "Probablemente",0, 140, 80,30);
                        
                        
                        
                        
                        
                        
                        graph.insertEdge(parent, null, "Enlace", papa1, v12);
                        graph.insertEdge(parent, null, "Enlace", papa1, v13);
                        
                        graph.insertEdge(parent, null, "Enlace", papa2, v2);
                        graph.insertEdge(parent, null, "Enlace", papa2, v3);
                        
                        graph.insertEdge(parent, null, "Enlace", papa3, v4);
                        graph.insertEdge(parent, null, "Enlace", papa3, v5);
                        
                        graph.insertEdge(parent, null, "Enlace", papa4, v6);
                        graph.insertEdge(parent, null, "Enlace", papa4, v7);
                        
			graph.insertEdge(parent, null, "Enlace", papa6, v8);
                        graph.insertEdge(parent, null, "Enlace", papa6, v9);
                        
                        
                        graph.insertEdge(parent, null, "Enlace", papa8, v10);
                        graph.insertEdge(parent, null, "Enlace", papa8, v11);*/
                        
                       // graph.insertEdge(parent, null, "Edge", padre, v2);
		}
		finally
		{
			graph.getModel().endUpdate();
		}

		mxGraphComponent graphComponent = new mxGraphComponent(graph);
		getContentPane().add(graphComponent);
        }







    /*public Grafo() {
        initComponents();
        
        /*
        new Grafo().setVisible(true);
                
                mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();   
                graph.getModel().beginUpdate();
                
                try
		{
			Object Abuelo = graph.insertVertex(parent, null, "Musica", 0, 0, 80,
					30);
                        Object papa1 = graph.insertVertex(parent, null, "Canciones", 100, 30, 80,30);
                        Object papa2 = graph.insertVertex(parent, null, "Artistas", 50, 30, 80,30);
                        Object papa3 = graph.insertVertex(parent, null, "Albumes", 30, 30, 80,30);
                        Object papa4 = graph.insertVertex(parent, null, "Episodios", 30, 30, 80,30);
                        Object papa5 = graph.insertVertex(parent, null, "Generos", 30, 30, 80,30);
                        Object papa6 = graph.insertVertex(parent, null, "Playlist", 30, 30, 80,30);
                        Object papa7 = graph.insertVertex(parent, null, "Usuarios", 30, 30, 80,30);
                        Object papa8 = graph.insertVertex(parent, null, "Podcast", 30, 30, 80,30);
                        
                        
			Object v2 = graph.insertVertex(parent, null, "Leon", 200, 150, 80,30);
                        Object v3 = graph.insertVertex(parent, null, "Gato",200,170,  80,30);
                        Object v4 = graph.insertVertex(parent, null, "Perro",200, 200, 80,30);
                        Object v5 = graph.insertVertex(parent, null, "Guepardo",200, 210, 80,30);
                        Object v6 = graph.insertVertex(parent, null, "Pez Globo",200, 230, 80,30);
                        Object v7 = graph.insertVertex(parent, null, "Meduza",200, 220, 80,30);
                        
                        
                        graph.insertEdge(parent, null, "Enlace", papa1, v3);
                        graph.insertEdge(parent, null, "Enlace", papa1, v4);
                        
                        graph.insertEdge(parent, null, "Enlace", papa2, v2);
                        graph.insertEdge(parent, null, "Enlace", papa2, v5);
                        
                        graph.insertEdge(parent, null, "Enlace", papa3, v6);
                        graph.insertEdge(parent, null, "Enlace", papa3, v7);
                        
                        
                        
			graph.insertEdge(parent, null, "Enlace", Abuelo, papa1);
                        graph.insertEdge(parent, null, "Enlace", Abuelo, papa2);
                        graph.insertEdge(parent, null, "Enlace", Abuelo, papa3);
                        graph.insertEdge(parent, null, "Enlace", Abuelo, papa4);
                        graph.insertEdge(parent, null, "Enlace", Abuelo, papa5);
                        graph.insertEdge(parent, null, "Enlace", Abuelo, papa6);
                        graph.insertEdge(parent, null, "Enlace", Abuelo, papa7);
                        graph.insertEdge(parent, null, "Enlace", Abuelo, papa8);
                        
                        
                        
                        
                        
                       // graph.insertEdge(parent, null, "Edge", padre, v2);
		}
		finally
		{
			graph.getModel().endUpdate();
		}

		mxGraphComponent graphComponent = new mxGraphComponent(graph);
		//getContentPane().add(graphComponent);
                getContentPane().add(graphComponent);
                
        
        
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        
        
        
        
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Grafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             Grafo frame = new Grafo();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900, 320);
		frame.setVisible(true);   
                
                
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
