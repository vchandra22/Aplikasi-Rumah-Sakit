package model;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import view.diagnosadokter;
import javax.swing.table.DefaultTableModel;

public class Mdiagnosa extends diagnosadokter{
    
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    
    public static void penomoran(){
        Connection connect = koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "SELECT * FROM diagnosa ORDER BY no_diagnosa DESC";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                String nomor = rs.getString("no_diagnosa").substring(1);
                String angka = "" + (Integer.parseInt(nomor)+1);
                String nol = "";
                
                if(angka.length()==1){
                    nol="3350000";
                }else if(angka.length()==2){
                    nol="335000";
                }else if(angka.length()==3){
                    nol="33500";
                }else if(angka.length()==4){
                    nol="3350";
                }else if(angka.length()==5){
                    nol="335";
                }else if(angka.length()==6){
                    nol="33";
                }else if(angka.length()==7){
                    nol="3";
                }else if(angka.length()==8){
                    nol="";
                }
                TNoDiagnosa.setText("" + nol + angka);
            }else {
                TNoDiagnosa.setText("33500001");
            }
            stmt.close();
            connect.close();
        }catch (NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(null, e); 
        }
    }
       
//    public static String [] getListIdDokter(){
//        String data[] = null;
//        Connection connect = koneksi.koneksiDatabase();
//        TSpesialis.setText(null);
//        try{
//            stmt = connect.createStatement();
//            query = "SELECT id_dokter, nama_dokter FROM dokter ORDER BY nama_dokter ASC";
//            rs = stmt.executeQuery(query);
//            ResultSetMetaData meta = rs.getMetaData();
//            int jmlKolom = meta.getColumnCount();
//            data = new String [1000];
//            int r = 0;
//            while(rs.next()){
//                String id = rs.getString(1);
//                String nama = rs.getString(2);
//                String list = id +(" - ")+ nama;
//                    data[r] = list;
//                r++;
//            }
//            int jmlBaris = r;
//            String [] tmparray = data;
//            data = new String[jmlBaris];
//            for(r=0; r<jmlBaris; r++){
//                data[r] = tmparray[r];
//            }
//
//            stmt.close();
//            connect.close();
//        }catch(SQLException ex) {
//            System.out.println("Error : "+ ex.getMessage());
//        }
//        return data;
//    }
    
//    public static void getIdDokter(){
//        String ininamadokter = CNamaDokter.getSelectedItem().toString();
//        try{
//            Connection connect = koneksi.koneksiDatabase();
//            stmt = connect.createStatement();
//            query = "SELECT * FROM dokter WHERE nama_dokter LIKE '"+ininamadokter+"'";
//            rs = stmt.executeQuery(query);
//            if(rs.next()){
//                TIdDokter.setText(rs.getString(1));
//                TIdDokter.setEditable(false);
//            }
//            stmt.close();
//            connect.close();
//        }catch(SQLException ex) {
//            System.out.println("Error : "+ ex.getMessage());
//        }
//    }
    
    public static void getIdDokterUbah(){
        String ininamadokter = TNamaPasien.getText();
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT * FROM pasien WHERE nama_pasien LIKE '"+ininamadokter+"'";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                TIdPasien.setText(rs.getString(1));
                TIdPasien.setEditable(true);
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println("Error : "+ ex.getMessage());
        }
    }
    
