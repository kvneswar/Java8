package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Sample_UsingLambdaExpressions01 {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(10);

		System.out.println("Task Started");

		IntStream.range(0, 10)
				 .forEach(loopCounter -> 
				 	executorService.submit(() -> 
				 		System.out.println("Rinning Task: "+ loopCounter)
				 	)
				 );

		executorService.shutdown();
		System.out.println("Task End");

	}

}
