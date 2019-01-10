/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author phong lan
 */
public class Database {
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/nhanvien";
    static final String USER="root";
    static final String PASS="";
    public java.sql.Connection getConnection() {
        java.sql.Connection conn = null;
        Statement stmt = null;
         try{
                Class.forName(JDBC_DRIVER);
                conn = DriverManager.getConnection("jdbc:mysql://localhost/nhanvien", USER, PASS);
                return conn;
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return null;
        
    }
    
}