//    public static void getSpesialis(){
//        String ininamadokter = CNamaDokter.getSelectedItem().toString();
//        try{
//            Connection connect = koneksi.koneksiDatabase();
//            stmt = connect.createStatement();
//            query = "SELECT * FROM dokter WHERE nama_dokter LIKE '"+ininamadokter+"'";
//            rs = stmt.executeQuery(query);
//            if(rs.next()){
//                TSpesialis.setText(rs.getString(3));
//                TSpesialis.setEditable(false);
//            }
//            stmt.close();
//            connect.close();
//        }catch(SQLException ex) {
//            System.out.println("Error : "+ ex.getMessage());
//        }
//    }
    
    public static void CekDataDobel(){
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT * FROM diagnosa WHERE id_pasien = '"+TIdPasien.getText()+"'";
            rs = stmt.executeQuery(query);
            if (rs.next()){
                JOptionPane.showMessageDialog(null, "Kode Pasien : "+TIdPasien.getText()+" "+TNamaPasien.getText()+"\nSudah melakukan pemeriksaan\nSilahkan Masukkan Kode Pasien Lain!", "Error", JOptionPane.WARNING_MESSAGE);
                TIdPasien.requestFocus();
                TIdPasien.setText(null);
                TNamaPasien.setText(null);
                TKeluhan.setText(null);
        }
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Salah Prosedur (Cek Double Data) Simpan!");
        }
    }
    
    public static void HapusData(){
         try{
             Connection connect = koneksi.koneksiDatabase();
             stmt = connect.createStatement();
             query = "DELETE FROM diagnosa WHERE no_diagnosa='"+TNoDiagnosa.getText()+"'";
             stmt.executeUpdate(query);
             
             stmt.close();
             connect.close();
         }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }     
     }
    
     public static void tabel(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No. Diagnosa");
        tbl.addColumn("Nama Dokter");
        tbl.addColumn("Nama Pasien");
        tbl.addColumn("Usia Pasien");
        tbl.addColumn("Keluhan");
        tbl.addColumn("Hasil Pemeriksaan");
        TabelDataPemeriksaan.setModel(tbl);
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT dokter.id_dokter, no_diagnosa, nama_dokter, nama_pasien, usia, keluhan, hasil_periksa FROM diagnosa "
                    + "JOIN dokter ON diagnosa.id_dokter = dokter.id_dokter "
                    + "JOIN pasien ON pasien.id_pasien = diagnosa.id_pasien WHERE dokter.id_dokter = '"+TIdDokter.getText()+"'"
                    + "ORDER BY no_diagnosa DESC";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString("no_diagnosa"),
                    rs.getString("nama_dokter"),
                    rs.getString("nama_pasien"),
                    rs.getString("usia"),
                    rs.getString("keluhan"),
                    rs.getString("hasil_periksa"),
                });
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }
    }
     
     public static void FungsiCari(){
         DefaultTableModel tbl = new DefaultTableModel();
         tbl.addColumn("No. Diagnosa");
         tbl.addColumn("Nama Dokter");
         tbl.addColumn("Nama Pasien");
         tbl.addColumn("Usia Pasien");
         tbl.addColumn("Keluhan");
         tbl.addColumn("Hasil Pemeriksaan");
        TabelDataPemeriksaan.setModel(tbl);
         try{
             Connection connect = koneksi.koneksiDatabase();
             int data = TabelDataPemeriksaan.getRowCount();
             for(int i=0;i<data;i++){
                 tbl.removeRow(0);
             }
             stmt = connect.createStatement();
             query = "SELECT dokter.id_dokter, no_diagnosa, nama_dokter, nama_pasien, usia, keluhan, hasil_periksa FROM diagnosa "
                     + "JOIN dokter ON diagnosa.id_dokter = dokter.id_dokter "
                     + "JOIN pasien ON pasien.id_pasien = diagnosa.id_pasien "
                     + "WHERE no_diagnosa LIKE '%"+TCariData.getText()+"%' AND dokter.id_dokter = '"+TIdDokter.getText()+"'"
                     + "OR nama_dokter LIKE '%"+TCariData.getText()+"%' AND dokter.id_dokter = '"+TIdDokter.getText()+"'"
                     + "OR nama_pasien LIKE '%"+TCariData.getText()+"%' AND dokter.id_dokter = '"+TIdDokter.getText()+"'"
                     + "OR usia LIKE '%"+TCariData.getText()+"%' AND dokter.id_dokter = '"+TIdDokter.getText()+"'"
                     + "OR keluhan LIKE '%"+TCariData.getText()+"%' AND dokter.id_dokter = '"+TIdDokter.getText()+"'"
                     + "OR hasil_periksa LIKE '%"+TCariData.getText()+"%' AND dokter.id_dokter = '"+TIdDokter.getText()+"'";
             rs = stmt.executeQuery(query);
             while(rs.next()){                    
                tbl.addRow(new Object[]{
                    rs.getString("no_diagnosa"),
                    rs.getString("nama_dokter"),
                    rs.getString("nama_pasien"),
                    rs.getString("usia"),
                    rs.getString("keluhan"),
                    rs.getString("hasil_periksa")
                });
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage() + "Error : ");
            }
        }
     
     public static void FungsiCariPasien(){
         String iniIdPasien = TIdPasien.getText().toString();
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT id_pasien, nama_pasien, keluhan FROM pasien WHERE id_pasien LIKE '"+iniIdPasien+"'";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                TNamaPasien.setText(rs.getString(2));
                TKeluhan.setText(rs.getString(3));
                JOptionPane.showMessageDialog(null, "Data ditemukan","Insert Data",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan ","Insert Data",JOptionPane.INFORMATION_MESSAGE);
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println("Error : "+ ex.getMessage());
        }
     }
     
     public static void ubahData(){
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "UPDATE diagnosa SET no_diagnosa='"+TNoDiagnosa.getText()+"',hasil_periksa='"+THasilPeriksa.getText()+"',id_dokter='"+TIdDokter.getText()+"',id_pasien='"+TIdPasien.getText()+"'WHERE no_diagnosa='"+temp_no_diagnosa+"'";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data berhasil diubah","Update Data",JOptionPane.INFORMATION_MESSAGE);
                       
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }   
    }
     
     public static void hitungData() {
        int total_baris = TabelDataPemeriksaan.getRowCount();
        if(String.valueOf(total_baris).length()==1){
            TJumlahData.setText("000"+total_baris);
        }else
        if(String.valueOf(total_baris).length()==2){
            TJumlahData.setText("00"+total_baris);
        }else
        if(String.valueOf(total_baris).length()==3){
            TJumlahData.setText("0"+total_baris);
        }else
        if(String.valueOf(total_baris).length()==4){
            TJumlahData.setText(""+total_baris);
        }
    }
     
     public static void SimpanData(){
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "INSERT INTO diagnosa VALUES('"+TNoDiagnosa.getText()+"','"+THasilPeriksa.getText()+"','"+TIdDokter.getText()+"','"+TIdPasien.getText()+"')";
            int reply = JOptionPane.showConfirmDialog(null,"Simpan data ?, \ndata yang telah disimpan dapat dihapus melalui menu pembayaran !!!","Peringatan", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (reply == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan","Insert Data",JOptionPane.INFORMATION_MESSAGE);
            stmt.executeUpdate(query);
            }else{
                JOptionPane.showMessageDialog(null, "Batal menyimpan data ini");
                HapusData();
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }
    }
     
         public static int GetIDDokter(String id_dokter){
        Connection connect = koneksi.koneksiDatabase();
        int data=0;
        try{
            stmt = connect.createStatement();
            query = "SELECT id_dokter FROM dokter WHERE id_dokter='"+TIdDokter+"' ";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                data = rs.getInt(1);
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return data; 
    }
    public static void getDetailDokter(){
         try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT * FROM dokter WHERE id_dokter='"+TIdDokter.getText()+"'";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                TIdDokter.setText(rs.getString(1));
                TNamaDokter.setText(rs.getString(2));
                //TSpesialis.setText(rs.getString(3));
            }
                       
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }   
     }
     
    
    public static void empty_field(){
        TNoDiagnosa.setText(null);
        //CNamaDokter.setSelectedItem("-");
        //TSpesialis.setText(null);
        TIdPasien.setText(null);
        TNamaPasien.setText(null);
        THasilPeriksa.setText(null);
        TKeluhan.setText(null);
    }
    
    public static void enable_field(){
        TNoDiagnosa.setEditable(true);
        //CNamaDokter.setEditable(true);
        //TSpesialis.setEditable(true);
        TIdPasien.setEditable(true);
        TNamaPasien.setEditable(true);
        THasilPeriksa.setEditable(true);
        TKeluhan.setEditable(true);
    }
    
    public static void disable_field(){
        TNoDiagnosa.setEditable(false);
        //CNamaDokter.setEditable(false);
        //TSpesialis.setEditable(false);
        TIdPasien.setEditable(false);
        TNamaPasien.setEditable(false);
        THasilPeriksa.setEditable(false);
        TKeluhan.setEditable(false);
    }
}
        
    
