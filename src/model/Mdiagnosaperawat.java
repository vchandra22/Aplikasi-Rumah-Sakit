package model;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.diagnosaperawat;

public class Mdiagnosaperawat extends diagnosaperawat{
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    
    public static void tabel(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No. Diagnosa");
        tbl.addColumn("Nama Dokter");
        tbl.addColumn("Nama Pasien");
        tbl.addColumn("Usia Pasien");
        tbl.addColumn("Keluhan");
        tbl.addColumn("Hasil Pemeriksaan");
        TabelDataPeriksa.setModel(tbl);
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT dokter.id_dokter, no_diagnosa, nama_dokter, nama_pasien, usia, keluhan, hasil_periksa FROM diagnosa "
                    + "JOIN dokter ON diagnosa.id_dokter = dokter.id_dokter "
                    + "JOIN pasien ON pasien.id_pasien = diagnosa.id_pasien "
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
        TabelDataPeriksa.setModel(tbl);
         try{
             Connection connect = koneksi.koneksiDatabase();
             int data = TabelDataPeriksa.getRowCount();
             for(int i=0;i<data;i++){
                 tbl.removeRow(0);
             }
             stmt = connect.createStatement();
             query = "SELECT dokter.id_dokter, no_diagnosa, nama_dokter, nama_pasien, usia, pasien.keluhan, hasil_periksa FROM diagnosa "
                     + "JOIN dokter ON diagnosa.id_dokter = dokter.id_dokter "
                     + "JOIN pasien ON pasien.id_pasien = diagnosa.id_pasien "
                     + "WHERE no_diagnosa LIKE '%"+TCariData.getText()+"%' "
                     + "OR nama_dokter LIKE '%"+TCariData.getText()+"%' "
                     + "OR nama_pasien LIKE '%"+TCariData.getText()+"%' "
                     + "OR usia LIKE '%"+TCariData.getText()+"%' "
                     + "OR pasien.keluhan LIKE '%"+TCariData.getText()+"%' "
                     + "OR hasil_periksa LIKE '%"+TCariData.getText()+"%' ORDER BY no_diagnosa DESC";
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
     
     public static void hitungData() {
        int total_baris = TabelDataPeriksa.getRowCount();
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
}
