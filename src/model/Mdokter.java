package model;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import view.dokter;
import javax.swing.table.DefaultTableModel;

public class Mdokter extends dokter{
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    
    public static void penomoran(){
        Connection connect = koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "SELECT * FROM dokter ORDER BY id_dokter DESC";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                String nomor = rs.getString("id_dokter").substring(1);
                String angka = "" + (Integer.parseInt(nomor)+1);
                String nol = "";
                
                if(angka.length()==1){
                    nol="80880";
                }else if(angka.length()==2){
                    nol="8088";
                }else if(angka.length()==3){
                    nol="808";
                }else if(angka.length()==4){
                    nol="80";
                }else if(angka.length()==5){
                    nol="8";
                }
                TIdDokter.setText("" + nol + angka);
            }else {
                TIdDokter.setText("808801");
            }
            stmt.close();
            connect.close();
        }catch (NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(null, e); 
        }
    }
    
    public static void SimpanData(){
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "INSERT INTO dokter VALUES('"+TIdDokter.getText()+"','"+TNamaDokter.getText()+"','"+TSpesialis.getText()+"','"+TBiayaPeriksa.getText()+"')";
            stmt.executeUpdate(query);
            System.out.println("Data berhasil disimpan !");
            
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }
    }
    
    public static void UbahData(){
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "UPDATE dokter SET id_dokter='"+TIdDokter.getText()+"',nama_dokter='"+TNamaDokter.getText()+"',spesialis='"+TSpesialis.getText()+"',biaya_periksa='"+TBiayaPeriksa.getText()+"'WHERE id_dokter='"+temp_id_dokter+"'";
            stmt.executeUpdate(query);
                       
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
             query = "DELETE FROM dokter WHERE id_dokter='"+TIdDokter.getText()+"'";
             stmt.executeUpdate(query);
             
             stmt.close();
             connect.close();
         }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }     
     }
    
    public static void tabel(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID Dokter");
        tbl.addColumn("Nama Dokter");
        tbl.addColumn("Spesialis");
        tbl.addColumn("Biaya Periksa");
        TabelDataDokter.setModel(tbl);
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT * FROM dokter ORDER BY id_dokter DESC";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString("id_dokter"),
                    rs.getString("nama_dokter"),
                    rs.getString("spesialis"),
                    rs.getString("biaya_periksa"),
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
         tbl.addColumn("ID Dokter");
         tbl.addColumn("Nama Dokter");
         tbl.addColumn("Spesialis");
         tbl.addColumn("Biaya Periksa");
        TabelDataDokter.setModel(tbl);
         try{
             Connection connect = koneksi.koneksiDatabase();
             int data = TabelDataDokter.getRowCount();
             for(int i=0;i<data;i++){
                 tbl.removeRow(0);
             }
             stmt = connect.createStatement();
             query = "SELECT * FROM dokter WHERE id_dokter LIKE '%"+TCari.getText()+"'"
                     +"OR nama_dokter LIKE '%"+TCari.getText()+"%'"
                     +"OR spesialis LIKE '%"+TCari.getText()+"%'"
                     +"OR biaya_periksa LIKE '%"+TCari.getText()+"%' ORDER BY id_dokter DESC";
             rs = stmt.executeQuery(query);
             while(rs.next()){                    
                tbl.addRow(new Object[]{
                    rs.getString("id_dokter"),
                    rs.getString("nama_dokter"),
                    rs.getString("spesialis"),
                    rs.getString("biaya_periksa"),
                });
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage() + "Error : ");
        }
    }
    
     public static void hitungData() {
        int total_baris = TabelDataDokter.getRowCount();
        if(String.valueOf(total_baris).length()==1){
            LJumlahAngka.setText("000"+total_baris);
        }else
        if(String.valueOf(total_baris).length()==2){
            LJumlahAngka.setText("00"+total_baris);
        }else
        if(String.valueOf(total_baris).length()==3){
            LJumlahAngka.setText("0"+total_baris);
        }else
        if(String.valueOf(total_baris).length()==4){
            LJumlahAngka.setText(""+total_baris);
        }
    }
     
        public static void empty_field(){
        TIdDokter.setText(null);
        TNamaDokter.setText(null);
        TSpesialis.setText(null);
        TBiayaPeriksa.setText(null);
    }
    
    public static void enable_field(){
        TIdDokter.setEditable(true);
        TNamaDokter.setEditable(true);
        TSpesialis.setEditable(true);
        TBiayaPeriksa.setEditable(true);

    }
    
    public static void disable_field(){
        TIdDokter.setEditable(false);
        TNamaDokter.setEditable(false);
        TSpesialis.setEditable(false);
        TBiayaPeriksa.setEditable(false);
    }
}
