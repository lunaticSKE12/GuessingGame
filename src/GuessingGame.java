import java.util.Random;
/**
 * Game of gussing a secret number.
 * @author Napong Dungduangsasitorn
 *
 */
public class GuessingGame {
	/* properties of a guessing game */
	
	private int upperBound;
	private int secret;
	private String hint;
	
	/**
	 * Initialize a new game
	 * @param uppperBound is the max value for the secret number (>1).
	 */
	public GuessingGame(int uppperBound){
		this.upperBound = upperBound;
		this.secret = getRandomNumber(this.upperBound);
		this.hint = "I'm thinking of number between 1 and " + this.upperBound;
	}
	
	/**  
	 * Create a random number between 1 and limit. 
	 * @param limit is the upper limit for random number 
	 * @return a random number between 1 and limit (inclusive) 
	 */ 
	private int getRandomNumber(int limit) { 
		long seed = System.currentTimeMillis( ); 
		Random rand = new Random( seed ); 
		return rand.nextInt(limit) + 1; 
	} 
	
	
	public boolean guess (int number){
		if(number == this.secret){
			setHint("Correct. The secret is " + this.secret);
			return true;
		}
		
		else if(number <= this.secret){
			setHint("Sorry, your guess is too small");
			return false;
		}
		else{
			setHint("Sorry, your guess is too large");
			return false;
		}
		
	}
	
	public String getHint(){
		return this.hint;
	}
	
	protected void setHint(String hint){
		this.hint = hint;
		
	}
	
}
