package theater;

public class Projector extends Device{
	
	boolean wideScreenModeOn = false;

	public void wideScreenModeOn() {
		if(!wideScreenModeOn){
			wideScreenModeOn = true;
		}
	}
	
	public void wideScreenModeOff() {
		if(wideScreenModeOn){
			wideScreenModeOn = false;
		}
	}

	public boolean isWideScreenModeOn() {
		return wideScreenModeOn;
	}

}
