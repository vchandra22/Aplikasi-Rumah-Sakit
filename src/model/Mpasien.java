package model;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import view.*;
import javax.swing.table.DefaultTableModel;

public class Mpasien extends pasien{
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    
    public static void penomoran(){
        Connection connect = koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "SELECT * FROM pasien ORDER BY id_pasien DESC";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                String nomor = rs.getString("id_pasien").substring(1);
                String angka = "" + (Integer.parseInt(nomor)+1);
                String nol = "";
                
                if(angka.length()==1){
                    nol="988000";
                }else if(angka.length()==2){
                    nol="98800";
                }else if(angka.length()==3){
                    nol="9880";
                }else if(angka.length()==4){
                    nol="988";
                }else if(angka.length()==5){
                    nol="98";
                }else if(angka.length()==6){
                    nol="9";
                }else if(angka.length()==7){
                    nol="";
                }
                TIdPasien.setText("" + nol + angka);
            }else {
                TIdPasien.setText("980001");
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
            query = "INSERT INTO pasien VALUES('"+TIdPasien.getText()+"','"+TNamaPasien.getText()+"',"
                    + "'"+TUsia.getText()+"','"+CJenisKelamin.getSelectedItem()+"','"+TAlamat.getText()+"','"+TKeluhan.getText()+"')";
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
            query = "UPDATE pasien SET id_pasien='"+TIdPasien.getText()+"',nama_pasien='"+TNamaPasien.getText()+"',"
                    + "usia='"+TUsia.getText()+"',jk_pasien='"+CJenisKelamin.getSelectedItem()+"',"
                    + "alamat='"+TAlamat.getText()+"', keluhan='"+TKeluhan.getText()+"' WHERE id_pasien='"+temp_id_pasien+"'";
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
             query = "DELETE FROM pasien WHERE id_pasien='"+TIdPasien.getText()+"'";
             stmt.executeUpdate(query);
             
             stmt.close();
             connect.close();
         }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
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
    
    public static void fungsiCari(){
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
                     +"WHERE id_pasien LIKE '%"+TCari.getText()+"%' "
                     +"OR nama_pasien LIKE '%"+TCari.getText()+"%' "
                     +"OR usia LIKE '%"+TCari.getText()+"%' "
                     +"OR jk_pasien LIKE '%"+TCari.getText()+"%' "
                     +"OR alamat LIKE '%"+TCari.getText()+"%' "
                     +"OR keluhan LIKE '%"+TCari.getText()+"%' "
                     +"ORDER BY id_pasien DESC";
             rs = stmt.executeQuery(query);
             while(rs.next()){                    
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
        }catch(SQLException ex){
            System.out.println(ex.getMessage() + "Error : ");
            }
        }
        
    public static void empty_field(){
        TIdPasien.setText(null);
        TNamaPasien.setText(null);
        TUsia.setText(null);
        TAlamat.setText(null);
        TKeluhan.setText(null);
        CJenisKelamin.setSelectedItem("-");
    }
    
    public static void enable_field(){
        TIdPasien.setEditable(true);
        TNamaPasien.setEditable(true);
        TUsia.setEditable(true);
        TAlamat.setEditable(true);
        TKeluhan.setEditable(true);
        CJenisKelamin.setEnabled(true);
    }
    
    public static void disable_field(){
        TIdPasien.setEditable(false);
        TNamaPasien.setEditable(false);
        TUsia.setEditable(false);
        TAlamat.setEditable(false);
        TKeluhan.setEditable(false);
        CJenisKelamin.setEnabled(false);
    }
    
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
}
