package org.constructor;

public class Parent1 {
	
	public Parent1() {
		System.out.println("default parent constructor");
	
	}
	public Parent1(String s) {
		
			this();
		
			
			System.out.println("parent name is"+s);
		}

}
