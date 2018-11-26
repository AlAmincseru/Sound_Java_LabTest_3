package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Sound_lab3UnitTest {
	private final double TIME = 7.2;
	private final double SPEED = 1100;
	
	Sound_lab3 sound = new Sound_lab3();

	@Test
	void test() {
		assertEquals(7920.0,sound.calculation(TIME,SPEED)," ");
	}

}
