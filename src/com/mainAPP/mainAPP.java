package com.mainAPP;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;



// M9 exercise classes and methods
import static com.mainAPP.fase1.*;


public class mainAPP {

	public static void main(String[] args) {
		
		// -----     FASE 1     -----
		printFase(1);
		
		// Ex-1
		printExercise(1);
		List<String> namesList = Arrays.asList("Ohm", "Ot", "Oscar", "Otilia", "Pepe", "Apu", "apu", "Carlos", "Sonia", "Angel", "Anna", "Ana", "ana", "Sofia", "Anacleto", "Maria", "Alberto", "Alp", "alp");
		System.out.println("\tNoms -> " + namesList.toString() + "\n");
		System.out.println("\tResult: " + get3LetterNamesBeginingWithA(namesList));
		
		
		// Ex-2
		printExercise(2);
		List<Integer> numbersList = Arrays.asList(1, 2 , 3, 10, 55, 123);
		System.out.println("\tNumeros -> " + numbersList.toString() + "\n");
		
		System.out.println("\tResult: " + identifyParityOfNumbers(numbersList));
		
		
		// Ex-3
		// We'll use the same List as in Ex-1 -> namesList.
		printExercise(3);
		System.out.println("\tNoms -> " + namesList.toString() + "\n");
		
		System.out.println("\tResult: " + getStringsWithLetterO(namesList));
		
		
		// Ex-4
		// We'll use the same List as in Ex-1 -> namesList.
		printExercise(4);
		System.out.println("\tNoms -> " + namesList.toString() + "\n");
		
		System.out.println("\tResult: " + getStringsWithLetterOLonger5Letters(namesList));
		
		
		// Ex-5
		printExercise(5);
		List<String> monthsList = Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre");
		System.out.println("\tMesos -> " + monthsList.toString() + "\n");
		
		Consumer<String> print = string -> System.out.print(string + ", ");
		System.out.print("\tResult: ");
		monthsList.forEach(print); 
		

		// Ex-6
		printExercise(6);
		System.out.println("\tMesos -> " + monthsList.toString() + "\n");
		
		System.out.print("\tResult: ");
		monthsList.forEach(System.out::print); 


		// -----     FASE 2     -----
		printFase(2);
		
		//Ex-7
		printExercise(7);
		
		piInterface myPiInterface = () -> 3.1415; 
		System.out.println("\tResult:  " + myPiInterface.getPiValue());
		
		
		// -----     FASE 3     -----
		printFase(3);
		
		//Ex-8
		printExercise(8);
		
		String originalString = "ABCD";
		System.out.println("\tstring -> " + originalString);
		
		reverseInterface myReverseInterface = (String inputString) -> new StringBuilder(inputString).reverse().toString(); 
		System.out.println("\tResult: " + myReverseInterface.reverse(originalString));
		
	}
	
	private static void printFase(int fase){
		System.out.println("\n\n========================");
		System.out.println("==       FASE " + fase + "       ==");
		System.out.println("========================\n");

	}
	
	private static void printExercise(int exercise){
		
		System.out.println("\n- Exercici " + exercise + " -\n");
		

	}
}
