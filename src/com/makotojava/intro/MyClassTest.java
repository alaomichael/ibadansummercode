package com.makotojava.intro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class MyClassTest {

	@Test
	void testFormatArray() {
		Logger l = Logger.getLogger(MyClassTest.class.getName());
			
		 MyClass myClass = new MyClass();
	       
	      String[] stringArray = { 
	            "1", "2", "3", "Four", "5","Esther","Michael","Joel"
	      };
	      String formatted = myClass.formatArray(stringArray);
	      l.info(formatted);
	   }
	}


