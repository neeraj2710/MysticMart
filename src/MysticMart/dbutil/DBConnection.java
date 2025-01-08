/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MysticMart.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DBConnection {
    private static Connection conn;

    public static Connection getConn() {
        return conn;
    }
    public static void closeConnection(){
        try{
            conn.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Connot close Connection");
            ex.printStackTrace();
        }
    }
    static{
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","mysticmart","mysticmart");
            //JOptionPane.showMessageDialog(null,"Connected successfully");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Connot open Connection");
            ex.printStackTrace();
            System.exit(0);
        }
    }
    
    
}