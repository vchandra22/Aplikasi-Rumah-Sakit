package model;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import view.obat;
import javax.swing.table.DefaultTableModel;

public class Mobat extends obat{
    
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    
    public static void penomoran(){
        Connection connect = koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "SELECT * FROM obat ORDER BY no_obat DESC";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                String nomor = rs.getString("no_obat").substring(1);
                String angka = "" + (Integer.parseInt(nomor)+1);
                String nol = "";
                
                if(angka.length()==1){
                    nol="89880000";
                }else if(angka.length()==2){
                    nol="8988000";
                }else if(angka.length()==3){
                    nol="898800";
                }else if(angka.length()==4){
                    nol="89880";
                }else if(angka.length()==5){
                    nol="8988";
                }else if(angka.length()==6){
                    nol="898";
                }else if(angka.length()==7){
                    nol="89";
                }else if(angka.length()==8){
                    nol="8";
                }else if(angka.length()==9){
                    nol="";
                }
                TNoObat.setText("" + nol + angka);
            }else {
                TNoObat.setText("898800001");
            }
            stmt.close();
            connect.close();
        }catch (NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(null, e); 
        }
    }
    
    public static void tabel(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No. Obat");
        tbl.addColumn("Nama Obat");
        tbl.addColumn("Jenis Obat");
        tbl.addColumn("Dosis");
        tbl.addColumn("Harga");
        TabelObat.setModel(tbl);
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "SELECT * FROM obat ORDER BY no_obat DESC";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString("no_obat"),
                    rs.getString("nama_obat"),
                    rs.getString("jenis_obat"),
                    rs.getString("dosis"),
                    rs.getString("harga"),
                });
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }
    }
    
     public static void SimpanData(){
        try{
            Connection connect = koneksi.koneksiDatabase();
            stmt = connect.createStatement();
            query = "INSERT INTO obat VALUES('"+TNoObat.getText()+"','"+TNamaObat.getText()+"','"+TJenisObat.getText()+"','"+TDosis.getText()+"','"+THarga.getText()+"')";
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
             query = "DELETE FROM obat WHERE no_obat='"+TNoObat.getText()+"'";
             stmt.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Data berhasil dihapus","Delete Data",JOptionPane.INFORMATION_MESSAGE);
             
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
            query = "UPDATE obat SET no_obat='"+TNoObat.getText()+"',nama_obat='"+TNamaObat.getText()+"',jenis_obat='"+TJenisObat.getText()+"',dosis='"+TDosis.getText()+"',harga='"+THarga.getText()+"'WHERE no_obat='"+temp_no_obat+"'";
            stmt.executeUpdate(query);
                       
            stmt.close();
            connect.close();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage() + "Error : ");
        }
    }
     
     public static void FungsiCari(){
         DefaultTableModel tbl = new DefaultTableModel();
         tbl.addColumn("No. Obat");
         tbl.addColumn("Nama Obat");
         tbl.addColumn("Jenis Obat");
         tbl.addColumn("Dosis");
         tbl.addColumn("Harga");
         TabelObat.setModel(tbl);
         try{
             Connection connect = koneksi.koneksiDatabase();
             int data = TabelObat.getRowCount();
             for(int i=0;i<data;i++){
                 tbl.removeRow(0);
             }
             stmt = connect.createStatement();
             query = "SELECT * FROM obat "
                     + "WHERE no_obat LIKE '%"+TCariObat.getText()+"%' "
                     + "OR nama_obat LIKE '%"+TCariObat.getText()+"%' "
                     + "OR jenis_obat LIKE '%"+TCariObat.getText()+"%' "
                     + "OR dosis LIKE '%"+TCariObat.getText()+"%' "
                     + "OR harga LIKE '%"+TCariObat.getText()+"%' ORDER BY no_obat DESC";
             rs = stmt.executeQuery(query);
             while(rs.next()){                    
                tbl.addRow(new Object[]{
                    rs.getString("no_obat"),
                    rs.getString("nama_obat"),
                    rs.getString("jenis_obat"),
                    rs.getString("dosis"),
                    rs.getString("harga")
                });
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage() + "Error : ");
            }
        }
     
       public static void hitungData() {
        int total_baris = TabelObat.getRowCount();
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
     
    
    public static void empty_field(){
        TNoObat.setText(null);
        TNamaObat.setText(null);
        TJenisObat.setText(null);
        TDosis.setText(null);
        THarga.setText(null);
        
    }
    
    public static void enable_field(){
        TNoObat.setEditable(true);
        TNamaObat.setEditable(true);
        TJenisObat.setEditable(true);
        TDosis.setEditable(true);
        THarga.setEditable(true);
    }
    
    public static void disable_field(){
        TNoObat.setEditable(false);
        TNamaObat.setEditable(false);
        TJenisObat.setEditable(false);
        TDosis.setEditable(false);
        THarga.setEditable(false);
    }
}
