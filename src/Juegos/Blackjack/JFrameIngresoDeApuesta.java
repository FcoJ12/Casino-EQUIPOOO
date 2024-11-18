/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Juegos.Blackjack;

import Juegos.Blackjack.Elementos.Mediator;

/**
 *
 * @author javi
 */
public class JFrameIngresoDeApuesta extends javax.swing.JFrame {

    public int dineroDisponible;
    
    /**
     * Creates new form JFrameIngresoDeApuesta
     */
    public JFrameIngresoDeApuesta(String s) {
        super(s);
        initComponents();
        
        setTotal();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slider1 = new javax.swing.JSlider();
        sliderLabel1 = new javax.swing.JLabel();
        slider2 = new javax.swing.JSlider();
        sliderLabel2 = new javax.swing.JLabel();
        slider3 = new javax.swing.JSlider();
        sliderLabel3 = new javax.swing.JLabel();
        slider4 = new javax.swing.JSlider();
        sliderLabel4 = new javax.swing.JLabel();
        acceptButton = new javax.swing.JButton();
        totalLabel = new javax.swing.JLabel();
        notaLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingresa tu Apuesta");

        slider1.setMajorTickSpacing(10);
        slider1.setPaintLabels(true);
        slider1.setPaintTicks(true);
        slider1.setValue(0);
        slider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider1StateChanged(evt);
            }
        });

        sliderLabel1.setText("Valor: 0");
        sliderLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        slider2.setMajorTickSpacing(10);
        slider2.setPaintLabels(true);
        slider2.setPaintTicks(true);
        slider2.setValue(0);
        slider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider2StateChanged(evt);
            }
        });

        sliderLabel2.setText("Valor: 0");
        sliderLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        slider3.setMajorTickSpacing(10);
        slider3.setPaintLabels(true);
        slider3.setPaintTicks(true);
        slider3.setValue(0);
        slider3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider3StateChanged(evt);
            }
        });

        sliderLabel3.setText("Valor: 0");
        sliderLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        slider4.setMajorTickSpacing(10);
        slider4.setPaintLabels(true);
        slider4.setPaintTicks(true);
        slider4.setValue(0);
        slider4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider4StateChanged(evt);
            }
        });

        sliderLabel4.setText("Valor: 0");
        sliderLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        acceptButton.setText("Aceptar");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });

        totalLabel.setText("Total:");
        totalLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        notaLabel.setFont(new java.awt.Font("Cantarell", 0, 17)); // NOI18N
        notaLabel.setForeground(new java.awt.Color(255, 51, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juegos/Blackjack/images/ficha4.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juegos/Blackjack/images/ficha1.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juegos/Blackjack/images/ficha2.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juegos/Blackjack/images/ficha3.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(acceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(notaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(slider4, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sliderLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(slider2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sliderLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(slider1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sliderLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(slider3, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sliderLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sliderLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(sliderLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sliderLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sliderLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slider4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acceptButton, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void slider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider1StateChanged
        this.sliderLabel1.setText("Valor: "+this.slider1.getValue());
        setTotal();
    }//GEN-LAST:event_slider1StateChanged

    private void slider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider2StateChanged
        this.sliderLabel2.setText("Valor: "+this.slider2.getValue() * 50);
        setTotal();
    }//GEN-LAST:event_slider2StateChanged

    private void slider3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider3StateChanged
        this.sliderLabel3.setText("Valor: "+this.slider3.getValue() * 10);
        setTotal();
    }//GEN-LAST:event_slider3StateChanged

    private void slider4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider4StateChanged
        this.sliderLabel4.setText("Valor: "+this.slider4.getValue() * 500);
        setTotal();
    }//GEN-LAST:event_slider4StateChanged

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        Mediator mediator = new Mediator(setTotal(),dineroDisponible);
        
        mediator.setVisibleMesaBlackJack();
        
        this.setVisible(false);
    }//GEN-LAST:event_acceptButtonActionPerformed

    private int setTotal(){        
        int total = this.slider1.getValue() + this.slider2.getValue()*50 + this.slider3.getValue()*10 + this.slider4.getValue()*500;
        this.totalLabel.setText("Total: "+ total); 
        
        if (total > dineroDisponible){
            notaLabel.setText("No tienes suficiente dinero.");
            this.acceptButton.setEnabled(false);
        } else {
            if (total < 25){
               notaLabel.setText("La Apuesta Mínima es de 25.");
                this.acceptButton.setEnabled(false); 
            } else {
                notaLabel.setText("");
                this.acceptButton.setEnabled(true);
            }
        }
        return total;
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel notaLabel;
    private javax.swing.JSlider slider1;
    private javax.swing.JSlider slider2;
    private javax.swing.JSlider slider3;
    private javax.swing.JSlider slider4;
    private javax.swing.JLabel sliderLabel1;
    private javax.swing.JLabel sliderLabel2;
    private javax.swing.JLabel sliderLabel3;
    private javax.swing.JLabel sliderLabel4;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
