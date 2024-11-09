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
        
        for (int i = 0; i < numeroDeMazos; i++) {
            Mazo newMazo = new Mazo(); 
            newMazo.obtenerMazoBarajeado();
            
            mazosDeJuego.add(newMazo);
        }
        
        while (mazosDeJuego.size() != 0){
            int indexMazo = rd.nextInt(mazosDeJuego.size());
            int indexCarta = rd.nextInt(mazosDeJuego.get(indexMazo).mazo.size());
            
            cartasDeShoeBarajeadas.add(mazosDeJuego.get(indexMazo).mazo.remove(indexCarta));
            
            if (mazosDeJuego.get(indexMazo).mazo.size() == 0){
                mazosDeJuego.remove(indexMazo);
            }
        }

    }
}

