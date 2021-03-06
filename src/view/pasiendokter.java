package view;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Mpasiendokter;

public class pasiendokter extends javax.swing.JFrame {
    
      public static String temp_id_pasien="";

    /**
     * Creates new form pasiendokter
     */
    public pasiendokter() {
        initComponents();
        Mpasiendokter.disable_field();
        Mpasiendokter.tabel();
        Mpasiendokter.hitungData();
        TJenisKelamin.setText(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TIdPasien = new javax.swing.JTextField();
        TNamaPasien = new javax.swing.JTextField();
        TUsia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAlamat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelDataPasien = new javax.swing.JTable();
        TCari = new javax.swing.JTextField();
        BCari = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        LAngkaJumlah = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TKeluhan = new javax.swing.JTextArea();
        TJenisKelamin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistem Informasi RS Pelita Harapan v1.0");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 116, 25));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA PASIEN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel2.setText("ID PASIEN                 :");

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel3.setText("NAMA PASIEN         :");

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel4.setText("USIA                            :");

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel5.setText("JENIS KELAMIN      :");

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel6.setText("ALAMAT                    :");

        TIdPasien.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        TNamaPasien.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        TUsia.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        TAlamat.setColumns(20);
        TAlamat.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        TAlamat.setRows(5);
        jScrollPane1.setViewportView(TAlamat);

        TabelDataPasien.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        TabelDataPasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelDataPasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelDataPasienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelDataPasien);

        TCari.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        TCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCariActionPerformed(evt);
            }
        });

        BCari.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BCari.setText("Cari");
        BCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCariActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 116, 25));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 236, 236));
        jLabel7.setText("Jumlah Data        :");

        LAngkaJumlah.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        LAngkaJumlah.setForeground(new java.awt.Color(240, 240, 240));
        LAngkaJumlah.setText("000000");
        LAngkaJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LAngkaJumlahKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LAngkaJumlah)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(LAngkaJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel8.setText("KELUHAN                 :");

        TKeluhan.setColumns(20);
        TKeluhan.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        TKeluhan.setRows(5);
        TKeluhan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TKeluhanKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(TKeluhan);

        TJenisKelamin.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        TJenisKelamin.setText("jTextField1");
        TJenisKelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TJenisKelaminActionPerformed(evt);
            }
        });
        TJenisKelamin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TJenisKelaminKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(TUsia)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                    .addComponent(TNamaPasien)
                    .addComponent(TIdPasien)
                    .addComponent(TJenisKelamin))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TCari, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BCari)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TUsia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(TJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(111, 111, 111))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BCari))
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCariActionPerformed

    private void TabelDataPasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelDataPasienMouseClicked
        // TODO add your handling code here:

        TIdPasien.setText(TabelDataPasien.getValueAt(TabelDataPasien.getSelectedRow(), 0).toString());
        TNamaPasien.setText(TabelDataPasien.getValueAt(TabelDataPasien.getSelectedRow(), 1).toString());
        TUsia.setText(TabelDataPasien.getValueAt(TabelDataPasien.getSelectedRow(), 2).toString());
        TJenisKelamin.setText(TabelDataPasien.getValueAt(TabelDataPasien.getSelectedRow(), 3).toString());
        TAlamat.setText(TabelDataPasien.getValueAt(TabelDataPasien.getSelectedRow(), 4).toString());
        TKeluhan.setText(TabelDataPasien.getValueAt(TabelDataPasien.getSelectedRow(), 5).toString());
                
        temp_id_pasien = TabelDataPasien.getValueAt(TabelDataPasien.getSelectedRow(), 0).toString();

        Mpasiendokter.hitungData();
        Mpasiendokter.disable_field();
    }//GEN-LAST:event_TabelDataPasienMouseClicked

    private void BCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCariActionPerformed
        // TODO add your handling code here:
             Mpasiendokter.FungsiCari();
        if(TabelDataPasien.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Data tidak ditemukan");
            Mpasiendokter.tabel();
        }
        Mpasiendokter.hitungData();
        TCari.requestFocus();
    }//GEN-LAST:event_BCariActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon("src/logo.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void LAngkaJumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LAngkaJumlahKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_LAngkaJumlahKeyTyped

    private void TJenisKelaminKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TJenisKelaminKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TJenisKelaminKeyPressed

    private void TJenisKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TJenisKelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TJenisKelaminActionPerformed

    private void TKeluhanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TKeluhanKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TKeluhanKeyTyped

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
            java.util.logging.Logger.getLogger(pasiendokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pasiendokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pasiendokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pasiendokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pasiendokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BCari;
    public static javax.swing.JLabel LAngkaJumlah;
    public static javax.swing.JTextArea TAlamat;
    public static javax.swing.JTextField TCari;
    public static javax.swing.JTextField TIdPasien;
    public static javax.swing.JTextField TJenisKelamin;
    public static javax.swing.JTextArea TKeluhan;
    public static javax.swing.JTextField TNamaPasien;
    public static javax.swing.JTextField TUsia;
    public static javax.swing.JTable TabelDataPasien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
