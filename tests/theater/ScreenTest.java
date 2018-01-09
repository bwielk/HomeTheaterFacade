package theater;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ScreenTest {
	
	Screen screen;
	
	@Before
	public void before(){
		screen = new Screen();
	}

	@Test
	public void screenIsRevealedAndHidden(){
		screen.down();
		assertEquals(true, screen.isRevealed());
		screen.up();
		assertEquals(false, screen.isRevealed());
	}
}
