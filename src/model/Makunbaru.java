package model;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import view.tambahperawat;

public class Makunbaru extends tambahperawat {
    
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    
    public static void penomoran(){    
        Connection connect = koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "SELECT * FROM perawat ORDER BY id_perawat DESC";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                String nomor = rs.getString("id_perawat").substring(1);
                String angka = "" + (Integer.parseInt(nomor)+1);
                String nol = "";
                
                if(angka.length()==1){
                    nol="22400";
                }else if(angka.length()==2){
                    nol="2240";
                }else if(angka.length()==3){
                    nol="224";
                }else if(angka.length()==4){
                    nol="22";
                }else if(angka.length()==5){
                    nol="2";
                }
                TIdPerawat.setText("" + nol + angka);
            }else{
                TIdPerawat.setText("224001");
            }
            stmt.close();
            connect.close();
        }catch (NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(null, e); 
        }
    }
    
    public static void SimpanData(){
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("yyyy-MM-dd");
        String tgl_lahir = String.valueOf(kal.format(TTanggal.getDate()));
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "INSERT INTO perawat VALUES('"+TIdPerawat.getText()+"','"+TNamaPerawat.getText()+"','"+tgl_lahir+"',"
                    + "'"+CJenisKelamin.getSelectedItem()+"','"+TNoHp.getText()+"','"+TAlamat.getText()+"',"
                    + "'"+TUsername.getText()+"','"+TPassword.getText()+"')";
            stmt.executeUpdate(query);
            System.out.println("Data berhasil disimpan !");
            
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
             query = "DELETE FROM perawat WHERE id_perawat='"+TIdPerawat.getText()+"'";
             stmt.executeUpdate(query);
             
             stmt.close();
             connect.close();
         }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }     
     }
    
        public static void empty_field(){
        TIdPerawat.setText(null);
        TNamaPerawat.setText(null);
        TAlamat.setText(null);
        TUsername.setText(null);
        TPassword.setText(null);
        TNoHp.setText(null);
        TTanggal.setCalendar(null);
        CJenisKelamin.setSelectedItem("-");
    }
        public static void disable_field(){
        TNamaPerawat.setEditable(false);
        TAlamat.setEditable(false);
        TUsername.setEditable(false);
        TPassword.setEditable(false);
        TNoHp.setEditable(false);
        CJenisKelamin.setEditable(false);
        CJenisKelamin.setSelectedItem("-");
    }
}
