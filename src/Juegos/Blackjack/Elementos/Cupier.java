/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juegos.Blackjack.Elementos;

import Juegos.Blackjack.Cartas.Carta;
import java.util.LinkedList;

/**
 *
 * @author javi
 */
public class Cupier {
    
    private BlackJackShoe SHOE;
    private LinkedList<Carta> cartasCupier;  //Cartas del juego de CUPIER.
    
    public Cupier(){
        this.SHOE = new BlackJackShoe(); // AL inicializarlo se barajean las cartas
    }    
    
    
}
