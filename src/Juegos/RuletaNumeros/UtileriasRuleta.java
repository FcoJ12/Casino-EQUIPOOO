/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuletaNumeros;

/**
 *
 * @author arely
 */
public class UtileriasRuleta {
    int apuesta;
    
    
    public int getApuesta() {
        return apuesta;
    }

    public void setApuesta(int apuesta) {
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
    
    public int calcularGanancia(){
        return 0;
    }
}
