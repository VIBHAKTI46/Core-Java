package org.tnsif.annotation;

import java.util.Set;
import java.util.TreeSet;
public class SuppressWarningExample {

	public static void main(String[] args) {
		
		/*
		 * we can remove the warning by using thebelow
		 * annonation
		 */
		@SuppressWarnings("Uncheckeble")
		
    Set s=new TreeSet();
		s.add(45);
		s.add(34);
		s.add("vibhakti");
		System.out.println(s);
		
	}

}
