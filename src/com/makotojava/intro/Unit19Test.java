package com.makotojava.intro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

class Unit19Test {

	@Test
	public void testFindMatches() {
	    
	   String input = "Do you run? Ran? No, bro, run! Bro, I ran and run.";
	    
	   String regex = "r[au]n";
	    
	   Pattern pattern = Pattern.compile(regex);
	   Matcher matcher = pattern.matcher(input);
	    
	   int matchCount = 0;
	   StringBuilder matchHolder = new StringBuilder();
	   while (matcher.find()) {
	   if (matchCount > 0) 
	   matchHolder.append(',');
	   matchHolder.append(matcher.group());
	   matchCount++;
	   }
	    
	   System.out.println("Matches: " + matchHolder.toString());
	    
	}
	
	@Test
	public void testSearchForWikiWord() {
	String input = "Here is a WikiWord followed by AnotherWikiWord, then SomeWikiWord.";
	Pattern pattern = Pattern.compile("[A-Z][a-z]*([A-Z][a-z]*)+");
	Matcher matcher = pattern.matcher(input);
	while (matcher.find()) {
	  Logger.getAnonymousLogger().info("Found this wiki word: " + matcher.group());
	}
}
	@Test
	public void testToReplaceAllWikiWord() {
	String input = "Here is a WikiWord followed by AnotherWikiWord, then SomeWikiWord.";
	Pattern pattern = Pattern.compile("[A-Z][a-z]*([A-Z][a-z]*)+");
	Matcher matcher = pattern.matcher(input);
	Logger.getAnonymousLogger().info("Before: " + input);
	String result = matcher.replaceAll("replaced Word");
	Logger.getAnonymousLogger().info("After: " + result);
	
	StringBuffer buffer = new StringBuffer();
	while (matcher.find()) {
	  matcher.appendReplacement(buffer, "blah$0blah");
	}
	matcher.appendTail(buffer);
	Logger.getAnonymousLogger().info("After: " + buffer.toString());
	}
	
	@Test
	public void testForMatchingGroups() {
	String input = "Here is a WikiWord followed by AnotherWikiWord, then SomeWikiWord.";
	Pattern pattern = Pattern.compile("[A-Z][a-z]*([A-Z][a-z]*)+");
	Matcher matcher = pattern.matcher(input);
	Logger.getAnonymousLogger().info("Before: " + input);
	String result = matcher.replaceAll("blah$0blah");
	Logger.getAnonymousLogger().info("After: " + result);
}
	
}
