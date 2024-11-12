package Juegos.Tragamonedas.Simbolos;

/**
 *
 * @author Murat
 */
public class Bar extends Simbolo {
    
    int numBars;
    
    public Bar(int numBars){
        this.numBars = numBars;
        valor = 40;
    }
    
    public int getBars(){
        return numBars;
    }
}

