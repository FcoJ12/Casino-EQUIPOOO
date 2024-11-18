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
    private int saldo;
    private int apuesta;
    private boolean chaeckParar = false;
    private LinkedList<Carta> cartasDelJugador; 
    
    
    private Mediator mediator;
    
    public Jugador(int saldo, int apuesta, Mediator mediator){
        this.saldo = saldo;
        this.apuesta = apuesta;
        this.mediator = mediator;
        
        this.cartasDelJugador = new LinkedList<Carta>();
    }
    
    public void duplicarApuesta(){
        this.apuesta *= 2;
    }
    
    public void solicitarCartaCupier(){

    }
    
    public void addCarta(Carta carta){
        cartasDelJugador.add(carta);
        
        mediator.notify(this, "Carta Agregada");
    }
    
    public int sumarCartas(){
        int suma = 0;
        int sumaAses = 0;
        
        for (int i = 0; i < cartasDelJugador.size(); i++) {
            
            switch (cartasDelJugador.get(i).getValor()){
                case 1 -> {
                    sumaAses++;
                }
                case 2 -> {
                    suma += cartasDelJugador.get(i).getValor();
                }
                case 3 -> {
                    suma += cartasDelJugador.get(i).getValor();
                }
                case 4 -> {
                    suma += cartasDelJugador.get(i).getValor();
                }
                case 5 -> {
                    suma += cartasDelJugador.get(i).getValor();
                }
                case 6 -> {
                    suma += cartasDelJugador.get(i).getValor();
                }
                case 7 -> {
                    suma += cartasDelJugador.get(i).getValor();
                }
                case 8 -> {
                    suma += cartasDelJugador.get(i).getValor();
                }
                case 9 -> {
                    suma += cartasDelJugador.get(i).getValor();
                }
                case 10 -> {
                    suma += cartasDelJugador.get(i).getValor();
                }
                case 11 -> {
                    suma += 10;
                } 
                case 12 -> {
                    suma += 10;
                }
                case 13 -> {
                    suma += 10;
                }
            }
           
        }
        
        for (int i = 0; i < sumaAses; i++) {
            if (suma + 11 > 21)
                suma += 1;
            else
                suma += 11;
        }
        
        return suma;
    }
    
    
    public Carta getLastCart(){
        return cartasDelJugador.getLast();
    }
    
    public LinkedList<Carta> getCartas(){
        return cartasDelJugador;
    }
    
    public void setCheckParar (boolean check){
       chaeckParar = check;
       
       mediator.notify(this, "Jugador Paro");
    }
    

}
