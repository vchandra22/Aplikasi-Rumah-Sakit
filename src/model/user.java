package model;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class user {
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    private static int IDUser;
    private static int IDDokter;
    
    public static void setIDUser(int id_perawat){
        user.IDUser = id_perawat;
    } 
    public static void setIDDokter(int id_dokter){
        user.IDDokter = id_dokter;
    }
    public static int getIDUser() {
        return IDUser;
    }
        public static int getIDDokter() {
        return IDDokter;
    }
    public static int CekUser(String username, String password){
        Connection connect = koneksi.koneksiDatabase();
        int data=0;
        try{
            stmt = connect.createStatement();
            query = "SELECT COUNT(id_perawat) FROM perawat WHERE username='"+username+"'"
                    + " AND password='"+password+"' ";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                data = rs.getInt(1);
            }
            stmt.close();
            connect.close();
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return data;
    }
    
    public static String[][] getProfil(int id_perawat) {
        Connection connect = koneksi.koneksiDatabase();
        String data[][] = null;
        try{
            stmt = connect.createStatement();
            query = "SELECT * FROM perawat WHERE id_perawat = '"+id_perawat+"'";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            data = new String[1000][jmlKolom];
            int r = 0;
            while(rs.next()){
                for(int c=0; c<jmlKolom; c++){
                    data[r][c] = rs.getString(c+1);
                }
                r++;
            }
            int jmlBaris = r;
            String [][] tmparray = data;
            data = new String[jmlBaris][jmlKolom];
            for(r=0; r<jmlBaris; r++){
                for(int c=0; c<jmlKolom; c++){
                    data[r][c] = tmparray[r][c];
                }
            }
            stmt.close();
            connect.close();
            }catch(SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return data;
    }
    
    public static int GetIDUser(String username, String password){
        Connection connect = koneksi.koneksiDatabase();
        int data=0;
        try{
            stmt = connect.createStatement();
            query = "SELECT id_perawat FROM perawat WHERE username='"+username+"' "
                    + " AND password='"+password+"' ";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                data = rs.getInt(1);
                JOptionPane.showMessageDialog(null, "Berhasil masuk sebagai perawat","Masuk",JOptionPane.INFORMATION_MESSAGE);
            }
            stmt.close();
            connect.close();
            }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Username atau Password Salah","Masuk",JOptionPane.INFORMATION_MESSAGE);
        }
        return data; 
    }
    
    public static int GetIDDokter(String id_dokter){
        Connection connect = koneksi.koneksiDatabase();
        int data=0;
        try{
            stmt = connect.createStatement();
            query = "SELECT id_dokter FROM dokter WHERE id_dokter='"+id_dokter+"'";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                data = rs.getInt(1);
                JOptionPane.showMessageDialog(null, "Berhasil masuk sebagai dokter","Masuk",JOptionPane.INFORMATION_MESSAGE);
            }
            stmt.close();
            connect.close();
            }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "ID Dokter tidak ditemukan","Masuk",JOptionPane.INFORMATION_MESSAGE);
        }
        return data; 
    }
    
    public static int CekDokter(String id_dokter){
        Connection connect = koneksi.koneksiDatabase();
        int data=0;
        try{
            stmt = connect.createStatement();
            query = "SELECT COUNT(id_dokter) FROM dokter WHERE id_dokter='"+id_dokter+"'";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                data = rs.getInt(1);
            }
            stmt.close();
            connect.close();
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return data;
    }
        
    public static String[][] getProfilDokter(int id_dokter) {
        Connection connect = koneksi.koneksiDatabase();
        String data[][] = null;
        try{
            stmt = connect.createStatement();
            query = "SELECT * FROM dokter WHERE id_dokter = '"+id_dokter+"'";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            data = new String[1000][jmlKolom];
            int r = 0;
            while(rs.next()){
                for(int c=0; c<jmlKolom; c++){
                    data[r][c] = rs.getString(c+1);
                }
                r++;
            }
            int jmlBaris = r;
            String [][] tmparray = data;
            data = new String[jmlBaris][jmlKolom];
            for(r=0; r<jmlBaris; r++){
                for(int c=0; c<jmlKolom; c++){
                    data[r][c] = tmparray[r][c];
                }
            }
            stmt.close();
            connect.close();
            }catch(SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return data;
    }

    public static void setIDDokter(String id_dokter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
