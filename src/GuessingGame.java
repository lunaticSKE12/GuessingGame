
public class GuessingGame {
	private int upperBound;
	private int secret;
	private String hint;
	
	public GuessingGame(int uppperBound){
		this.upperBound = upperBound;
	}
	
	public boolean guess (int number){
		if(number == secret){
			return true;
		}
		return false;
	}
	
	public String getHint(){
		return "";
	}
	
	protected void setHint(String hint){
		
	}
	
}
