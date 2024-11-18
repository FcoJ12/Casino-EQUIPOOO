/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Juegos.Blackjack.Elementos;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.LinkedList;
import javax.swing.ImageIcon;


public class MesaBlackJack extends javax.swing.JFrame {

    public int dineroDisponible;
    public Mediator mediator;
    
    public MesaBlackJack(Mediator mediator) {
        this.mediator = mediator;
        
        initComponents(); 
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dineroJugador = new javax.swing.JLabel();
        buttonParar = new javax.swing.JButton();
        buttonPedir = new javax.swing.JButton();
        imageFicha = new javax.swing.JLabel();
        sumaDeCartas = new javax.swing.JLabel();
        sumaDeCartas1 = new javax.swing.JLabel();
        dineroApuesta = new javax.swing.JLabel();
        playerCard1 = new javax.swing.JLabel();
        playerCard2 = new javax.swing.JLabel();
        playerCard3 = new javax.swing.JLabel();
        playerCard4 = new javax.swing.JLabel();
        cupierCard1 = new javax.swing.JLabel();
        cupierCard2 = new javax.swing.JLabel();
        cupierCard3 = new javax.swing.JLabel();
        cupierCard4 = new javax.swing.JLabel();
        playerCard5 = new javax.swing.JLabel();
        playerCard6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dineroJugador.setText("Dinero Disponible: $");
        dineroJugador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(dineroJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 180, 55));

