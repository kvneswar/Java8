package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample01 {
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		System.out.println("Task Started");

		for(int loopCounter=0; loopCounter < 10; loopCounter++){
			
			/*
			 * final int index = loopCounter;
			 * No need to declare the variable 'final' in Java8, but we have to treat this variable as final variable only i.e. also known as effectively final.
			 * If we don't modify the variable then we are good, if we modify the variable then compiler will throw the error.
			*/
			
			int index = loopCounter;

			executorService.submit(new Runnable() {
				@Override
				public void run() {
					System.out.println("Rinning Task: "+ index);
				}
			});
			
			//index = 11; // Not allowed, because index is effectively final variable.
			
		}
		
		executorService.shutdown();
		System.out.println("Task End");
		
		
	}

}
