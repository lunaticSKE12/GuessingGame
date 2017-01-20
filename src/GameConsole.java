import java.util.Scanner;
/**
 * GameConsole is console of guessing game
 * @author Napong Dungduangsasitorn
 *
 */
public class GameConsole {
	
	/**
	 * run process of guessing game
	 * @param game is GuessingGame object 
	 * @return secret number
	 */
	public int play (GuessingGame game){
	
		boolean check = false;
		String title = "Guessing Game";
		String question = "Your guess?";
		System.out.println(title);
		System.out.println(game.getHint());
		System.out.println(question);
		Scanner scaner = new Scanner(System.in);
		int number = 0;
		
		while(!check){
			number = scaner.nextInt();
			if(number < 1 || number > game.getUpperBound()){
				System.out.println("Guess number between 1 and " + game.getUpperBound());
				continue;
			}
			
			check = game.guess(number);
			System.out.println(game.getHint());
			if(!check){
				System.out.println(question);
			}
		}
		
		System.out.println("Correct. You uesd " + game.getCount() + " guesses");
		return number;
	}
}
