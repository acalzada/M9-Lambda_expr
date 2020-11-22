package com.mainAPP;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;



// M9 exercise classes and methods
import static com.mainAPP.fase1.*;


public class mainAPP {

	public static void main(String[] args) {
		
		// -----     FASE 1     -----
		System.out.println("-----     FASE 1     -----\n\n");
		
		// Ex-1
		System.out.println("- Exercici 1 -\n");
		List<String> namesList = Arrays.asList("Ohm", "Ot", "Oscar", "Otilia", "Pepe", "Apu", "apu", "Carlos", "Sonia", "Angel", "Anna", "Ana", "ana", "Sofia", "Anacleto", "Maria", "Alberto", "Alp", "alp");
		System.out.println("\tNoms -> " + namesList.toString() + "\n");
		System.out.print("\tResult: " + get3LetterNamesBeginingWithA(namesList));
		
		
		// Ex-2
		List<Integer> numbersList = Arrays.asList(1, 2 , 3, 10, 55, 123);
		System.out.println("\n\n- Exercici 2 -\n");
		System.out.println("\tNumeros -> " + numbersList.toString() + "\n");
		
		System.out.println("\tResult: " + identifyParityOfNumbers(numbersList));
		
		
		// Ex-3
		// We'll use the same List as in Ex-1 -> namesList.
		System.out.println("\n\n- Exercici 3 -\n");
		System.out.println("\tNoms -> " + namesList.toString() + "\n");
		
		System.out.println("\tResult: " + getStringsWithLetterO(namesList));
		
		
		// Ex-4
		// We'll use the same List as in Ex-1 -> namesList.
		System.out.println("\n\n- Exercici 4 -\n");
		System.out.println("\tNoms -> " + namesList.toString() + "\n");
		
		System.out.println("\tResult: " + getStringsWithLetterOLonger5Letters(namesList));
		
		
		// Ex-5
		List<String> monthsList = Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre");
		System.out.println("\n\n- Exercici 5 -\n");
		System.out.println("\tMesos -> " + monthsList.toString() + "\n");
		
		Consumer<String> print = string -> System.out.print(string + ", ");
		System.out.print("\tResult: ");
		monthsList.forEach(print); 
		

		// Ex-6
		System.out.println("\n\n- Exercici 6 -\n");
		System.out.println("\tMesos -> " + monthsList.toString() + "\n");
		
		System.out.print("\tResult: ");
		monthsList.forEach(System.out::print); 


		// -----     FASE 2     -----
		System.out.println("-----     FASE 2     -----\n\n");
		
		//Ex-7
		System.out.println("\n\n- Exercici 7 -\n");
		
		piInterface myPiInterface = () -> 3.1415; 
		System.out.println("\tResult:  " + myPiInterface.getPiValue());
		
		
		// -----     FASE 3     -----
		System.out.println("-----     FASE 3     -----\n\n");
		
		//Ex-8
		System.out.println("\n\n- Exercici 8 -\n");
		

		
		
	}
	
}
