/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juegos.Tragamonedas;

/**
 *
 * @author Murat
 */
public class JugarSimple implements Juego {

    @Override
    public void Jugar() {
        double saldo = TragamonedasPanel.TraPanel.getSaldo();
        if(3<=saldo){
            TragamonedasPanel.TraPanel.setSaldo(saldo-3);
            TragamonedasPanel.TraPanel.actualizarSaldo();
            Tirada tirada = TragamonedasPanel.TraPanel.tragamonedas.Jugar(1);
            TragamonedasPanel.TraPanel.mostrarTiradaInterfaz(tirada.getTirada());
            
            if(tirada.getPremio()>0){
                TragamonedasPanel.TraPanel.premioEtiqueta.setText("!!!! GANASTE " + tirada.getPremio() + " !!!!");
                TragamonedasPanel.TraPanel.setSaldo(TragamonedasPanel.TraPanel.getSaldo()+tirada.getPremio());
                TragamonedasPanel.TraPanel.actualizarSaldo();
            } else {
                TragamonedasPanel.TraPanel.premioEtiqueta.setText("Suerte para la proxima ");
            }
        } else {
            TragamonedasPanel.TraPanel.premioEtiqueta.setText("Saldo insuficiente :(");
        }
    }
    
}
