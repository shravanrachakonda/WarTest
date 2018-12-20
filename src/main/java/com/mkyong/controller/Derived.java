package com.mkyong.controller;

class Derived extends PrivateStaticExample {
	
	public void print() {
		System.out.println("Non-static or instance method from Derived");
	}
	public static void main(String args[])
	{
		PrivateStaticExample obj= new Derived();
	obj.display();
	obj.print();
	}
}
