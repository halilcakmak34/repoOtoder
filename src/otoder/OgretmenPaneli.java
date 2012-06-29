/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package otoder;

import javax.swing.JFrame;

/**
 *
 * @author Cihan
 */
public class OgretmenPaneli extends javax.swing.JFrame {

    JFrame m_previousJFrame;
    /**
     * Creates new form OgretmenPaneli
     */
    public OgretmenPaneli( JFrame previous ) {
        m_previousJFrame = previous;
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

        buttonOgretmenKayit = new javax.swing.JButton();
        buttonOgretmenGuncelle = new javax.swing.JButton();
        jButtonCikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        buttonOgretmenKayit.setText("Öğretmen Kayit");
        buttonOgretmenKayit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonOgretmenKayitMouseClicked(evt);
            }
        });

        buttonOgretmenGuncelle.setText("Öğretmen Güncelle");
        buttonOgretmenGuncelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonOgretmenGuncelleMouseClicked(evt);
            }
        });

        jButtonCikis.setText("Çıkış");
        jButtonCikis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCikisMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonOgretmenGuncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonOgretmenKayit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCikis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(428, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonOgretmenKayit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonOgretmenGuncelle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCikis)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOgretmenKayitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonOgretmenKayitMouseClicked
        OgretmenBilgiPaneli ogrtbilgiPan = new OgretmenBilgiPaneli( this );
        this.setVisible(false);
        ogrtbilgiPan.setVisible(true);
    }//GEN-LAST:event_buttonOgretmenKayitMouseClicked

    private void buttonOgretmenGuncelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonOgretmenGuncelleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonOgretmenGuncelleMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseClicked

    private void jButtonCikisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCikisMouseClicked
        
        m_previousJFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCikisMouseClicked

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /*
//         * Set the Nimbus look and feel
//         */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /*
//         * If Nimbus (introduced in Java SE 6) is not available, stay with the
//         * default look and feel. For details see
//         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(OgretmenPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(OgretmenPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(OgretmenPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(OgretmenPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /*
//         * Create and display the form
//         */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
//                new OgretmenPaneli().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonOgretmenGuncelle;
    private javax.swing.JButton buttonOgretmenKayit;
    private javax.swing.JButton jButtonCikis;
    // End of variables declaration//GEN-END:variables
}