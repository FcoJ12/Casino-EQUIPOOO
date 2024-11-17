package Juegos.Tragamonedas;

import Juegos.Tragamonedas.Simbolos.*;
import casino.JFrame_Principal;
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
public class TragamonedasPanel extends JPanel{
    
    Tragamonedas tragamonedas;
    double saldo;
    JLabel saldoEtiqueta;
    JLabel premioEtiqueta;
    ArrayList<JLabel> giros;
    Premios premios;
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
        actualizarSaldo();
    }
    
    public TragamonedasPanel(){
        this.setSize(854,480);
        this.setLayout(null);
        tragamonedas = new Tragamonedas();
        
        this.setBackground(Color.red.darker().darker().darker());
        
        //saldo = 1000;
        saldoEtiqueta = new JLabel();
        saldoEtiqueta.setBounds(30, 130, 200, 30);
        saldoEtiqueta.setFont(new Font("Arial", Font.BOLD, 18));
        saldoEtiqueta.setForeground(Color.white);
        this.add(saldoEtiqueta);
        this.saldoEtiqueta.setText("Saldo actual: " + saldo + "$");

        premioEtiqueta = new JLabel();
        premioEtiqueta.setBounds(210,350,600,50);
        premioEtiqueta.setFont(new Font("arial",1,40));
        premioEtiqueta.setForeground(Color.white);
        premios = new Premios();
        
        this.add(premioEtiqueta);
        colocarBotones();
        colocarIconos();
    }
    
    public void actualizarSaldo(){
        this.saldoEtiqueta.setText("Saldo actual: " + saldo + "$");
        JFrame_Principal.principalWindow.setSaldo(saldo);
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
                jugar(3); 
            }
        });
        
        JButton jugarDoble = new JButton("Juego doble ($6)");
        jugarDoble.setBounds(210,70,160,50);
        jugarDoble.setBackground(Color.gray.brighter());
        jugarDoble.setFont(fuente1);
        jugarDoble.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jugar(6);  
            }
        });

        
        JButton jugarTriple = new JButton("Juego triple ($9)");
        jugarTriple.setBounds(390,70,160,50);
        jugarTriple.setBackground(Color.gray.brighter());
        jugarTriple.setFont(fuente1);
        jugarTriple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jugar(9);  
            }
        });
        
        JButton verTabla = new JButton("Ver tabla");
        verTabla.setBounds(570,70,120,50);
        verTabla.setBackground(Color.gray.brighter());
        verTabla.setFont(fuente2);
        verTabla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                premios.setVisible(true);
            }
        });
        
        JButton salir = new JButton("Salir");
        salir.setBounds(710,70,100,50);
        salir.setBackground(Color.gray.brighter());
        salir.setFont(fuente2);
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ventana = (JFrame) javax.swing.SwingUtilities.getWindowAncestor(TragamonedasPanel.this);
                ventana.setVisible(false);
                premios.setVisible(false);
                JFrame_Principal.principalWindow.setVisible(true);
                JFrame_Principal.principalWindow.actualizarSaldo();
            }
        });

        this.add(jugarSimple);
        this.add(jugarDoble);
        this.add(jugarTriple);
        this.add(verTabla);
        this.add(salir);

    }
    
    private void colocarIconos(){
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/Juegos/Tragamonedas/SimbolosIconos/3Bar.jpg"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/Juegos/Tragamonedas/SimbolosIconos/Manzana.jpg"));
        ImageIcon icon3 = new ImageIcon(getClass().getResource("/Juegos/Tragamonedas/SimbolosIconos/Sandia.jpg"));
        
        giros = new ArrayList<>();
        
        JLabel giro0 = new JLabel();
        giro0.setBounds(90,170,150,150);
        giro0.setIcon(new ImageIcon(icon1.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        
        JLabel giro1 = new JLabel();
        giro1.setBounds(340,170,150,150);
        giro1.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));

        JLabel giro2 = new JLabel();
        giro2.setBounds(590,170,150,150);
        giro2.setIcon(new ImageIcon(icon3.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        
        giros.add(giro0);
        giros.add(giro1);
        giros.add(giro2);
        
        this.add(giros.get(0));
        this.add(giros.get(1));
        this.add(giros.get(2));
    }
    
    private void jugar(int costo){
        if(costo<=saldo){
            saldo-=costo;
            actualizarSaldo();
            
            Tirada tirada;
            tirada = switch (costo) {
                case 3 -> tragamonedas.Jugar(1);
                case 6 -> tragamonedas.Jugar(2);
                case 9 -> tragamonedas.Jugar(4);
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
            ImageIcon icono = null;
            if(sim instanceof Bar){
                Bar bari = (Bar) tirada.get(i);
                int numBars = bari.getBars();
                switch(numBars){
                    case 1->{
                        icono = new ImageIcon(getClass().getResource("/Juegos/Tragamonedas/SimbolosIconos/1Bar.jpg"));
                    }
                    case 2->{
                        icono = new ImageIcon(getClass().getResource("/Juegos/Tragamonedas/SimbolosIconos/2Bar.jpg"));
                    }
                    case 3->{
                        icono = new ImageIcon(getClass().getResource("/Juegos/Tragamonedas/SimbolosIconos/3Bar.jpg"));
                    }
                }
            } else if(sim instanceof Siete){
                Siete sieteI = (Siete) tirada.get(i);
                if(sieteI.getColor().equals("rojo"))
                    icono = new ImageIcon(getClass().getResource("/Juegos/Tragamonedas/SimbolosIconos/SieteRojo.jpg"));
                else
                    icono = new ImageIcon(getClass().getResource("/Juegos/Tragamonedas/SimbolosIconos/SieteVerde.jpg"));
            } else {
                String clase = tirada.get(i).getClass().getSimpleName();
                icono = new ImageIcon(getClass().getResource("/Juegos/Tragamonedas/SimbolosIconos/"+clase+".jpg"));
            }
            
            if (icono != null) {
                icono = new ImageIcon(icono.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
            }
            
            giros.get(i).setIcon(new ImageIcon(icono.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        }
    }
    
}
