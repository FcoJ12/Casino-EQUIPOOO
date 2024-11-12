package Juegos.Tragamonedas.Simbolos;

/**
 *
 * @author Murat
 */
public class Siete extends Simbolo {
    String color;
    
    public Siete(String color){
        this.color=color;
        if(color == "rojo")
            valor = 100;
        else
            valor = 80;
    }
    
    public String getColor(){
        return color;
    }
    
}
