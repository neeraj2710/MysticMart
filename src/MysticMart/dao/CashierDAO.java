/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MysticMart.dao;

import MysticMart.dbutil.DBConnection;
import MysticMart.pojo.CashierPojo;
import MysticMart.pojo.UserPojo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CashierDAO {

    public static Map<String, String> getNonRegisteredCashiers() throws SQLException {
        Statement st = DBConnection.getConn().createStatement();
        ResultSet rs = st.executeQuery("Select empid,empname from employees where job='Cashier' and empid not in(Select empid from users where usertype='Cashier')");
        HashMap<String, String> cashierList = new HashMap<>();
        while (rs.next()) {
            String id = rs.getString(1);
            String name = rs.getString(2);
            cashierList.put(id, name);
        }
        return cashierList;
    }

    public static boolean addCashier(UserPojo user) throws SQLException {
        PreparedStatement ps = DBConnection.getConn().prepareStatement("insert into users values(?,?,?,?,?)");
        ps.setString(1, user.getUserid());
        ps.setString(2, user.getEmpid());
        ps.setString(3, user.getPassword());
        ps.setString(4, user.getUsertype());
        ps.setString(5, user.getUsername());
        return ps.executeUpdate() == 1;
    }

    public static List<CashierPojo> getAllCashierDetails() throws SQLException {
        Statement st = DBConnection.getConn().createStatement();
        ResultSet rs = st.executeQuery("select users.empid,empname,userid,job,salary from users, employees where usertype='Cashier' and users.empid=employees.empid");
        ArrayList<CashierPojo> al = new ArrayList<>();

        while (rs.next()) {
            CashierPojo cashier = new CashierPojo();
            cashier.setEmpid(rs.getString(1));
            cashier.setEmpname(rs.getString(2));
            cashier.setUserid(rs.getString(3));
            cashier.setJob(rs.getString(4));
            cashier.setSalary(rs.getDouble(5));
            al.add(cashier);
        }

        return al;
    }

    public static Map<String, String> getAllCashierIdAndName() throws SQLException {
        Statement st = DBConnection.getConn().createStatement();
        ResultSet rs = st.executeQuery("Select userid,username from users where usertype='Cashier' order by userid");
        HashMap<String, String> cashierList = new HashMap<>();
        while (rs.next()) {
            String id = rs.getString(1);
            String name = rs.getString(2);
            cashierList.put(id, name);
        }
        return cashierList;
    }

    public static boolean updatePassword(String userid, String pwd) throws SQLException {
        PreparedStatement ps = DBConnection.getConn().prepareStatement("update users set password=? where userid=?");
        ps.setString(1, pwd);
        ps.setString(2, userid);
        return ps.executeUpdate() == 1;
    }

    public static List<String> getAllCashierUserId() throws SQLException {
        Statement st = DBConnection.getConn().createStatement();
        ResultSet rs = st.executeQuery("Select userid from users where usertype='Cashier' order by userid");
        List<String> cashierList = new ArrayList<>();
        while (rs.next()) {
            String id = rs.getString(1);
            cashierList.add(id);
        }
        return cashierList;
    }

    public static boolean deleteCashier(String userid) throws SQLException {
        System.out.println("this is userid "+userid);
        PreparedStatement ps = DBConnection.getConn().prepareStatement("delete from users where userid=?");
        ps.setString(1, userid);
        return ps.executeUpdate() == 1;
    }
}
