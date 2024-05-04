package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class dbConnector {
    
    private Connection connect;

    public dbConnector(){
        try{
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bims", "root", "");
        }catch(SQLException ex){
                System.out.println("Can't connect to database: "+ex.getMessage());
        }
    }

    public ResultSet getData(String sql) throws SQLException{
        Statement stmt = connect.createStatement();
        ResultSet rst = stmt.executeQuery(sql);
        return rst;
    }
    
    public boolean insertData(String sql){
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                pst.executeUpdate();
                pst.close();
               return true;
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
               return false;
            }
    }
    
    public PreparedStatement prepareStatement(String query) throws SQLException {
        return connect.prepareStatement(query);
    }
    
    public boolean updateData(String sql){
        try{
            PreparedStatement pst = connect.prepareStatement(sql);
            int rowsUpdated = pst.executeUpdate();
            pst.close();
            return rowsUpdated > 0;
        } catch(SQLException ex){
            System.out.println("Connection Error: " + ex);
            return false;
        }
    }
    
    public boolean deleteData(String sql) {
        try {
            PreparedStatement pst = connect.prepareStatement(sql);
            int rowsDeleted = pst.executeUpdate();
            pst.close();
            return rowsDeleted > 0;
        } catch(SQLException ex) {
            System.out.println("Connection Error: " + ex);
            return false;
        }
    }
}