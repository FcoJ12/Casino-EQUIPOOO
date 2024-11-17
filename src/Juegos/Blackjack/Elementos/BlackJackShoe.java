package Juegos.Blackjack.Elementos;

import Juegos.Blackjack.Cartas.Carta;
import Juegos.Blackjack.Cartas.Mazo;
import java.util.LinkedList;
import java.util.Random;

class BlackJackShoe {
    
    static int numeroDeMazos = 6;
    static Random rd = new Random();
    
    public LinkedList<Carta> cartasDeShoeBarajeadas = new LinkedList<>();
    
    public BlackJackShoe() {
        barajearCartas();
    }

    public void barajearCartas(){
        LinkedList<Mazo> mazosDeJuego = new LinkedList<>();

        for (int i = 0; i < numeroDeMazos; i++) {       //Generamos seis mazos
            Mazo newMazo = new Mazo();                  
            newMazo.obtenerMazoBarajeado();
            
            mazosDeJuego.add(newMazo);
        }
        
        while (mazosDeJuego.size() != 0){
            int indexMazo = rd.nextInt(mazosDeJuego.size());                                    //Obtenemos números aleatorios para intercalar los mazos.
            int indexCarta = rd.nextInt(mazosDeJuego.get(indexMazo).getBarajaCompleta().size());               //Obtenemos números aleatorios para intercalar los mazos.
            
            cartasDeShoeBarajeadas.add(mazosDeJuego.get(indexMazo).getBarajaCompleta().remove(indexCarta));   //Intercalamos las cartas.
            
            if (mazosDeJuego.get(indexMazo).getBarajaCompleta().size() == 0){                                 //Si las listas de las barajas quedan en cero entonces las quitamos.          
                mazosDeJuego.remove(indexMazo);
            }
        }

    }
    
    public LinkedList<Carta> getCartasDeShoeBarajeadas(){
        return cartasDeShoeBarajeadas;
    }
    
    public Carta desencolarCarta(){
        return cartasDeShoeBarajeadas.pollFirst();
    }
       
}

