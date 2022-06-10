package model;
import java.sql.*;
public class koneksi {
    public static Connection koneksi = null;
    public static Connection koneksiDatabase(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        koneksi = DriverManager.getConnection("jdbc:mysql:///rumahsakitpelitaharapan","root","");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Error : " + e.getMessage());
        }
        return koneksi;
    } 
}
