package theater;

public class Amplifier extends Device{
	
	boolean surroundSystemOn = false;
	int volume = 10;

	public String setVolume(int value){
		if(value >= 0 && value <= 100){
			volume = value;
			return "Volume set at value " + value;
		}
		return "Too big value. The maximum volume is 100";
	}

	public void surroundSystem() {
		if(!surroundSystemOn){
			surroundSystemOn = true;
		}
	}

	public int getVolume() {
		return volume;
	}

	public boolean isSurroundSystemOn() {
		return surroundSystemOn;
	}

}
