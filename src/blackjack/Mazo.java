/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

import java.util.LinkedList;
import java.util.Random;

public class Mazo {

private static Random rd = new Random();

    LinkedList<Carta> mazo = new LinkedList<>(); 

    LinkedList<Carta> cartasDeCorazones = new LinkedList<>();
    LinkedList<Carta> cartasDeDiamantes = new LinkedList<>();
    LinkedList<Carta> cartasDeTreboles = new LinkedList<>();
    LinkedList<Carta> cartasDePicas = new LinkedList<>();
    LinkedList<Carta> cartasJ = new LinkedList<>();
    LinkedList<Carta> cartasQ = new LinkedList<>();
    LinkedList<Carta> cartasK = new LinkedList<>();

    LinkedList<LinkedList<Carta>> cartasDeLaBaraja = new LinkedList<>();


    public void barajearCartas (LinkedList<Carta> cartas, int tipoDeCarta){
        
        cartasDeLaBaraja.add(cartas);
        
        while (cartas.size() != 10){
            Integer randomNumber = rd.nextInt(10) + 1; 
            boolean banderaCartaExistente = false;
            
            for (int i = 0; i < cartas.size(); i++) {
                if (cartas.get(i).getValor() == randomNumber){
                    banderaCartaExistente = true;
                }
            }
            
            if (!banderaCartaExistente){
                cartas.add(new Carta(randomNumber,tipoDeCarta));
            }
 
        }
    }
    
    public void barajearCartasEnEspecifico (LinkedList<Integer> cartas){
        barajearCartas(cartasDeCorazones,1);
        barajearCartas(cartasDeDiamantes,2);
        barajearCartas(cartasDeTreboles,3);
        barajearCartas(cartasDePicas,4);
        barajearCartas(cartasJ,5);
        barajearCartas(cartasQ,6);
        barajearCartas(cartasK,7);
    }
    
    public void combinarCartas (){
        int indexCartas = rd.nextInt(cartasDeLaBaraja.size());
        int indexCarta = rd.nextInt(cartasDeLaBaraja.get(indexCartas).size());
        
        mazo.add(cartasDeLaBaraja.get(indexCartas).remove());
        
        if (cartasDeLaBaraja.get(indexCartas).size() == 0)
            cartasDeLaBaraja.get(indexCartas).remove();   
    }
    
}
