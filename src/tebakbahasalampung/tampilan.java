package tebakbahasalampung;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class tampilan extends javax.swing.JFrame {
    String jawaban[];
    byte kesempatan = 5, posisi = 0;
    int skor = 0;
    String nama = null, temp;

    public tampilan() {
        this.jawaban = new String[]{"ajoman", "lamban", "mulang", "ikam", "gawoh", "cakak", "cadang", "liman", "gham", "tabik_pun"};
        initComponents();
//        mengurutkan data yang ada di array jawaban sesuai dengan abjad
        sortingJawaban(jawaban);
        this.setLocationRelativeTo(null);
    }

//    subroutine untuk sorting
    private void sortingJawaban(String[] arraynya) {
        for (int i = 1; i < arraynya.length; i++) {
            int index = i;
            while (index > 0 && arraynya[index].compareToIgnoreCase(arraynya[index - 1]) < 0) {
                temp = arraynya[index - 1];
                arraynya[index - 1] = arraynya[index];
                arraynya[index] = temp;
                index--;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        txtJawaban = new javax.swing.JTextField();
        btnCek = new javax.swing.JButton();
        background = new javax.swing.JPanel();
        lblSkor = new javax.swing.JLabel();
        lblKesempatan = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        gambar = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(500, 470));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtJawaban.setBackground(new java.awt.Color(153, 153, 0));
        txtJawaban.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtJawaban.setForeground(new java.awt.Color(255, 255, 255));
        txtJawaban.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJawaban.setBorder(null);
        txtJawaban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJawabanActionPerformed(evt);
            }
        });
        txtJawaban.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtJawabanKeyPressed(evt);
            }
        });
        getContentPane().add(txtJawaban, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 389, 300, 30));

        btnCek.setBackground(new java.awt.Color(255, 255, 255));
        btnCek.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCek.setText("CEK");
        btnCek.setBorder(null);
        btnCek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pop(evt);
            }
        });
        btnCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekActionPerformed(evt);
            }
        });
        getContentPane().add(btnCek, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 79, 30));

        background.setBackground(new java.awt.Color(241, 196, 15));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSkor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblSkor.setForeground(new java.awt.Color(13, 13, 13));
        lblSkor.setText("Skor : 0 ");
        background.add(lblSkor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        lblKesempatan.setBackground(new java.awt.Color(102, 102, 102));
        lblKesempatan.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblKesempatan.setForeground(new java.awt.Color(13, 13, 13));
        lblKesempatan.setText("Kesempatan : 5");
        background.add(lblKesempatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 13, 13));
        jLabel1.setText("Jawaban : ");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bahasalampung/tampilan/ajoman.png")));
        background.add(gambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txtJawabanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJawabanActionPerformed

    }//GEN-LAST:event_txtJawabanActionPerformed

    private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekActionPerformed

        String jwb = txtJawaban.getText().replace(" ", "_");

        if (jwb.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "ISI JAWABAN");
            txtJawaban.requestFocus();
        } else {
            if (jwb.equalsIgnoreCase(jawaban[posisi])) {
                JOptionPane.showMessageDialog(this, "BENAR");
                txtJawaban.requestFocus();
                posisi++;
                skor += 10;
                lblSkor.setText("Skor : " + skor);
                txtJawaban.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "SALAH");
                kesempatan--;
                txtJawaban.requestFocus();
                lblKesempatan.setText("Kesempatan : " + kesempatan);
            }
        }

        // cek kesempatan
        if (kesempatan == 0) {
            JOptionPane.showMessageDialog(this, "KALAH");
            JOptionPane.showMessageDialog(this, "SKOR ANDA = " + skor);
            nama = JOptionPane.showInputDialog("Nama Anda");
            Database db = new Database();
            db.insertTabel(nama, skor);
            new skor().setVisible(true);
            this.dispose();
        }

        // cek posisi
        if (posisi > jawaban.length - 1) {
            JOptionPane.showMessageDialog(this, "SELAMAT ANDA MENANG");
            JOptionPane.showMessageDialog(this, "SKOR ANDA = " + skor);
            nama = JOptionPane.showInputDialog("Nama Anda");
            Database db = new Database();
            db.insertTabel(nama, skor);
            new skor().setVisible(true);
            this.dispose();
        } else {
            gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bahasalampung/tampilan/" + jawaban[posisi] + ".png")));
        }


    }//GEN-LAST:event_btnCekActionPerformed

    private void pop(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pop
        // TODO add your handling code here:
    }//GEN-LAST:event_pop

    private void txtJawabanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJawabanKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            String jwb = txtJawaban.getText().replace(" ", "_");

        if (jwb.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "ISI JAWABAN");
            txtJawaban.requestFocus();
        } else {
            if (jwb.equalsIgnoreCase(jawaban[posisi])) {
                JOptionPane.showMessageDialog(this, "BENAR");
                txtJawaban.requestFocus();
                posisi++;
                skor += 10;
                lblSkor.setText("Skor : " + skor);
                txtJawaban.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "SALAH");
                kesempatan--;
                txtJawaban.requestFocus();
                lblKesempatan.setText("Kesempatan : " + kesempatan);
            }
        }

        // cek kesempatan
        if (kesempatan == 0) {
            JOptionPane.showMessageDialog(this, "KALAH");
            JOptionPane.showMessageDialog(this, "SKOR ANDA = " + skor);
            nama = JOptionPane.showInputDialog("Nama Anda");
            Database db = new Database();
            db.insertTabel(nama, skor);
            new skor().setVisible(true);
            this.dispose();
        }

        // cek posisi
        if (posisi > jawaban.length - 1) {
            JOptionPane.showMessageDialog(this, "SELAMAT ANDA MENANG");
            JOptionPane.showMessageDialog(this, "SKOR ANDA = " + skor);
            nama = JOptionPane.showInputDialog("Nama Anda");
            Database db = new Database();
            db.insertTabel(nama, skor);
            new skor().setVisible(true);
            this.dispose();
        } else {
            gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bahasalampung/tampilan/" + jawaban[posisi] + ".png")));
        }
        }
        
    }//GEN-LAST:event_txtJawabanKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tampilan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnCek;
    private javax.swing.JLabel gambar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lblKesempatan;
    private javax.swing.JLabel lblSkor;
    private javax.swing.JTextField txtJawaban;
    // End of variables declaration//GEN-END:variables
}
