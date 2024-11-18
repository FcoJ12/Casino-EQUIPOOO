/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package casino;

import Juegos.ruletaPremios.Ruleta;
import Casino.Entrar;
import Usuario.*;
import Juegos.Tragamonedas.TragamonedasVentana;
import Usuario.RecargarSaldo;
import Juegos.Blackjack.BlackJackPrincipal;
import Juegos.ruletaPremios.ruletaVentana;
import Juegos.RuletaNumeros.VentanaPrincipalRul;
import java.util.List;

/**
 *
 * @author Murat
 */
public class JFrame_Principal extends javax.swing.JFrame {
    
    public static JFrame_Principal principalWindow;

    private BlackJackPrincipal blackJack = new BlackJackPrincipal("BlackJack Menú");
    private TragamonedasVentana tragamonedas = new TragamonedasVentana();
    private VentanaPrincipalRul ruletaNum = new VentanaPrincipalRul();
    private RecargarSaldo rS = new RecargarSaldo();
    private ruletaVentana ruleta;
    double saldo;
    List<String> premios;
    
    public JFrame_Principal(String s, double saldo, List<String> premios) {
        super(s);
        this.ruleta = new ruletaVentana(saldo, premios);
        initComponents();
        principalWindow = this;
        this.premios = premios;
        this.saldo=saldo;
        jLabel1.setText("Saldo: " + saldo + "$");
        tragamonedas.trPanel.setSaldo(this.saldo);
        rS.setSaldo(this.saldo);
        ruleta.setSaldo(this.saldo);
    }
    
    public void actualizarPremios(){
        this.repaint();
    }

    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    
    public void actualizarSaldo(){
        jLabel1.setText("Saldo: " + saldo + "$");
        this.repaint();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BlackJack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ruletaP = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));

        BlackJack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BlackJack.setText("BlackJack");
        BlackJack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackJackActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Tragamonedas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Saldo: ");

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("Cerrar sesión");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setText("Ruleta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ruletaP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ruletaP.setText("Premios");
        ruletaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruletaPActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton5.setText("Recargar saldo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BlackJack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(ruletaP, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BlackJack, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruletaP, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(192, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BlackJackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlackJackActionPerformed
        blackJack.setVisible(true);
        
        blackJack.usuario = "Francisco";  ////////////////////////// Modificar
        blackJack.dinderoDelUsuario = 10_000;
        
        blackJack.setUsuarioInfoLabelText();
        
        this.setVisible(false);
    }//GEN-LAST:event_BlackJackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tragamonedas.setVisible(true);
        tragamonedas.trPanel.setSaldo(this.saldo);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Entrar.VentanaEntrar.uM.getUsuarioActual().setSaldo(saldo);
        Entrar.VentanaEntrar.uM.getUsuarioActual().setPremios(premios);
        Entrar.VentanaEntrar.uM.guardarUsuarios();
        Entrar.VentanaEntrar.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ruletaNum.setVisible(true);
        //ruletaNum.trPanel.setSaldo(this.saldo);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        rS.setSaldo(saldo);
        rS.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void ruletaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruletaPActionPerformed
        // TODO add your handling code here:
        
            ruleta.setVisible(true);
            this.setVisible(false);
            this.setSaldo(saldo);
            this.setPremios(premios);
    }//GEN-LAST:event_ruletaPActionPerformed

    public void setJFramePrincipalVisible(){
        this.setVisible(true);
    }
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BlackJack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ruletaP;
    // End of variables declaration//GEN-END:variables

    public void setPremios(List<String> premios) {
      this.premios = premios;  
    }
}
