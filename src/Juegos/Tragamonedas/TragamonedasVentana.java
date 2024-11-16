/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juegos.Tragamonedas;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Murat
 */
public class TragamonedasVentana extends JFrame {
    
    JPanel trPanel;
    
    public TragamonedasVentana(){
        this.setSize(854,480);
        this.setTitle("Tragamonedas");
        
        trPanel = new TragamonedasPanel();
        this.add(trPanel);
    }
    
    
}
