package view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class didalamdokter extends javax.swing.JFrame {

    public didalamdokter() {
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
        LHeading = new javax.swing.JLabel();
        LBackround = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MMaster = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        MPembayaran = new javax.swing.JMenu();
        MKataSandi = new javax.swing.JMenu();
        MLogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistem Informasi RS Pelita Harapan v1.0");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 116, 25));

        LHeading.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        LHeading.setForeground(new java.awt.Color(234, 234, 234));
        LHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LHeading.setText("SISTEM INFORMASI RUMAH SAKIT PELITA HARAPAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 1169, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LHeading, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
        );

        LBackround.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBackround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/rumahsakit2.jpg"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N

        MMaster.setText("Data Pasien");
        MMaster.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        MMaster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MMasterMouseClicked(evt);
            }
        });
        jMenuBar1.add(MMaster);

        jMenu1.setText("Pemeriksaan");
        jMenu1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Resep");
        jMenu2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        MPembayaran.setText("Pembayaran");
        MPembayaran.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        MPembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MPembayaranMouseClicked(evt);
            }
        });
        jMenuBar1.add(MPembayaran);

        MKataSandi.setText("Lihat Profil");
        MKataSandi.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        MKataSandi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MKataSandiMouseClicked(evt);
            }
        });
        jMenuBar1.add(MKataSandi);

        MLogout.setText("Logout");
        MLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MLogout.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        MLogout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MLogoutMouseDragged(evt);
            }
        });
        MLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MLogoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(MLogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LBackround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LBackround, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MPembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MPembayaranMouseClicked
        // TODO add your handling code here:
        bayarasdokter p = new bayarasdokter();
        p.setLocationRelativeTo(this);
        p.setVisible(true);
    }//GEN-LAST:event_MPembayaranMouseClicked

    private void MLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MLogoutMouseClicked
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(null,"Keluar?, \nAnda yakin ingin keluar?","Peringatan", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (reply == JOptionPane.YES_OPTION){
        diluar l = new diluar();
        l.setLocationRelativeTo(this);
        l.setVisible(true);
        this.dispose();
            }
    }//GEN-LAST:event_MLogoutMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon("src/logo.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void MLogoutMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MLogoutMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_MLogoutMouseDragged

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        resepdokter r = new resepdokter();
        r.setLocationRelativeTo(this);
        r.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void MKataSandiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MKataSandiMouseClicked
        // TODO add your handling code here:
        lihatprofildokter dt = new lihatprofildokter();
        dt.setLocationRelativeTo(this);
        dt.setVisible(true);
    }//GEN-LAST:event_MKataSandiMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        diagnosadokter dt = new diagnosadokter();
        dt.setLocationRelativeTo(this);
        dt.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void MMasterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMasterMouseClicked
        // TODO add your handling code here:
        pasiendokter pd = new pasiendokter();
        pd.setLocationRelativeTo(this);
        pd.setVisible(true);
    }//GEN-LAST:event_MMasterMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(didalamdokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(didalamdokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(didalamdokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(didalamdokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new didalamdokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBackround;
    private javax.swing.JLabel LHeading;
    public static javax.swing.JMenu MKataSandi;
    private javax.swing.JMenu MLogout;
    public static javax.swing.JMenu MMaster;
    private javax.swing.JMenu MPembayaran;
    public static javax.swing.JMenu jMenu1;
    public static javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
