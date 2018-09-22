package com.makotojava.intro;

public class MyClass {
	public <E> String formatArray(E[] arrayToFormat) {
	    StringBuilder sb = new StringBuilder();
	 
	    int index = 0;
	    for (E element : arrayToFormat) {
	      sb.append("Element ");
	      sb.append(index++);
	      sb.append(" => ");
	      sb.append(element);
	      sb.append('\n');
	    }
	 
	    return sb.toString();
	  }
}
