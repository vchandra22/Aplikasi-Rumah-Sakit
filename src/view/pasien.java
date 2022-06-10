package view;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Mpasien;

public class pasien extends javax.swing.JFrame {

    public static String temp_id_pasien="";

    public pasien() {
        initComponents();
        Mpasien.tabel();
        Mpasien.hitungData();
        Mpasien.fungsiCari();
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
        LDataPasien = new javax.swing.JLabel();
        LIdPasien = new javax.swing.JLabel();
        LNamaPasien = new javax.swing.JLabel();
        LUsia = new javax.swing.JLabel();
        LJenisKelamin = new javax.swing.JLabel();
        LAlamat = new javax.swing.JLabel();
        TIdPasien = new javax.swing.JTextField();
        TNamaPasien = new javax.swing.JTextField();
        TUsia = new javax.swing.JTextField();
        CJenisKelamin = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelDataPasien = new javax.swing.JTable();
        BTambah = new javax.swing.JButton();
        BSimpan = new javax.swing.JButton();
        BUbah = new javax.swing.JButton();
        BHapus = new javax.swing.JButton();
        BBatal = new javax.swing.JButton();
        TCari = new javax.swing.JTextField();
        BCari = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TAlamat = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        LJumlahData = new javax.swing.JLabel();
        LAngkaJumlah = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TKeluhan = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistem Informasi RS Pelita Harapan v1.0");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 128, 0));

        LDataPasien.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        LDataPasien.setForeground(new java.awt.Color(238, 238, 238));
        LDataPasien.setText("DATA PASIEN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(LDataPasien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LDataPasien, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
        );

        LIdPasien.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        LIdPasien.setText("ID PASIEN                                  :");

        LNamaPasien.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        LNamaPasien.setText("NAMA PASIEN                          :");

        LUsia.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        LUsia.setText("USIA                                              :");

        LJenisKelamin.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        LJenisKelamin.setText("JENIS KELAMIN                       :");

        LAlamat.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        LAlamat.setText("ALAMAT            :");

        TIdPasien.setEditable(false);
        TIdPasien.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        TIdPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIdPasienActionPerformed(evt);
            }
        });

        TNamaPasien.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        TNamaPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNamaPasienActionPerformed(evt);
            }
        });

        TUsia.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        TUsia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TUsiaActionPerformed(evt);
            }
        });

        CJenisKelamin.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        CJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Laki-Laki", "Perempuan" }));
        CJenisKelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CJenisKelaminActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(TabelDataPasien);

        BTambah.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BTambah.setText("Tambah");
        BTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahActionPerformed(evt);
            }
        });

        BSimpan.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BSimpan.setText("Simpan");
        BSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BSimpan.setEnabled(false);
        BSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSimpanActionPerformed(evt);
            }
        });

        BUbah.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BUbah.setText("Ubah");
        BUbah.setEnabled(false);
        BUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUbahActionPerformed(evt);
            }
        });

        BHapus.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BHapus.setText("Hapus");
        BHapus.setEnabled(false);
        BHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHapusActionPerformed(evt);
            }
        });

        BBatal.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BBatal.setText("Batal");
        BBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBatalActionPerformed(evt);
            }
        });

        TCari.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        TCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCariActionPerformed(evt);
            }
        });

        BCari.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BCari.setText("Cari");
        BCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCariMouseClicked(evt);
            }
        });
        BCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCariActionPerformed(evt);
            }
        });

        TAlamat.setColumns(20);
        TAlamat.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        TAlamat.setRows(5);
        jScrollPane3.setViewportView(TAlamat);
        TAlamat.getAccessibleContext().setAccessibleParent(jScrollPane1);

        jPanel2.setBackground(new java.awt.Color(0, 128, 0));

        LJumlahData.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        LJumlahData.setForeground(new java.awt.Color(236, 236, 236));
        LJumlahData.setText("Jumlah Data      :");

        LAngkaJumlah.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        LAngkaJumlah.setForeground(new java.awt.Color(239, 239, 239));
        LAngkaJumlah.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LAngkaJumlah.setText("000000");
        LAngkaJumlah.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                LAngkaJumlahInputMethodTextChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(LJumlahData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LAngkaJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(LAngkaJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addComponent(LJumlahData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel1.setText("KELUHAN         :");

        TKeluhan.setColumns(20);
        TKeluhan.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        TKeluhan.setRows(5);
        TKeluhan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TKeluhanKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(TKeluhan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LAlamat)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTambah)
                                        .addGap(18, 18, 18)
                                        .addComponent(BSimpan)
                                        .addGap(18, 18, 18)
                                        .addComponent(BUbah)
                                        .addGap(18, 18, 18)
                                        .addComponent(BHapus)
                                        .addGap(18, 18, 18)
                                        .addComponent(BBatal)
                                        .addGap(82, 82, 82))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(LUsia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LJenisKelamin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LIdPasien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LNamaPasien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(TNamaPasien)
                                            .addComponent(CJenisKelamin, javax.swing.GroupLayout.Alignment.LEADING, 0, 186, Short.MAX_VALUE)
                                            .addComponent(TUsia, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TIdPasien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel1)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TCari, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BCari, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane3)
                                            .addComponent(jScrollPane2))))))))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LAlamat)
                            .addComponent(LIdPasien)
                            .addComponent(TIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LNamaPasien)
                            .addComponent(TNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LUsia)
                            .addComponent(TUsia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LJenisKelamin)
                        .addComponent(CJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTambah)
                            .addComponent(BSimpan)
                            .addComponent(BUbah)
                            .addComponent(BHapus)
                            .addComponent(BBatal))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BCari))
                        .addGap(8, 8, 8)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahActionPerformed
        // TODO add your handling code here:
        Mpasien.empty_field();
        Mpasien.enable_field();
        TKeluhan.setEditable(true);
        Mpasien.penomoran();
        BTambah.setEnabled(false);
        BUbah.setEnabled(false);
        BHapus.setEnabled(false);
        BSimpan.setEnabled(true);
        TIdPasien.requestFocus();
        TIdPasien.setEditable(false);
        Mpasien.hitungData();
    }//GEN-LAST:event_BTambahActionPerformed

    private void BSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSimpanActionPerformed
        // TODO add your handling code here:
            if(TIdPasien.getText().isEmpty() || TNamaPasien.getText().isEmpty() || TUsia.getText().isEmpty() || CJenisKelamin.getSelectedItem().equals("-") || TAlamat.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Ulangi, semua data harus diisi !");
                Mpasien.HapusData();
                Mpasien.empty_field();
                BTambah.setEnabled(false);
            }else{
                Mpasien.SimpanData();
                Mpasien.tabel();
                JOptionPane.showMessageDialog(this, "Data Disimpan !");
                Mpasien.empty_field();
                BTambah.setEnabled(true);
            }
            Mpasien.hitungData();
            BTambah.setEnabled(true);
            BUbah.setEnabled(false);
            BHapus.setEnabled(false);
            BSimpan.setEnabled(false);
            TIdPasien.requestFocus();
    }//GEN-LAST:event_BSimpanActionPerformed

    private void TCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCariActionPerformed

    private void CJenisKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CJenisKelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CJenisKelaminActionPerformed

    private void TIdPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIdPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TIdPasienActionPerformed

    private void TNamaPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNamaPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNamaPasienActionPerformed

    private void TUsiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TUsiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TUsiaActionPerformed

    private void BHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHapusActionPerformed
        // TODO add your handling code here:
        if(TIdPasien.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Pilih data terlebih dahulu !");            
        }else{
            int reply = JOptionPane.showConfirmDialog(this,"Hapus data pasien ?","Peringatan", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (reply == JOptionPane.YES_OPTION){
                Mpasien.HapusData();
                JOptionPane.showMessageDialog(this, "Data pasien berhasil dihapus");
                Mpasien.tabel();
            }else{
                JOptionPane.showMessageDialog(this, "Batal menghapus data ini");
            }
        }
        Mpasien.hitungData();
        Mpasien.empty_field();
    }//GEN-LAST:event_BHapusActionPerformed

    private void TabelDataPasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelDataPasienMouseClicked
        // TODO add your handling code here:
        TIdPasien.setText(TabelDataPasien.getValueAt(TabelDataPasien.getSelectedRow(), 0).toString());
        TNamaPasien.setText(TabelDataPasien.getValueAt(TabelDataPasien.getSelectedRow(), 1).toString());
        TUsia.setText(TabelDataPasien.getValueAt(TabelDataPasien.getSelectedRow(), 2).toString());
        CJenisKelamin.setSelectedItem(TabelDataPasien.getValueAt(TabelDataPasien.getSelectedRow(), 3).toString());
        TAlamat.setText(TabelDataPasien.getValueAt(TabelDataPasien.getSelectedRow(), 4).toString());
        TKeluhan.setText(TabelDataPasien.getValueAt(TabelDataPasien.getSelectedRow(), 5).toString());
        
        temp_id_pasien = TabelDataPasien.getValueAt(TabelDataPasien.getSelectedRow(), 0).toString();
        
        BTambah.setEnabled(false);
        BSimpan.setEnabled(false);
        BUbah.setEnabled(true);
        BHapus.setEnabled(true);
        TKeluhan.setEditable(true);
        Mpasien.hitungData();
        Mpasien.enable_field();
    }//GEN-LAST:event_TabelDataPasienMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void BUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUbahActionPerformed
        // TODO add your handling code here:
        if(TIdPasien.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Pilih Data Terlebih Dahulu !");
        }else if(TIdPasien.getText().isEmpty() || TNamaPasien.getText().isEmpty() || TUsia.getText().isEmpty() || CJenisKelamin.getSelectedItem().equals("-") || TAlamat.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ulangi, semua data harus diisi !");
        }else{
            Mpasien.UbahData();
            JOptionPane.showMessageDialog(this, "Data berhasil diubah");
        }
        Mpasien.tabel();
        Mpasien.hitungData();
        Mpasien.empty_field();
        BUbah.setEnabled(true);
        BTambah.setEnabled(false);
        BHapus.setEnabled(false);
        BSimpan.setEnabled(false);
        TIdPasien.requestFocus(); 
    }//GEN-LAST:event_BUbahActionPerformed

    private void BBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBatalActionPerformed
        // TODO add your handling code here:
        Mpasien.tabel();
        Mpasien.hitungData();
        Mpasien.disable_field();
        Mpasien.empty_field();
        BTambah.setEnabled(true);
        BUbah.setEnabled(false);
        BHapus.setEnabled(false);
        BSimpan.setEnabled(false);
    }//GEN-LAST:event_BBatalActionPerformed

    private void BCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BCariActionPerformed

    private void LAngkaJumlahInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_LAngkaJumlahInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_LAngkaJumlahInputMethodTextChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon("src/logo.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void TKeluhanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TKeluhanKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TKeluhanKeyTyped

    private void BCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCariMouseClicked
        // TODO add your handling code here:
        if(TabelDataPasien.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Data tidak ditemukan");
        }
        Mpasien.fungsiCari();
        Mpasien.hitungData();
        //TCari.requestFocus();
    }//GEN-LAST:event_BCariMouseClicked

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
            java.util.logging.Logger.getLogger(Mpasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mpasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mpasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mpasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mpasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBatal;
    public static javax.swing.JButton BCari;
    private javax.swing.JButton BHapus;
    public javax.swing.JButton BSimpan;
    private javax.swing.JButton BTambah;
    public javax.swing.JButton BUbah;
    public static javax.swing.JComboBox<String> CJenisKelamin;
    private javax.swing.JLabel LAlamat;
    public static javax.swing.JLabel LAngkaJumlah;
    private javax.swing.JLabel LDataPasien;
    private javax.swing.JLabel LIdPasien;
    private javax.swing.JLabel LJenisKelamin;
    private javax.swing.JLabel LJumlahData;
    private javax.swing.JLabel LNamaPasien;
    private javax.swing.JLabel LUsia;
    public static javax.swing.JTextArea TAlamat;
    public static javax.swing.JTextField TCari;
    public static javax.swing.JTextField TIdPasien;
    public static javax.swing.JTextArea TKeluhan;
    public static javax.swing.JTextField TNamaPasien;
    public static javax.swing.JTextField TUsia;
    public static javax.swing.JTable TabelDataPasien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

}
