/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MysticMart.pojo;


public class EmployeePojo {
    private String empid;
    private String empname;
    private String job;
    private double salary;

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmployeePojo() {
        
    }

    public EmployeePojo(String empid, String empname, String job, double salary) {
        this.empid = empid;
        this.empname = empname;
        this.job = job;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePojo{" + "empid=" + empid + ", empname=" + empname + ", job=" + job + ", salary=" + salary + '}';
    }
    
}
