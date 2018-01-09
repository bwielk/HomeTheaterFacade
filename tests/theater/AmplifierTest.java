package theater;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AmplifierTest {
	
	Amplifier amp;
	
	@Before
	public void before(){
		amp = new Amplifier();
	}

	@Test
	public void isOffOnceInstantiated(){
		assertEquals(false, amp.isOn());
	}
	
	@Test
	public void canBeSwtichedOnAndOff(){
		amp.on();
		assertEquals(true, amp.isOn());
		amp.off();
		assertEquals(false, amp.isOn());
	}
	
	@Test
	public void amplifiersHaveVolumeThatCanBeRegulated(){
		assertEquals(10, amp.getVolume());
		amp.setVolume(80);
		assertEquals(80, amp.getVolume());
		assertEquals("Too big value. The maximum volume is 100", amp.setVolume(101));
	}
	
	@Test
	public void amplifierHasSurroundSystem(){
		assertEquals(false, amp.isSurroundSystemOn());
		amp.surroundSystem();
		assertEquals(true, amp.isSurroundSystemOn());
	}
}
