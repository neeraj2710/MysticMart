/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MysticMart.dao;

import MysticMart.dbutil.DBConnection;
import MysticMart.pojo.ProductPojo;
import MysticMart.pojo.UserProfile;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OrderDAO {

    public static String getNextOrderId() throws SQLException {
        Statement st = DBConnection.getConn().createStatement();
        ResultSet rs = st.executeQuery("select max(order_id) from orders");
        rs.next();
        String orderId = rs.getString(1);
        if (orderId == null) {
            return "R101";
        }
        int orderNo = Integer.parseInt(orderId.substring(1, orderId.length()));
        orderNo++;
        return "R"+orderNo;
    }

    public static boolean addOrder(List<ProductPojo> al, String ordId) throws SQLException {
        PreparedStatement ps = DBConnection.getConn().prepareStatement("insert into orders values (?,?,?,?,?,?,?,?,?)");
        int count=0;
        for (ProductPojo p : al) {
            ps.setString(1, ordId);
            ps.setString(2, p.getProductId());
            ps.setString(3, p.getProductName());
            ps.setString(4, p.getProductCompany());
            ps.setDouble(5, p.getProductPrice());
            ps.setDouble(6, p.getOurPrice());
            ps.setInt(7, p.getTax());
            ps.setInt(8, p.getQuantity());
            ps.setString(9, UserProfile.getUserid());
            count=count+ps.executeUpdate();
        }
        return count==al.size();
    }
    
    public static Set<String> getOrderId(String userid)throws SQLException{
        String url="select order_id from orders where userid =? order by order_id";
        PreparedStatement ps=DBConnection.getConn().prepareStatement(url);
        ps.setString(1, userid);
        ResultSet rs=ps.executeQuery();
        Set<String> idList = new HashSet<>();
        while(rs.next()){
            idList.add(rs.getString(1));
        }
        return idList;
    }
    
    public static List<ProductPojo> getOrderDetails(String orderid)throws SQLException{
        String url="select p.p_id, p.p_name,p.p_companyname, p.p_price, p.our_price,o.quantity,p.p_tax from products p join orders o on o.p_id=p.p_id where order_id=?";
        PreparedStatement ps=DBConnection.getConn().prepareStatement(url);
        ps.setString(1,orderid );
       
        ResultSet rs=ps.executeQuery();
        List<ProductPojo> pList = new ArrayList<>();
        while(rs.next()){
            ProductPojo p = new ProductPojo();
            p.setProductId(rs.getString(1));
            p.setProductName(rs.getString(2));
            p.setProductCompany(rs.getString(3));
            p.setProductPrice(rs.getDouble(4));
            p.setOurPrice(rs.getDouble(5));
            p.setQuantity(rs.getInt(6));
            p.setTax(rs.getInt(7));
            double ourPrice=rs.getDouble(5);
            int tax=rs.getInt(7);
            int quantity=rs.getInt(6);
            double total=(ourPrice+(ourPrice*tax/100))*quantity;
            p.setTotal(total);
            pList.add(p);
        }
        return pList;
    }
    
    public static Set<String> getOrderId()throws SQLException{
        String url="select order_id from orders order by order_id";
        Statement st=DBConnection.getConn().createStatement();
        
        ResultSet rs=st.executeQuery(url);
        Set<String> idList = new HashSet<>();
        while(rs.next()){
            idList.add(rs.getString(1));
        }
        return idList;
}
    

}
