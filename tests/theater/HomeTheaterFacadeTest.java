package theater;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HomeTheaterFacadeTest {
	
	HomeTheaterFacade homeTheater;
	
	@Before
	public void before(){
		
		homeTheater = new HomeTheaterFacade(new Amplifier(), new Tuner(), new DVDplayer(), new Projector(), new TheaterLights(), new Screen(), new PopcornPopper());
	}

	@Test
	public void devicesReactToTheScreeningOn() {
		homeTheater.watchMovie("Dark");
		assertEquals(true, homeTheater.getPopper().isOn());
		assertEquals(10, homeTheater.getTheaterLights().getBrightness());
		assertEquals(true, homeTheater.getScreen().isRevealed());
		assertEquals(true, homeTheater.getProjector().isOn());
		assertEquals(true, homeTheater.getProjector().isWideScreenModeOn());
		assertEquals(true, homeTheater.getAmplifier().isOn());
		assertEquals(true, homeTheater.getAmplifier().isSurroundSystemOn());
		assertEquals(5, homeTheater.getAmplifier().getVolume());
		assertEquals(true, homeTheater.getDvdPlayer().isMovieOn());
	}
}
