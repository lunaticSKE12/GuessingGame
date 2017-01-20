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
	private int count;
	
	/**
	 * Initialize a new game
	 * @param uppperBound is the max value for the secret number (>1).
	 */
	public GuessingGame(int uppperBound){
		this.upperBound = upperBound;
		this.secret = getRandomNumber(this.upperBound);
		this.hint = "I'm thinking of number between 1 and " + this.upperBound;
		this.count = 0;
	}
	
	/**  
	 * Create a random number between 1 and limit. 
	 * @param limit is the upper limit for random number 
	 * @return a random number between 1 and limit (inclusive) 
	 */ 
	private int getRandomNumber(int limit) { 
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		return rand.nextInt(limit) + 1;
	} 
	
	/**
	 * Check number that equal to secret number or not if equal return true
	 * if not return false and show hint
	 * @param number is number that user guess
	 * @return true if correct false if not correct and show hint
	 */
	public boolean guess (int number){
		if(number == this.secret){
			setHint("Correct. The secret is " + this.secret);
			this.count++;
			return true;
		}
		
		else if(number < this.secret){
			setHint("Sorry, your guess is too small");
			this.count++;
			return false;
		}
		else{
			setHint("Sorry, your guess is too large");
			this.count++;
			return false;
		}
		
	}
	/**
	 * return based on the most recent guess
	 * @return hint based on most recent guess
	 */
	
	public String getHint(){
		return this.hint;
	}
	
	/**
	 * set hint message
	 * @param hint is message that help user for guess number
	 */
	protected void setHint(String hint){
		this.hint = hint;
		
	}
	
	/**
	 * return limit of guess number
	 * @return upper bound of guess number
	 */
	public int getUpperBound(){
		return this.upperBound;
	}
	
	
	/**
	 * show how many times of user guess
	 * @return number of guess
	 */
	public int getCount(){
		return this.count;
	}
	
	
	
}
