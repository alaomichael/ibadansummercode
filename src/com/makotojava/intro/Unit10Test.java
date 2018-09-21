package com.makotojava.intro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class Unit10Test {
	
/*
	@Test
	void testIntInit() {
	Unit10 testclass = new Unit10();
		int[] intArray = testclass.intInit();
	assertEquals(intArray[0],1);
	assertEquals(intArray[1],2);
	assertEquals(intArray[2],3);
	assertEquals(intArray[3],5);
	assertEquals(intArray[4],7);
	assertEquals(intArray[5],11);
	assertEquals(intArray[6],13);
	assertEquals(intArray[7],17);
	assertEquals(intArray[8],19);
	assertEquals(intArray[9],23);
	assertEquals(intArray[10],27);
	assertEquals(intArray[11],29);
	};
		
	@Test
	public void testIntInit2() {
		int[] intArray = {
				1,2,3,5,7,11,13,17,19,23,27,29
		};
		Logger l = Logger.getLogger(Unit10.class.getName());
		for (int number : intArray) {
			l.info("Number: " + number);
		}
		
	} */
	
	@Test
	public void testProblem6(){
		List<Object> listOfObjects = new ArrayList<>();
		Logger l = Logger.getLogger(Unit10.class.getName());
		listOfObjects.add(32);
		listOfObjects.add("This is a string");
		listOfObjects.add(Integer.valueOf(238));
		listOfObjects.add(-410);
		listOfObjects.add(null);
		listOfObjects.add("I love my wife Esther Alao");
			
		l.info("List of Object: " + listOfObjects);	
		
	}
	
	@Test
	public void testProblem7() {
		Unit10 testclass = new Unit10();
		
		List<Object> listOfObjects = testclass.problem7();
		
		assertEquals (32, listOfObjects.get(0));
		assertEquals ("This is a string", listOfObjects.get(1));
		assertEquals (Integer.valueOf(238), listOfObjects.get(2));
		assertEquals (-410, listOfObjects.get(3));
		assertEquals (null, listOfObjects.get(4));
		assertEquals ("I love you Esther", listOfObjects.get(5));
	}
	
	}


