package blackjack;

import java.util.LinkedList;
import java.util.Random;

public class BlackJackShoe {
    
    static int numeroDeMazos = 6;
    static Random rd = new Random();
    
    public LinkedList<Carta> cartasDeShoeBarajeadas = new LinkedList<>();
    public LinkedList<Mazo> mazosDeJuego = new LinkedList<>();
    
    public BlackJackShoe() {
        
    }

    public void reiniciarBaraja(){
        
        for (int i = 0; i < numeroDeMazos; i++) {       //Generamos seis mazos
            Mazo newMazo = new Mazo();                  
            newMazo.obtenerMazoBarajeado();
            
            mazosDeJuego.add(newMazo);
        }
        
        while (mazosDeJuego.size() != 0){
            int indexMazo = rd.nextInt(mazosDeJuego.size());                                    //Obtenemos números aleatorios para intercalar los mazos.
            int indexCarta = rd.nextInt(mazosDeJuego.get(indexMazo).barajaCompleta.size());               //Obtenemos números aleatorios para intercalar los mazos.
            
            cartasDeShoeBarajeadas.add(mazosDeJuego.get(indexMazo).barajaCompleta.remove(indexCarta));   //Intercalamos las cartas.
            
            if (mazosDeJuego.get(indexMazo).barajaCompleta.size() == 0){                                 //Si las listas de las barajas quedan en cero entonces las quitamos.          
                mazosDeJuego.remove(indexMazo);
            }
        }

    }
}

