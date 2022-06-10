package model;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import view.bayarasperawat;
import javax.swing.table.DefaultTableModel;

public class Mpembayaranperawat extends bayarasperawat {
    
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    
    public static void tabel(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No. Pembayaran");
        tbl.addColumn("Nama Pasien");
        tbl.addColumn("Obat");
        tbl.addColumn("Harga Obat");
        tbl.addColumn("Biaya Pemeriksaan");
        tbl.addColumn("Total Bayar");
        tbl.addColumn("Status");
        TabelPembayaran.setModel(tbl);
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT pembayaran.no_bayar, pasien.nama_pasien, obat.nama_obat, obat.harga, "
                    + "dokter.biaya_periksa, SUM(obat.harga + dokter.biaya_periksa) AS total_bayar, pembayaran.status "
                    + "FROM pasien JOIN diagnosa ON diagnosa.id_pasien = pasien.id_pasien "
                    + "JOIN resep ON resep.id_pasien = diagnosa.id_pasien "
                    + "JOIN obat ON obat.no_obat = resep.no_obat "
                    + "JOIN dokter ON dokter.id_dokter = diagnosa.id_dokter "
                    + "JOIN pembayaran ON pembayaran.no_resep = resep.no_resep "
                    + "GROUP BY pembayaran.no_bayar "
                    + "ORDER BY pembayaran.no_bayar DESC"; 
            rs = stmt.executeQuery(query);
            while (rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString("no_bayar"),
                    rs.getString("nama_pasien"),
                    rs.getString("nama_obat"),
                    rs.getString("harga"),
                    rs.getString("biaya_periksa"),
                    rs.getString("total_bayar"),
                    rs.getString("status"),
                });
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }
    }
    
    public static String [] getListStatus(){
        String data[] = null;
        Connection connect = koneksi.koneksiDatabase();
        CStatus.setSelectedItem("-");
        try{
            stmt = connect.createStatement();
            query = "SELECT DISTINCT status FROM pembayaran";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            data = new String [1000];
            int r = 0;
            while(rs.next()){
                String nama = rs.getString(1);
                String list = nama;
                    data[r] = list;
                r++;
            }
            int jmlBaris = r;
            String [] tmparray = data;
            data = new String[jmlBaris];
            for(r=0; r<jmlBaris; r++){
                data[r] = tmparray[r];
            }

            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println("Error : "+ ex.getMessage());
        }
        return data;
    }
    
    public static void getNoResep(){
         String iniNoResep = TIdPasien.getText().toString();
         try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT no_resep FROM resep WHERE id_pasien LIKE '"+iniNoResep+"'";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                TNoResep.setText(rs.getString(1));
            }
                       
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }   
     }
    
    public static void SimpanData(){
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "UPDATE pembayaran SET no_bayar='"+TNoBayar.getText()+"',no_resep='"+TNoResep.getText()+"',status='"+CStatus.getSelectedItem()+"' WHERE no_bayar='"+temp_no_bayar+"'";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan","Insert Data",JOptionPane.INFORMATION_MESSAGE);
            
           
                       
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }
    }
    
    public static void HapusData(){
         try{
             Connection connect = koneksi.koneksiDatabase();
             stmt = connect.createStatement();
             query = "DELETE FROM pembayaran WHERE no_bayar='"+TNoBayar.getText()+"'";
             stmt.executeUpdate(query);
             
             stmt.close();
             connect.close();
         }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }     
     }
    
    public static void getDataPasien(){
         try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT resep.id_pasien, pasien.usia, pasien.alamat FROM pembayaran "
                    + "JOIN resep ON resep.no_resep = pembayaran.no_resep "
                    + "JOIN pasien ON pasien.id_pasien = resep.id_pasien "
                    + "JOIN diagnosa ON diagnosa.id_pasien = resep.id_pasien WHERE no_bayar LIKE '"+TNoBayar.getText()+"'";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                TIdPasien.setText(rs.getString(1));
                TUsia.setText(rs.getString(2));
                TAlamat.setText(rs.getString(3));
            }
                       
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }   
     }
       
    public static void penomoran(){
        Connection connect = koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "SELECT * FROM pembayaran ORDER BY no_bayar DESC";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                String nomor = rs.getString("no_bayar").substring(1);
                String angka = "" + (Integer.parseInt(nomor)+1);
                String nol = "";
                
                if(angka.length()==1){
                    nol="75288000";
                }else if(angka.length()==2){
                    nol="7528800";
                }else if(angka.length()==3){
                    nol="752880";
                }else if(angka.length()==4){
                    nol="75288";
                }else if(angka.length()==5){
                    nol="7528";
                }else if(angka.length()==6){
                    nol="752";
                }else if(angka.length()==7){
                    nol="75";
                }else if(angka.length()==8){
                    nol="7";
                }else if(angka.length()==9){
                    nol="";
                }
                TNoBayar.setText("" + nol + angka);
            }else {
                TNoBayar.setText("752880001");
            }
            stmt.close();
            connect.close();
        }catch (NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(null, e); 
        }
    }
    
    public static void hitungData() {
        int total_baris = TabelPembayaran.getRowCount();
        if(String.valueOf(total_baris).length()==1){
            TJumlah.setText("000"+total_baris);
        }else
        if(String.valueOf(total_baris).length()==2){
            TJumlah.setText("00"+total_baris);
        }else
        if(String.valueOf(total_baris).length()==3){
            TJumlah.setText("0"+total_baris);
        }else
        if(String.valueOf(total_baris).length()==4){
            TJumlah.setText(""+total_baris);
        }
    }
    
     public static void fungsiCari(){
         DefaultTableModel tbl = new DefaultTableModel();
         tbl.addColumn("No. Pembayaran");
         tbl.addColumn("Nama Pasien");
         tbl.addColumn("Obat");
         tbl.addColumn("Harga Obat");
         tbl.addColumn("Biaya Pemeriksaan");
         tbl.addColumn("Total Bayar");
         tbl.addColumn("Status");
         TabelPembayaran.setModel(tbl);
         try{
             Connection connect = koneksi.koneksiDatabase();
             int data = TabelPembayaran.getRowCount();
             for(int i=0;i<data;i++){
                 tbl.removeRow(0);
             }
             stmt = connect.createStatement();
             query = "SELECT pembayaran.no_bayar, pasien.nama_pasien, obat.nama_obat, obat.harga, dokter.biaya_periksa, "
                     + "SUM(obat.harga + dokter.biaya_periksa) AS total_bayar, pembayaran.status FROM pasien "
                     + "JOIN diagnosa ON diagnosa.id_pasien = pasien.id_pasien "
                     + "JOIN resep ON resep.id_pasien = diagnosa.id_pasien "
                     + "JOIN obat ON obat.no_obat = resep.no_obat "
                     + "JOIN dokter ON dokter.id_dokter = diagnosa.id_dokter "
                     + "JOIN pembayaran ON pembayaran.no_resep = resep.no_resep "
                     + "WHERE pembayaran.no_bayar LIKE '%"+TCari.getText()+"%' "
                     + "OR pasien.nama_pasien LIKE '%"+TCari.getText()+"%' "
                     + "OR obat.nama_obat LIKE '%"+TCari.getText()+"%' "
                     + "OR dokter.biaya_periksa LIKE '"+TCari.getText()+"' "
                     + "OR pembayaran.status LIKE '%"+TCari.getText()+"%' "
                     + "GROUP BY pembayaran.no_bayar DESC";
             rs = stmt.executeQuery(query);
             while(rs.next()){                    
                tbl.addRow(new Object[]{
                    rs.getString("no_bayar"),
                    rs.getString("nama_pasien"),
                    rs.getString("nama_obat"),
                    rs.getString("harga"),
                    rs.getString("biaya_periksa"),
                    rs.getString("total_bayar"),
                    rs.getString("status")
                    
                });
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage() + "Error : ");
            }
        }

     public static void empty_field(){
        TNoBayar.setText(null);
        TIdPasien.setText(null);
        TNamaPasien.setText(null);
        TNamaObat.setText(null);
        THargaObat.setText(null);
        TBiayaPeriksa.setText(null);
        TTotalBayar.setText(null);
        TUsia.setText(null);
        TAlamat.setText(null);
        CStatus.setSelectedItem("-");
    }
    
    public static void enable_field(){
        TNoBayar.setEditable(true);
        TIdPasien.setEditable(true);
        TNamaPasien.setEditable(true);
        TNamaObat.setEditable(true);
        THargaObat.setEditable(true);
        TBiayaPeriksa.setEditable(true);
        TTotalBayar.setEditable(true);
    }
    
    public static void disable_field(){
        TUsia.setEditable(false);
        TAlamat.setEditable(false);
        TNamaPasien.setEditable(false);
        TNamaObat.setEditable(false);
        THargaObat.setEditable(false);
        TBiayaPeriksa.setEditable(false);
        TTotalBayar.setEditable(false);
    }
    
}
