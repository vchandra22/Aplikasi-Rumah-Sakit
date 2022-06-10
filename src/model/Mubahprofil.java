package model;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import view.ubahprofil;


public class Mubahprofil extends ubahprofil{
        
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    
    public static void getTanggalLahir(){
         try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT tgl_lahir_perawat FROM perawat WHERE id_perawat ='"+TIdPerawat.getText()+"'";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                TTanggalLahir.setDate(rs.getDate(1));
            }
                       
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }   
     }
    
    
    public static void getDetailPerawat(){
         try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT * FROM perawat WHERE id_perawat ='"+TIdPerawat.getText()+"'";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                TIdPerawat.setText(rs.getString(1));
                TNamaPerawat.setText(rs.getString(2));
                TTanggalLahir.setDate(rs.getDate(3));
                TJenisKelamin.setText(rs.getString(4));
                TNoHp.setText(rs.getString(5));
                TAlamat.setText(rs.getString(6));
                TUsername.setText(rs.getString(7));
                TPassword.setText(rs.getString(8));
            }
                       
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }   
     }
    
    public static void UbahData(){
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("yyyy-MM-dd");
        String tgl_lahir = String.valueOf(kal.format(TTanggalLahir.getDate()));
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "UPDATE perawat SET id_perawat='"+TIdPerawat.getText()+"',"
                    + "nama_perawat='"+TNamaPerawat.getText()+"',"
                    + "tgl_lahir_perawat='"+tgl_lahir+"',"
                    + "jk_perawat='"+TJenisKelamin.getText()+"',"
                    + "no_telp='"+TNoHp.getText()+"',alamat='"+TAlamat.getText()+"',"
                    + "username='"+TUsername.getText()+"',password='"+TPassword.getText()+"' "
                    + "WHERE id_perawat='"+TIdPerawat.getText()+"'";
            stmt.executeUpdate(query);
                       
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }
    }
    
}
