package fr.uvsq.exercice3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPosition {
	@Test
	public void changerPositonTest() {
		Position p = new Position(2,5);
		p.changeX(-2);
		p.changeY(2);
		assertEquals(0, p.getX(), 0) ;
		assertEquals(7, p.getY(), 0) ;
		
		
	}
	public void changerPositonTest2() {
		Position p = new Position(1,-17);
		p.changeX(8);
		p.changeY(20);
		assertEquals(9, p.getX(), 0) ;
		assertEquals(3, p.getY(), 0) ;
		
		
	}
}
