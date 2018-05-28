/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author thiag
 */
public class ViewLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmInicio
     */
    public ViewLogin() {
        initComponents();
    }

    public boolean validaLogin(String nome, String id){
        
        
        
        
        return nome.equals("mesario1")&& id.equals("123");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();
        txtNomeMes = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblIDMes = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        bnEntrar = new javax.swing.JButton();
        txtIDMesario = new javax.swing.JPasswordField();
        lblErro = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login para mesários");
        setBackground(new java.awt.Color(39, 74, 96));
        setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelHeader.setBackground(new java.awt.Color(39, 74, 96));
        jPanelHeader.setForeground(new java.awt.Color(255, 255, 255));

        lblNome.setBackground(new java.awt.Color(233, 255, 255));
        lblNome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome");

        lblHeader.setBackground(new java.awt.Color(233, 255, 255));
        lblHeader.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("Login para mesário");

        txtNomeMes.setBackground(new java.awt.Color(39, 74, 96));
        txtNomeMes.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtNomeMes.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeMes.setBorder(null);
        txtNomeMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeMesActionPerformed(evt);
            }
        });

        lblIDMes.setBackground(new java.awt.Color(233, 255, 255));
        lblIDMes.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblIDMes.setForeground(new java.awt.Color(255, 255, 255));
        lblIDMes.setText("ID");

        bnEntrar.setBackground(new java.awt.Color(189, 79, 148));
        bnEntrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        bnEntrar.setText("Entrar");
        bnEntrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnEntrarActionPerformed(evt);
            }
        });

        txtIDMesario.setBackground(new java.awt.Color(39, 74, 96));
        txtIDMesario.setForeground(new java.awt.Color(255, 255, 255));
        txtIDMesario.setBorder(null);
        txtIDMesario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDMesarioActionPerformed(evt);
            }
        });

        lblErro.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblErro.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(lblIDMes, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeMes, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(txtIDMesario)
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelHeaderLayout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNomeMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIDMes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtIDMesario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(bnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblErro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelHeaderLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(322, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        setSize(new java.awt.Dimension(316, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeMesActionPerformed

    private void bnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnEntrarActionPerformed
        if(this.validaLogin(txtNomeMes.getText(), new String (txtIDMesario.getText()))){
            viewPrincipal vp =new viewPrincipal();
            vp.setVisible(true);
            this.dispose();
        }
        else{
            lblErro.setText("Nome ou ID inválidos");
            txtIDMesario.hasFocus();
        }
    }//GEN-LAST:event_bnEntrarActionPerformed

    private void txtIDMesarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDMesarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDMesarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnEntrar;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Label lblErro;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblIDMes;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPasswordField txtIDMesario;
    private javax.swing.JTextField txtNomeMes;
    // End of variables declaration//GEN-END:variables
}
