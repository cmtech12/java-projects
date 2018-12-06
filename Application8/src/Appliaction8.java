import java.util.Scanner;

public class Appliaction8 {

	public static void main(String[] args) {
		
		Scanner guess = new Scanner(System.in);
		int value = 0;
		do {
				System.out.println("Enter a number:");
				value = guess.nextInt();	
		if(value >= 6){
			System.out.println("You guessed to high");
		break;	
		}
		
		if (value <= 4){
			System.out.println("You guessed to low");
		break;
		}
		
		}while (value == 5);
		System.out.println("Got 5!");
						
		}
	}


		

		
		
	


// Author Christopher Moore. Created 10/7/2018//
