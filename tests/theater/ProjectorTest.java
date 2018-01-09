package theater;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProjectorTest {
	
	Projector projector;
	
	@Before
	public void before(){
		projector = new Projector();
	}

	@Test
	public void widescreenModeCanBeOnAndOff() {
		projector.wideScreenModeOn();
		assertEquals(true, projector.isWideScreenModeOn());
		projector.wideScreenModeOff();
		assertEquals(false, projector.isWideScreenModeOn());
	}

}