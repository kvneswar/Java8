package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Sample03 {
	
	static Random random = new Random();
	
	public void schedule(){
		System.out.println("Scheduled!!!");
	}
	
	public boolean isAvailable(){
		return random.nextBoolean();
	}

	public static void main(String[] args) {
		
		List<Sample03> list = Arrays.asList(new Sample03(), new Sample03(), new Sample03(),
				new Sample03(), new Sample03(), new Sample03());
		
		Sample03 firstTimeSlot = list.stream()
									 .filter(Sample03 :: isAvailable)
									 .findFirst()
									 .orElse(new Sample03());
		
		System.out.println("First Time Slot" + firstTimeSlot);
	}
	
}
