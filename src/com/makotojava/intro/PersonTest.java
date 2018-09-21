package com.makotojava.intro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class PersonTest {
	
/*	@Test
	public void testToStringFullName() {
		Person p = new Person("Esther","Alao", 32, 162, 55,"Brown","FEMALE");
		Logger l = Logger.getLogger(PersonTest.class.getName());
		l.info("Full Name with toString method: " + p.getFullName());
		String fullName = p.getFullName();
		assertEquals("Esther Alao", fullName);
	}
*/
	
/*	@Test
	public void testToStringFullName() {
		Person p = new Person("Esther","Alao", 32, 162, 55,"Brown","FEMALE");
		Logger l = Logger.getLogger(PersonTest.class.getName());
		l.info("Full Name with toString method: " + p.toStringFullName());
	}

 */
	/*
 	@Test
	public void testPerson() {
 		
 		  Person p = new Person("Michael","Alao", 32, 164, 58,"Brown","MALE");
 			Logger l = Logger.getLogger(Person.class.getName());
 			for (int a=3, iterationNumber = 0;a<=9;a++, iterationNumber++) {
 			l.info("Loop executing iteration# " + iterationNumber);
 			l.info("Full Name: " + p.getFullName());
 			l.info("Age: " + p.getAge());
 			l.info("Height (cm): " + p.getHeight());
 			l.info("Weight (kg): " + p.getWeight());
 			l.info("Eye Color: " + p.getEyeColor());
 			l.info("Gender: " + p.getGender());
 			assertEquals("Michael Alao", p.getFullName());
 			assertEquals(32,p.getAge());
 			assertEquals(164, p.getHeight());
 			assertEquals(58, p.getWeight());
 			assertEquals("Brown", p.getEyeColor());
 			assertEquals("MALE", p.getGender());
 	}
 		
 			*/
 			
	/* For loop	iteration
	  Person p = new Person("Michael Alao", 32, 164, 58,"Brown","MALE");
		Logger l = Logger.getLogger(Person.class.getName());
		for (int a=3;a<=9;a++) 
		l.info("Loop executing iteration# " + a);
		l.info("Name: " + p.getName());
		l.info("Age: " + p.getAge());
		l.info("Height (cm): " + p.getHeight());
		l.info("Weight (kg): " + p.getWeight());
		l.info("Eye Color: " + p.getEyeColor());
		l.info("Gender: " + p.getGender());
		assertEquals("Michael Alao", p.getName());
		assertEquals(32,p.getAge());
		assertEquals(164, p.getHeight());
		assertEquals(58, p.getWeight());
		assertEquals("Brown", p.getEyeColor());
		assertEquals("MALE", p.getGender());
 	 */
 		
 		// while loop iteration
	/*	Person p = new Person("Michael Alao", 32, 164, 58,"Brown","MALE");
		Logger l = Logger.getLogger(Person.class.getName());
		int counter = 3;
		while (counter <= 9) {
		l.info("Loop executing iteration# " + counter);
		l.info("Name: " + p.getName());
		l.info("Age: " + p.getAge());
		l.info("Height (cm): " + p.getHeight());
		l.info("Weight (kg): " + p.getWeight());
		l.info("Eye Color: " + p.getEyeColor());
		l.info("Gender: " + p.getGender());
		assertEquals("Michael Alao", p.getName());
		assertEquals(32,p.getAge());
		assertEquals(164, p.getHeight());
		assertEquals(58, p.getWeight());
		assertEquals("Brown", p.getEyeColor());
		assertEquals("MALE", p.getGender());
		counter++;
	} */
		
	/* A do...while iteration loop
	 	int counters = 3;
		do {
		Person p = new Person("Michael Alao", 32, 164, 58,"Brown","MALE");
		Logger l = Logger.getLogger(Person.class.getName());
		
		l.info("Loop executing iteration# " + counters);
		l.info("Name: " + p.getName());
		l.info("Age: " + p.getAge());
		l.info("Height (cm): " + p.getHeight());
		l.info("Weight (kg): " + p.getWeight());
		l.info("Eye Color: " + p.getEyeColor());
		l.info("Gender: " + p.getGender());
		assertEquals("Michael Alao", p.getName());
		assertEquals(32,p.getAge());
		assertEquals(164, p.getHeight());
		assertEquals(58, p.getWeight());
		assertEquals("Brown", p.getEyeColor());
		assertEquals("MALE", p.getGender());
		counters++;
	} while (counters <= 9);
	*/
 		
 		// For loop	iteration
 	/*
 	 	  Person p = new Person("Michael Alao", 32, 164, 58,"Brown","MALE");
 	 
 			Logger l = Logger.getLogger(Person.class.getName());
 			for (int a=3;a<=9;a++) {
 			l.info("Loop executing iteration# " + a);
 			l.info("Name: " + p.getName());
 			l.info("Age: " + p.getAge());
 			l.info("Height (cm): " + p.getHeight());
 			l.info("Weight (kg): " + p.getWeight());
 			l.info("Eye Color: " + p.getEyeColor());
 			l.info("Gender: " + p.getGender());
 			assertEquals("Michael Alao", p.getName());
 			assertEquals(32,p.getAge());
 			assertEquals(164, p.getHeight());
 			assertEquals(58, p.getWeight());
 			assertEquals("Brown", p.getEyeColor());
 			assertEquals("MALE", p.getGender());
 	}
 }
		*/
/*	
	@Test
	public void testToString() {
		Person p = new Person("Esther Alao", 32, 162, 55,"Brown","FEMALE");
		Logger l = Logger.getLogger(PersonTest.class.getName());
		l.info("toString: " + p.toString());
	}
	
/*	@Test
	public void testPerson(String[] args) {
		Logger l = Logger.getLogger(Person.class.getName());
		for (int a=3;a<=9;a++) 
			Person p = new Person("Michael Alao", 32, 164, 58,"Brown","MALE");
	l.info("Loop executing iteration# " + a);
	l.info("Name: " + p.getName());
	l.info("Age: " + p.getAge());
	l.info("Height (cm): " + p.getHeight());
	l.info("Weight (kg): " + p.getWeight());
	l.info("Eye Color: " + p.getEyeColor());
	l.info("Gender: " + p.getGender());
} */
 			 			
}
 	