package com.makotojava.intro;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	@Test
	void testPrintAuditStringLogger() {
		Employee e = new Employee("Joe Doe",25,175,80,"Brown","MALE");
		e.setTaxpayerIdnumber("123-45-6789");
		e.setEmployeeNumber("ABC12345");
		e.setSalary(BigDecimal.valueOf(6000.0));
		StringBuilder sb = new StringBuilder();
		e.printAudit(sb);
		e.printAudit(Logger.getLogger(EmployeeTest.class.getName()));
	}
	
	@Test
	public void testReferenceAssignment() {
		Person p;
		Employee e;
		Manager m;
		Executive x;
		StockOptionEligible soe;
		
		p = new Person();
		
		e = p; // narrowing conversion - no okay to assign
		m = p; // ibid
		x = p;  // ibid
				
		e = new Employee();
		p = e; //widening conversion - okay to assign
		
		m = new Manager();
		e = m; //widening conversion
		p = m; // ibid 
		m = e; // narrowing conversion - no okay to assign
		
		x = new Executive();
		m = x; //widening conversion
		e = x; //widening conversion
		p = x; //widening conversion
		x = m; //narrowing conversion
		x = e; //narrowing conversion
		x = p; //narrowing conversion
		
		soe = x; // Implements StockOptionEligible, okay to assign
		soe = m;
		soe = e; // Employee does NOT implement StockOptionEligible
		soe = p; // Person 	  "	   "     "              "
	}

/*
	@Test
	public void test() {
	int  int1 = 1;
	int int2 = 1;
	Logger l = Logger.getLogger(EmployeeTest.class.getName());
	
	l.info("Q: int1 == int2? A: " + (int1 == int2));
	Integer integer1 = Integer.valueOf(int1);
	Integer integer2 = Integer.valueOf(int2);
	l.info("Q: Integer1 == Integer2? A: " + (integer1 == integer2));
	integer1  = new Integer(int1);
	integer2 = new Integer(int2);
	l.info("Q: Integer1 == Integer2? A: " + (integer1 == integer2));
	Employee employee1 = new Employee();
	Employee employee2 = new Employee();
	l.info("Q: Employee1 == Employee2? A: " + (employee1 == employee2));
	}
	
	@Test
	public void anotherTest() {
	
	Logger l = Logger.getLogger(EmployeeTest.class.getName());
	
	Integer integer1 = Integer.valueOf(1);
	Integer integer2 = Integer.valueOf(1);
	l.info("Q: Integer1 == Integer2? A: " + (integer1 == integer2));
	l.info("Q: Integer1.equals(Integer2) ? A: " + integer1.equals(integer2));
	integer1  = new Integer(integer1);
	integer2 = new Integer(integer2);
	l.info("Q: Integer1 == Integer2? A: " + (integer1 == integer2));
	l.info("Q: Integer1.equals(Integer2) ? A: " + integer1.equals(integer2));
	Employee employee1 = new Employee();
	Employee employee2 = new Employee();
	l.info("Q: employee1 == employee2? A: " + (employee1 == employee2));
	l.info("Q: employee1.equals(employee2) ? A: " + employee1.equals(employee2));
	}
	
	@Test
	public void yetAnotherTest() {
		Logger l = Logger.getLogger(Employee.class.getName());
		Employee employee1 = new Employee();
		employee1.setName("J Smith");
		Employee employee2 = new Employee();
		employee2.setName("J Smith");
		l.info("Q: employee1 == employee2? A:" + (employee1 == employee2));
		l.info("Q: employee1.equals(employee2)? A: " + employee1.equals(employee2));
		}
	
 /*	@Test
	void testPrintAuditStringBuilder() {
		fail("Not yet implemented");
	}
	*/
*/

}
