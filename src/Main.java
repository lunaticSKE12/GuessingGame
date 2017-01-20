/**
 * Main class that create GuessingGame and GameConsole to run program
 * @author Napong Dungduangsasitorn
 *
 */
public class Main {
	
	public static void main(String[] args){
		GuessingGame game = new GuessingGame( 20 ); 
		GameConsole ui =  new GameConsole( ); 
		ui.play( game );

	}

}
