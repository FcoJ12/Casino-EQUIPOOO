/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juegos.Tragamonedas;

/**
 *
 * @author Murat
 */
public class ContextoTragamonedas {
    Juego tipoJuego;
    
    public void setTipoJuego(Juego tipo){
        this.tipoJuego = tipo;
    }
    
    public void jugar(){
        tipoJuego.Jugar();
    }
}
