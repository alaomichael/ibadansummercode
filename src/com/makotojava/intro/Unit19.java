package com.makotojava.intro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Unit19 {
	Pattern pattern = Pattern.compile("[Aa].*string");
	  Matcher matcher = pattern.matcher("A string");
	  boolean didMatch = matcher.matches();
	  Logger.getAnonymousLogger().info (didMatch);
	  int patternStartIndex = matcher.start();
	  Logger.getAnonymousLogger().info (patternStartIndex);
	  int patternEndIndex = matcher.end();
	  Logger.getAnonymousLogger().info (patternEndIndex);
}
}
