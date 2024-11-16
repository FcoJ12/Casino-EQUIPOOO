/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casino;

import Juegos.Tragamonedas.TragamonedasPanel;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Murat
 */
public class CasinoIGU extends JFrame{
    
    private CardLayout panelActual;
    private JPanel panelCasino;
    
    public CasinoIGU(){
        this.setSize(854,480);
        this.setTitle("Casino");
        
        panelActual = new CardLayout(); //Permite ir cambiando de paneles
        panelCasino = new JPanel(panelActual); //Para mostrar el panel actual
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        panelCasino.add(new TragamonedasPanel(), "Tragamonedas");//Anade a los paneles el juego de tragamonedas
        
        this.add(panelCasino);
        //Estoy probando, pero el funto es que aqui este la logica para cambiar de juego
        this.setJuego("Tragamonedas");
    }
    
    public void setJuego(String juego){
        panelActual.show(panelCasino, juego);
    }
    
    
}
