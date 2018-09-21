package com.makotojava.intro;

import java.util.logging.Logger;

	public class Unit9 {
		private static final Logger log = Logger.getLogger(Unit9.class.getName());
		public void problem10() {
			for (int aa = 3,iterationNumber = 1; iterationNumber <= 6; aa++, iterationNumber++) {
				log.info("Iterartion# " + iterationNumber + ", Loop variable: " + aa);
				}
			}
			
			public void problem11() {
				int aa = 3;
			int	iterationNumber = 1;
				while (iterationNumber <= 6){
					log.info("Iterartion# " + iterationNumber + ", Loop variable: " + aa);
					aa++;
					iterationNumber++;
				}
		}
			
			public void problem12() {
				int aa = 3;
			int	iterationNumber = 1;
				do {
					log.info("Iterartion# " + iterationNumber + ", Loop variable: " + aa);
					aa++;
					iterationNumber++;
				} while (iterationNumber <= 6);
		}
			
			public void problem13() {
				for (int aa = 0,iterationNumber = 1; aa < 10; aa++, iterationNumber++) {
					
					if (iterationNumber == 4 || iterationNumber == 5 || iterationNumber == 9) {
						log.info("Iterartion# " + iterationNumber + " **SKIPPED**");
						continue;						
					}
					log.info("Iterartion# " + iterationNumber + ", Loop variable: " + aa);
					}
				}
	}


