package theater;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DVDplayerTest {
	
	DVDplayer dvdPlayer;
	
	@Before
	public void before(){
		dvdPlayer = new DVDplayer();
	}

	@Test
	public void isOffOnceCreated() {
		assertEquals(false, dvdPlayer.isOn());
	}
	
	@Test 
	public void canBeSwitchedONandOFF(){
		dvdPlayer.on();
		assertEquals(true, dvdPlayer.isOn());
		dvdPlayer.off();
		assertEquals(false, dvdPlayer.isOn());
	}
	
	@Test
	public void canPlayAMovie(){
		assertEquals(false, dvdPlayer.isMovieOn());
		dvdPlayer.playMovie("Star Wars");
		assertEquals(true, dvdPlayer.isMovieOn());
	}
	
	@Test
	public void canStopAMovie(){
		dvdPlayer.playMovie("Star Wars");
		dvdPlayer.stop();
		assertEquals(false, dvdPlayer.isMovieOn());
	}
	
	@Test
	public void canEjectADisc(){
		dvdPlayer.eject();
		assertEquals(true, dvdPlayer.isEjected());
	}
}
