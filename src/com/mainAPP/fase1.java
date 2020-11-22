package com.mainAPP;

import java.util.List;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.joining;

public class fase1 {
	
	// Ex-1
	public static List<String> get3LetterNamesBeginingWithA(List<String> namesList) {
		return namesList.stream()
		.filter(
				name -> name.startsWith("A") 
				&& name.length() == 3)
		
		.collect(toList());
	}

	
	//Ex-2
	public static String identifyParityOfNumbers(List<Integer> numbersList) {
		return 	numbersList.stream()
				.map( 
						number -> ((int)number % 2 == 0) ? "e" + number : "o" + number)
				.collect(joining(", "));
	}
	
	
	//Ex-3
	public static List<String> getStringsWithLetterO(List<String> stringsList){
		return stringsList.stream()
				.filter(
						string -> string.toLowerCase().contains("o") 
				).collect(toList());
	}
	
	//Ex-4
	public static List<String> getStringsWithLetterOLonger5Letters(List<String> stringsList){
		return stringsList.stream()
				.filter(
						string -> ( string.toLowerCase().contains("o") && string.length() > 5) 
				).collect(toList());
	}
}
