package com.example1.demo1.model;


// import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeDetails {

    @Id
    private Long empId;
    private String empName;
    private String empDept;
    //  @Column(name = "gmail", length = 20,unique=true) 
    private String empGmail;
    private int empSalary;
    
    public EmployeeDetails() {
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public String getEmpGmail() {
        return empGmail;
    }

    public void setEmpGmail(String empGmail) {
        this.empGmail = empGmail;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

  
    
    
}
