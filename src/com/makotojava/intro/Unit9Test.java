package com.makotojava.intro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class Unit9Test {
	
	/* A long hard core way to test methods
	 
	 	private static final Logger log = Logger.getLogger(Unit9.class.getName());
		@Test void testProblem10() {
			for (int aa = 3,iterationNumber = 1; iterationNumber <= 6; aa++, iterationNumber++) {
				log.info("Iterartion# " + iterationNumber + ", Loop variable: " + aa);
				}
			}

		@Test void testProblem11() {
			int aa = 3;
		int	iterationNumber = 1;
			while (iterationNumber <= 6){
				log.info("Iterartion# " + iterationNumber + ", Loop variable: " + aa);
				aa++;
				iterationNumber++;
			}
	}
		
		@Test public void testProblem12() {
			int aa = 3;
		int	iterationNumber = 1;
			do {
				log.info("Iterartion# " + iterationNumber + ", Loop variable: " + aa);
				aa++;
				iterationNumber++;
			}while (iterationNumber <= 6);
	}
		
		@Test  void testProblem13() {
			for (int aa = 0,iterationNumber = 1; aa < 10; aa++, iterationNumber++) {
				
				if (iterationNumber == 4 || iterationNumber == 5 || iterationNumber == 9) {
					log.info("Iterartion# " + iterationNumber + " **SKIPPED**");
					continue;						
				}
				log.info("Iterartion# " + iterationNumber + ", Loop variable: " + aa);
				}
			}
		*/
	
	// A short-hand way to test methods
	@Test 
	public void testProblem10() {
		Unit9 testclass = new Unit9();
		testclass.problem10();
	}
	
	@Test 
	public void testProblem11() {
		Unit9 testclass = new Unit9();
		testclass.problem11();
	}
	
	@Test 
	public void testProblem12() {
		Unit9 testclass = new Unit9();
		testclass.problem12();
	}
	
	@Test 
	public void testProblem13() {
		Unit9 testclass = new Unit9();
		testclass.problem13();
	}
}
