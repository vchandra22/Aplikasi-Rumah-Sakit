package model;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import view.lihatprofildokter;

public class Mprofildokter extends lihatprofildokter{
    
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    
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
                TSpesialis.setText(rs.getString(3));
            }
                       
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }   
     }
        
}
