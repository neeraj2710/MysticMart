/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MysticMart.dao;

import MysticMart.dbutil.DBConnection;
import MysticMart.pojo.EmployeePojo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDAO {

    public static String getNextEmpId() throws SQLException {
        Statement st = DBConnection.getConn().createStatement();
        ResultSet rs = st.executeQuery("select max(empid) from employees");
        rs.next();
        String empid = rs.getString(1);
        int empNo = Integer.parseInt(empid.substring(1, empid.length()));
        empNo++;
        return "E" + empNo;
    }

    public static boolean addEmployee(EmployeePojo emp) throws SQLException {
        PreparedStatement ps = DBConnection.getConn().prepareStatement("insert into employees values(?,?,?,?)");
        ps.setString(1, emp.getEmpid());
        ps.setString(2, emp.getEmpname());
        ps.setString(3, emp.getJob());
        ps.setDouble(4, emp.getSalary());
        return ps.executeUpdate() == 1;
    }

    public static List<EmployeePojo> getAllEmployees() throws SQLException {
        Statement st = DBConnection.getConn().createStatement();
        ResultSet rs = st.executeQuery("select * from employees order by empid");
        List<EmployeePojo> empList = new ArrayList<>();
        while (rs.next()) {
            EmployeePojo emp = new EmployeePojo();
            emp.setEmpid(rs.getString(1));
            emp.setEmpname(rs.getString(2));
            emp.setJob(rs.getString(3));
            emp.setSalary(rs.getDouble(4));
            empList.add(emp);
        }
        return empList;
    }

    public static List<String> getAllEmpId() throws SQLException {
        Statement st = DBConnection.getConn().createStatement();
        ResultSet rs = st.executeQuery("select empid from employees order by empid ");
        ArrayList<String> allid = new ArrayList<String>();
        while (rs.next()) {
            allid.add(rs.getString(1));
        }
        return allid;
    }

    public static EmployeePojo findEmpById(String empid) throws SQLException {
        PreparedStatement ps = DBConnection.getConn().prepareStatement("Select * from employees where empid=?");
        ps.setString(1, empid);
        ResultSet rs = ps.executeQuery();
        rs.next();
        EmployeePojo emp = new EmployeePojo();
        emp.setEmpid(rs.getString(1));
        emp.setEmpname(rs.getString(2));
        emp.setJob(rs.getString(3));
        emp.setSalary(rs.getDouble(4));
        return emp;
    }

    public static boolean updateEmployee(EmployeePojo e) throws SQLException {
        PreparedStatement ps = DBConnection.getConn().prepareStatement("Update employees set empname=?,job=?,salary=? where empid=?");
        ps.setString(1, e.getEmpname());
        ps.setString(2, e.getJob());
        ps.setDouble(3, e.getSalary());
        ps.setString(4, e.getEmpid());
        int x = ps.executeUpdate();
        if (x == 0) {
            return false;
        } else {
            boolean result = UserDAO.isUserPresent(e.getEmpid());
            if (result == false) {
                return true;
            }

            ps = DBConnection.getConn().prepareStatement("Update users set username=?,usertype=? where empid=?");
            ps.setString(1, e.getEmpname());
            ps.setString(2, e.getJob());
            ps.setString(3, e.getEmpid());
            int y = ps.executeUpdate();
            return y == 1;
        }
    }
    
    public static boolean deleteEmployee(String empid) throws SQLException
    {
        PreparedStatement ps = DBConnection.getConn().prepareStatement("delete from employees where empid=?");
        ps.setString(1, empid);
        return ps.executeUpdate()==1;
    }
}
