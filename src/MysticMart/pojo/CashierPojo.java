/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MysticMart.pojo;

public class CashierPojo {
    private String empid;
    private String empname;
    private String userid;
    private String job;
    private Double salary;

    @Override
    public String toString() {
        return "CashierPojo{" + "empid=" + empid + ", empname=" + empname + ", userid=" + userid + ", job=" + job + ", salary=" + salary + '}';
    }

    public CashierPojo(String empid, String empname, String userid, String job, Double salary) {
        this.empid = empid;
        this.empname = empname;
        this.userid = userid;
        this.job = job;
        this.salary = salary;
    }

    public CashierPojo() {

    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    

}
