package com.SRP;

public class Employee {
	
	private String employeeid;
	private String employeename;
	private String employeeaddress;
	private String employeenumber;
	private String employeetype;
	
	public void save()
	
	{
		
		//new EmployeeRepository().save(this);		
	}
	
	public void calulatetax()
	
	{
		
		//new TaxCalulation().calulatetax(this);
		
	}
	
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeeaddress() {
		return employeeaddress;
	}
	public void setEmployeeaddress(String employeeaddress) {
		this.employeeaddress = employeeaddress;
	}
	public String getEmployeenumber() {
		return employeenumber;
	}
	public void setEmployeenumber(String employeenumber) {
		this.employeenumber = employeenumber;
	}
	public String getEmployeetype() {
		return employeetype;
	}
	public void setEmployeetype(String employeetype) {
		this.employeetype = employeetype;
	}

}
