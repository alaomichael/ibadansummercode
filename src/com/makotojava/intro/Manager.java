package com.makotojava.intro;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class Manager extends Employee implements StockOptionEligible {

	private static final Logger log = Logger.getLogger(Manager.class.getName());
	
/*	@Override
	public void processStockOptions(int numberOfOptions, BigDecimal price) {
		log.info("I can't believe I got " + numberOfOptions + " options at $" + price.toPlainString() + "!");
		
	} */
	
	public Manager() {
}
	public class DirectReports {
		
	}


// Meanwhile in another method somewhere
public static void main (String[] args) {
	Manager manager = new Manager();
	Manager.DirectReports dr = manager.new DirectReports();
}


@Override
public void processStockOptions(int numberOfOptions, BigDecimal price) {
	// TODO Auto-generated method stub
	
}
}