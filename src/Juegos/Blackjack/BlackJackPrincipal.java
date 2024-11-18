/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Juegos.Blackjack;

import casino.JFrame_Principal;

public class BlackJackPrincipal extends javax.swing.JFrame {
    
    public static BlackJackPrincipal BlackJack;
    
    public String usuario;
    public double dinderoDelUsuario;
    
    /**
     * Creates new form BlackJack
     */
    
    public BlackJackPrincipal(String s) {
        super(s);
        initComponents();
        BlackJackPrincipal.BlackJack = this;
    }
    
    public void setDineroDelUsuario(double dinderoDelUsuario){
        this.dinderoDelUsuario = dinderoDelUsuario;
    }

    public void actualizarDinero(){
        setUsuarioInfoLabelText();
        JFrame_Principal.principalWindow.setSaldo(dinderoDelUsuario);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonMenuPrincipal = new javax.swing.JButton();
        botonJugarBlackJack = new javax.swing.JButton();
        imageBlackJack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        fichasLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 0));

        botonMenuPrincipal.setBackground(new java.awt.Color(102, 102, 255));
        botonMenuPrincipal.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        botonMenuPrincipal.setText("Menú Principal");
        botonMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuPrincipalActionPerformed(evt);
            }
        });

        botonJugarBlackJack.setBackground(new java.awt.Color(102, 153, 0));
        botonJugarBlackJack.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        botonJugarBlackJack.setText("Jugar");
        botonJugarBlackJack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugarBlackJackActionPerformed(evt);
            }
        });

        imageBlackJack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juegos/Blackjack/images/blackJack.png"))); // NOI18N
        imageBlackJack.setText("jLabel1");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juegos/Blackjack/images/cartas.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juegos/Blackjack/images/fichas.png"))); // NOI18N

        userLabel.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        userLabel.setText("Ususuario:");

        fichasLabel.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        fichasLabel.setText("Fichas: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonJugarBlackJack, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(botonMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(fichasLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imageBlackJack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imageBlackJack, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(botonJugarBlackJack, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(botonMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(userLabel)
                        .addGap(28, 28, 28)
                        .addComponent(fichasLabel)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuPrincipalActionPerformed
        this.setVisible(false);
        actualizarDinero();
        JFrame_Principal.principalWindow.setVisible(true);
    }//GEN-LAST:event_botonMenuPrincipalActionPerformed

    private void botonJugarBlackJackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugarBlackJackActionPerformed
        JFrameIngresoDeApuesta apuestaFrame = new JFrameIngresoDeApuesta("Ingresa tu Apuesta");
        apuestaFrame.dineroDisponible = dinderoDelUsuario;
        
        apuestaFrame.setVisible(true);
        
    }//GEN-LAST:event_botonJugarBlackJackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonJugarBlackJack;
    private javax.swing.JButton botonMenuPrincipal;
    private javax.swing.JLabel fichasLabel;
    private javax.swing.JLabel imageBlackJack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables


    public void setUsuarioInfoLabelText (){
        this.userLabel.setText("Usuario: "+usuario);
        this.fichasLabel.setText("Fichas: "+dinderoDelUsuario);
    }
    
}
