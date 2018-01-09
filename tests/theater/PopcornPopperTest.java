package theater;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PopcornPopperTest {

	PopcornPopper popper;
	
	@Before
	public void before(){
		popper = new PopcornPopper();
	}
	
	@Test
	public void canBeOnAndOff() {
		assertEquals(false, popper.isOn());
		popper.on();
		assertEquals(true, popper.isOn());
		popper.off();
		assertEquals(false, popper.isOn());
	}
	
	@Test
	public void canMakePopPopcorn(){
		assertEquals("Making popcorn...", popper.pop());
	}
}