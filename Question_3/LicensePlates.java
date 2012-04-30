import java.util.Scanner;


public class LicensePlates {
	/*
	 * Please Note: 
	 * Only enter whole numbers with no spaces or additional characters into the input
	 * */

	public static void main(String[] args) {
		
		try{
			
			String inputString = null;
			int pop = 0;
			int ten = 10;
			int twentySix = 26;
			long plates26 = 0;
			long plates10 = 0;
			
			Scanner scanner = new Scanner(System.in);
		
			//Asks for the population, then stores it in 'pop'
			System.out.println("Please Enter the POPULATION Number: ");
			inputString = scanner.nextLine();
			pop = Integer.parseInt(inputString);
			
			//Prints out Population Size
			System.out.println();
			System.out.println("Population: " + pop);
			
			//Declaring Variables
			int i = 0;
			int i1 = 0;
			long platesTot = 0;
			long platesTot1 = 0;
			long platesTot2 = 0;
			long platesTot3 = 0;
			long excessPlates1 = 0;
			long excessPlates2 = 0;
			long excessPlates3 = 0;
			int iCounter = inputString.length() - 1;	//The 'iCounter' pattern was noticed when MOST of the combinations involved the total number of exponents to be one less than the total number of digits in the population.
			int k = iCounter;
			int k1 = 0;

			
			//The following if & elseif are designed to catch if a population input is 0 or negative.
			if(pop == 0){
				System.out.println("Pattern: " + "no pattern");
				System.out.println("Total Plates: " + "0");
				System.out.println("Excess Plates: " + "0");
				System.exit(0);
			}
			else if(pop<0){
				System.out.println("I do not understand the question. A NEGATIVE population?");
				System.exit(0);
			}
	
	//This loop created handles most of the number of alphanumeric combinations. As long as the iCounter is sufficient.
			for (i = 0; i <= iCounter; i++){
				
				plates10 = (long) Math.pow(ten, k);	
				plates26 = (long) Math.pow(twentySix, i);
				platesTot = (plates10 * plates26);
				
				if (platesTot >= pop){
					i1 = i;
					k1 = k;
					platesTot1 = platesTot;
					excessPlates1 = platesTot - pop;
					break;
				}
				k--;
			}	
	//if iCounter was not sufficient in the prior for loop (i.e. pop=99 & iCounter=1), a check for all number or all letter combo is performed. 
			k = iCounter + 1;
			plates10= (long) Math.pow(ten, k);
			platesTot2= plates10;
			excessPlates2= platesTot2 - pop;
			
			i  = iCounter - 1;
			plates26 = (long) Math.pow(twentySix, i);
			platesTot3 = plates26;
			excessPlates3 = platesTot3 - pop;
	
	//if excessPlates1, was less than or ==0, then it checks if the other all number/letter combos would be sufficient.
			if (excessPlates1 <= 0){
				if(excessPlates2 > excessPlates3 && excessPlates3>0 || excessPlates2<0){
					System.out.println("Pattern: " + i + " letters");
					System.out.println("Total Plates: " + platesTot3);
					System.out.println("Excess Plates: " + excessPlates3);
				}
				else if(excessPlates3 > excessPlates2 && excessPlates2>0 || excessPlates3<0){
					System.out.println("Pattern: " + k + " numbers");
					System.out.println("Total Plates: " + platesTot2);
					System.out.println("Excess Plates: " + excessPlates2);
				}
			}

//The last step leads us to check any instance that we have more than 1 positive number for excessPlates (including excessPlates1) and which would be the smallest positive number. 
			else {
				if(excessPlates1 > excessPlates2 && excessPlates1 > excessPlates3){				//if ex1 is the biggest...
					if(excessPlates2 > excessPlates3 && excessPlates3>0 || excessPlates2<0){	//checks to see if ex3 is smallest positive
						System.out.println("Pattern: " + i + " letters");
						System.out.println("Total Plates: " + platesTot3);
						System.out.println("Excess Plates: " + excessPlates3);
					}
					else if(excessPlates3 > excessPlates2 && excessPlates2>0 || excessPlates3<0){	//checks to see if ex2 is smallest positive
						System.out.println("Pattern: " + k + " numbers");
						System.out.println("Total Plates: " + platesTot2);
						System.out.println("Excess Plates: " + excessPlates2);
					}
				}
				else if(excessPlates2>excessPlates1 && excessPlates2 >excessPlates3){		//if excessPlates2 is the biggest
					if(excessPlates3 > excessPlates1 && excessPlates1>0 || excessPlates3<0){	//checks to see if excessPlates1 is smallest positive
						System.out.println("Pattern: " + k1 + " numbers & " + i1 + " letters");
						System.out.println("Total Plates: " + platesTot1);
						System.out.println("Excess Plates: " + excessPlates1);
					}
					else if(excessPlates1 > excessPlates3 && excessPlates3>0 || excessPlates1<0){	//checks to see if excessPlates3 is smallest positive
						System.out.println("Pattern: " + i + " letters");
						System.out.println("Total Plates: " + platesTot3);
						System.out.println("Excess Plates: " + excessPlates3);
					}				
				}
				else if(excessPlates3 > excessPlates1 && excessPlates3 > excessPlates2){	//if excessPlates3 is the biggest
					if(excessPlates2 > excessPlates1 && excessPlates1>0 || excessPlates2<0){	//checks to see if excessPlates1 is smallest positive
						System.out.println("Pattern: " + k1 + " numbers & " + i1 + " letters");
						System.out.println("Total Plates: " + platesTot1);
						System.out.println("Excess Plates: " + excessPlates1);
					}
					else if(excessPlates1 > excessPlates2 && excessPlates2>0 || excessPlates1<0){	//checks to see if excessPlates2 is smallest positive
						System.out.println("Pattern: " + k + " numbers");
						System.out.println("Total Plates: " + platesTot2);
						System.out.println("Excess Plates: " + excessPlates2);
					}
				}
			}
			
			scanner.close();
		}
		
//implemented a trycatch block if an error is reached was parsing the string from the user input
		catch (NumberFormatException e){
			System.out.println("\nSilly, user.\nA POPULATION cannot have that size.\n\nYou need to get Positively Real with your whole numbers and TRY AGAIN.");
		
		}
	}
}

//Coded by MOEEN ARSHAD.
