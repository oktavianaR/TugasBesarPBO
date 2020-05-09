package tebakbahasalampung;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSkor = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnMulai = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(241, 196, 15));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSkor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSkor.setText("LIHAT SKOR");
        btnSkor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSkor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkorActionPerformed(evt);
            }
        });
        jPanel1.add(btnSkor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 110, -1));

        btnKeluar.setBackground(new java.awt.Color(255, 0, 0));
        btnKeluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKeluar.setText("KELUAR");
        btnKeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        jPanel1.add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        btnMulai.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMulai.setText("MULAI GAME");
        btnMulai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulaiActionPerformed(evt);
            }
        });
        jPanel1.add(btnMulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bahasalampung/tampilan/tampilanawal.png")));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 440, 330));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel2.setText("Muhammad Ichsan Ramadhan (118140126)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 220, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel3.setText("Oktaviana Rinda Sari (118140126)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSkorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkorActionPerformed
        new skor().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSkorActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnMulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulaiActionPerformed
        new tampilan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMulaiActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnMulai;
    private javax.swing.JButton btnSkor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
