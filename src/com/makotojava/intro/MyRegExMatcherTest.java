package com.makotojava.intro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyRegExMatcherTest {

	@Test
	   public void testMatchesAll() {
	      MyRegExMatcher classUnderTest = new MyRegExMatcher();
	 
	      String input = "The quick brown fox jumped over the lazy dogs";
	      String regEx = ".*x.*l.*";
	      boolean matches = classUnderTest.matchesAll(regEx, input);
	      assertTrue(matches); 
	      //assertFalse(matches);
	}
}
