/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MysticMart.dao;

import MysticMart.dbutil.DBConnection;
import MysticMart.pojo.UserPojo;
import MysticMart.pojo.UserProfile;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public static boolean validteUser(UserPojo user) throws SQLException {

        PreparedStatement ps = DBConnection.getConn().prepareStatement("select * from users where userid=? and password=? and usertype=?");
//        System.out.println(user);
        ps.setString(1, user.getUserid());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUsertype());
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            UserProfile.setUsername(rs.getString("username"));
            UserProfile.setUserid(user.getUserid());
//            System.out.println(UserProfile.getUsername());
            return true;
        }
        return false;
    }

    public static boolean isUserPresent(String empid) throws SQLException {
        PreparedStatement ps = DBConnection.getConn().prepareStatement("select 1 from users where empid=?");
        ps.setString(1, empid);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }
}
