import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class NumGuessv2 {
	public static void main(String[] args){
		Random random = new SecureRandom();
		int magicNumber = random.nextInt(1001);

		int maxguesses = 10;
			
	Scanner input = new Scanner(System.in);
		int guess = 0;
		
		int count = 0;
		// while loop prompting user to enter guess while displaying remaining guesses
		while (maxguesses >= 1) {
	System.out.printf("\n Enter Your Guess   (%d remaining): ",maxguesses);
	guess =	input.nextInt();
	count++;
    maxguesses--;
//shows if guess is lower than magic number
	if (guess < magicNumber) {
			System.out.printf("Too low", guess, magicNumber);
            
	} 
	//shows if guess is higher than magic number
	else if(guess > magicNumber) {
				System.out.printf( "Too high", guess, magicNumber);
				}
				//shows if user guessed magic number correctly
	else if  (guess == magicNumber) { 
				System.out.printf(count == 1 ? "Congratulations, you guessed the magic number in %d guess" : "Congratulations, you guessed the magic number in %d guesses", count);
						
            maxguesses = 0;
	}
			}
	//makes text diffrent between guess and guessed depening on how many trys user takes to guess correctly 

if (maxguesses == 0 && guess != magicNumber) {
	System.out.printf("\nYou are out of guesses, the magic number was %d", magicNumber);
}
			//closing input
		input.close();
	}
String a = new String("boom");
	}
	



