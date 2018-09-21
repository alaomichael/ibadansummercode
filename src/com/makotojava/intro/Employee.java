package com.makotojava.intro;

import java.math.BigDecimal;

public class Employee extends Person {
	private String taxpayerIdnumber;
	private String employeeNumber;
	private BigDecimal salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, int height, int weight, String eyeColor, String gender) {
		super(name, age, height, weight, eyeColor, gender);
		// TODO Auto-generated constructor stub
	}

	public String getTaxpayerIdnumber() {
		return taxpayerIdnumber;
	}

	public void setTaxpayerIdnumber(String taxpayerIdnumber) {
		this.taxpayerIdnumber = taxpayerIdnumber;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	/*
	@Override
	public void printAudit(StringBuilder buffer) {
		// Call the superclass version of this method first to get its attribute values
		super.printAudit(buffer);
		// Now format this instance's values
		buffer.append("TaxpayerIdentificationNumber=");
		buffer.append(getTaxpayerIdnumber());
		buffer.append(",");
		buffer.append("EmployeeNumber=");
		buffer.append(getEmployeeNumber());
		buffer.append(",");
		buffer.append("Salary=");
		buffer.append(getSalary().setScale(2).toPlainString());
	}
	*/
	
	@Override
	public void printAudit(StringBuilder buffer) {
		buffer.append(toString());
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	public String toString() {
		return super.toString() + "Employee [taxpayerIdnumber=" + taxpayerIdnumber + ", employeeNumber=" + employeeNumber + ", salary="
				+ salary + "]";
	}

}
