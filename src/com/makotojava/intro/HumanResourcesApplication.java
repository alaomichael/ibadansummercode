package com.makotojava.intro;

public class HumanResourcesApplication {
	public void handleStockOptions(final Person person, StockOptionProcessingCallback callback) {
		if (person instanceOf StockOptionEligible) {
			// Eligible Person, invoke the callback straight up
			callback.process((StockOptionEligible)person)
		}
	}

}
