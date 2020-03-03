package fr.uvsq.exercice3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPosition {
	@Test
	public void changerPositonTest() {
		Position p = new Position(2,5);
		p.change_position(-2, 2);
		assertEquals(0, p.getX(), 0) ;
		assertEquals(7, p.getY(), 0) ;
		
		
	}
	public void changerPositonTest2() {
		Position p = new Position(-1,17);
		p.change_position(+5, -20);
		assertEquals(4, p.getX(), 0) ;
		assertEquals(-3, p.getY(), 0) ;
		
		
	}
}
