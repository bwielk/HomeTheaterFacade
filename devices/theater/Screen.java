package theater;

public class Screen extends Device{

	boolean revealed = false;
	
	public void up() {
		if(revealed){
			revealed = false;
		}
	}

	public void down() {
		if(!revealed){
			revealed = true;
		}
	}

	public boolean isRevealed() {
		return revealed;
	}
}