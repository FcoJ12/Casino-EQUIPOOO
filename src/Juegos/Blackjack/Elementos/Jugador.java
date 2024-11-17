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
public class Jugador {
    
    
    
    private LinkedList<Carta> cartasCupier;  //Cartas del juego de CUPIER.
    int saldo;
    int apuesta;

    
    public Jugador(int saldo){
        this.saldo = saldo;
    }
    
    public void duplicarApuesta(){
        this.apuesta *= 2;
    }
    
    public void solicitarCartaCupier(){
        this.apuesta *= 2;
    }
    
}
