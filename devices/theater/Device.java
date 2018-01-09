package theater;

public abstract class Device {
	
	boolean isOn = false;
	
	public boolean isOn(){
		return isOn;
	}
	
	public void on(){
		if(isOn == false){
			isOn = true;
		}
	}
	
	public void off(){
		if(isOn == true){
			isOn = false;
		}
	}
}
