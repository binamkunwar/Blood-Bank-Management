/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blood.bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Acer
 */
public class BLOODBANKMANAGEMENTSYSTEM {

    /**
     * @param args the command line arguments
     */
   
        public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbankmanagement`","root","binam12345@");
               System.out.println("Connected");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    }
    

