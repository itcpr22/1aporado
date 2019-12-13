/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActPack;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class productClass {
    conn con = new conn();
    
    public int product(String pName, int quantity, Object price ){
   
    int x = 0;
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = (Connection) DriverManager.getConnection(con.url, con.username, con.password);
        String sql = "insert into product values(null,?,?,?)";
        PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
        
        String np = price.toString();
        float newprice = Float.parseFloat(np);
        
        pstmt.setString(1, pName);
        pstmt.setInt(2, quantity);
        pstmt.setFloat(3,  newprice);
       
        
        x = pstmt.executeUpdate();
        
        //System.out.println(x);
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(productClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(productClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    return x; 
    }
    
    
    
     public int editProduct(Object id, String product_name, Object price){
        int r = 0;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = (Connection) DriverManager.getConnection(con.url,con.username,con.password);
        
        String sql = "UPDATE product SET pName = ?, price = ? WHERE id = ?;";
        PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
        
        pstmt.setString(1, product_name);
        float newprice = Float.parseFloat(price.toString());
        pstmt.setFloat(2, newprice);
        String newid = (String) id;
        pstmt.setString(3, newid);
        
        //System.out.println(pstmt);
        r = pstmt.executeUpdate();
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(productClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(productClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

  public int product_addQty(int id, Object quantity){int y = 0;
        try{
    String sql = "update product set quantity = quantity+ ? where id=?;";
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection conn = (java.sql.Connection)DriverManager.getConnection("jdbc:mysql://localhost/1aporado?", "root", "");
    java.sql.PreparedStatement pstmt = conn.prepareStatement(sql);
    
    pstmt.setString(1, quantity.toString());
    pstmt.setInt(2, id);
    y=pstmt.executeUpdate();
    
    
}       catch (ClassNotFoundException ex) {
            Logger.getLogger(productClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(productClass.class.getName()).log(Level.SEVERE, null, ex);
        }return y; 
    }   
}
