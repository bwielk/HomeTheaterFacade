package theater;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TheaterLightsTest {

	TheaterLights lights;
	
	@Before
	public void before() {
		lights = new TheaterLights();
	}
	
	@Test
	public void fullBrigthnessOnceInstantiated() {
		assertEquals(100, lights.getBrightness());
	}
	
	@Test
	public void lightsCanBeDimmed(){
		lights.on();
		lights.dim(10);
		assertEquals(10, lights.getBrightness());
		lights.dim(20);
		assertEquals(10, lights.getBrightness());
	}
}