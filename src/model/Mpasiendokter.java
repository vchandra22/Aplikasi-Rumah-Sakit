package model;
import javax.swing.table.DefaultTableModel;
import view.pasiendokter;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import view.pasiendokter;
import javax.swing.JOptionPane;

public class Mpasiendokter extends pasiendokter {
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    
        public static void hitungData() {
        int total_baris = TabelDataPasien.getRowCount();
        if(String.valueOf(total_baris).length()==1){
            LAngkaJumlah.setText("000"+total_baris);
        }else
        if(String.valueOf(total_baris).length()==2){
            LAngkaJumlah.setText("00"+total_baris);
        }else
        if(String.valueOf(total_baris).length()==3){
            LAngkaJumlah.setText("0"+total_baris);
        }else
        if(String.valueOf(total_baris).length()==4){
            LAngkaJumlah.setText(""+total_baris);
        }
    }
        public static void tabel(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID Pasien");
        tbl.addColumn("Nama Pasien");
        tbl.addColumn("Usia");
        tbl.addColumn("Jenis Kelamin");
        tbl.addColumn("Alamat");
        tbl.addColumn("Keluhan");
        TabelDataPasien.setModel(tbl);
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT * FROM pasien ORDER BY id_pasien DESC";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString("id_pasien"),
                    rs.getString("nama_pasien"),
                    rs.getString("usia"),
                    rs.getString("jk_pasien"),
                    rs.getString("alamat"),
                    rs.getString("keluhan")
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
         tbl.addColumn("ID Pasien");
         tbl.addColumn("Nama Pasien");
         tbl.addColumn("Usia");
         tbl.addColumn("Jenis Kelamin");
         tbl.addColumn("Alamat");
         tbl.addColumn("Keluhan");
        TabelDataPasien.setModel(tbl);
         try{
             Connection connect = koneksi.koneksiDatabase();
             int data = TabelDataPasien.getRowCount();
             for(int i=0;i<data;i++){
                 tbl.removeRow(0);
             }
             stmt = connect.createStatement();
             query = "SELECT * FROM pasien "
                     +"WHERE id_pasien LIKE '%"+TCari.getText()+"%'"
                     +"OR nama_pasien LIKE '%"+TCari.getText()+"%'"
                     +"OR usia LIKE '%"+TCari.getText()+"%'"
                     +"OR jk_pasien LIKE '%"+TCari.getText()+"%'"
                     +"OR keluhan LIKE '%"+TCari.getText()+"%'"
                     +"OR alamat LIKE '%"+TCari.getText()+"%' ORDER BY id_pasien DESC";
             rs = stmt.executeQuery(query);
             while(rs.next()){                    
                tbl.addRow(new Object[]{
                    rs.getString("id_pasien"),
                    rs.getString("nama_pasien"),
                    rs.getString("usia"),
                    rs.getString("jk_pasien"),
                    rs.getString("alamat"),
                    rs.getString("Keluhan")
                });
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage() + "Error : ");
            }
        }
        
        public static void disable_field(){
        TIdPasien.setEditable(false);
        TNamaPasien.setEditable(false);
        TUsia.setEditable(false);
        TAlamat.setEditable(false);
        TJenisKelamin.setEditable(false);
        TKeluhan.setEditable(false);
    }
        public static void empty_field(){
        TIdPasien.setText(null);
        TNamaPasien.setText(null);
        TUsia.setText(null);
        TAlamat.setText(null);
        TJenisKelamin.setText(null);
    }
            
        public static void enable_field(){
        TIdPasien.setEditable(true);
        TNamaPasien.setEditable(true);
        TUsia.setEditable(true);
        TAlamat.setEditable(true);
        TJenisKelamin.setEnabled(true);
    }
}


