/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juegos.Blackjack.Cartas;

import java.util.LinkedList;
import java.util.Random;

public class Mazo {

private static Random rd = new Random();

    private LinkedList<Carta> barajaCompleta = new LinkedList<>(); 

    private LinkedList<Carta> cartasDeCorazones = new LinkedList<>();
    private LinkedList<Carta> cartasDeDiamantes = new LinkedList<>();
    private LinkedList<Carta> cartasDeTreboles = new LinkedList<>();
    private LinkedList<Carta> cartasDePicas = new LinkedList<>();
    private LinkedList<Carta> cartasJ = new LinkedList<>();
    private LinkedList<Carta> cartasQ = new LinkedList<>();
    private LinkedList<Carta> cartasK = new LinkedList<>();

    private LinkedList<LinkedList<Carta>> cartasDeLaBaraja = new LinkedList<>();

    public void barajearCartasEnEspecifico (){
        barajearTiposDeCartas(cartasDeCorazones,1,10);
        barajearTiposDeCartas(cartasDeDiamantes,2,10);
        barajearTiposDeCartas(cartasDeTreboles,3,10);
        barajearTiposDeCartas(cartasDePicas,4,10);
        barajearTiposDeCartas(cartasJ,5,4);
        barajearTiposDeCartas(cartasQ,6,4);
        barajearTiposDeCartas(cartasK,7,4);
    }
    
    public void barajearTiposDeCartas (LinkedList<Carta> cartas, int tipoDeCarta, int cantidad){
        
        cartasDeLaBaraja.add(cartas);
        
        while (cartas.size() != cantidad){
            Integer randomNumber = rd.nextInt(cantidad) + 1; 
            boolean banderaCartaExistente = false;
            
            for (int i = 0; i < cartas.size(); i++) {
                if (cartas.get(i).getValor() == randomNumber){
                    banderaCartaExistente = true;
                }
            }
            
            if (!banderaCartaExistente){
                if (tipoDeCarta != 5 && tipoDeCarta != 6 && tipoDeCarta != 7)
                    cartas.add(new Carta(randomNumber,tipoDeCarta));
                else 
                    cartas.add(new Carta(10,tipoDeCarta));
            }
        }
        
    }
    
    public void combinarCartas (){
        while(cartasDeLaBaraja.size() != 0){
            int indexCartas = rd.nextInt(cartasDeLaBaraja.size());
            int indexCarta = rd.nextInt(cartasDeLaBaraja.get(indexCartas).size());

            barajaCompleta.add(cartasDeLaBaraja.get(indexCartas).remove(indexCarta));

            if (cartasDeLaBaraja.get(indexCartas).size() == 0)
                cartasDeLaBaraja.remove(indexCartas);   
        }
    }
    
    public void obtenerMazoBarajeado (){
        barajearCartasEnEspecifico();
        combinarCartas();
    }
    
    
    public LinkedList<Carta> getBarajaCompleta(){
        return barajaCompleta;
    }

    
}