        buttonParar.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        buttonParar.setText("Parar");
        jPanel1.add(buttonParar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 155, 90));

        buttonPedir.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        buttonPedir.setText("+ Carta");
        jPanel1.add(buttonPedir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 155, 90));

        imageFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juegos/Blackjack/images/fichaVacia.png"))); // NOI18N
        imageFicha.setText("jLabel3");
        jPanel1.add(imageFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 94, -1));

        sumaDeCartas.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        sumaDeCartas.setText("0");
        jPanel1.add(sumaDeCartas, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 60, 50));

        sumaDeCartas1.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        sumaDeCartas1.setText("0");
        jPanel1.add(sumaDeCartas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 60, 50));

        dineroApuesta.setFont(new java.awt.Font("Cantarell", 1, 28)); // NOI18N
        dineroApuesta.setText("$ 500.00");
        jPanel1.add(dineroApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 158, 74));

        playerCard1.setBackground(new java.awt.Color(255, 255, 255));
        playerCard1.setText("1");
        jPanel1.add(playerCard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 90, 130));

        playerCard2.setBackground(new java.awt.Color(255, 255, 255));
        playerCard2.setText("1");
        jPanel1.add(playerCard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 90, 130));

        playerCard3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(playerCard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 90, 130));

        playerCard4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(playerCard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 90, 130));

        cupierCard1.setBackground(new java.awt.Color(255, 255, 255));
        cupierCard1.setText("1");
        jPanel1.add(cupierCard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 90, 130));

        cupierCard2.setBackground(new java.awt.Color(255, 255, 255));
        cupierCard2.setText("1");
        jPanel1.add(cupierCard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 90, 130));

        cupierCard3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cupierCard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 90, 130));

        cupierCard4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cupierCard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 90, 130));

        playerCard5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(playerCard5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 90, 130));

        playerCard6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(playerCard6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 90, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void setTextLabelDinero(int dinero){
        this.dineroJugador.setText("Dinero Disponible: "+dinero);
    }
    
    void setTextLabelApuesta(int dinero){
        this.dineroApuesta.setText("$ "+dinero+".00");
    }

    void setImagePlayer1(String pathName) {
        try {
            // Cargar la imagen desde la ruta proporcionada
            ImageIcon icon = new ImageIcon(pathName);

            // Escalar la imagen para ajustarse al tamaño del JLabel (opcional)
            Image image = icon.getImage();
            Image scaledImage = image.getScaledInstance(playerCard2.getWidth(), playerCard1.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImage);

            playerCard1.setIcon(icon);
            
            playerCard1.setOpaque(true);
            playerCard1.setBackground(Color.WHITE);
        } catch (Exception e) {
            // Manejar errores, por ejemplo, si la imagen no se encuentra
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
    }

    
    void setImagePlayer2(String pathName) {
        try {
            // Cargar la imagen desde la ruta proporcionada
            ImageIcon icon = new ImageIcon(pathName);

            // Escalar la imagen para ajustarse al tamaño del JLabel (opcional)
            Image image = icon.getImage();
            Image scaledImage = image.getScaledInstance(playerCard2.getWidth(), playerCard2.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImage);

            playerCard2.setIcon(icon);
                        
            playerCard2.setOpaque(true);
            playerCard2.setBackground(Color.WHITE);
        } catch (Exception e) {
            // Manejar errores, por ejemplo, si la imagen no se encuentra
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
    }
        
    void setImagePlayer3(String pathName) {
        try {
            // Cargar la imagen desde la ruta proporcionada
            ImageIcon icon = new ImageIcon(pathName);

            // Escalar la imagen para ajustarse al tamaño del JLabel (opcional)
            Image image = icon.getImage();
            Image scaledImage = image.getScaledInstance(playerCard3.getWidth(), playerCard3.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImage);

            playerCard3.setIcon(icon);
            
            playerCard3.setOpaque(true);
            playerCard3.setBackground(Color.WHITE);
        } catch (Exception e) {
            // Manejar errores, por ejemplo, si la imagen no se encuentra
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
    }
    
    void setImagePlayer4(String pathName) {
        try {
            // Cargar la imagen desde la ruta proporcionada
            ImageIcon icon = new ImageIcon(pathName);

            // Escalar la imagen para ajustarse al tamaño del JLabel (opcional)
            Image image = icon.getImage();
            Image scaledImage = image.getScaledInstance(playerCard4.getWidth(), playerCard4.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImage);

            playerCard4.setIcon(icon);
            
            playerCard4.setOpaque(true);
            playerCard4.setBackground(Color.WHITE);
        } catch (Exception e) {
            // Manejar errores, por ejemplo, si la imagen no se encuentra
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
    }
    
    void setImagePlayer5(String pathName) {
        try {
            // Cargar la imagen desde la ruta proporcionada
            ImageIcon icon = new ImageIcon(pathName);

            // Escalar la imagen para ajustarse al tamaño del JLabel (opcional)
            Image image = icon.getImage();
            Image scaledImage = image.getScaledInstance(playerCard5.getWidth(), playerCard5.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImage);

            playerCard5.setIcon(icon);
            
            playerCard5.setOpaque(true);
            playerCard5.setBackground(Color.WHITE);
        } catch (Exception e) {
            // Manejar errores, por ejemplo, si la imagen no se encuentra
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
    }
    
    void setImagePlayer6(String pathName) {
        try {
            // Cargar la imagen desde la ruta proporcionada
            ImageIcon icon = new ImageIcon(pathName);

            // Escalar la imagen para ajustarse al tamaño del JLabel (opcional)
            Image image = icon.getImage();
            Image scaledImage = image.getScaledInstance(playerCard6.getWidth(), playerCard6.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImage);

            playerCard6.setIcon(icon);
            
            playerCard6.setOpaque(true);
            playerCard6.setBackground(Color.WHITE);
        } catch (Exception e) {
            // Manejar errores, por ejemplo, si la imagen no se encuentra
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
    }
    
    
    
    void setCupierCard1(String pathName) {
        try {
            // Cargar la imagen desde la ruta proporcionada
            ImageIcon icon = new ImageIcon(pathName);

            // Escalar la imagen para ajustarse al tamaño del JLabel (opcional)
            Image image = icon.getImage();
            Image scaledImage = image.getScaledInstance(cupierCard1.getWidth(), cupierCard1.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImage);

            cupierCard1.setIcon(icon);
            
            cupierCard1.setOpaque(true);
            cupierCard1.setBackground(Color.WHITE);
        } catch (Exception e) {
            // Manejar errores, por ejemplo, si la imagen no se encuentra
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
    }
    
    void setCupierCard2(String pathName) {
        try {
            // Cargar la imagen desde la ruta proporcionada
            ImageIcon icon = new ImageIcon(pathName);

            // Escalar la imagen para ajustarse al tamaño del JLabel (opcional)
            Image image = icon.getImage();
            Image scaledImage = image.getScaledInstance(cupierCard2.getWidth(), cupierCard2.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImage);

            cupierCard2.setIcon(icon);
            
            cupierCard2.setOpaque(true);
            cupierCard2.setBackground(Color.WHITE);
        } catch (Exception e) {
            // Manejar errores, por ejemplo, si la imagen no se encuentra
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
    }
    
    void setCupierCard3(String pathName) {
        try {
            // Cargar la imagen desde la ruta proporcionada
            ImageIcon icon = new ImageIcon(pathName);

            // Escalar la imagen para ajustarse al tamaño del JLabel (opcional)
            Image image = icon.getImage();
            Image scaledImage = image.getScaledInstance(cupierCard3.getWidth(), cupierCard3.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImage);

            cupierCard3.setIcon(icon);
            
            cupierCard3.setOpaque(true);
            cupierCard3.setBackground(Color.WHITE);
        } catch (Exception e) {
            // Manejar errores, por ejemplo, si la imagen no se encuentra
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
    }
        
    void setCupierCard4(String pathName) {
        try {
            // Cargar la imagen desde la ruta proporcionada
            ImageIcon icon = new ImageIcon(pathName);

            // Escalar la imagen para ajustarse al tamaño del JLabel (opcional)
            Image image = icon.getImage();
            Image scaledImage = image.getScaledInstance(cupierCard4.getWidth(), cupierCard4.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImage);

            cupierCard4.setIcon(icon);
            
            cupierCard4.setOpaque(true);
            cupierCard4.setBackground(Color.WHITE);
        } catch (Exception e) {
            // Manejar errores, por ejemplo, si la imagen no se encuentra
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
    }
      
    
    void setSuamDeCartasJugador(int suma){
        sumaDeCartas.setText(Integer.toString(suma));
    }
    
    void setSuamDeCartasJugador1(int suma){
        sumaDeCartas1.setText(Integer.toString(suma));
    }
    
    int getSuamDeCartasJugador(){
        return  Integer.parseInt(sumaDeCartas.getText());
    }
    
    int getSuamDeCartasJugador1(){
        return  Integer.parseInt(sumaDeCartas1.getText());
    }
    
    void setButtonPedirState(boolean state){
        this.buttonPedir.setEnabled(state);
    }
    
    void setButtonPararState(boolean state){
        this.buttonParar.setEnabled(state);
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonParar;
    private javax.swing.JButton buttonPedir;
    private javax.swing.JLabel cupierCard1;
    private javax.swing.JLabel cupierCard2;
    private javax.swing.JLabel cupierCard3;
    private javax.swing.JLabel cupierCard4;
    private javax.swing.JLabel dineroApuesta;
    private javax.swing.JLabel dineroJugador;
    private javax.swing.JLabel imageFicha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel playerCard1;
    private javax.swing.JLabel playerCard2;
    private javax.swing.JLabel playerCard3;
    private javax.swing.JLabel playerCard4;
    private javax.swing.JLabel playerCard5;
    private javax.swing.JLabel playerCard6;
    private javax.swing.JLabel sumaDeCartas;
    private javax.swing.JLabel sumaDeCartas1;
    // End of variables declaration//GEN-END:variables
}
