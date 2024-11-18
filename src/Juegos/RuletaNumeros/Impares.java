/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juegos.RuletaNumeros;

/**
 *
 * @author arely
 */
public class Impares extends UtileriasRuleta{
    @Override
    public double calcularGanancia() {
        return getApuesta() * 20; 
    }
}
