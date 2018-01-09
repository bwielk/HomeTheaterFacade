package theater;

public class TheaterLights extends Device{
	
	int brightness = 100;

	public void dim(int value) {
		if(value <= 100 && value <= getBrightness()){
			brightness = value;
		}
	}

	public int getBrightness() {
		return brightness;
	}
}
