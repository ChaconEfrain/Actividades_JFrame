/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame_Actividades;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Dell
 */
public class Encuesta extends javax.swing.JFrame {

    /**
     * Creates new form Encuesta
     */
    public Encuesta() {
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

        lbl_sistemaFavorito = new javax.swing.JLabel();
        rbd_windows = new javax.swing.JRadioButton();
        rbd_linux = new javax.swing.JRadioButton();
        rbd_mac = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_especialidad = new javax.swing.JLabel();
        ckb_diseño = new javax.swing.JCheckBox();
        ckb_programacion = new javax.swing.JCheckBox();
        ckb_administracion = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        sld_horas = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        btn_generar = new javax.swing.JButton();
        lbl_horas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_sistemaFavorito.setText("Elige tu sistema operativo favorito");

        rbd_windows.setText("Windows");

        rbd_linux.setText("Linux");

        rbd_mac.setText("Mac");

        lbl_especialidad.setText("Elige tu especialidad");

        ckb_diseño.setText("Diseño gráfico");
        ckb_diseño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_diseñoActionPerformed(evt);
            }
        });

        ckb_programacion.setText("Programación");
        ckb_programacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_programacionActionPerformed(evt);
            }
        });

        ckb_administracion.setText("Administración");
        ckb_administracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_administracionActionPerformed(evt);
            }
        });

        sld_horas.setMaximum(10);
        sld_horas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sld_horasStateChanged(evt);
            }
        });

        jLabel1.setText("Horas dedicadas al ordenador");

        btn_generar.setText("Generar");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });

        lbl_horas.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lbl_horas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ckb_diseño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_especialidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1)
                        .addComponent(rbd_windows, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_sistemaFavorito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbd_linux, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbd_mac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ckb_programacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ckb_administracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(sld_horas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btn_generar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_sistemaFavorito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbd_windows)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbd_linux)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbd_mac, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_especialidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckb_programacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckb_diseño)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckb_administracion)
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sld_horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_horas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_generar)
                        .addGap(16, 16, 16))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ckb_diseñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_diseñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckb_diseñoActionPerformed

    private void ckb_programacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_programacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckb_programacionActionPerformed

    private void ckb_administracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_administracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckb_administracionActionPerformed

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        // TODO add your handling code here:
        String informacion = "Tu sistema operativo preferido es ";
        JRadioButton[] radioButtons = {rbd_windows, rbd_linux, rbd_mac};
        for(int i = 0; i < radioButtons.length; i++){
            if(radioButtons[i].isSelected()){
                informacion += radioButtons[i].getText();
            }
        }
        JCheckBox[] checkBox = {ckb_programacion, ckb_diseño, ckb_administracion};
        informacion += ", \ntus especialidades son ";
        for(int i = 0; i < checkBox.length; i++){
            if(checkBox[i].isSelected()){
                informacion += checkBox[i].getText();
            }
        }
        informacion += "\ny las horas dedicadas son " + sld_horas.getValue();
        JOptionPane.showMessageDialog(this, informacion, "Muestra de datos", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_generarActionPerformed

    private void sld_horasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sld_horasStateChanged
        // TODO add your handling code here:
        lbl_horas.setText(String.valueOf(sld_horas.getValue()));
    }//GEN-LAST:event_sld_horasStateChanged

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
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generar;
    private javax.swing.JCheckBox ckb_administracion;
    private javax.swing.JCheckBox ckb_diseño;
    private javax.swing.JCheckBox ckb_programacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_especialidad;
    private javax.swing.JLabel lbl_horas;
    private javax.swing.JLabel lbl_sistemaFavorito;
    private javax.swing.JRadioButton rbd_linux;
    private javax.swing.JRadioButton rbd_mac;
    private javax.swing.JRadioButton rbd_windows;
    private javax.swing.JSlider sld_horas;
    // End of variables declaration//GEN-END:variables
}
