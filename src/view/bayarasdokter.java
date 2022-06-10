package view;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Mpembayarandokter;
import model.user;

public class bayarasdokter extends javax.swing.JFrame {
    
    public static String temp_no_bayar = "";
    DefaultComboBoxModel mdl = new DefaultComboBoxModel ();
    int IDDokter = user.getIDDokter();

    /**
     * Creates new form pembayaran
     */
    public bayarasdokter() {
        initComponents();
        Mpembayarandokter.hitungData();
        TIdDokter.setVisible(true);
        Mpembayarandokter.getDetailDokter();
        String [][] data = user.getProfilDokter(IDDokter);
        TIdDokter.setText(data[0][0]);
        TNamaDokter.setText(data [0][1]);
        Mpembayarandokter.tabel();
        TNoResep.setVisible(false);
        Mpembayarandokter.hitungData();
        BUbah.setVisible(false);
        BUbah.setEnabled(false);
        CStatus.setEditable(false);
       
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
        LPembayaran = new javax.swing.JLabel();
        TIdDokter = new javax.swing.JLabel();
        TNamaDokter = new javax.swing.JLabel();
        LNoBayar = new javax.swing.JLabel();
        LIdPasien = new javax.swing.JLabel();
        LNamaPasien = new javax.swing.JLabel();
        LNamaObat = new javax.swing.JLabel();
        LHargaObat = new javax.swing.JLabel();
        LBiayaPeriksa = new javax.swing.JLabel();
        LTotalBayar = new javax.swing.JLabel();
        TNoBayar = new javax.swing.JTextField();
        TIdPasien = new javax.swing.JTextField();
        TNamaPasien = new javax.swing.JTextField();
        TNamaObat = new javax.swing.JTextField();
        THargaObat = new javax.swing.JTextField();
        TBiayaPeriksa = new javax.swing.JTextField();
        TTotalBayar = new javax.swing.JTextField();
        BUbah = new javax.swing.JButton();
        BHapus = new javax.swing.JButton();
        BBatal = new javax.swing.JButton();
        TNoResep = new javax.swing.JTextField();
        CStatus = new javax.swing.JComboBox<>();
        LStatus = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TJumlah = new javax.swing.JLabel();
        TCari = new javax.swing.JTextField();
        BCari = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TUsia = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TAlamat = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelPembayaran = new javax.swing.JTable();

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

        jPanel1.setBackground(new java.awt.Color(255, 116, 25));

        LPembayaran.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        LPembayaran.setForeground(new java.awt.Color(236, 236, 236));
        LPembayaran.setText("PEMBAYARAN");

        TIdDokter.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        TIdDokter.setForeground(new java.awt.Color(242, 242, 242));
        TIdDokter.setText("jLabel1");
        TIdDokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TIdDokterMouseEntered(evt);
            }
        });

        TNamaDokter.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        TNamaDokter.setForeground(new java.awt.Color(239, 239, 239));
        TNamaDokter.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(LPembayaran)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TIdDokter)
                .addGap(67, 67, 67)
                .addComponent(TNamaDokter)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LPembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TIdDokter)
                    .addComponent(TNamaDokter))
                .addContainerGap())
        );

        LNoBayar.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        LNoBayar.setText("NO. BAYAR                               :");

        LIdPasien.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        LIdPasien.setText("ID. PASIEN                               :");

        LNamaPasien.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        LNamaPasien.setText("NAMA PASIEN                        :");

        LNamaObat.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        LNamaObat.setText("NAMA OBAT                           :");

        LHargaObat.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        LHargaObat.setText("HARGA OBAT                         :");

        LBiayaPeriksa.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        LBiayaPeriksa.setText("BIAYA PEMERIKSAAN       :");

        LTotalBayar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        LTotalBayar.setText("TOTAL PEMBAYARAN      :");

        TNoBayar.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        TNoBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNoBayarActionPerformed(evt);
            }
        });

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

        TNamaObat.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        TNamaObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNamaObatActionPerformed(evt);
            }
        });

        THargaObat.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        THargaObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THargaObatActionPerformed(evt);
            }
        });

        TBiayaPeriksa.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        TBiayaPeriksa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBiayaPeriksaActionPerformed(evt);
            }
        });

        TTotalBayar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        TTotalBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTotalBayarActionPerformed(evt);
            }
        });

        BUbah.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        BUbah.setText("Simpan");
        BUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUbahActionPerformed(evt);
            }
        });

        BHapus.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        BHapus.setText("Hapus");
        BHapus.setEnabled(false);
        BHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHapusActionPerformed(evt);
            }
        });

        BBatal.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        BBatal.setText("Batal");
        BBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBatalActionPerformed(evt);
            }
        });

        TNoResep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNoResepActionPerformed(evt);
            }
        });

        CStatus.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        CStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sudah Bayar", "Belum Bayar" }));
        CStatus.setAlignmentX(2.5F);
        CStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CStatusActionPerformed(evt);
            }
        });

        LStatus.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        LStatus.setText("STATUS BAYAR                      :");

        jPanel3.setBackground(new java.awt.Color(255, 116, 25));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(239, 239, 239));
        jLabel4.setText("Jumlah Data        :");

        TJumlah.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        TJumlah.setForeground(new java.awt.Color(239, 239, 239));
        TJumlah.setText("000000");
        TJumlah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TJumlahMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(TJumlah)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TCari.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        BCari.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BCari.setText("Cari");
        BCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCariActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel2.setText("ALAMAT                                    :");

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel3.setText("USIA                                            :");

        TUsia.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        TAlamat.setColumns(20);
        TAlamat.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        TAlamat.setRows(5);
        TAlamat.setWrapStyleWord(true);
        jScrollPane2.setViewportView(TAlamat);

        TabelPembayaran.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        TabelPembayaran.setModel(new javax.swing.table.DefaultTableModel(
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
        TabelPembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelPembayaranMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TabelPembayaranMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(TabelPembayaran);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(482, 482, 482)
                                .addComponent(TCari, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BCari))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LNoBayar)
                            .addComponent(LIdPasien))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TNoBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(TIdPasien))
                        .addGap(18, 18, 18)
                        .addComponent(TNoResep, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LNamaPasien)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TUsia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(TNamaPasien)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LBiayaPeriksa)
                                    .addComponent(LHargaObat)))
                            .addComponent(LNamaObat)
                            .addComponent(LTotalBayar)
                            .addComponent(LStatus))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TNamaObat)
                            .addComponent(THargaObat)
                            .addComponent(TTotalBayar)
                            .addComponent(TBiayaPeriksa)
                            .addComponent(CStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BCari))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LNoBayar)
                                .addComponent(TNoBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TNoResep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LIdPasien)
                                    .addComponent(TIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TNamaPasien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LNamaPasien))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(TUsia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LNamaObat)
                                    .addComponent(TNamaObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LHargaObat)
                                    .addComponent(THargaObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LBiayaPeriksa)
                                    .addComponent(TBiayaPeriksa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LTotalBayar)
                                    .addComponent(TTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LStatus))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                .addComponent(BHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TNoBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNoBayarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TNoBayarActionPerformed

    private void TIdPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIdPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TIdPasienActionPerformed

    private void TNamaPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNamaPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNamaPasienActionPerformed

    private void TNamaObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNamaObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNamaObatActionPerformed

    private void THargaObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THargaObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_THargaObatActionPerformed

    private void TBiayaPeriksaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBiayaPeriksaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TBiayaPeriksaActionPerformed

    private void TTotalBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTotalBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TTotalBayarActionPerformed

    private void BBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBatalActionPerformed
        // TODO add your handling code here:
        Mpembayarandokter.tabel();
        Mpembayarandokter.disable_field();
        Mpembayarandokter.empty_field();
        BUbah.setEnabled(false);
        BHapus.setEnabled(false);
        Mpembayarandokter.hitungData();
    }//GEN-LAST:event_BBatalActionPerformed

    private void TNoResepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNoResepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNoResepActionPerformed

    private void BHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHapusActionPerformed
        // TODO add your handling code here:
        
        if(TNoBayar.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Pilih data terlebih dahulu !");            
        }else{
            int reply = JOptionPane.showConfirmDialog(this,"Hapus data pasien ?","Peringatan", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (reply == JOptionPane.YES_OPTION){
                Mpembayarandokter.HapusData();
                JOptionPane.showMessageDialog(this, "Data pasien berhasil dihapus");
                Mpembayarandokter.tabel();
            }else{
                JOptionPane.showMessageDialog(this, "Batal menghapus data ini");
            }
        }
        Mpembayarandokter.empty_field();
        Mpembayarandokter.hitungData();
    }//GEN-LAST:event_BHapusActionPerformed

    private void CStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CStatusActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void BUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUbahActionPerformed
        // TODO add your handling code here:
        if(TNoBayar.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Pilih Data Terlebih Dahulu !");
        }else if(TNoBayar.getText().isEmpty() || TNamaPasien.getText().isEmpty() || TNamaObat.getText().isEmpty() || THargaObat.getText().isEmpty() || TBiayaPeriksa.getText().isEmpty() || TTotalBayar.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ulangi, semua data harus diisi !");
        }else{
            Mpembayarandokter.SimpanData();
        }
        TabelPembayaran.requestFocus();
        Mpembayarandokter.tabel();
        Mpembayarandokter.empty_field();
        BUbah.setEnabled(false);;
        BHapus.setEnabled(false);
        Mpembayarandokter.hitungData();
    }//GEN-LAST:event_BUbahActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon("src/logo.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void BCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCariActionPerformed
        // TODO add your handling code here:
        Mpembayarandokter.fungsiCari();
        Mpembayarandokter.hitungData();
    }//GEN-LAST:event_BCariActionPerformed

    private void TJumlahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TJumlahMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TJumlahMouseEntered

    private void TabelPembayaranMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelPembayaranMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TabelPembayaranMouseEntered

    private void TabelPembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelPembayaranMouseClicked
        // TODO add your handling code here:
        TNoBayar.setText(TabelPembayaran.getValueAt(TabelPembayaran.getSelectedRow(), 0).toString());
        TNamaPasien.setText(TabelPembayaran.getValueAt(TabelPembayaran.getSelectedRow(), 1).toString());
        TNamaObat.setText(TabelPembayaran.getValueAt(TabelPembayaran.getSelectedRow(), 2).toString());
        THargaObat.setText(TabelPembayaran.getValueAt(TabelPembayaran.getSelectedRow(), 3).toString());
        TBiayaPeriksa.setText(TabelPembayaran.getValueAt(TabelPembayaran.getSelectedRow(), 4).toString());
        TTotalBayar.setText(TabelPembayaran.getValueAt(TabelPembayaran.getSelectedRow(), 5).toString());
        CStatus.setSelectedItem(TabelPembayaran.getValueAt(TabelPembayaran.getSelectedRow(), 6).toString());

        temp_no_bayar = TabelPembayaran.getValueAt(TabelPembayaran.getSelectedRow(), 0).toString();

        Mpembayarandokter.hitungData();
        Mpembayarandokter.getDataPasien();
        Mpembayarandokter.getNoResep();
        Mpembayarandokter.disable_field();
        BUbah.setEnabled(true);
        BHapus.setEnabled(true);
        TIdPasien.setEditable(false);
        TNoBayar.setEditable(false);
        CStatus.setEditable(false);
        CStatus.requestFocus();
    }//GEN-LAST:event_TabelPembayaranMouseClicked

    private void TIdDokterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TIdDokterMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TIdDokterMouseEntered

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
            java.util.logging.Logger.getLogger(bayarasdokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bayarasdokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bayarasdokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bayarasdokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bayarasdokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBatal;
    public static javax.swing.JButton BCari;
    public static javax.swing.JButton BHapus;
    public static javax.swing.JButton BUbah;
    public static javax.swing.JComboBox<String> CStatus;
    private javax.swing.JLabel LBiayaPeriksa;
    private javax.swing.JLabel LHargaObat;
    private javax.swing.JLabel LIdPasien;
    private javax.swing.JLabel LNamaObat;
    private javax.swing.JLabel LNamaPasien;
    private javax.swing.JLabel LNoBayar;
    private javax.swing.JLabel LPembayaran;
    private javax.swing.JLabel LStatus;
    private javax.swing.JLabel LTotalBayar;
    public static javax.swing.JTextArea TAlamat;
    public static javax.swing.JTextField TBiayaPeriksa;
    public static javax.swing.JTextField TCari;
    public static javax.swing.JTextField THargaObat;
    public static javax.swing.JLabel TIdDokter;
    public static javax.swing.JTextField TIdPasien;
    public static javax.swing.JLabel TJumlah;
    public static javax.swing.JLabel TNamaDokter;
    public static javax.swing.JTextField TNamaObat;
    public static javax.swing.JTextField TNamaPasien;
    public static javax.swing.JTextField TNoBayar;
    public static javax.swing.JTextField TNoResep;
    public static javax.swing.JTextField TTotalBayar;
    public static javax.swing.JTextField TUsia;
    public static javax.swing.JTable TabelPembayaran;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
