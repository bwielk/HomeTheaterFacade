package theater;

public class HomeTheaterFacade {
	
	Amplifier amplifier;
	Tuner tuner;
	DVDplayer dvdPlayer;
	Projector projector;
	TheaterLights theaterLights;
	Screen screen;
	PopcornPopper popper;
	
	public HomeTheaterFacade(Amplifier amplifier,
					Tuner tuner,
					DVDplayer dvdPlayer,
					Projector projector,
					TheaterLights theaterLights,
					Screen screen,
					PopcornPopper popper){
		
		this.amplifier = amplifier;
		this.tuner = tuner;
		this.dvdPlayer = dvdPlayer;
		this.projector = projector;
		this.theaterLights = theaterLights;
		this.screen = screen;
		this.popper = popper;
	}
	
	public void watchMovie(String movieName){
		popper.on();
		popper.pop();
		theaterLights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenModeOn();
		amplifier.on();
		amplifier.surroundSystem();
		amplifier.setVolume(5);
		dvdPlayer.on();
		dvdPlayer.playMovie(movieName);
	}
	
	public void endMovie(){
		popper.off();
		theaterLights.on();
		screen.up();
		projector.off();
		amplifier.off();
		dvdPlayer.stop();
		dvdPlayer.eject();
		dvdPlayer.off();
	}
}
