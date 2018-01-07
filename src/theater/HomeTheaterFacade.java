package theater;

public class HomeTheaterFacade {
	
	Amplifier amplifier;
	Tuner tuner;
	DVDplayer dvdPlayer;
	CDPlayer cdPlayer;
	Projector projector;
	TheaterLights theaterLights;
	Screen screen;
	PopcornPopper popper;
	
	public HomeTheaterFacade(Amplifier amplifier,
							Tuner tuner,
							DVDplayer dvdPlayer,
							CDPlayer cdPlayer,
							Projector projector,
							TheaterLights theaterLights,
							Screen screen,
							PopcornPopper popper){
		
		this.amplifier = amplifier;
		this.tuner = tuner;
		this.dvdPlayer = dvdPlayer;
		this.cdPlayer = cdPlayer;
		this.projector = projector;
		this.theaterLights = theaterLights;
		this.screen = screen;
		this.popper = popper;
		
	}

}
