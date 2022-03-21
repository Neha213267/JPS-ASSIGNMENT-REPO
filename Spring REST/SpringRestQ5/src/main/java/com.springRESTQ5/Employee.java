package com.springRESTQ5;

public class Employee {
	
	    private String employeeId, employeeName, employeeDepartment, employeeDesignation, employeeSalary;

	    public String getEmployeeId()
	    {
	        return employeeId;
	    }

	    public void setEmployeeId(String employeeId)
	    {
	        this.employeeId = employeeId;
	    }

	    public String getEmployeeName()
	    {
	        return employeeName;
	    }

	    public void setEmployeeName(String employeeName)
	    {
	        this.employeeName = employeeName;
	    }

	    public String getEmployeeDepartment() {
	        return employeeDepartment;
	    }

	    public void setEmployeeDepartment(String employeeDepartment) {
	        this.employeeDepartment = employeeDepartment;
	    }

	    public String getEmployeeDesignation() {
	        return employeeDesignation;
	    }

	    public void setEmployeeDesignation(String employeeDesignation) {
	        this.employeeDesignation = employeeDesignation;
	    }

	    public String getEmployeeSalary() {
	        return employeeSalary;
	    }

	    public void setEmployeeSalary(String employeeSalary) {
	        this.employeeSalary = employeeSalary;
	    }

	    public Employee()
	    {
	    }

	    public Employee(String employeeId,String employeeName,String employeeDepartment,String employeeDesignation,String employeeSalary)
	    {
	        super();
	        this.employeeDepartment=employeeDepartment;
	        this.employeeId = employeeId;
	        this.employeeSalary = employeeSalary;
	        this.employeeName = employeeName;
	        this.employeeDesignation = employeeDesignation;
	    }

}
