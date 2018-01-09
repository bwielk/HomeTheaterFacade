package theater;

public class PopcornPopper extends Device{

	public String pop() {
		if(isOn()){
			return "Making popcorn...";
		}
		return "Popper is off";
	}
}