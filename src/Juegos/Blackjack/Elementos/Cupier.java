package Juegos.Blackjack.Elementos;

import Juegos.Blackjack.Cartas.Carta;
import java.util.LinkedList;

public class Cupier {

    private Mediator mediator;                 
    private BlackJackShoe shoe;                
    private LinkedList<Carta> cartasDelCupier; 

    public Cupier(Mediator mediator) {
        this.mediator = mediator;
        this.shoe = new BlackJackShoe(); 
        this.cartasDelCupier = new LinkedList<>(); 
    }
    
    public void repartirCartasInicio() {
        for (int i = 0; i < 2; i++) {
            tomarCarta();
        }
        
        mediator.notify(this, "Repartir Cartas Inicio"); 
    }

    public Carta repartirCarta() {
        return shoe.desencolarCarta();  
    }

    // Draws a card for the dealer
    public void tomarCarta() {
        Carta carta = shoe.desencolarCarta();
        cartasDelCupier.add(carta); // Adds the card to the dealer's hand.
        mediator.notify(this, "Tomar Carta");
    }
    
    public Carta getFirst() {
        return cartasDelCupier.getFirst();
    }
    
    public Carta getLast() {
        return cartasDelCupier.getLast();
    }
    
    public LinkedList<Carta> getCartasDelCupier(){
        return cartasDelCupier;
    }
    

    public int sumarCartas(){
        int suma = 0;
        int sumaAses = 0;
        
        for (int i = 0; i < cartasDelCupier.size(); i++) {
            
            switch (cartasDelCupier.get(i).getValor()){
                case 1 -> {
                    sumaAses++;
                }
                case 2 -> {
                    suma += cartasDelCupier.get(i).getValor();
                }
                case 3 -> {
                    suma += cartasDelCupier.get(i).getValor();
                }
                case 4 -> {
                    suma += cartasDelCupier.get(i).getValor();
                }
                case 5 -> {
                    suma += cartasDelCupier.get(i).getValor();
                }
                case 6 -> {
                    suma += cartasDelCupier.get(i).getValor();
                }
                case 7 -> {
                    suma += cartasDelCupier.get(i).getValor();
                }
                case 8 -> {
                    suma += cartasDelCupier.get(i).getValor();
                }
                case 9 -> {
                    suma += cartasDelCupier.get(i).getValor();
                }
                case 10 -> {
                    suma += cartasDelCupier.get(i).getValor();
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
}
