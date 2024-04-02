/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MysticMart.dao;

import MysticMart.dbutil.DBConnection;
import MysticMart.pojo.ProductPojo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    public static String getNextProductId() throws SQLException {
        Statement st = DBConnection.getConn().createStatement();
        ResultSet rs = st.executeQuery("select max(p_id) from products");
        rs.next();
        String productId = rs.getString(1);
        if (productId == null) {
            return "P101";
        }
        int productNo = Integer.parseInt(productId.substring(1, productId.length()));
        productNo++;
        return "P"+productNo;
    }

    public static boolean addProduct(ProductPojo p) throws SQLException {
        PreparedStatement ps = DBConnection.getConn().prepareStatement("insert into products values (?,?,?,?,?,?,?,'Y')");
        ps.setString(1, p.getProductId());
        ps.setString(2, p.getProductName());
        ps.setString(3, p.getProductCompany());
        ps.setDouble(4, p.getProductPrice());
        ps.setDouble(5, p.getOurPrice());
        ps.setInt(6, p.getTax());
        ps.setInt(7, p.getQuantity());
        return ps.executeUpdate() == 1;
    }

    public static List<ProductPojo> getProductDetails() throws SQLException {
        Statement st = DBConnection.getConn().createStatement();
        ResultSet rs = st.executeQuery("select * from products where status='Y' order by p_id");
        List<ProductPojo> productList = new ArrayList<>();
        while (rs.next()) {

            ProductPojo product = new ProductPojo();
            product.setProductId(rs.getString(1));
            product.setProductName(rs.getString(2));
            product.setProductCompany(rs.getString(3));
            product.setProductPrice(rs.getDouble(4));
            product.setOurPrice(rs.getDouble(5));
            product.setTax(rs.getInt(6));
            product.setQuantity(rs.getInt(7));

            productList.add(product);
        }
        return productList;

    }

    public static boolean deleteProduct(String productId) throws SQLException {
        PreparedStatement ps = DBConnection.getConn().prepareStatement("update products set status='N' where p_id=?");
        ps.setString(1, productId);
        return ps.executeUpdate() == 1;
    }

    public static boolean updateProduct(ProductPojo p) throws SQLException {
        PreparedStatement ps = DBConnection.getConn().prepareStatement("update products set p_name=?,p_companyname=?,p_price=?,our_price=?,p_tax=?,quantity=? where p_id=?");       
        ps.setString(1, p.getProductName());
        ps.setString(2, p.getProductCompany());
        ps.setDouble(3, p.getProductPrice());
        ps.setDouble(4, p.getOurPrice());
        ps.setInt(5, p.getTax());
        ps.setInt(6, p.getQuantity());
        ps.setString(7, p.getProductId());
        return ps.executeUpdate() == 1;
    }
    
    public static ProductPojo getProductDetails(String id) throws SQLException
    {
       PreparedStatement ps = DBConnection.getConn().prepareStatement("Select * from products where p_id=? and status='Y'");
       ps.setString(1,id);
       ResultSet rs=ps.executeQuery();
       ProductPojo product=new ProductPojo();
       if(rs.next())
       {
            product.setProductId(rs.getString(1));
            product.setProductName(rs.getString(2));
            product.setProductCompany(rs.getString(3));
            product.setProductPrice(rs.getDouble(4));
            product.setOurPrice(rs.getDouble(5));
            product.setTax(rs.getInt(6));
            product.setQuantity(rs.getInt(7));
       }
       return product;
    }
    
    public static boolean updateStocks(List<ProductPojo> productList)throws SQLException
    {
       PreparedStatement ps = DBConnection.getConn().prepareStatement("update products set quantity=quantity-? where p_id=?");
       int x=0;
       for(ProductPojo p:productList)
       {
           ps.setInt(1, p.getQuantity());
           ps.setString(2, p.getProductId());
           int rows=ps.executeUpdate();
           if(rows!=0)
               x++;           
       }
       return x==productList.size();
    }
}
