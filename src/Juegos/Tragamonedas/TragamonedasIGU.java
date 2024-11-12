package Juegos.Tragamonedas;

import Juegos.Tragamonedas.Simbolos.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Murat
 */
public class TragamonedasIGU extends JPanel{
    
    Tragamonedas tragamonedas;
    int saldo;
    JLabel saldoEtiqueta;
    JLabel premioEtiqueta;
    JLabel giro1;
    JLabel giro2;
    JLabel giro3;
    
    public TragamonedasIGU(){
        this.setSize(900,900);
        this.setLayout(null);
        tragamonedas = new Tragamonedas();
        JLabel encabezado = new JLabel("!!!GANA MILES DE PREMIOS!!!");
        encabezado.setBounds(260,10,500,50);
        this.add(encabezado);
        
        this.setBackground(Color.red.darker().darker().darker());
        encabezado.setFont(new Font("Arial",1,30));
        encabezado.setForeground(Color.white);
        
        saldo = 1000;
        saldoEtiqueta = new JLabel();
        saldoEtiqueta.setBounds(30, 150, 200, 30);
        saldoEtiqueta.setFont(new Font("Arial", Font.BOLD, 18));
        saldoEtiqueta.setForeground(Color.white);
        this.add(saldoEtiqueta);
        actualizarSaldo();

        premioEtiqueta = new JLabel();
        premioEtiqueta.setBounds(250,600,600,50);
        premioEtiqueta.setFont(new Font("arial",1,40));
        premioEtiqueta.setForeground(Color.white);
        
        this.add(premioEtiqueta);
        colocarBotones();
        colocarIconos();
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    
    public void actualizarSaldo(){
        this.saldoEtiqueta.setText("Saldo actual: " + saldo + "$");
    }
    
    private void colocarBotones(){
        
        Font fuente1 = new Font("arial",1,14);
        Font fuente2 = new Font("arial",1,17);
        
        JButton jugarSimple = new JButton("Juego simple ($3)");
        jugarSimple.setBounds(30,70,160,50);
        jugarSimple.setBackground(Color.gray.brighter());
        jugarSimple.setFont(fuente1);
        jugarSimple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jugar(3);  // Llama a jugar con un costo de $3
            }
        });
        
        JButton jugarDoble = new JButton("Juego doble ($6)");
        jugarDoble.setBounds(220,70,160,50);
        jugarDoble.setBackground(Color.gray.brighter());
        jugarDoble.setFont(fuente1);
        jugarDoble.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jugar(6);  
            }
        });

        
        JButton jugarTriple = new JButton("Juego triple ($9)");
        jugarTriple.setBounds(420,70,150,50);
        jugarTriple.setBackground(Color.gray.brighter());
        jugarTriple.setFont(fuente1);
        jugarTriple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jugar(9);  // Llama a jugar con un costo de $3
            }
        });
        
        JButton verTabla = new JButton("Ver tabla");
        verTabla.setBounds(620,70,150,50);
        verTabla.setBackground(Color.gray.brighter());
        verTabla.setFont(fuente2);
        
        JButton salir = new JButton("Salir");
        salir.setBounds(820,70,150,50);
        salir.setBackground(Color.gray.brighter());
        salir.setFont(fuente2);

        this.add(jugarSimple);
        this.add(jugarDoble);
        this.add(jugarTriple);
        this.add(verTabla);
        this.add(salir);

    }
    
    private void colocarIconos(){
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/Juegos/Tragamonedas/SimbolosIconos/SieteRojo.jpg"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/Juegos/Tragamonedas/SimbolosIconos/SieteVerde.jpg"));
        ImageIcon icon3 = new ImageIcon(getClass().getResource("/Juegos/Tragamonedas/SimbolosIconos/Cereza.jpg"));
        
        giro1 = new JLabel();
        giro1.setBounds(0,0,1000,1000);
        giro1.setIcon(new ImageIcon(icon1.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        
        giro2 = new JLabel(icon2);
        giro2.setBounds(0,0,1000,1000);
        giro2.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));

        
        giro3 = new JLabel(icon3);
        giro3.setBounds(100,0,1000,1000);
        giro3.setIcon(new ImageIcon(icon3.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        
        this.add(giro1);
        this.add(giro2);
        this.add(giro3);

    }
    
    private void jugar(int costo){
        if(costo<=saldo){
            saldo-=costo;
            actualizarSaldo();
            
            Tirada tirada;
            tirada = switch (costo) {
                case 3 -> tragamonedas.Jugar(1);
                case 6 -> tragamonedas.Jugar(3);
                case 9 -> tragamonedas.Jugar(5);
                default -> null;
            };
            
            mostrarTiradaInterfaz(tirada.getTirada());
            
            if(tirada.getPremio()>0){
                premioEtiqueta.setText("!!!! GANASTE " + tirada.getPremio() + " !!!!");
                this.saldo+=tirada.getPremio();
                actualizarSaldo();
            } else {
                premioEtiqueta.setText("Suerte para la proxima ");
            }
        } else {
            premioEtiqueta.setText("Saldo insuficiente :(");
        }
    }
    
    void mostrarTiradaInterfaz(ArrayList<Simbolo> tirada){
        for(int i=0; i<tirada.size(); i++){
            Simbolo sim = tirada.get(i);
            if(sim instanceof Bar){
                
            } else if(sim instanceof Siete){
                
            } else {
                
            }
            
        }
    }
    
}
