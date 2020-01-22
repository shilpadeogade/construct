package org.constructor;

public class Child extends Parent1{
	public Child() {
		this(1234);
		System.out.println("default constructor");
	}
	 public Child(String s) {
		 super("vijay");

		 System.out.println("stud name is"+s);
		}
	 public Child(int a) {
		 this("kartik");
		 System.out.println("stud Id id"+a);
	 }
	 public static void main(String[] args) {
		 Child c=new Child();
		 System.out.println("waether");
		 System.out.println("cloud");
		 
		
	}
}
