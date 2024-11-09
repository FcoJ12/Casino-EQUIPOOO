/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack.Cartas;

import java.util.ArrayList;
import java.util.Arrays;

public class Carta {
    
    static ArrayList<String> tiposDeCartas = new ArrayList<String>(Arrays.asList("Corazones", "Diamantes", "Tréboles", "Picas","J","Q","K"));
    
    private int valor;
    private int tipoDeCarta;
    
    public Carta (int valor, int tipoDeCarta){
        this.valor = valor;
        this.tipoDeCarta = tipoDeCarta;
    }
    
    public int getValor (){
        return valor;
    }
    
    public int getTipoDeCarta (){
        return tipoDeCarta;
    }
    
    
    public String toString(){
        return valor + " : " + tiposDeCartas.get(tipoDeCarta-1) + "\n";
    }
}
