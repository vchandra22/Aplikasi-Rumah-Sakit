
package model;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import view.resepdokter;
import javax.swing.table.DefaultTableModel;

public class Mresep extends resepdokter{
    
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    
    public static void penomoran(){
        Connection connect = koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "SELECT * FROM resep ORDER BY no_resep DESC";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                String nomor = rs.getString("no_resep").substring(1);
                String angka = "" + (Integer.parseInt(nomor)+1);
                String nol = "";
                
                if(angka.length()==1){
                    nol="6809000";
                }else if(angka.length()==2){
                    nol="680900";
                }else if(angka.length()==3){
                    nol="68090";
                }else if(angka.length()==4){
                    nol="6809";
                }else if(angka.length()==5){
                    nol="680";
                }else if(angka.length()==6){
                    nol="68";
                }else if(angka.length()==7){
                    nol="6";
                }else if(angka.length()==8){
                    nol="";
                }
                TNoResep.setText("" + nol + angka);
            }else {
                TNoResep.setText("68090001");
            }
            stmt.close();
            connect.close();
        }catch (NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(null, e); 
        }
    }
    
    public static void SimpanData(){
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("yyyy-MM-dd");
        String tglresep = String.valueOf(kal.format(TTanggal.getDate()));
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "INSERT INTO resep VALUES('"+TNoResep.getText()+"','"+tglresep+"','"+TIdPasien.getText()+"','"+TNoObat.getText()+"')";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan","Insert Data",JOptionPane.INFORMATION_MESSAGE);

            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }
    }
    
    public static void getNoObat(){
        String ininamaobat = CObat.getSelectedItem().toString();
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT * FROM obat WHERE nama_obat LIKE '"+ininamaobat+"'";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                TNoObat.setText(rs.getString(1));
                TNoObat.setEditable(false);
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println("Error : "+ ex.getMessage());
        }
    }
    
    public static void HapusData(){
         try{
             Connection connect = koneksi.koneksiDatabase();
             stmt = connect.createStatement();
             query = "DELETE FROM pembayaran WHERE no_resep='"+TNoResep.getText()+"'";
             stmt.executeUpdate(query);
             
             stmt.close();
             connect.close();
         }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }     
     }
    
     public static void tabel(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No. Resep");
        tbl.addColumn("No. Diagnosa");
        tbl.addColumn("Nama Pasien");
        tbl.addColumn("Hasil Periksa");
        tbl.addColumn("Obat");
        tbl.addColumn("Tanggal");
        TTabelResep.setModel(tbl);
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT no_resep, no_diagnosa, nama_pasien, hasil_periksa, nama_obat, tgl_resep FROM resep "
                    + "JOIN obat ON obat.no_obat = resep.no_obat JOIN pasien ON pasien.id_pasien = resep.id_pasien "
                    + "JOIN diagnosa ON resep.id_pasien = diagnosa.id_pasien WHERE id_dokter = '"+TIdDokter.getText()+"'"
                    + "ORDER BY no_resep DESC";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString("no_resep"),
                    rs.getString("no_diagnosa"),
                    rs.getString("nama_pasien"),
                    rs.getString("hasil_periksa"),
                    rs.getString("nama_obat"),
                    rs.getString("tgl_resep"),
                });
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }
    }
     
     public static void CekDataDobel(){
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT * FROM resep WHERE id_pasien = '"+TIdPasien.getText()+"'";
            rs = stmt.executeQuery(query);
            if (rs.next()){
                JOptionPane.showMessageDialog(null, "Kode Pasien : "+TIdPasien.getText()+"\nSudah Terdaftar\nSilahkan Ganti Kode Pasien !", "Error", JOptionPane.WARNING_MESSAGE);
                TIdPasien.requestFocus();
                TIdPasien.setEditable(true);
                TIdPasien.setText(null);
                TNamaPasien.setText(null);
        }
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Salah Prosedur (Cek Double Data) Simpan!");
        }
    }
     
     public static void FungsiCariPasien(){
         String iniIdPasien = TIdPasien.getText().toString();
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT diagnosa.id_pasien, pasien.nama_pasien, diagnosa.hasil_periksa FROM pasien "
                    + "JOIN diagnosa ON diagnosa.id_pasien = pasien.id_pasien WHERE diagnosa.id_pasien LIKE '"+iniIdPasien+"'";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                TNamaPasien.setText(rs.getString(2));
                THasilPeriksa.setText(rs.getString(3));
                JOptionPane.showMessageDialog(null, "Data ditemukan","Insert Data",JOptionPane.INFORMATION_MESSAGE);
                TIdPasien.setEditable(false);
            }else{
                JOptionPane.showMessageDialog(null, "Data pasien belum dilakukan pemeriksaan ","Insert Data",JOptionPane.INFORMATION_MESSAGE);
                TIdPasien.requestFocus();
                TIdPasien.setText(null);
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println("Error : "+ ex.getMessage());
        }
     }
        
        public static String [] getListObat(){
        String data[] = null;
        Connection connect = koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "SELECT no_obat, nama_obat FROM obat ORDER BY no_obat ASC";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            data = new String [1000];
            int r = 0;
            while(rs.next()){
                String nama = rs.getString(2);
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
     
     public static void getIdPasien(){
         String iniNoResep = TNoResep.getText().toString();
         try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT id_pasien FROM resep WHERE no_resep LIKE '"+iniNoResep+"'";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                TIdPasien.setText(rs.getString(1));
            }
                       
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }   
     }
     
     public static void ubahData(){
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("yyyy-MM-dd");
        String tglresep = String.valueOf(kal.format(TTanggal.getDate()));
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "UPDATE resep SET no_resep='"+TNoResep.getText()+"',tgl_resep='"+tglresep+"',id_pasien='"+TIdPasien.getText()+"',no_obat='"+TNoObat.getText()+"'WHERE no_resep='"+temp_no_resep+"'";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan","Insert Data",JOptionPane.INFORMATION_MESSAGE);
                       
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
        TNoResep.setText(null);
        TIdPasien.setText(null);
        TNamaPasien.setText(null);
    }
    
    public static void enable_field(){
        TNoResep.setEditable(true);
        TIdPasien.setEditable(true);
        TNamaPasien.setEditable(true);
    }
    
    public static void disable_field(){
        TNoResep.setEditable(false);
        TIdPasien.setEditable(false);
        TNamaPasien.setEditable(false);;
    }
}
