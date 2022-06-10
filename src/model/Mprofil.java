package model;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import view.detailprofil;


public class Mprofil extends detailprofil {
    
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    
    public static int GetIDUser(String username, String password){
        Connection connect = koneksi.koneksiDatabase();
        int data=0;
        try{
            stmt = connect.createStatement();
            query = "SELECT id_perawat FROM perawat WHERE username='"+TUsername+"' "
                    + " AND password='"+TPassword+"' ";
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
    
    public static void getDetailPerawat(){
         try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT * FROM perawat WHERE username='"+TUsername.getText()+"'";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                TIdPerawat.setText(rs.getString(1));
                TNamaPerawat.setText(rs.getString(2));
                TTanggalLahir.setText(rs.getString(3));
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
    
    public static void disable_field(){
        TNamaPerawat.setEditable(false);
        TTanggalLahir.setEditable(false);
        TJenisKelamin.setEditable(false);
        TNoHp.setEditable(false);
        TAlamat.setEditable(false);
        TUsername.setEditable(false);
        TPassword.setEditable(false);
    }
}
