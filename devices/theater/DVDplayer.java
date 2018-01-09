package theater;

public class DVDplayer extends Device{
	
	boolean movieOn = false;
	boolean isEjected = false;
	
	public String stop() {
		if(movieOn){
			movieOn = false;
		}
		return "The movie has been stopped";
	}

	public void eject() {
		if(!movieOn){
			isEjected = true;
		}
	}

	public String playMovie(String movieName) {
		if(!movieOn){
			movieOn = true;
			return movieName + " is playing";
		}
		return "Stop playing the desired movie";
	}

	public boolean isMovieOn() {
		return movieOn;
	}

	public boolean isEjected() {
		return isEjected;
	}
}
