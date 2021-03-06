package org.example;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample02_UsingLambdaExpressions02 {

	public static void main(String[] args) {

		List<Double> sqrtOfFirst100Primes = 
					Stream.iterate(1, e -> e+1)
				   .filter(Sample02_UsingLambdaExpressions02 :: isPrime)
				   .map(Math :: sqrt)
				   .limit(100)
				   .collect(toList());

		System.out.println(String.format("Computer %d values, first is %g, last is %g",
				sqrtOfFirst100Primes.size(), 
				sqrtOfFirst100Primes.get(0), 
				sqrtOfFirst100Primes.get(sqrtOfFirst100Primes.size()-1))
				);
	}

	public static boolean isPrime(int number){
		return number > 1 && 
				IntStream.range(2, number)
				.noneMatch(i -> number % i == 0);
	}

}
