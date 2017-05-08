package org.example;

import java.util.function.Consumer;

public class Sample06_UsingLambdaExpressions {

	public static void main(String[] args) {
		Resource.use(resource -> {
			resource.op1();
			resource.op2();
		});
	}
	
}

class Resource implements AutoCloseable{
	
	private Resource(){
		System.out.println("I'm from Constructor");
	}
	
	void op1(){
		System.out.println("I'm from Op1");
	}
	
	void op2(){
		System.out.println("I'm from Op2");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("I'm from close");
	}
	
	static void use(Consumer<Resource> consumer){
		
		try(Resource resource = new Resource()){
			consumer.accept(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	
}
