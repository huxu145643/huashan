package com.ruanyuan.pojo;

public class Employee {
    private  int empno;
    private String ename;
    private String job;
    private String hiredate;
    private String sal;
    private String comm;
    private Department deptno;

    public int getEmpno() {
        return empno;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", hiredate='" + hiredate + '\'' +
                ", sal='" + sal + '\'' +
                ", comm='" + comm + '\'' +
                ", deptno=" + deptno +
                '}';
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    public Department getDeptno() {
        return deptno;
    }

    public void setDeptno(Department deptno) {
        this.deptno = deptno;
    }
}
