/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuletaNumeros;

/**
 *
 * @author arely
 */
public class Pleno extends UtileriasRuleta{
    int num;
    String color; //rojo, negro o verde que seria el 0

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Pleno(int num, String color) {
        this.num = num;
        this.color = color;
    }
    
    @Override
    public int calcularGanancia() {
        return getApuesta() * 36; 
    }
    
}
