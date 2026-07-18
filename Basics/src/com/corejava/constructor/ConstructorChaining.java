package com.corejava.constructor;

public class ConstructorChaining {
	
	 ConstructorChaining() // default constructor
	 {
		System.out.println("This is default constructor");
	 }
	
	 ConstructorChaining (int a, int b)  //Paramertised constructor
	 {
		 this();
		 int c = a+b;
		 System.out.println("Parameterised Constructor: "+c);
	 }
	 
	 ConstructorChaining ( int a, int b, double c)  //Overloading
	 {
		 this(a,b);
		 double d = a+b+c;
		 System.out.println("Overloaded Constructor : "+d);
	 }

}
