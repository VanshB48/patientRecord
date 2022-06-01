
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forData;
import java.sql.*;  

/**
 *
 * @author vansh
 */
public class connectionProvider {
    public static Connection getCon()
    {
        try{
            Class.forName("com.mysql.MyLibrary.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql//localhost8080/forData","root","");
            return con;
        } catch (Exception e) {
            return null;
        }
    }
        
    
}
