package org.example;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

public class Sample04 {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Eswar", "Lakshmi");
		System.out.println(names.stream()
							    .map(String :: toUpperCase)
							    .collect(joining(", ")));
		
		/*
		String nameStr = "";
		for(int i=0; i<names.size(); i++){
			nameStr = nameStr + names.get(i).toUpperCase();
			if(i != names.size()-1){
				nameStr = nameStr + ", ";
			}
		}
		System.out.println(nameStr);
		*/
	}

}
