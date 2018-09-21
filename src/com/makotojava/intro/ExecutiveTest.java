package com.makotojava.intro;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class ExecutiveTest {
	private static final Logger log = Logger.getLogger(Executive.class.getName());
	@Test
void testProcessStockOptions(int numberOfOptions, BigDecimal price) {
		log.info("Of course I got " + numberOfOptions + " options at $" + price.toPlainString() + "I am an executive!");
	}

}
