package org.example;

public class Sample06 {
	
	public static void main(String[] args) {
		Sample06 sample06 = new Sample06();
		sample06.op1();
		sample06.op2();
	}
	
	Sample06(){
		System.out.println("I'm from Constructor");
	}
	
	void op1(){
		System.out.println("I'm from Op1");
	}
	
	void op2(){
		System.out.println("I'm from Op2");
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("I'm from Finalize");
	}
	
	
	
	

}
