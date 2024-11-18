/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juegos.RuletaNumeros;

/**
 *
 * @author arely
 */
public class UtileriasRuleta {
    double apuesta;
    
    
    public double getApuesta() {
        return apuesta;
    }

    public void setApuesta(double apuesta) {
        this.apuesta = apuesta;
    }
    
    public void limpiar(){
        apuesta = 0;
    }
    
    public void sumarFicha(){
        apuesta++;
    }

    
    @Override
    public String toString(){
        return "Apuesta: " + apuesta;
    }
    
    public double calcularGanancia(){
        return 0;
    }
}
