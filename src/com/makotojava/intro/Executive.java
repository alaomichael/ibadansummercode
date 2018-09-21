package com.makotojava.intro;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class Executive extends Manager {

	private static final Logger log = Logger.getLogger(Executive.class.getName());
	
	@Override
	public void processStockOptions(int numberOfOptions, BigDecimal price) {
		log.info("Of course I got " + numberOfOptions + " options at $" + price.toPlainString() + "I am an executive!");
	}
	

}
